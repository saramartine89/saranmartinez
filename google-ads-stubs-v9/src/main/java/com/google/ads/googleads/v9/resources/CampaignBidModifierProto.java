// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/campaign_bid_modifier.proto

package com.google.ads.googleads.v9.resources;

public final class CampaignBidModifierProto {
  private CampaignBidModifierProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_CampaignBidModifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_CampaignBidModifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v9/resources/camp" +
      "aign_bid_modifier.proto\022!google.ads.goog" +
      "leads.v9.resources\032-google/ads/googleads" +
      "/v9/common/criteria.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032\034google/api/annotations.proto\"\357\003\n\023" +
      "CampaignBidModifier\022K\n\rresource_name\030\001 \001" +
      "(\tB4\340A\005\372A.\n,googleads.googleapis.com/Cam" +
      "paignBidModifier\022@\n\010campaign\030\006 \001(\tB)\340A\003\372" +
      "A#\n!googleads.googleapis.com/CampaignH\001\210" +
      "\001\001\022\036\n\014criterion_id\030\007 \001(\003B\003\340A\003H\002\210\001\001\022\031\n\014bi" +
      "d_modifier\030\010 \001(\001H\003\210\001\001\022T\n\020interaction_typ" +
      "e\030\005 \001(\01323.google.ads.googleads.v9.common" +
      ".InteractionTypeInfoB\003\340A\005H\000:|\352Ay\n,google" +
      "ads.googleapis.com/CampaignBidModifier\022I" +
      "customers/{customer_id}/campaignBidModif" +
      "iers/{campaign_id}~{criterion_id}B\013\n\tcri" +
      "terionB\013\n\t_campaignB\017\n\r_criterion_idB\017\n\r" +
      "_bid_modifierB\205\002\n%com.google.ads.googlea" +
      "ds.v9.resourcesB\030CampaignBidModifierProt" +
      "oP\001ZJgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v9/resources;resources\242" +
      "\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Resource" +
      "s\312\002!Google\\Ads\\GoogleAds\\V9\\Resources\352\002%" +
      "Google::Ads::GoogleAds::V9::Resourcesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.CriteriaProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_CampaignBidModifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_CampaignBidModifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_CampaignBidModifier_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "BidModifier", "InteractionType", "Criterion", "Campaign", "CriterionId", "BidModifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.CriteriaProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
