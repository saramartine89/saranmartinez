// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/distance_view.proto

package com.google.ads.googleads.v9.resources;

public final class DistanceViewProto {
  private DistanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_DistanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_DistanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v9/resources/dist" +
      "ance_view.proto\022!google.ads.googleads.v9" +
      ".resources\0323google/ads/googleads/v9/enum" +
      "s/distance_bucket.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032\034google/api/annotations.proto\"\343\002\n\014Di" +
      "stanceView\022D\n\rresource_name\030\001 \001(\tB-\340A\003\372A" +
      "\'\n%googleads.googleapis.com/DistanceView" +
      "\022^\n\017distance_bucket\030\002 \001(\0162@.google.ads.g" +
      "oogleads.v9.enums.DistanceBucketEnum.Dis" +
      "tanceBucketB\003\340A\003\022\037\n\rmetric_system\030\004 \001(\010B" +
      "\003\340A\003H\000\210\001\001:z\352Aw\n%googleads.googleapis.com" +
      "/DistanceView\022Ncustomers/{customer_id}/d" +
      "istanceViews/{placeholder_chain_id}~{dis" +
      "tance_bucket}B\020\n\016_metric_systemB\376\001\n%com." +
      "google.ads.googleads.v9.resourcesB\021Dista" +
      "nceViewProtoP\001ZJgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v9/resources" +
      ";resources\242\002\003GAA\252\002!Google.Ads.GoogleAds." +
      "V9.Resources\312\002!Google\\Ads\\GoogleAds\\V9\\R" +
      "esources\352\002%Google::Ads::GoogleAds::V9::R" +
      "esourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.DistanceBucketProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_DistanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_DistanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_DistanceView_descriptor,
        new java.lang.String[] { "ResourceName", "DistanceBucket", "MetricSystem", "MetricSystem", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.DistanceBucketProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
