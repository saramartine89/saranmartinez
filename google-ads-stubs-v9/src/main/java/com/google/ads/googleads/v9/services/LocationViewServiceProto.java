// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/location_view_service.proto

package com.google.ads.googleads.v9.services;

public final class LocationViewServiceProto {
  private LocationViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetLocationViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetLocationViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v9/services/locat" +
      "ion_view_service.proto\022 google.ads.googl" +
      "eads.v9.services\0325google/ads/googleads/v" +
      "9/resources/location_view.proto\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"^\n\026GetLocatio" +
      "nViewRequest\022D\n\rresource_name\030\001 \001(\tB-\340A\002" +
      "\372A\'\n%googleads.googleapis.com/LocationVi" +
      "ew2\244\002\n\023LocationViewService\022\305\001\n\017GetLocati" +
      "onView\0228.google.ads.googleads.v9.service" +
      "s.GetLocationViewRequest\032/.google.ads.go" +
      "ogleads.v9.resources.LocationView\"G\202\323\344\223\002" +
      "1\022//v9/{resource_name=customers/*/locati" +
      "onViews/*}\332A\rresource_name\032E\312A\030googleads" +
      ".googleapis.com\322A\'https://www.googleapis" +
      ".com/auth/adwordsB\377\001\n$com.google.ads.goo" +
      "gleads.v9.servicesB\030LocationViewServiceP" +
      "rotoP\001ZHgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v9/services;services" +
      "\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Service" +
      "s\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$G" +
      "oogle::Ads::GoogleAds::V9::Servicesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.LocationViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetLocationViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetLocationViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetLocationViewRequest_descriptor,
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
    com.google.ads.googleads.v9.resources.LocationViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
