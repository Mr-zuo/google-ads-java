/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v9.services.stub;

import com.google.ads.googleads.v9.resources.CampaignFeed;
import com.google.ads.googleads.v9.services.GetCampaignFeedRequest;
import com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest;
import com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CampaignFeedService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class CampaignFeedServiceStub implements BackgroundResource {

  public UnaryCallable<GetCampaignFeedRequest, CampaignFeed> getCampaignFeedCallable() {
    throw new UnsupportedOperationException("Not implemented: getCampaignFeedCallable()");
  }

  public UnaryCallable<MutateCampaignFeedsRequest, MutateCampaignFeedsResponse>
      mutateCampaignFeedsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCampaignFeedsCallable()");
  }

  @Override
  public abstract void close();
}