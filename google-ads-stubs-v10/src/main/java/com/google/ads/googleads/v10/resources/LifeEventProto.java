// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/life_event.proto

package com.google.ads.googleads.v10.resources;

public final class LifeEventProto {
  private LifeEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_LifeEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_LifeEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v10/resources/lif" +
      "e_event.proto\022\"google.ads.googleads.v10." +
      "resources\032Egoogle/ads/googleads/v10/comm" +
      "on/criterion_category_availability.proto" +
      "\032\034google/api/annotations.proto\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\"\206\003\n\tLifeEvent\022A\n\rresource_nam" +
      "e\030\001 \001(\tB*\340A\003\372A$\n\"googleads.googleapis.co" +
      "m/LifeEvent\022\017\n\002id\030\002 \001(\003B\003\340A\003\022\021\n\004name\030\003 \001" +
      "(\tB\003\340A\003\022:\n\006parent\030\004 \001(\tB*\340A\003\372A$\n\"googlea" +
      "ds.googleapis.com/LifeEvent\022\034\n\017launched_" +
      "to_all\030\005 \001(\010B\003\340A\003\022[\n\016availabilities\030\006 \003(" +
      "\0132>.google.ads.googleads.v10.common.Crit" +
      "erionCategoryAvailabilityB\003\340A\003:[\352AX\n\"goo" +
      "gleads.googleapis.com/LifeEvent\0222custome" +
      "rs/{customer_id}/lifeEvents/{life_event_" +
      "id}B\200\002\n&com.google.ads.googleads.v10.res" +
      "ourcesB\016LifeEventProtoP\001ZKgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "0/resources;resources\242\002\003GAA\252\002\"Google.Ads" +
      ".GoogleAds.V10.Resources\312\002\"Google\\Ads\\Go" +
      "ogleAds\\V10\\Resources\352\002&Google::Ads::Goo" +
      "gleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.CriterionCategoryAvailabilityProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_LifeEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_LifeEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_LifeEvent_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Parent", "LaunchedToAll", "Availabilities", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.CriterionCategoryAvailabilityProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
