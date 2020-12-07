// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/ad_group_criterion_simulation.proto

package com.google.ads.googleads.v6.resources;

public final class AdGroupCriterionSimulationProto {
  private AdGroupCriterionSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_AdGroupCriterionSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_AdGroupCriterionSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v6/resources/ad_g" +
      "roup_criterion_simulation.proto\022!google." +
      "ads.googleads.v6.resources\032/google/ads/g" +
      "oogleads/v6/common/simulation.proto\032Bgoo" +
      "gle/ads/googleads/v6/enums/simulation_mo" +
      "dification_method.proto\0323google/ads/goog" +
      "leads/v6/enums/simulation_type.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032\034google/api/annotations" +
      ".proto\"\230\007\n\032AdGroupCriterionSimulation\022R\n" +
      "\rresource_name\030\001 \001(\tB;\340A\003\372A5\n3googleads." +
      "googleapis.com/AdGroupCriterionSimulatio" +
      "n\022\035\n\013ad_group_id\030\t \001(\003B\003\340A\003H\001\210\001\001\022\036\n\014crit" +
      "erion_id\030\n \001(\003B\003\340A\003H\002\210\001\001\022S\n\004type\030\004 \001(\0162@" +
      ".google.ads.googleads.v6.enums.Simulatio" +
      "nTypeEnum.SimulationTypeB\003\340A\003\022~\n\023modific" +
      "ation_method\030\005 \001(\0162\\.google.ads.googlead" +
      "s.v6.enums.SimulationModificationMethodE" +
      "num.SimulationModificationMethodB\003\340A\003\022\034\n" +
      "\nstart_date\030\013 \001(\tB\003\340A\003H\003\210\001\001\022\032\n\010end_date\030" +
      "\014 \001(\tB\003\340A\003H\004\210\001\001\022\\\n\022cpc_bid_point_list\030\010 " +
      "\001(\01329.google.ads.googleads.v6.common.Cpc" +
      "BidSimulationPointListB\003\340A\003H\000\022k\n\032percent" +
      "_cpc_bid_point_list\030\r \001(\0132@.google.ads.g" +
      "oogleads.v6.common.PercentCpcBidSimulati" +
      "onPointListB\003\340A\003H\000:\301\001\352A\275\001\n3googleads.goo" +
      "gleapis.com/AdGroupCriterionSimulation\022\205" +
      "\001customers/{customer_id}/adGroupCriterio" +
      "nSimulations/{ad_group_id}~{criterion_id" +
      "}~{type}~{modification_method}~{start_da" +
      "te}~{end_date}B\014\n\npoint_listB\016\n\014_ad_grou" +
      "p_idB\017\n\r_criterion_idB\r\n\013_start_dateB\013\n\t" +
      "_end_dateB\214\002\n%com.google.ads.googleads.v" +
      "6.resourcesB\037AdGroupCriterionSimulationP" +
      "rotoP\001ZJgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v6/resources;resourc" +
      "es\242\002\003GAA\252\002!Google.Ads.GoogleAds.V6.Resou" +
      "rces\312\002!Google\\Ads\\GoogleAds\\V6\\Resources" +
      "\352\002%Google::Ads::GoogleAds::V6::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_AdGroupCriterionSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_AdGroupCriterionSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_AdGroupCriterionSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupId", "CriterionId", "Type", "ModificationMethod", "StartDate", "EndDate", "CpcBidPointList", "PercentCpcBidPointList", "PointList", "AdGroupId", "CriterionId", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v6.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v6.enums.SimulationTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}