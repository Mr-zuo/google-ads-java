// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/errors/manager_link_error.proto

package com.google.ads.googleads.v6.errors;

public final class ManagerLinkErrorProto {
  private ManagerLinkErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_errors_ManagerLinkErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_errors_ManagerLinkErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v6/errors/manager" +
      "_link_error.proto\022\036google.ads.googleads." +
      "v6.errors\032\034google/api/annotations.proto\"" +
      "\305\004\n\024ManagerLinkErrorEnum\"\254\004\n\020ManagerLink" +
      "Error\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\'\n#A" +
      "CCOUNTS_NOT_COMPATIBLE_FOR_LINKING\020\002\022\025\n\021" +
      "TOO_MANY_MANAGERS\020\003\022\024\n\020TOO_MANY_INVITES\020" +
      "\004\022#\n\037ALREADY_INVITED_BY_THIS_MANAGER\020\005\022#" +
      "\n\037ALREADY_MANAGED_BY_THIS_MANAGER\020\006\022 \n\034A" +
      "LREADY_MANAGED_IN_HIERARCHY\020\007\022\031\n\025DUPLICA" +
      "TE_CHILD_FOUND\020\010\022\034\n\030CLIENT_HAS_NO_ADMIN_" +
      "USER\020\t\022\026\n\022MAX_DEPTH_EXCEEDED\020\n\022\025\n\021CYCLE_" +
      "NOT_ALLOWED\020\013\022\025\n\021TOO_MANY_ACCOUNTS\020\014\022 \n\034" +
      "TOO_MANY_ACCOUNTS_AT_MANAGER\020\r\022%\n!NON_OW" +
      "NER_USER_CANNOT_MODIFY_LINK\020\016\022(\n$SUSPEND" +
      "ED_ACCOUNT_CANNOT_ADD_CLIENTS\020\017\022\027\n\023CLIEN" +
      "T_OUTSIDE_TREE\020\020\022\031\n\025INVALID_STATUS_CHANG" +
      "E\020\021\022\022\n\016INVALID_CHANGE\020\022B\360\001\n\"com.google.a" +
      "ds.googleads.v6.errorsB\025ManagerLinkError" +
      "ProtoP\001ZDgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v6/errors;errors\242\002\003" +
      "GAA\252\002\036Google.Ads.GoogleAds.V6.Errors\312\002\036G" +
      "oogle\\Ads\\GoogleAds\\V6\\Errors\352\002\"Google::" +
      "Ads::GoogleAds::V6::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_errors_ManagerLinkErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_errors_ManagerLinkErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_errors_ManagerLinkErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}