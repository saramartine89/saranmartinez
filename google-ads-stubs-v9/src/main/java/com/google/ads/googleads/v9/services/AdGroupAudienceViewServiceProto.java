// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/ad_group_audience_view_service.proto

package com.google.ads.googleads.v9.services;

public final class AdGroupAudienceViewServiceProto {
  private AdGroupAudienceViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetAdGroupAudienceViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetAdGroupAudienceViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v9/services/ad_gr" +
      "oup_audience_view_service.proto\022 google." +
      "ads.googleads.v9.services\032>google/ads/go" +
      "ogleads/v9/resources/ad_group_audience_v" +
      "iew.proto\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"l\n\035GetAdGroupAudienceViewRequest\022K\n" +
      "\rresource_name\030\001 \001(\tB4\340A\002\372A.\n,googleads." +
      "googleapis.com/AdGroupAudienceView2\307\002\n\032A" +
      "dGroupAudienceViewService\022\341\001\n\026GetAdGroup" +
      "AudienceView\022?.google.ads.googleads.v9.s" +
      "ervices.GetAdGroupAudienceViewRequest\0326." +
      "google.ads.googleads.v9.resources.AdGrou" +
      "pAudienceView\"N\202\323\344\223\0028\0226/v9/{resource_nam" +
      "e=customers/*/adGroupAudienceViews/*}\332A\r" +
      "resource_name\032E\312A\030googleads.googleapis.c" +
      "om\322A\'https://www.googleapis.com/auth/adw" +
      "ordsB\206\002\n$com.google.ads.googleads.v9.ser" +
      "vicesB\037AdGroupAudienceViewServiceProtoP\001" +
      "ZHgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v9/services;services\242\002\003GAA" +
      "\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Go" +
      "ogle\\Ads\\GoogleAds\\V9\\Services\352\002$Google:" +
      ":Ads::GoogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.AdGroupAudienceViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetAdGroupAudienceViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetAdGroupAudienceViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetAdGroupAudienceViewRequest_descriptor,
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
    com.google.ads.googleads.v9.resources.AdGroupAudienceViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
