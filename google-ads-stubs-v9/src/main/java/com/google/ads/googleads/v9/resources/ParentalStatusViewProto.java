// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/parental_status_view.proto

package com.google.ads.googleads.v9.resources;

public final class ParentalStatusViewProto {
  private ParentalStatusViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_ParentalStatusView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_ParentalStatusView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v9/resources/pare" +
      "ntal_status_view.proto\022!google.ads.googl" +
      "eads.v9.resources\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\034g" +
      "oogle/api/annotations.proto\"\334\001\n\022Parental" +
      "StatusView\022J\n\rresource_name\030\001 \001(\tB3\340A\003\372A" +
      "-\n+googleads.googleapis.com/ParentalStat" +
      "usView:z\352Aw\n+googleads.googleapis.com/Pa" +
      "rentalStatusView\022Hcustomers/{customer_id" +
      "}/parentalStatusViews/{ad_group_id}~{cri" +
      "terion_id}B\204\002\n%com.google.ads.googleads." +
      "v9.resourcesB\027ParentalStatusViewProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v9/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V9.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V9\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V9::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_ParentalStatusView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_ParentalStatusView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_ParentalStatusView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
