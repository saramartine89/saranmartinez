// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/feed_placeholder_view.proto

package com.google.ads.googleads.v3.resources;

public final class FeedPlaceholderViewProto {
  private FeedPlaceholderViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v3/resources/feed" +
      "_placeholder_view.proto\022!google.ads.goog" +
      "leads.v3.resources\0324google/ads/googleads" +
      "/v3/enums/placeholder_type.proto\032\031google" +
      "/api/resource.proto\032\034google/api/annotati" +
      "ons.proto\"\200\002\n\023FeedPlaceholderView\022\025\n\rres" +
      "ource_name\030\001 \001(\t\022\\\n\020placeholder_type\030\002 \001" +
      "(\0162B.google.ads.googleads.v3.enums.Place" +
      "holderTypeEnum.PlaceholderType:t\352Aq\n,goo" +
      "gleads.googleapis.com/FeedPlaceholderVie" +
      "w\022Acustomers/{customer}/feedPlaceholderV" +
      "iews/{feed_placeholder_view}B\205\002\n%com.goo" +
      "gle.ads.googleads.v3.resourcesB\030FeedPlac" +
      "eholderViewProtoP\001ZJgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v3/resou" +
      "rces;resources\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V3.Resources\312\002!Google\\Ads\\GoogleAds\\" +
      "V3\\Resources\352\002%Google::Ads::GoogleAds::V" +
      "3::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_descriptor,
        new java.lang.String[] { "ResourceName", "PlaceholderType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.PlaceholderTypeProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}