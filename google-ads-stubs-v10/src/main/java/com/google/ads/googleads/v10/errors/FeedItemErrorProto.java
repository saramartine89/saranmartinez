// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/feed_item_error.proto

package com.google.ads.googleads.v10.errors;

public final class FeedItemErrorProto {
  private FeedItemErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_FeedItemErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_FeedItemErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v10/errors/feed_i" +
      "tem_error.proto\022\037google.ads.googleads.v1" +
      "0.errors\032\034google/api/annotations.proto\"\207" +
      "\003\n\021FeedItemErrorEnum\"\361\002\n\rFeedItemError\022\017" +
      "\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022.\n*CANNOT_C" +
      "ONVERT_ATTRIBUTE_VALUE_FROM_STRING\020\002\022\'\n#" +
      "CANNOT_OPERATE_ON_REMOVED_FEED_ITEM\020\003\022*\n" +
      "&DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE\020" +
      "\004\022\034\n\030KEY_ATTRIBUTES_NOT_FOUND\020\005\022\017\n\013INVAL" +
      "ID_URL\020\006\022\032\n\026MISSING_KEY_ATTRIBUTES\020\007\022\035\n\031" +
      "KEY_ATTRIBUTES_NOT_UNIQUE\020\010\022%\n!CANNOT_MO" +
      "DIFY_KEY_ATTRIBUTE_VALUE\020\t\022,\n(SIZE_TOO_L" +
      "ARGE_FOR_MULTI_VALUE_ATTRIBUTE\020\nB\362\001\n#com" +
      ".google.ads.googleads.v10.errorsB\022FeedIt" +
      "emErrorProtoP\001ZEgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v10/errors;e" +
      "rrors\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10.E" +
      "rrors\312\002\037Google\\Ads\\GoogleAds\\V10\\Errors\352" +
      "\002#Google::Ads::GoogleAds::V10::Errorsb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_FeedItemErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_FeedItemErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_FeedItemErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
