// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/customer_feed_error.proto

package com.google.ads.googleads.v10.errors;

public final class CustomerFeedErrorProto {
  private CustomerFeedErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_CustomerFeedErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_CustomerFeedErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v10/errors/custom" +
      "er_feed_error.proto\022\037google.ads.googlead" +
      "s.v10.errors\032\034google/api/annotations.pro" +
      "to\"\367\002\n\025CustomerFeedErrorEnum\"\335\002\n\021Custome" +
      "rFeedError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001" +
      "\022,\n(FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_" +
      "TYPE\020\002\022\"\n\036CANNOT_CREATE_FOR_REMOVED_FEED" +
      "\020\003\0220\n,CANNOT_CREATE_ALREADY_EXISTING_CUS" +
      "TOMER_FEED\020\004\022\'\n#CANNOT_MODIFY_REMOVED_CU" +
      "STOMER_FEED\020\005\022\034\n\030INVALID_PLACEHOLDER_TYP" +
      "E\020\006\022,\n(MISSING_FEEDMAPPING_FOR_PLACEHOLD" +
      "ER_TYPE\020\007\0221\n-PLACEHOLDER_TYPE_NOT_ALLOWE" +
      "D_ON_CUSTOMER_FEED\020\010B\366\001\n#com.google.ads." +
      "googleads.v10.errorsB\026CustomerFeedErrorP" +
      "rotoP\001ZEgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v10/errors;errors\242\002\003" +
      "GAA\252\002\037Google.Ads.GoogleAds.V10.Errors\312\002\037" +
      "Google\\Ads\\GoogleAds\\V10\\Errors\352\002#Google" +
      "::Ads::GoogleAds::V10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_CustomerFeedErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_CustomerFeedErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_CustomerFeedErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
