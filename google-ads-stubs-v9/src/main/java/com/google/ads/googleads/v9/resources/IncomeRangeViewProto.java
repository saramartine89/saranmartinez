// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/income_range_view.proto

package com.google.ads.googleads.v9.resources;

public final class IncomeRangeViewProto {
  private IncomeRangeViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_IncomeRangeView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_IncomeRangeView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v9/resources/inco" +
      "me_range_view.proto\022!google.ads.googlead" +
      "s.v9.resources\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\034goog" +
      "le/api/annotations.proto\"\320\001\n\017IncomeRange" +
      "View\022G\n\rresource_name\030\001 \001(\tB0\340A\003\372A*\n(goo" +
      "gleads.googleapis.com/IncomeRangeView:t\352" +
      "Aq\n(googleads.googleapis.com/IncomeRange" +
      "View\022Ecustomers/{customer_id}/incomeRang" +
      "eViews/{ad_group_id}~{criterion_id}B\201\002\n%" +
      "com.google.ads.googleads.v9.resourcesB\024I" +
      "ncomeRangeViewProtoP\001ZJgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v9/re" +
      "sources;resources\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V9.Resources\312\002!Google\\Ads\\GoogleA" +
      "ds\\V9\\Resources\352\002%Google::Ads::GoogleAds" +
      "::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_IncomeRangeView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_IncomeRangeView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_IncomeRangeView_descriptor,
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
