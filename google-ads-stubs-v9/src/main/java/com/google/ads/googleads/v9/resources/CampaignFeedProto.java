// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/campaign_feed.proto

package com.google.ads.googleads.v9.resources;

public final class CampaignFeedProto {
  private CampaignFeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_CampaignFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_CampaignFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v9/resources/camp" +
      "aign_feed.proto\022!google.ads.googleads.v9" +
      ".resources\0326google/ads/googleads/v9/comm" +
      "on/matching_function.proto\0324google/ads/g" +
      "oogleads/v9/enums/feed_link_status.proto" +
      "\0324google/ads/googleads/v9/enums/placehol" +
      "der_type.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\034goog" +
      "le/api/annotations.proto\"\324\004\n\014CampaignFee" +
      "d\022D\n\rresource_name\030\001 \001(\tB-\340A\005\372A\'\n%google" +
      "ads.googleapis.com/CampaignFeed\0228\n\004feed\030" +
      "\007 \001(\tB%\340A\005\372A\037\n\035googleads.googleapis.com/" +
      "FeedH\000\210\001\001\022@\n\010campaign\030\010 \001(\tB)\340A\005\372A#\n!goo" +
      "gleads.googleapis.com/CampaignH\001\210\001\001\022]\n\021p" +
      "laceholder_types\030\004 \003(\0162B.google.ads.goog" +
      "leads.v9.enums.PlaceholderTypeEnum.Place" +
      "holderType\022K\n\021matching_function\030\005 \001(\01320." +
      "google.ads.googleads.v9.common.MatchingF" +
      "unction\022U\n\006status\030\006 \001(\0162@.google.ads.goo" +
      "gleads.v9.enums.FeedLinkStatusEnum.FeedL" +
      "inkStatusB\003\340A\003:i\352Af\n%googleads.googleapi" +
      "s.com/CampaignFeed\022=customers/{customer_" +
      "id}/campaignFeeds/{campaign_id}~{feed_id" +
      "}B\007\n\005_feedB\013\n\t_campaignB\376\001\n%com.google.a" +
      "ds.googleads.v9.resourcesB\021CampaignFeedP" +
      "rotoP\001ZJgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v9/resources;resourc" +
      "es\242\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Resou" +
      "rces\312\002!Google\\Ads\\GoogleAds\\V9\\Resources" +
      "\352\002%Google::Ads::GoogleAds::V9::Resources" +
      "b\006proto3"
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
    internal_static_google_ads_googleads_v9_resources_CampaignFeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_CampaignFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_CampaignFeed_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Campaign", "PlaceholderTypes", "MatchingFunction", "Status", "Feed", "Campaign", });
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
