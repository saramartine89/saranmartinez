// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/operating_system_version_constant_service.proto

package com.google.ads.googleads.v9.services;

public final class OperatingSystemVersionConstantServiceProto {
  private OperatingSystemVersionConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetOperatingSystemVersionConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetOperatingSystemVersionConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPgoogle/ads/googleads/v9/services/opera" +
      "ting_system_version_constant_service.pro" +
      "to\022 google.ads.googleads.v9.services\032Igo" +
      "ogle/ads/googleads/v9/resources/operatin" +
      "g_system_version_constant.proto\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\202\001\n(GetOperat" +
      "ingSystemVersionConstantRequest\022V\n\rresou" +
      "rce_name\030\001 \001(\tB?\340A\002\372A9\n7googleads.google" +
      "apis.com/OperatingSystemVersionConstant2" +
      "\362\002\n%OperatingSystemVersionConstantServic" +
      "e\022\201\002\n!GetOperatingSystemVersionConstant\022" +
      "J.google.ads.googleads.v9.services.GetOp" +
      "eratingSystemVersionConstantRequest\032A.go" +
      "ogle.ads.googleads.v9.resources.Operatin" +
      "gSystemVersionConstant\"M\202\323\344\223\0027\0225/v9/{res" +
      "ource_name=operatingSystemVersionConstan" +
      "ts/*}\332A\rresource_name\032E\312A\030googleads.goog" +
      "leapis.com\322A\'https://www.googleapis.com/" +
      "auth/adwordsB\221\002\n$com.google.ads.googlead" +
      "s.v9.servicesB*OperatingSystemVersionCon" +
      "stantServiceProtoP\001ZHgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v9/serv" +
      "ices;services\242\002\003GAA\252\002 Google.Ads.GoogleA" +
      "ds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9" +
      "\\Services\352\002$Google::Ads::GoogleAds::V9::" +
      "Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.OperatingSystemVersionConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetOperatingSystemVersionConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetOperatingSystemVersionConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetOperatingSystemVersionConstantRequest_descriptor,
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
    com.google.ads.googleads.v9.resources.OperatingSystemVersionConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
