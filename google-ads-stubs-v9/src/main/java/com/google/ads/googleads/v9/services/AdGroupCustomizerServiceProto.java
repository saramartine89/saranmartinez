// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/ad_group_customizer_service.proto

package com.google.ads.googleads.v9.services;

public final class AdGroupCustomizerServiceProto {
  private AdGroupCustomizerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_AdGroupCustomizerOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_AdGroupCustomizerOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizerResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v9/services/ad_gr" +
      "oup_customizer_service.proto\022 google.ads" +
      ".googleads.v9.services\0329google/ads/googl" +
      "eads/v9/enums/response_content_type.prot" +
      "o\032;google/ads/googleads/v9/resources/ad_" +
      "group_customizer.proto\032\034google/api/annot" +
      "ations.proto\032\027google/api/client.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\027google/r" +
      "pc/status.proto\"\255\002\n\037MutateAdGroupCustomi" +
      "zersRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022U\n" +
      "\noperations\030\002 \003(\0132<.google.ads.googleads" +
      ".v9.services.AdGroupCustomizerOperationB" +
      "\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidat" +
      "e_only\030\004 \001(\010\022i\n\025response_content_type\030\005 " +
      "\001(\0162J.google.ads.googleads.v9.enums.Resp" +
      "onseContentTypeEnum.ResponseContentType\"" +
      "\203\001\n\032AdGroupCustomizerOperation\022F\n\006create" +
      "\030\001 \001(\01324.google.ads.googleads.v9.resourc" +
      "es.AdGroupCustomizerH\000\022\020\n\006remove\030\002 \001(\tH\000" +
      "B\013\n\toperation\"\247\001\n MutateAdGroupCustomize" +
      "rsResponse\022P\n\007results\030\001 \003(\0132?.google.ads" +
      ".googleads.v9.services.MutateAdGroupCust" +
      "omizerResult\0221\n\025partial_failure_error\030\002 " +
      "\001(\0132\022.google.rpc.Status\"\211\001\n\035MutateAdGrou" +
      "pCustomizerResult\022\025\n\rresource_name\030\001 \001(\t" +
      "\022Q\n\023ad_group_customizer\030\002 \001(\01324.google.a" +
      "ds.googleads.v9.resources.AdGroupCustomi" +
      "zer2\342\002\n\030AdGroupCustomizerService\022\376\001\n\030Mut" +
      "ateAdGroupCustomizers\022A.google.ads.googl" +
      "eads.v9.services.MutateAdGroupCustomizer" +
      "sRequest\032B.google.ads.googleads.v9.servi" +
      "ces.MutateAdGroupCustomizersResponse\"[\202\323" +
      "\344\223\002<\"7/v9/customers/{customer_id=*}/adGr" +
      "oupCustomizers:mutate:\001*\332A\026customer_id,o" +
      "perations\032E\312A\030googleads.googleapis.com\322A" +
      "\'https://www.googleapis.com/auth/adwords" +
      "B\204\002\n$com.google.ads.googleads.v9.service" +
      "sB\035AdGroupCustomizerServiceProtoP\001ZHgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v9/services;services\242\002\003GAA\252\002 Goo" +
      "gle.Ads.GoogleAds.V9.Services\312\002 Google\\A" +
      "ds\\GoogleAds\\V9\\Services\352\002$Google::Ads::" +
      "GoogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.AdGroupCustomizerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v9_services_AdGroupCustomizerOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_AdGroupCustomizerOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_AdGroupCustomizerOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizersResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizerResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdGroupCustomizerResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCustomizer", });
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
    com.google.ads.googleads.v9.resources.AdGroupCustomizerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
