// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/ad_group_ad_asset_view_service.proto

package com.google.ads.googleads.v9.services;

public final class AdGroupAdAssetViewServiceProto {
  private AdGroupAdAssetViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetAdGroupAdAssetViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetAdGroupAdAssetViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v9/services/ad_gr" +
      "oup_ad_asset_view_service.proto\022 google." +
      "ads.googleads.v9.services\032>google/ads/go" +
      "ogleads/v9/resources/ad_group_ad_asset_v" +
      "iew.proto\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"j\n\034GetAdGroupAdAssetViewRequest\022J\n\r" +
      "resource_name\030\001 \001(\tB3\340A\002\372A-\n+googleads.g" +
      "oogleapis.com/AdGroupAdAssetView2\302\002\n\031AdG" +
      "roupAdAssetViewService\022\335\001\n\025GetAdGroupAdA" +
      "ssetView\022>.google.ads.googleads.v9.servi" +
      "ces.GetAdGroupAdAssetViewRequest\0325.googl" +
      "e.ads.googleads.v9.resources.AdGroupAdAs" +
      "setView\"M\202\323\344\223\0027\0225/v9/{resource_name=cust" +
      "omers/*/adGroupAdAssetViews/*}\332A\rresourc" +
      "e_name\032E\312A\030googleads.googleapis.com\322A\'ht" +
      "tps://www.googleapis.com/auth/adwordsB\205\002" +
      "\n$com.google.ads.googleads.v9.servicesB\036" +
      "AdGroupAdAssetViewServiceProtoP\001ZHgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v9/services;services\242\002\003GAA\252\002 Googl" +
      "e.Ads.GoogleAds.V9.Services\312\002 Google\\Ads" +
      "\\GoogleAds\\V9\\Services\352\002$Google::Ads::Go" +
      "ogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.AdGroupAdAssetViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetAdGroupAdAssetViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetAdGroupAdAssetViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetAdGroupAdAssetViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v9.resources.AdGroupAdAssetViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
