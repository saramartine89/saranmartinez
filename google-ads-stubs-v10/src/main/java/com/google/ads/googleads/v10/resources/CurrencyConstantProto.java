// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/currency_constant.proto

package com.google.ads.googleads.v10.resources;

public final class CurrencyConstantProto {
  private CurrencyConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CurrencyConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CurrencyConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v10/resources/cur" +
      "rency_constant.proto\022\"google.ads.googlea" +
      "ds.v10.resources\032\034google/api/annotations" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\316\002\n\020CurrencyC" +
      "onstant\022H\n\rresource_name\030\001 \001(\tB1\340A\003\372A+\n)" +
      "googleads.googleapis.com/CurrencyConstan" +
      "t\022\026\n\004code\030\006 \001(\tB\003\340A\003H\000\210\001\001\022\026\n\004name\030\007 \001(\tB" +
      "\003\340A\003H\001\210\001\001\022\030\n\006symbol\030\010 \001(\tB\003\340A\003H\002\210\001\001\022&\n\024b" +
      "illable_unit_micros\030\t \001(\003B\003\340A\003H\003\210\001\001:H\352AE" +
      "\n)googleads.googleapis.com/CurrencyConst" +
      "ant\022\030currencyConstants/{code}B\007\n\005_codeB\007" +
      "\n\005_nameB\t\n\007_symbolB\027\n\025_billable_unit_mic" +
      "rosB\207\002\n&com.google.ads.googleads.v10.res" +
      "ourcesB\025CurrencyConstantProtoP\001ZKgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v10/resources;resources\242\002\003GAA\252\002\"Goo" +
      "gle.Ads.GoogleAds.V10.Resources\312\002\"Google" +
      "\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::A" +
      "ds::GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CurrencyConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CurrencyConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CurrencyConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Code", "Name", "Symbol", "BillableUnitMicros", "Code", "Name", "Symbol", "BillableUnitMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}