// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/ad_service.proto

package com.google.ads.googleads.v9.services;

public final class AdServiceProto {
  private AdServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetAdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetAdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_AdOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_AdOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v9/services/ad_se" +
      "rvice.proto\022 google.ads.googleads.v9.ser" +
      "vices\032+google/ads/googleads/v9/common/po" +
      "licy.proto\0329google/ads/googleads/v9/enum" +
      "s/response_content_type.proto\032*google/ad" +
      "s/googleads/v9/resources/ad.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\032 google/pro" +
      "tobuf/field_mask.proto\032\027google/rpc/statu" +
      "s.proto\"J\n\014GetAdRequest\022:\n\rresource_name" +
      "\030\001 \001(\tB#\340A\002\372A\035\n\033googleads.googleapis.com" +
      "/Ad\"\217\002\n\020MutateAdsRequest\022\030\n\013customer_id\030" +
      "\001 \001(\tB\003\340A\002\022F\n\noperations\030\002 \003(\0132-.google." +
      "ads.googleads.v9.services.AdOperationB\003\340" +
      "A\002\022\027\n\017partial_failure\030\004 \001(\010\022i\n\025response_" +
      "content_type\030\005 \001(\0162J.google.ads.googlead" +
      "s.v9.enums.ResponseContentTypeEnum.Respo" +
      "nseContentType\022\025\n\rvalidate_only\030\003 \001(\010\"\344\001" +
      "\n\013AdOperation\022/\n\013update_mask\030\002 \001(\0132\032.goo" +
      "gle.protobuf.FieldMask\022^\n\033policy_validat" +
      "ion_parameter\030\003 \001(\01329.google.ads.googlea" +
      "ds.v9.common.PolicyValidationParameter\0227" +
      "\n\006update\030\001 \001(\0132%.google.ads.googleads.v9" +
      ".resources.AdH\000B\013\n\toperation\"\211\001\n\021MutateA" +
      "dsResponse\0221\n\025partial_failure_error\030\003 \001(" +
      "\0132\022.google.rpc.Status\022A\n\007results\030\002 \003(\01320" +
      ".google.ads.googleads.v9.services.Mutate" +
      "AdResult\"Z\n\016MutateAdResult\022\025\n\rresource_n" +
      "ame\030\001 \001(\t\0221\n\002ad\030\002 \001(\0132%.google.ads.googl" +
      "eads.v9.resources.Ad2\267\003\n\tAdService\022\235\001\n\005G" +
      "etAd\022..google.ads.googleads.v9.services." +
      "GetAdRequest\032%.google.ads.googleads.v9.r" +
      "esources.Ad\"=\202\323\344\223\002\'\022%/v9/{resource_name=" +
      "customers/*/ads/*}\332A\rresource_name\022\302\001\n\tM" +
      "utateAds\0222.google.ads.googleads.v9.servi" +
      "ces.MutateAdsRequest\0323.google.ads.google" +
      "ads.v9.services.MutateAdsResponse\"L\202\323\344\223\002" +
      "-\"(/v9/customers/{customer_id=*}/ads:mut" +
      "ate:\001*\332A\026customer_id,operations\032E\312A\030goog" +
      "leads.googleapis.com\322A\'https://www.googl" +
      "eapis.com/auth/adwordsB\365\001\n$com.google.ad" +
      "s.googleads.v9.servicesB\016AdServiceProtoP" +
      "\001ZHgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v9/services;services\242\002\003GA" +
      "A\252\002 Google.Ads.GoogleAds.V9.Services\312\002 G" +
      "oogle\\Ads\\GoogleAds\\V9\\Services\352\002$Google" +
      "::Ads::GoogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.AdProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetAdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetAdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetAdRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_MutateAdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_MutateAdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ResponseContentType", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_AdOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_AdOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_AdOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "PolicyValidationParameter", "Update", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateAdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateAdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v9_services_MutateAdResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_MutateAdResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdResult_descriptor,
        new java.lang.String[] { "ResourceName", "Ad", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v9.resources.AdProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
