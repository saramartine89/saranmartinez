// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/feed_common.proto

package com.google.ads.googleads.v9.common;

public final class FeedCommonProto {
  private FeedCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_Money_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_Money_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v9/common/feed_co" +
      "mmon.proto\022\036google.ads.googleads.v9.comm" +
      "on\032\034google/api/annotations.proto\"c\n\005Mone" +
      "y\022\032\n\rcurrency_code\030\003 \001(\tH\000\210\001\001\022\032\n\ramount_" +
      "micros\030\004 \001(\003H\001\210\001\001B\020\n\016_currency_codeB\020\n\016_" +
      "amount_microsB\352\001\n\"com.google.ads.googlea" +
      "ds.v9.commonB\017FeedCommonProtoP\001ZDgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v9/common;common\242\002\003GAA\252\002\036Google.Ads" +
      ".GoogleAds.V9.Common\312\002\036Google\\Ads\\Google" +
      "Ads\\V9\\Common\352\002\"Google::Ads::GoogleAds::" +
      "V9::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_common_Money_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_common_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_Money_descriptor,
        new java.lang.String[] { "CurrencyCode", "AmountMicros", "CurrencyCode", "AmountMicros", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
