// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/payments_account.proto

package com.google.ads.googleads.v9.resources;

public final class PaymentsAccountProto {
  private PaymentsAccountProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_PaymentsAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_PaymentsAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v9/resources/paym" +
      "ents_account.proto\022!google.ads.googleads" +
      ".v9.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032\034googl" +
      "e/api/annotations.proto\"\333\004\n\017PaymentsAcco" +
      "unt\022G\n\rresource_name\030\001 \001(\tB0\340A\003\372A*\n(goog" +
      "leads.googleapis.com/PaymentsAccount\022%\n\023" +
      "payments_account_id\030\010 \001(\tB\003\340A\003H\000\210\001\001\022\026\n\004n" +
      "ame\030\t \001(\tB\003\340A\003H\001\210\001\001\022\037\n\rcurrency_code\030\n \001" +
      "(\tB\003\340A\003H\002\210\001\001\022%\n\023payments_profile_id\030\013 \001(" +
      "\tB\003\340A\003H\003\210\001\001\022/\n\035secondary_payments_profil" +
      "e_id\030\014 \001(\tB\003\340A\003H\004\210\001\001\022O\n\027paying_manager_c" +
      "ustomer\030\r \001(\tB)\340A\003\372A#\n!googleads.googlea" +
      "pis.com/CustomerH\005\210\001\001:m\352Aj\n(googleads.go" +
      "ogleapis.com/PaymentsAccount\022>customers/" +
      "{customer_id}/paymentsAccounts/{payments" +
      "_account_id}B\026\n\024_payments_account_idB\007\n\005" +
      "_nameB\020\n\016_currency_codeB\026\n\024_payments_pro" +
      "file_idB \n\036_secondary_payments_profile_i" +
      "dB\032\n\030_paying_manager_customerB\201\002\n%com.go" +
      "ogle.ads.googleads.v9.resourcesB\024Payment" +
      "sAccountProtoP\001ZJgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v9/resource" +
      "s;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds" +
      ".V9.Resources\312\002!Google\\Ads\\GoogleAds\\V9\\" +
      "Resources\352\002%Google::Ads::GoogleAds::V9::" +
      "Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_PaymentsAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_PaymentsAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_PaymentsAccount_descriptor,
        new java.lang.String[] { "ResourceName", "PaymentsAccountId", "Name", "CurrencyCode", "PaymentsProfileId", "SecondaryPaymentsProfileId", "PayingManagerCustomer", "PaymentsAccountId", "Name", "CurrencyCode", "PaymentsProfileId", "SecondaryPaymentsProfileId", "PayingManagerCustomer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}