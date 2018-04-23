// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.GoogleAdsException;
import com.google.ads.googleads.v0.common.TargetSpend;
import com.google.ads.googleads.v0.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v0.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v0.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v0.errors.GoogleAdsError;
import com.google.ads.googleads.v0.resources.BiddingStrategy;
import com.google.ads.googleads.v0.resources.Campaign;
import com.google.ads.googleads.v0.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v0.resources.CampaignBudget;
import com.google.ads.googleads.v0.resources.CampaignBudgetName;
import com.google.ads.googleads.v0.services.BiddingStrategyOperation;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v0.services.CampaignBudgetOperation;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v0.services.CampaignOperation;
import com.google.ads.googleads.v0.services.CampaignServiceClient;
import com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse;
import com.google.ads.googleads.v0.services.MutateBiddingStrategyResult;
import com.google.ads.googleads.v0.services.MutateCampaignBudgetResult;
import com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v0.services.MutateCampaignResult;
import com.google.ads.googleads.v0.services.MutateCampaignsResponse;
import com.google.common.collect.Lists;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.annotation.Nullable;

/** This example adds a portfolio bidding strategy and uses it to construct a campaign. */
public class UsePortfolioBiddingStrategy {

  private static class UsePortfolioBiddingStrategyParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_BUDGET_ID)
    private Long campaignBudgetId;
  }

  public static void main(String[] args) {
    UsePortfolioBiddingStrategyParams params = new UsePortfolioBiddingStrategyParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optional: Specify a campaign budget ID here if you'd like to use an existing shared budget.
      params.campaignBudgetId = null;
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new UsePortfolioBiddingStrategy()
          .runExample(googleAdsClient, params.customerId, params.campaignBudgetId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignBudgetId the ID of the shared budget to use. If null, this example will create a
   *     new shared budget.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, Long customerId, @Nullable Long campaignBudgetId) {
    String biddingStrategyResourceName = createBiddingStrategy(googleAdsClient, customerId);
    String campaignBudgetResourceName = null;
    if (campaignBudgetId == null) {
      campaignBudgetResourceName = createSharedCampaignBudget(googleAdsClient, customerId);
    } else {
      campaignBudgetResourceName =
          CampaignBudgetName.format(customerId.toString(), campaignBudgetId.toString());
    }

    createCampaignWithBiddingStrategy(
        googleAdsClient, customerId, biddingStrategyResourceName, campaignBudgetResourceName);
  }

  /**
   * Creates the bidding strategy object.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String createBiddingStrategy(GoogleAdsClient googleAdsClient, long customerId) {
    try (BiddingStrategyServiceClient biddingStrategyServiceClient =
        googleAdsClient.getBiddingStrategyServiceClient()) {
      // Create a portfolio bidding strategy.
      TargetSpend targetSpend =
          TargetSpend.newBuilder()
              .setCpcBidCeilingMicros(Int64Value.of(2_000_000L))
              .setTargetSpendMicros(Int64Value.of(20_000_000L))
              .build();
      BiddingStrategy portfolioBiddingStrategy =
          BiddingStrategy.newBuilder()
              .setName(StringValue.of("Maximize Clicks #" + System.currentTimeMillis()))
              .setTargetSpend(targetSpend)
              .build();
      // Construct an operation that will create a portfolio bidding strategy.
      BiddingStrategyOperation operation =
          BiddingStrategyOperation.newBuilder().setCreate(portfolioBiddingStrategy).build();
      // Send the operation in a mutate request.
      MutateBiddingStrategiesResponse response =
          biddingStrategyServiceClient.mutateBiddingStrategies(
              Long.toString(customerId), Lists.newArrayList(operation));

      MutateBiddingStrategyResult mutateBiddingStrategyResult = response.getResults(0);
      // Print the resource name of the created object.
      System.out.printf(
          "Created portfolio bidding strategy with resource name: '%s'.%n",
          mutateBiddingStrategyResult.getResourceName());

      return mutateBiddingStrategyResult.getResourceName();
    }
  }

  /**
   * Creates an explicit budget to be used only to create the campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String createSharedCampaignBudget(GoogleAdsClient googleAdsClient, long customerId) {
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getCampaignBudgetServiceClient()) {
      // Create a shared budget.
      CampaignBudget budget =
          CampaignBudget.newBuilder()
              .setName(
                  StringValue.of("Shared Interplanetary Budget #" + System.currentTimeMillis()))
              .setAmountMicros(Int64Value.of(50_000_000L))
              .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
              .setExplicitlyShared(BoolValue.of(true))
              .build();
      // Construct an operation that will create a shared budget.
      CampaignBudgetOperation operation =
          CampaignBudgetOperation.newBuilder().setCreate(budget).build();
      // Send the operation in a mutate request.
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), Lists.newArrayList(operation));

      MutateCampaignBudgetResult mutateCampaignBudgetResult = response.getResults(0);
      // Print the resource name of the created object.
      System.out.printf(
          "Created shared budget with resource name: '%s'.%n",
          mutateCampaignBudgetResult.getResourceName());

      return mutateCampaignBudgetResult.getResourceName();
    }
  }

  /**
   * Create a Campaign with a portfolio bidding strategy.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param biddingStrategyResourceName the bidding strategy resource name to use
   * @param campaignBudgetResourceName the shared budget resource name to use
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String createCampaignWithBiddingStrategy(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String biddingStrategyResourceName,
      String campaignBudgetResourceName) {
    try (CampaignServiceClient campaignServiceClient = googleAdsClient.getCampaignServiceClient()) {
      // Create campaign.
      NetworkSettings networkSettings =
          NetworkSettings.newBuilder()
              .setTargetGoogleSearch(BoolValue.of(true))
              .setTargetSearchNetwork(BoolValue.of(true))
              .setTargetContentNetwork(BoolValue.of(true))
              .build();
      Campaign campaign =
          Campaign.newBuilder()
              .setName(StringValue.of("Interplanetary Cruise #" + System.currentTimeMillis()))
              .setStatus(CampaignStatus.PAUSED)
              .setCampaignBudget(StringValue.of(campaignBudgetResourceName))
              .setBiddingStrategy(StringValue.of(biddingStrategyResourceName))
              .setAdvertisingChannelType(AdvertisingChannelType.SEARCH)
              .setNetworkSettings(networkSettings)
              .build();
      // Construct an operation that will create a campaign.
      CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();
      // Send the operation in a mutate request.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), Lists.newArrayList(operation));

      MutateCampaignResult mutateCampaignResult = response.getResults(0);
      // Print the resource name of the created object.
      System.out.printf(
          "Created campaign with resource name: '%s'.%n", mutateCampaignResult.getResourceName());

      return mutateCampaignResult.getResourceName();
    }
  }
}