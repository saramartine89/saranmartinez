// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/paid_organic_search_term_view.proto

package com.google.ads.googleads.v9.resources;

public final class PaidOrganicSearchTermViewProto {
  private PaidOrganicSearchTermViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_PaidOrganicSearchTermView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_PaidOrganicSearchTermView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v9/resources/paid" +
      "_organic_search_term_view.proto\022!google." +
      "ads.googleads.v9.resources\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\034google/api/annotations.proto\"\275\002\n" +
      "\031PaidOrganicSearchTermView\022Q\n\rresource_n" +
      "ame\030\001 \001(\tB:\340A\003\372A4\n2googleads.googleapis." +
      "com/PaidOrganicSearchTermView\022\035\n\013search_" +
      "term\030\003 \001(\tB\003\340A\003H\000\210\001\001:\235\001\352A\231\001\n2googleads.g" +
      "oogleapis.com/PaidOrganicSearchTermView\022" +
      "ccustomers/{customer_id}/paidOrganicSear" +
      "chTermViews/{campaign_id}~{ad_group_id}~" +
      "{base64_search_term}B\016\n\014_search_termB\213\002\n" +
      "%com.google.ads.googleads.v9.resourcesB\036" +
      "PaidOrganicSearchTermViewProtoP\001ZJgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v9/resources;resources\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V9.Resources\312\002!Google\\" +
      "Ads\\GoogleAds\\V9\\Resources\352\002%Google::Ads" +
      "::GoogleAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_PaidOrganicSearchTermView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_PaidOrganicSearchTermView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_PaidOrganicSearchTermView_descriptor,
        new java.lang.String[] { "ResourceName", "SearchTerm", "SearchTerm", });
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
