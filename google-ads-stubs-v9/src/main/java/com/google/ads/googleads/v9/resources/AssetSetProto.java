// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/asset_set.proto

package com.google.ads.googleads.v9.resources;

public final class AssetSetProto {
  private AssetSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AssetSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AssetSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AssetSet_MerchantCenterFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AssetSet_MerchantCenterFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v9/resources/asse" +
      "t_set.proto\022!google.ads.googleads.v9.res" +
      "ources\0324google/ads/googleads/v9/enums/as" +
      "set_set_status.proto\0322google/ads/googlea" +
      "ds/v9/enums/asset_set_type.proto\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\032\034google/api/annotations.pro" +
      "to\"\237\004\n\010AssetSet\022@\n\rresource_name\030\001 \001(\tB)" +
      "\340A\005\372A#\n!googleads.googleapis.com/AssetSe" +
      "t\022\021\n\004name\030\002 \001(\tB\003\340A\002\022R\n\004type\030\003 \001(\0162<.goo" +
      "gle.ads.googleads.v9.enums.AssetSetTypeE" +
      "num.AssetSetTypeB\006\340A\002\340A\005\022U\n\006status\030\004 \001(\016" +
      "2@.google.ads.googleads.v9.enums.AssetSe" +
      "tStatusEnum.AssetSetStatusB\003\340A\003\022\\\n\024merch" +
      "ant_center_feed\030\005 \001(\0132>.google.ads.googl" +
      "eads.v9.resources.AssetSet.MerchantCente" +
      "rFeed\032[\n\022MerchantCenterFeed\022\030\n\013merchant_" +
      "id\030\001 \001(\003B\003\340A\002\022\034\n\nfeed_label\030\002 \001(\tB\003\340A\001H\000" +
      "\210\001\001B\r\n\013_feed_label:X\352AU\n!googleads.googl" +
      "eapis.com/AssetSet\0220customers/{customer_" +
      "id}/assetSets/{asset_set_id}B\372\001\n%com.goo" +
      "gle.ads.googleads.v9.resourcesB\rAssetSet" +
      "ProtoP\001ZJgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v9/resources;resour" +
      "ces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Reso" +
      "urces\312\002!Google\\Ads\\GoogleAds\\V9\\Resource" +
      "s\352\002%Google::Ads::GoogleAds::V9::Resource" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.AssetSetStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.AssetSetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_AssetSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_AssetSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AssetSet_descriptor,
        new java.lang.String[] { "ResourceName", "Name", "Type", "Status", "MerchantCenterFeed", });
    internal_static_google_ads_googleads_v9_resources_AssetSet_MerchantCenterFeed_descriptor =
      internal_static_google_ads_googleads_v9_resources_AssetSet_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_AssetSet_MerchantCenterFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AssetSet_MerchantCenterFeed_descriptor,
        new java.lang.String[] { "MerchantId", "FeedLabel", "FeedLabel", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.AssetSetStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.AssetSetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
