// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/customizer_attribute.proto

package com.google.ads.googleads.v9.resources;

public final class CustomizerAttributeProto {
  private CustomizerAttributeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_CustomizerAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_CustomizerAttribute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v9/resources/cust" +
      "omizer_attribute.proto\022!google.ads.googl" +
      "eads.v9.resources\032?google/ads/googleads/" +
      "v9/enums/customizer_attribute_status.pro" +
      "to\032=google/ads/googleads/v9/enums/custom" +
      "izer_attribute_type.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032\034google/api/annotations.proto\"\330\003\n\023" +
      "CustomizerAttribute\022K\n\rresource_name\030\001 \001" +
      "(\tB4\340A\005\372A.\n,googleads.googleapis.com/Cus" +
      "tomizerAttribute\022\017\n\002id\030\002 \001(\003B\003\340A\003\022\024\n\004nam" +
      "e\030\003 \001(\tB\006\340A\002\340A\005\022e\n\004type\030\004 \001(\0162R.google.a" +
      "ds.googleads.v9.enums.CustomizerAttribut" +
      "eTypeEnum.CustomizerAttributeTypeB\003\340A\005\022k" +
      "\n\006status\030\005 \001(\0162V.google.ads.googleads.v9" +
      ".enums.CustomizerAttributeStatusEnum.Cus" +
      "tomizerAttributeStatusB\003\340A\003:y\352Av\n,google" +
      "ads.googleapis.com/CustomizerAttribute\022F" +
      "customers/{customer_id}/customizerAttrib" +
      "utes/{customizer_attribute_id}B\205\002\n%com.g" +
      "oogle.ads.googleads.v9.resourcesB\030Custom" +
      "izerAttributeProtoP\001ZJgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v9/res" +
      "ources;resources\242\002\003GAA\252\002!Google.Ads.Goog" +
      "leAds.V9.Resources\312\002!Google\\Ads\\GoogleAd" +
      "s\\V9\\Resources\352\002%Google::Ads::GoogleAds:" +
      ":V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.CustomizerAttributeStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.CustomizerAttributeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_CustomizerAttribute_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_CustomizerAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_CustomizerAttribute_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.CustomizerAttributeStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.CustomizerAttributeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
