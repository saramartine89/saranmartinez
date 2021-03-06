// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/feed_mapping_service.proto

package com.google.ads.googleads.v9.services;

public final class FeedMappingServiceProto {
  private FeedMappingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetFeedMappingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetFeedMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateFeedMappingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_FeedMappingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_FeedMappingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateFeedMappingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateFeedMappingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v9/services/feed_" +
      "mapping_service.proto\022 google.ads.google" +
      "ads.v9.services\0329google/ads/googleads/v9" +
      "/enums/response_content_type.proto\0324goog" +
      "le/ads/googleads/v9/resources/feed_mappi" +
      "ng.proto\032\034google/api/annotations.proto\032\027" +
      "google/api/client.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032\027google/rpc/status.proto\"\\\n\025GetFeedM" +
      "appingRequest\022C\n\rresource_name\030\001 \001(\tB,\340A" +
      "\002\372A&\n$googleads.googleapis.com/FeedMappi" +
      "ng\"\241\002\n\031MutateFeedMappingsRequest\022\030\n\013cust" +
      "omer_id\030\001 \001(\tB\003\340A\002\022O\n\noperations\030\002 \003(\01326" +
      ".google.ads.googleads.v9.services.FeedMa" +
      "ppingOperationB\003\340A\002\022\027\n\017partial_failure\030\003" +
      " \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022i\n\025response_" +
      "content_type\030\005 \001(\0162J.google.ads.googlead" +
      "s.v9.enums.ResponseContentTypeEnum.Respo" +
      "nseContentType\"w\n\024FeedMappingOperation\022@" +
      "\n\006create\030\001 \001(\0132..google.ads.googleads.v9" +
      ".resources.FeedMappingH\000\022\020\n\006remove\030\003 \001(\t" +
      "H\000B\013\n\toperation\"\233\001\n\032MutateFeedMappingsRe" +
      "sponse\0221\n\025partial_failure_error\030\003 \001(\0132\022." +
      "google.rpc.Status\022J\n\007results\030\002 \003(\01329.goo" +
      "gle.ads.googleads.v9.services.MutateFeed" +
      "MappingResult\"v\n\027MutateFeedMappingResult" +
      "\022\025\n\rresource_name\030\001 \001(\t\022D\n\014feed_mapping\030" +
      "\002 \001(\0132..google.ads.googleads.v9.resource" +
      "s.FeedMapping2\210\004\n\022FeedMappingService\022\301\001\n" +
      "\016GetFeedMapping\0227.google.ads.googleads.v" +
      "9.services.GetFeedMappingRequest\032..googl" +
      "e.ads.googleads.v9.resources.FeedMapping" +
      "\"F\202\323\344\223\0020\022./v9/{resource_name=customers/*" +
      "/feedMappings/*}\332A\rresource_name\022\346\001\n\022Mut" +
      "ateFeedMappings\022;.google.ads.googleads.v" +
      "9.services.MutateFeedMappingsRequest\032<.g" +
      "oogle.ads.googleads.v9.services.MutateFe" +
      "edMappingsResponse\"U\202\323\344\223\0026\"1/v9/customer" +
      "s/{customer_id=*}/feedMappings:mutate:\001*" +
      "\332A\026customer_id,operations\032E\312A\030googleads." +
      "googleapis.com\322A\'https://www.googleapis." +
      "com/auth/adwordsB\376\001\n$com.google.ads.goog" +
      "leads.v9.servicesB\027FeedMappingServicePro" +
      "toP\001ZHgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v9/services;services\242\002" +
      "\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312" +
      "\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Goo" +
      "gle::Ads::GoogleAds::V9::Servicesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.FeedMappingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetFeedMappingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetFeedMappingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetFeedMappingRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateFeedMappingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v9_services_FeedMappingOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_FeedMappingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_FeedMappingOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateFeedMappingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_MutateFeedMappingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateFeedMappingResult_descriptor,
        new java.lang.String[] { "ResourceName", "FeedMapping", });
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
    com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v9.resources.FeedMappingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
