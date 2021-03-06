// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/bidding_strategy.proto

package com.google.ads.googleads.v10.resources;

public final class BiddingStrategyProto {
  private BiddingStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_BiddingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_BiddingStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v10/resources/bid" +
      "ding_strategy.proto\022\"google.ads.googlead" +
      "s.v10.resources\032-google/ads/googleads/v1" +
      "0/common/bidding.proto\032<google/ads/googl" +
      "eads/v10/enums/bidding_strategy_status.p" +
      "roto\032:google/ads/googleads/v10/enums/bid" +
      "ding_strategy_type.proto\032\034google/api/ann" +
      "otations.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\"\332\t\n\017B" +
      "iddingStrategy\022G\n\rresource_name\030\001 \001(\tB0\340" +
      "A\005\372A*\n(googleads.googleapis.com/BiddingS" +
      "trategy\022\024\n\002id\030\020 \001(\003B\003\340A\003H\001\210\001\001\022\021\n\004name\030\021 " +
      "\001(\tH\002\210\001\001\022d\n\006status\030\017 \001(\0162O.google.ads.go" +
      "ogleads.v10.enums.BiddingStrategyStatusE" +
      "num.BiddingStrategyStatusB\003\340A\003\022^\n\004type\030\005" +
      " \001(\0162K.google.ads.googleads.v10.enums.Bi" +
      "ddingStrategyTypeEnum.BiddingStrategyTyp" +
      "eB\003\340A\003\022\032\n\rcurrency_code\030\027 \001(\tB\003\340A\005\022)\n\027ef" +
      "fective_currency_code\030\024 \001(\tB\003\340A\003H\003\210\001\001\022 \n" +
      "\016campaign_count\030\022 \001(\003B\003\340A\003H\004\210\001\001\022,\n\032non_r" +
      "emoved_campaign_count\030\023 \001(\003B\003\340A\003H\005\210\001\001\022D\n" +
      "\014enhanced_cpc\030\007 \001(\0132,.google.ads.googlea" +
      "ds.v10.common.EnhancedCpcH\000\022]\n\031maximize_" +
      "conversion_value\030\025 \001(\01328.google.ads.goog" +
      "leads.v10.common.MaximizeConversionValue" +
      "H\000\022T\n\024maximize_conversions\030\026 \001(\01324.googl" +
      "e.ads.googleads.v10.common.MaximizeConve" +
      "rsionsH\000\022@\n\ntarget_cpa\030\t \001(\0132*.google.ad" +
      "s.googleads.v10.common.TargetCpaH\000\022Y\n\027ta" +
      "rget_impression_share\0300 \001(\01326.google.ads" +
      ".googleads.v10.common.TargetImpressionSh" +
      "areH\000\022B\n\013target_roas\030\013 \001(\0132+.google.ads." +
      "googleads.v10.common.TargetRoasH\000\022D\n\014tar" +
      "get_spend\030\014 \001(\0132,.google.ads.googleads.v" +
      "10.common.TargetSpendH\000:n\352Ak\n(googleads." +
      "googleapis.com/BiddingStrategy\022?customer" +
      "s/{customer_id}/biddingStrategies/{biddi" +
      "ng_strategy_id}B\010\n\006schemeB\005\n\003_idB\007\n\005_nam" +
      "eB\032\n\030_effective_currency_codeB\021\n\017_campai" +
      "gn_countB\035\n\033_non_removed_campaign_countB" +
      "\206\002\n&com.google.ads.googleads.v10.resourc" +
      "esB\024BiddingStrategyProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v10/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V10.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V10\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.BiddingStrategyStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_BiddingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_BiddingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_BiddingStrategy_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "CurrencyCode", "EffectiveCurrencyCode", "CampaignCount", "NonRemovedCampaignCount", "EnhancedCpc", "MaximizeConversionValue", "MaximizeConversions", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "Scheme", "Id", "Name", "EffectiveCurrencyCode", "CampaignCount", "NonRemovedCampaignCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v10.enums.BiddingStrategyStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
