// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/customizer_attribute.proto

package com.google.ads.googleads.v10.resources;

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
    internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v10/resources/cus" +
      "tomizer_attribute.proto\022\"google.ads.goog" +
      "leads.v10.resources\032@google/ads/googlead" +
      "s/v10/enums/customizer_attribute_status." +
      "proto\032>google/ads/googleads/v10/enums/cu" +
      "stomizer_attribute_type.proto\032\034google/ap" +
      "i/annotations.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\"" +
      "\332\003\n\023CustomizerAttribute\022K\n\rresource_name" +
      "\030\001 \001(\tB4\340A\005\372A.\n,googleads.googleapis.com" +
      "/CustomizerAttribute\022\017\n\002id\030\002 \001(\003B\003\340A\003\022\024\n" +
      "\004name\030\003 \001(\tB\006\340A\002\340A\005\022f\n\004type\030\004 \001(\0162S.goog" +
      "le.ads.googleads.v10.enums.CustomizerAtt" +
      "ributeTypeEnum.CustomizerAttributeTypeB\003" +
      "\340A\005\022l\n\006status\030\005 \001(\0162W.google.ads.googlea" +
      "ds.v10.enums.CustomizerAttributeStatusEn" +
      "um.CustomizerAttributeStatusB\003\340A\003:y\352Av\n," +
      "googleads.googleapis.com/CustomizerAttri" +
      "bute\022Fcustomers/{customer_id}/customizer" +
      "Attributes/{customizer_attribute_id}B\212\002\n" +
      "&com.google.ads.googleads.v10.resourcesB" +
      "\030CustomizerAttributeProtoP\001ZKgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v10/resources;resources\242\002\003GAA\252\002\"Google." +
      "Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads" +
      "\\GoogleAds\\V10\\Resources\352\002&Google::Ads::" +
      "GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.CustomizerAttributeStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CustomizerAttributeTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.CustomizerAttributeStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CustomizerAttributeTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}