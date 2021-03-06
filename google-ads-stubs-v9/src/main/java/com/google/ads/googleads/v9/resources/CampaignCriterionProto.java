// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/campaign_criterion.proto

package com.google.ads.googleads.v9.resources;

public final class CampaignCriterionProto {
  private CampaignCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v9/resources/camp" +
      "aign_criterion.proto\022!google.ads.googlea" +
      "ds.v9.resources\032-google/ads/googleads/v9" +
      "/common/criteria.proto\032=google/ads/googl" +
      "eads/v9/enums/campaign_criterion_status." +
      "proto\0322google/ads/googleads/v9/enums/cri" +
      "terion_type.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\034g" +
      "oogle/api/annotations.proto\"\244\027\n\021Campaign" +
      "Criterion\022I\n\rresource_name\030\001 \001(\tB2\340A\005\372A," +
      "\n*googleads.googleapis.com/CampaignCrite" +
      "rion\022@\n\010campaign\030% \001(\tB)\340A\005\372A#\n!googlead" +
      "s.googleapis.com/CampaignH\001\210\001\001\022\036\n\014criter" +
      "ion_id\030& \001(\003B\003\340A\003H\002\210\001\001\022\031\n\014display_name\030+" +
      " \001(\tB\003\340A\003\022\031\n\014bid_modifier\030\' \001(\002H\003\210\001\001\022\032\n\010" +
      "negative\030( \001(\010B\003\340A\005H\004\210\001\001\022Q\n\004type\030\006 \001(\0162>" +
      ".google.ads.googleads.v9.enums.Criterion" +
      "TypeEnum.CriterionTypeB\003\340A\003\022b\n\006status\030# " +
      "\001(\0162R.google.ads.googleads.v9.enums.Camp" +
      "aignCriterionStatusEnum.CampaignCriterio" +
      "nStatus\022C\n\007keyword\030\010 \001(\0132+.google.ads.go" +
      "ogleads.v9.common.KeywordInfoB\003\340A\005H\000\022G\n\t" +
      "placement\030\t \001(\0132-.google.ads.googleads.v" +
      "9.common.PlacementInfoB\003\340A\005H\000\022Y\n\023mobile_" +
      "app_category\030\n \001(\01325.google.ads.googlead" +
      "s.v9.common.MobileAppCategoryInfoB\003\340A\005H\000" +
      "\022X\n\022mobile_application\030\013 \001(\01325.google.ad" +
      "s.googleads.v9.common.MobileApplicationI" +
      "nfoB\003\340A\005H\000\022E\n\010location\030\014 \001(\0132,.google.ad" +
      "s.googleads.v9.common.LocationInfoB\003\340A\005H" +
      "\000\022A\n\006device\030\r \001(\0132*.google.ads.googleads" +
      ".v9.common.DeviceInfoB\003\340A\005H\000\022J\n\013ad_sched" +
      "ule\030\017 \001(\0132..google.ads.googleads.v9.comm" +
      "on.AdScheduleInfoB\003\340A\005H\000\022F\n\tage_range\030\020 " +
      "\001(\0132,.google.ads.googleads.v9.common.Age" +
      "RangeInfoB\003\340A\005H\000\022A\n\006gender\030\021 \001(\0132*.googl" +
      "e.ads.googleads.v9.common.GenderInfoB\003\340A" +
      "\005H\000\022L\n\014income_range\030\022 \001(\0132/.google.ads.g" +
      "oogleads.v9.common.IncomeRangeInfoB\003\340A\005H" +
      "\000\022R\n\017parental_status\030\023 \001(\01322.google.ads." +
      "googleads.v9.common.ParentalStatusInfoB\003" +
      "\340A\005H\000\022F\n\tuser_list\030\026 \001(\0132,.google.ads.go" +
      "ogleads.v9.common.UserListInfoB\003\340A\005H\000\022N\n" +
      "\ryoutube_video\030\024 \001(\01320.google.ads.google" +
      "ads.v9.common.YouTubeVideoInfoB\003\340A\005H\000\022R\n" +
      "\017youtube_channel\030\025 \001(\01322.google.ads.goog" +
      "leads.v9.common.YouTubeChannelInfoB\003\340A\005H" +
      "\000\022G\n\tproximity\030\027 \001(\0132-.google.ads.google" +
      "ads.v9.common.ProximityInfoB\003\340A\005H\000\022?\n\005to" +
      "pic\030\030 \001(\0132).google.ads.googleads.v9.comm" +
      "on.TopicInfoB\003\340A\005H\000\022N\n\rlisting_scope\030\031 \001" +
      "(\01320.google.ads.googleads.v9.common.List" +
      "ingScopeInfoB\003\340A\005H\000\022E\n\010language\030\032 \001(\0132,." +
      "google.ads.googleads.v9.common.LanguageI" +
      "nfoB\003\340A\005H\000\022D\n\010ip_block\030\033 \001(\0132+.google.ad" +
      "s.googleads.v9.common.IpBlockInfoB\003\340A\005H\000" +
      "\022N\n\rcontent_label\030\034 \001(\01320.google.ads.goo" +
      "gleads.v9.common.ContentLabelInfoB\003\340A\005H\000" +
      "\022C\n\007carrier\030\035 \001(\0132+.google.ads.googleads" +
      ".v9.common.CarrierInfoB\003\340A\005H\000\022N\n\ruser_in" +
      "terest\030\036 \001(\01320.google.ads.googleads.v9.c" +
      "ommon.UserInterestInfoB\003\340A\005H\000\022C\n\007webpage" +
      "\030\037 \001(\0132+.google.ads.googleads.v9.common." +
      "WebpageInfoB\003\340A\005H\000\022c\n\030operating_system_v" +
      "ersion\030  \001(\0132:.google.ads.googleads.v9.c" +
      "ommon.OperatingSystemVersionInfoB\003\340A\005H\000\022" +
      "N\n\rmobile_device\030! \001(\01320.google.ads.goog" +
      "leads.v9.common.MobileDeviceInfoB\003\340A\005H\000\022" +
      "P\n\016location_group\030\" \001(\01321.google.ads.goo" +
      "gleads.v9.common.LocationGroupInfoB\003\340A\005H" +
      "\000\022R\n\017custom_affinity\030$ \001(\01322.google.ads." +
      "googleads.v9.common.CustomAffinityInfoB\003" +
      "\340A\005H\000\022R\n\017custom_audience\030) \001(\01322.google." +
      "ads.googleads.v9.common.CustomAudienceIn" +
      "foB\003\340A\005H\000\022V\n\021combined_audience\030* \001(\01324.g" +
      "oogle.ads.googleads.v9.common.CombinedAu" +
      "dienceInfoB\003\340A\005H\000\022N\n\rkeyword_theme\030- \001(\013" +
      "20.google.ads.googleads.v9.common.Keywor" +
      "dThemeInfoB\003\340A\005H\000:v\352As\n*googleads.google" +
      "apis.com/CampaignCriterion\022Ecustomers/{c" +
      "ustomer_id}/campaignCriteria/{campaign_i" +
      "d}~{criterion_id}B\013\n\tcriterionB\013\n\t_campa" +
      "ignB\017\n\r_criterion_idB\017\n\r_bid_modifierB\013\n" +
      "\t_negativeB\203\002\n%com.google.ads.googleads." +
      "v9.resourcesB\026CampaignCriterionProtoP\001ZJ" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v9/resources;resources\242\002\003GAA" +
      "\252\002!Google.Ads.GoogleAds.V9.Resources\312\002!G" +
      "oogle\\Ads\\GoogleAds\\V9\\Resources\352\002%Googl" +
      "e::Ads::GoogleAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.CampaignCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.CriterionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "DisplayName", "BidModifier", "Negative", "Type", "Status", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "Location", "Device", "AdSchedule", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Proximity", "Topic", "ListingScope", "Language", "IpBlock", "ContentLabel", "Carrier", "UserInterest", "Webpage", "OperatingSystemVersion", "MobileDevice", "LocationGroup", "CustomAffinity", "CustomAudience", "CombinedAudience", "KeywordTheme", "Criterion", "Campaign", "CriterionId", "BidModifier", "Negative", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v9.enums.CampaignCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.CriterionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
