// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/database_error.proto

package com.google.ads.googleads.v10.errors;

public final class DatabaseErrorProto {
  private DatabaseErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_DatabaseErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_DatabaseErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v10/errors/databa" +
      "se_error.proto\022\037google.ads.googleads.v10" +
      ".errors\032\034google/api/annotations.proto\"\226\001" +
      "\n\021DatabaseErrorEnum\"\200\001\n\rDatabaseError\022\017\n" +
      "\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\033\n\027CONCURREN" +
      "T_MODIFICATION\020\002\022\035\n\031DATA_CONSTRAINT_VIOL" +
      "ATION\020\003\022\025\n\021REQUEST_TOO_LARGE\020\004B\362\001\n#com.g" +
      "oogle.ads.googleads.v10.errorsB\022Database" +
      "ErrorProtoP\001ZEgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v10/errors;err" +
      "ors\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10.Err" +
      "ors\312\002\037Google\\Ads\\GoogleAds\\V10\\Errors\352\002#" +
      "Google::Ads::GoogleAds::V10::Errorsb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_DatabaseErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_DatabaseErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_DatabaseErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}