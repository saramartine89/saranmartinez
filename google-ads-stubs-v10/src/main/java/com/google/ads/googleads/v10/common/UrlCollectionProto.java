// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/url_collection.proto

package com.google.ads.googleads.v10.common;

public final class UrlCollectionProto {
  private UrlCollectionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UrlCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UrlCollection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v10/common/url_co" +
      "llection.proto\022\037google.ads.googleads.v10" +
      ".common\032\034google/api/annotations.proto\"\262\001" +
      "\n\rUrlCollection\022\036\n\021url_collection_id\030\005 \001" +
      "(\tH\000\210\001\001\022\022\n\nfinal_urls\030\006 \003(\t\022\031\n\021final_mob" +
      "ile_urls\030\007 \003(\t\022\"\n\025tracking_url_template\030" +
      "\010 \001(\tH\001\210\001\001B\024\n\022_url_collection_idB\030\n\026_tra" +
      "cking_url_templateB\362\001\n#com.google.ads.go" +
      "ogleads.v10.commonB\022UrlCollectionProtoP\001" +
      "ZEgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v10/common;common\242\002\003GAA\252\002\037" +
      "Google.Ads.GoogleAds.V10.Common\312\002\037Google" +
      "\\Ads\\GoogleAds\\V10\\Common\352\002#Google::Ads:" +
      ":GoogleAds::V10::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_UrlCollection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_UrlCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UrlCollection_descriptor,
        new java.lang.String[] { "UrlCollectionId", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCollectionId", "TrackingUrlTemplate", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
