// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/billing_setup.proto

package com.google.ads.googleads.v2.resources;

public final class BillingSetupProto {
  private BillingSetupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_BillingSetup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_BillingSetup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_BillingSetup_PaymentsAccountInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_BillingSetup_PaymentsAccountInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v2/resources/bill" +
      "ing_setup.proto\022!google.ads.googleads.v2" +
      ".resources\0328google/ads/googleads/v2/enum" +
      "s/billing_setup_status.proto\032-google/ads" +
      "/googleads/v2/enums/time_type.proto\032\036goo" +
      "gle/protobuf/wrappers.proto\032\034google/api/" +
      "annotations.proto\"\273\007\n\014BillingSetup\022\025\n\rre" +
      "source_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.p" +
      "rotobuf.Int64Value\022X\n\006status\030\003 \001(\0162H.goo" +
      "gle.ads.googleads.v2.enums.BillingSetupS" +
      "tatusEnum.BillingSetupStatus\0226\n\020payments" +
      "_account\030\013 \001(\0132\034.google.protobuf.StringV" +
      "alue\022b\n\025payments_account_info\030\014 \001(\0132C.go" +
      "ogle.ads.googleads.v2.resources.BillingS" +
      "etup.PaymentsAccountInfo\0227\n\017start_date_t" +
      "ime\030\t \001(\0132\034.google.protobuf.StringValueH" +
      "\000\022O\n\017start_time_type\030\n \001(\01624.google.ads." +
      "googleads.v2.enums.TimeTypeEnum.TimeType" +
      "H\000\0225\n\rend_date_time\030\r \001(\0132\034.google.proto" +
      "buf.StringValueH\001\022M\n\rend_time_type\030\016 \001(\016" +
      "24.google.ads.googleads.v2.enums.TimeTyp" +
      "eEnum.TimeTypeH\001\032\312\002\n\023PaymentsAccountInfo" +
      "\0229\n\023payments_account_id\030\001 \001(\0132\034.google.p" +
      "rotobuf.StringValue\022;\n\025payments_account_" +
      "name\030\002 \001(\0132\034.google.protobuf.StringValue" +
      "\0229\n\023payments_profile_id\030\003 \001(\0132\034.google.p" +
      "rotobuf.StringValue\022;\n\025payments_profile_" +
      "name\030\004 \001(\0132\034.google.protobuf.StringValue" +
      "\022C\n\035secondary_payments_profile_id\030\005 \001(\0132" +
      "\034.google.protobuf.StringValueB\014\n\nstart_t" +
      "imeB\n\n\010end_timeB\376\001\n%com.google.ads.googl" +
      "eads.v2.resourcesB\021BillingSetupProtoP\001ZJ" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v2/resources;resources\242\002\003GAA" +
      "\252\002!Google.Ads.GoogleAds.V2.Resources\312\002!G" +
      "oogle\\Ads\\GoogleAds\\V2\\Resources\352\002%Googl" +
      "e::Ads::GoogleAds::V2::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.enums.BillingSetupStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.TimeTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_BillingSetup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_BillingSetup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_BillingSetup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Status", "PaymentsAccount", "PaymentsAccountInfo", "StartDateTime", "StartTimeType", "EndDateTime", "EndTimeType", "StartTime", "EndTime", });
    internal_static_google_ads_googleads_v2_resources_BillingSetup_PaymentsAccountInfo_descriptor =
      internal_static_google_ads_googleads_v2_resources_BillingSetup_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_BillingSetup_PaymentsAccountInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_BillingSetup_PaymentsAccountInfo_descriptor,
        new java.lang.String[] { "PaymentsAccountId", "PaymentsAccountName", "PaymentsProfileId", "PaymentsProfileName", "SecondaryPaymentsProfileId", });
    com.google.ads.googleads.v2.enums.BillingSetupStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.TimeTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}