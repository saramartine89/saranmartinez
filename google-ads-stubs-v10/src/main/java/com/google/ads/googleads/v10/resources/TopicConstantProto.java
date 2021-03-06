// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/topic_constant.proto

package com.google.ads.googleads.v10.resources;

public final class TopicConstantProto {
  private TopicConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_TopicConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_TopicConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v10/resources/top" +
      "ic_constant.proto\022\"google.ads.googleads." +
      "v10.resources\032\034google/api/annotations.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\"\274\002\n\rTopicConstan" +
      "t\022E\n\rresource_name\030\001 \001(\tB.\340A\003\372A(\n&google" +
      "ads.googleapis.com/TopicConstant\022\024\n\002id\030\005" +
      " \001(\003B\003\340A\003H\000\210\001\001\022R\n\025topic_constant_parent\030" +
      "\006 \001(\tB.\340A\003\372A(\n&googleads.googleapis.com/" +
      "TopicConstantH\001\210\001\001\022\021\n\004path\030\007 \003(\tB\003\340A\003:F\352" +
      "AC\n&googleads.googleapis.com/TopicConsta" +
      "nt\022\031topicConstants/{topic_id}B\005\n\003_idB\030\n\026" +
      "_topic_constant_parentB\204\002\n&com.google.ad" +
      "s.googleads.v10.resourcesB\022TopicConstant" +
      "ProtoP\001ZKgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v10/resources;resou" +
      "rces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Re" +
      "sources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resou" +
      "rces\352\002&Google::Ads::GoogleAds::V10::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_TopicConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_TopicConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_TopicConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "TopicConstantParent", "Path", "Id", "TopicConstantParent", });
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
