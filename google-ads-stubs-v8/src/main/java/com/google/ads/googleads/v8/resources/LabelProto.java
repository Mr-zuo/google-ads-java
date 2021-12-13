// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/label.proto

package com.google.ads.googleads.v8.resources;

public final class LabelProto {
  private LabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_Label_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_Label_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v8/resources/labe" +
      "l.proto\022!google.ads.googleads.v8.resourc" +
      "es\032/google/ads/googleads/v8/common/text_" +
      "label.proto\0320google/ads/googleads/v8/enu" +
      "ms/label_status.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032\034google/api/annotations.proto\"\337\002\n\005Labe" +
      "l\022=\n\rresource_name\030\001 \001(\tB&\340A\005\372A \n\036google" +
      "ads.googleapis.com/Label\022\024\n\002id\030\006 \001(\003B\003\340A" +
      "\003H\000\210\001\001\022\021\n\004name\030\007 \001(\tH\001\210\001\001\022O\n\006status\030\004 \001(" +
      "\0162:.google.ads.googleads.v8.enums.LabelS" +
      "tatusEnum.LabelStatusB\003\340A\003\022=\n\ntext_label" +
      "\030\005 \001(\0132).google.ads.googleads.v8.common." +
      "TextLabel:N\352AK\n\036googleads.googleapis.com" +
      "/Label\022)customers/{customer_id}/labels/{" +
      "label_id}B\005\n\003_idB\007\n\005_nameB\367\001\n%com.google" +
      ".ads.googleads.v8.resourcesB\nLabelProtoP" +
      "\001ZJgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v8/resources;resources\242\002\003" +
      "GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312" +
      "\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Go" +
      "ogle::Ads::GoogleAds::V8::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.common.TextLabelProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.LabelStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_Label_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_Label_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_Label_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "TextLabel", "Id", "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.common.TextLabelProto.getDescriptor();
    com.google.ads.googleads.v8.enums.LabelStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}