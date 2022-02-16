// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/account_link.proto

package com.google.ads.googleads.v10.resources;

public final class AccountLinkProto {
  private AccountLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AccountLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AccountLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_DataPartnerLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_DataPartnerLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_GoogleAdsLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_GoogleAdsLinkIdentifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v10/resources/acc" +
      "ount_link.proto\022\"google.ads.googleads.v1" +
      "0.resources\0328google/ads/googleads/v10/en" +
      "ums/account_link_status.proto\0328google/ad" +
      "s/googleads/v10/enums/linked_account_typ" +
      "e.proto\0326google/ads/googleads/v10/enums/" +
      "mobile_app_vendor.proto\032\034google/api/anno" +
      "tations.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\333\005\n\013Ac" +
      "countLink\022C\n\rresource_name\030\001 \001(\tB,\340A\005\372A&" +
      "\n$googleads.googleapis.com/AccountLink\022!" +
      "\n\017account_link_id\030\010 \001(\003B\003\340A\003H\001\210\001\001\022W\n\006sta" +
      "tus\030\003 \001(\0162G.google.ads.googleads.v10.enu" +
      "ms.AccountLinkStatusEnum.AccountLinkStat" +
      "us\022Z\n\004type\030\004 \001(\0162G.google.ads.googleads." +
      "v10.enums.LinkedAccountTypeEnum.LinkedAc" +
      "countTypeB\003\340A\003\022r\n\031third_party_app_analyt" +
      "ics\030\005 \001(\0132H.google.ads.googleads.v10.res" +
      "ources.ThirdPartyAppAnalyticsLinkIdentif" +
      "ierB\003\340A\005H\000\022Z\n\014data_partner\030\006 \001(\0132=.googl" +
      "e.ads.googleads.v10.resources.DataPartne" +
      "rLinkIdentifierB\003\340A\003H\000\022V\n\ngoogle_ads\030\007 \001" +
      "(\0132;.google.ads.googleads.v10.resources." +
      "GoogleAdsLinkIdentifierB\003\340A\003H\000:a\352A^\n$goo" +
      "gleads.googleapis.com/AccountLink\0226custo" +
      "mers/{customer_id}/accountLinks/{account" +
      "_link_id}B\020\n\016linked_accountB\022\n\020_account_" +
      "link_id\"\364\001\n$ThirdPartyAppAnalyticsLinkId" +
      "entifier\022+\n\031app_analytics_provider_id\030\004 " +
      "\001(\003B\003\340A\005H\000\210\001\001\022\030\n\006app_id\030\005 \001(\tB\003\340A\005H\001\210\001\001\022" +
      "\\\n\napp_vendor\030\003 \001(\0162C.google.ads.googlea" +
      "ds.v10.enums.MobileAppVendorEnum.MobileA" +
      "ppVendorB\003\340A\005B\034\n\032_app_analytics_provider" +
      "_idB\t\n\007_app_id\"R\n\031DataPartnerLinkIdentif" +
      "ier\022!\n\017data_partner_id\030\001 \001(\003B\003\340A\005H\000\210\001\001B\022" +
      "\n\020_data_partner_id\"h\n\027GoogleAdsLinkIdent" +
      "ifier\022@\n\010customer\030\003 \001(\tB)\340A\005\372A#\n!googlea" +
      "ds.googleapis.com/CustomerH\000\210\001\001B\013\n\t_cust" +
      "omerB\202\002\n&com.google.ads.googleads.v10.re" +
      "sourcesB\020AccountLinkProtoP\001ZKgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v10/resources;resources\242\002\003GAA\252\002\"Google." +
      "Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads" +
      "\\GoogleAds\\V10\\Resources\352\002&Google::Ads::" +
      "GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AccountLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.LinkedAccountTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.MobileAppVendorProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_AccountLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AccountLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AccountLink_descriptor,
        new java.lang.String[] { "ResourceName", "AccountLinkId", "Status", "Type", "ThirdPartyAppAnalytics", "DataPartner", "GoogleAds", "LinkedAccount", "AccountLinkId", });
    internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor,
        new java.lang.String[] { "AppAnalyticsProviderId", "AppId", "AppVendor", "AppAnalyticsProviderId", "AppId", });
    internal_static_google_ads_googleads_v10_resources_DataPartnerLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_resources_DataPartnerLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_DataPartnerLinkIdentifier_descriptor,
        new java.lang.String[] { "DataPartnerId", "DataPartnerId", });
    internal_static_google_ads_googleads_v10_resources_GoogleAdsLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_resources_GoogleAdsLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_GoogleAdsLinkIdentifier_descriptor,
        new java.lang.String[] { "Customer", "Customer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.AccountLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.LinkedAccountTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.MobileAppVendorProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}