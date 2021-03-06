// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/ad_group_feed.proto

package com.google.ads.googleads.v9.resources;

public final class AdGroupFeedProto {
  private AdGroupFeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AdGroupFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AdGroupFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v9/resources/ad_g" +
      "roup_feed.proto\022!google.ads.googleads.v9" +
      ".resources\0326google/ads/googleads/v9/comm" +
      "on/matching_function.proto\0324google/ads/g" +
      "oogleads/v9/enums/feed_link_status.proto" +
      "\0324google/ads/googleads/v9/enums/placehol" +
      "der_type.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\034goog" +
      "le/api/annotations.proto\"\317\004\n\013AdGroupFeed" +
      "\022C\n\rresource_name\030\001 \001(\tB,\340A\005\372A&\n$googlea" +
      "ds.googleapis.com/AdGroupFeed\0228\n\004feed\030\007 " +
      "\001(\tB%\340A\005\372A\037\n\035googleads.googleapis.com/Fe" +
      "edH\000\210\001\001\022?\n\010ad_group\030\010 \001(\tB(\340A\005\372A\"\n googl" +
      "eads.googleapis.com/AdGroupH\001\210\001\001\022]\n\021plac" +
      "eholder_types\030\004 \003(\0162B.google.ads.googlea" +
      "ds.v9.enums.PlaceholderTypeEnum.Placehol" +
      "derType\022K\n\021matching_function\030\005 \001(\01320.goo" +
      "gle.ads.googleads.v9.common.MatchingFunc" +
      "tion\022U\n\006status\030\006 \001(\0162@.google.ads.google" +
      "ads.v9.enums.FeedLinkStatusEnum.FeedLink" +
      "StatusB\003\340A\003:g\352Ad\n$googleads.googleapis.c" +
      "om/AdGroupFeed\022<customers/{customer_id}/" +
      "adGroupFeeds/{ad_group_id}~{feed_id}B\007\n\005" +
      "_feedB\013\n\t_ad_groupB\375\001\n%com.google.ads.go" +
      "ogleads.v9.resourcesB\020AdGroupFeedProtoP\001" +
      "ZJgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v9/resources;resources\242\002\003G" +
      "AA\252\002!Google.Ads.GoogleAds.V9.Resources\312\002" +
      "!Google\\Ads\\GoogleAds\\V9\\Resources\352\002%Goo" +
      "gle::Ads::GoogleAds::V9::Resourcesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.MatchingFunctionProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.FeedLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_AdGroupFeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_AdGroupFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AdGroupFeed_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "AdGroup", "PlaceholderTypes", "MatchingFunction", "Status", "Feed", "AdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.MatchingFunctionProto.getDescriptor();
    com.google.ads.googleads.v9.enums.FeedLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.PlaceholderTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
