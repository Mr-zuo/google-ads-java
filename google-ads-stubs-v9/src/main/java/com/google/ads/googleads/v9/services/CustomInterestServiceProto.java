// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/custom_interest_service.proto

package com.google.ads.googleads.v9.services;

public final class CustomInterestServiceProto {
  private CustomInterestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetCustomInterestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetCustomInterestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomInterestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CustomInterestOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CustomInterestOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomInterestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomInterestResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v9/services/custo" +
      "m_interest_service.proto\022 google.ads.goo" +
      "gleads.v9.services\0327google/ads/googleads" +
      "/v9/resources/custom_interest.proto\032\034goo" +
      "gle/api/annotations.proto\032\027google/api/cl" +
      "ient.proto\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\032 google/p" +
      "rotobuf/field_mask.proto\"b\n\030GetCustomInt" +
      "erestRequest\022F\n\rresource_name\030\001 \001(\tB/\340A\002" +
      "\372A)\n\'googleads.googleapis.com/CustomInte" +
      "rest\"\243\001\n\034MutateCustomInterestsRequest\022\030\n" +
      "\013customer_id\030\001 \001(\tB\003\340A\002\022R\n\noperations\030\002 " +
      "\003(\01329.google.ads.googleads.v9.services.C" +
      "ustomInterestOperationB\003\340A\002\022\025\n\rvalidate_" +
      "only\030\004 \001(\010\"\341\001\n\027CustomInterestOperation\022/" +
      "\n\013update_mask\030\004 \001(\0132\032.google.protobuf.Fi" +
      "eldMask\022C\n\006create\030\001 \001(\01321.google.ads.goo" +
      "gleads.v9.resources.CustomInterestH\000\022C\n\006" +
      "update\030\002 \001(\01321.google.ads.googleads.v9.r" +
      "esources.CustomInterestH\000B\013\n\toperation\"n" +
      "\n\035MutateCustomInterestsResponse\022M\n\007resul" +
      "ts\030\002 \003(\0132<.google.ads.googleads.v9.servi" +
      "ces.MutateCustomInterestResult\"3\n\032Mutate" +
      "CustomInterestResult\022\025\n\rresource_name\030\001 " +
      "\001(\t2\243\004\n\025CustomInterestService\022\315\001\n\021GetCus" +
      "tomInterest\022:.google.ads.googleads.v9.se" +
      "rvices.GetCustomInterestRequest\0321.google" +
      ".ads.googleads.v9.resources.CustomIntere" +
      "st\"I\202\323\344\223\0023\0221/v9/{resource_name=customers" +
      "/*/customInterests/*}\332A\rresource_name\022\362\001" +
      "\n\025MutateCustomInterests\022>.google.ads.goo" +
      "gleads.v9.services.MutateCustomInterests" +
      "Request\032?.google.ads.googleads.v9.servic" +
      "es.MutateCustomInterestsResponse\"X\202\323\344\223\0029" +
      "\"4/v9/customers/{customer_id=*}/customIn" +
      "terests:mutate:\001*\332A\026customer_id,operatio" +
      "ns\032E\312A\030googleads.googleapis.com\322A\'https:" +
      "//www.googleapis.com/auth/adwordsB\201\002\n$co" +
      "m.google.ads.googleads.v9.servicesB\032Cust" +
      "omInterestServiceProtoP\001ZHgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v9" +
      "/services;services\242\002\003GAA\252\002 Google.Ads.Go" +
      "ogleAds.V9.Services\312\002 Google\\Ads\\GoogleA" +
      "ds\\V9\\Services\352\002$Google::Ads::GoogleAds:" +
      ":V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.CustomInterestProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetCustomInterestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetCustomInterestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetCustomInterestRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomInterestsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_CustomInterestOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_CustomInterestOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CustomInterestOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomInterestsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_MutateCustomInterestResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomInterestResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.resources.CustomInterestProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}