// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/campaign_customizer_service.proto

package com.google.ads.googleads.v9.services;

public final class CampaignCustomizerServiceProto {
  private CampaignCustomizerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CampaignCustomizerOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CampaignCustomizerOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizerResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v9/services/campa" +
      "ign_customizer_service.proto\022 google.ads" +
      ".googleads.v9.services\0329google/ads/googl" +
      "eads/v9/enums/response_content_type.prot" +
      "o\032;google/ads/googleads/v9/resources/cam" +
      "paign_customizer.proto\032\034google/api/annot" +
      "ations.proto\032\027google/api/client.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\027google/r" +
      "pc/status.proto\"\257\002\n MutateCampaignCustom" +
      "izersRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022V" +
      "\n\noperations\030\002 \003(\0132=.google.ads.googlead" +
      "s.v9.services.CampaignCustomizerOperatio" +
      "nB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalid" +
      "ate_only\030\004 \001(\010\022i\n\025response_content_type\030" +
      "\005 \001(\0162J.google.ads.googleads.v9.enums.Re" +
      "sponseContentTypeEnum.ResponseContentTyp" +
      "e\"\205\001\n\033CampaignCustomizerOperation\022G\n\006cre" +
      "ate\030\001 \001(\01325.google.ads.googleads.v9.reso" +
      "urces.CampaignCustomizerH\000\022\020\n\006remove\030\002 \001" +
      "(\tH\000B\013\n\toperation\"\251\001\n!MutateCampaignCust" +
      "omizersResponse\022Q\n\007results\030\001 \003(\0132@.googl" +
      "e.ads.googleads.v9.services.MutateCampai" +
      "gnCustomizerResult\0221\n\025partial_failure_er" +
      "ror\030\002 \001(\0132\022.google.rpc.Status\"\213\001\n\036Mutate" +
      "CampaignCustomizerResult\022\025\n\rresource_nam" +
      "e\030\001 \001(\t\022R\n\023campaign_customizer\030\002 \001(\01325.g" +
      "oogle.ads.googleads.v9.resources.Campaig" +
      "nCustomizer2\347\002\n\031CampaignCustomizerServic" +
      "e\022\202\002\n\031MutateCampaignCustomizers\022B.google" +
      ".ads.googleads.v9.services.MutateCampaig" +
      "nCustomizersRequest\032C.google.ads.googlea" +
      "ds.v9.services.MutateCampaignCustomizers" +
      "Response\"\\\202\323\344\223\002=\"8/v9/customers/{custome" +
      "r_id=*}/campaignCustomizers:mutate:\001*\332A\026" +
      "customer_id,operations\032E\312A\030googleads.goo" +
      "gleapis.com\322A\'https://www.googleapis.com" +
      "/auth/adwordsB\205\002\n$com.google.ads.googlea" +
      "ds.v9.servicesB\036CampaignCustomizerServic" +
      "eProtoP\001ZHgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v9/services;servic" +
      "es\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Servi" +
      "ces\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002" +
      "$Google::Ads::GoogleAds::V9::Servicesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.CampaignCustomizerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v9_services_CampaignCustomizerOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_CampaignCustomizerOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CampaignCustomizerOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizersResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizerResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCampaignCustomizerResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignCustomizer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v9.resources.CampaignCustomizerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
