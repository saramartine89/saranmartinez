// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/asset_service.proto

package com.google.ads.googleads.v9.services;

public final class AssetServiceProto {
  private AssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetAssetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetAssetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_AssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_AssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v9/services/asset" +
      "_service.proto\022 google.ads.googleads.v9." +
      "services\0329google/ads/googleads/v9/enums/" +
      "response_content_type.proto\032-google/ads/" +
      "googleads/v9/resources/asset.proto\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032 google/pr" +
      "otobuf/field_mask.proto\032\027google/rpc/stat" +
      "us.proto\"P\n\017GetAssetRequest\022=\n\rresource_" +
      "name\030\001 \001(\tB&\340A\002\372A \n\036googleads.googleapis" +
      ".com/Asset\"\225\002\n\023MutateAssetsRequest\022\030\n\013cu" +
      "stomer_id\030\001 \001(\tB\003\340A\002\022I\n\noperations\030\002 \003(\013" +
      "20.google.ads.googleads.v9.services.Asse" +
      "tOperationB\003\340A\002\022\027\n\017partial_failure\030\005 \001(\010" +
      "\022i\n\025response_content_type\030\003 \001(\0162J.google" +
      ".ads.googleads.v9.enums.ResponseContentT" +
      "ypeEnum.ResponseContentType\022\025\n\rvalidate_" +
      "only\030\004 \001(\010\"\306\001\n\016AssetOperation\022/\n\013update_" +
      "mask\030\003 \001(\0132\032.google.protobuf.FieldMask\022:" +
      "\n\006create\030\001 \001(\0132(.google.ads.googleads.v9" +
      ".resources.AssetH\000\022:\n\006update\030\002 \001(\0132(.goo" +
      "gle.ads.googleads.v9.resources.AssetH\000B\013" +
      "\n\toperation\"\217\001\n\024MutateAssetsResponse\0221\n\025" +
      "partial_failure_error\030\003 \001(\0132\022.google.rpc" +
      ".Status\022D\n\007results\030\002 \003(\01323.google.ads.go" +
      "ogleads.v9.services.MutateAssetResult\"c\n" +
      "\021MutateAssetResult\022\025\n\rresource_name\030\001 \001(" +
      "\t\0227\n\005asset\030\002 \001(\0132(.google.ads.googleads." +
      "v9.resources.Asset2\322\003\n\014AssetService\022\251\001\n\010" +
      "GetAsset\0221.google.ads.googleads.v9.servi" +
      "ces.GetAssetRequest\032(.google.ads.googlea" +
      "ds.v9.resources.Asset\"@\202\323\344\223\002*\022(/v9/{reso" +
      "urce_name=customers/*/assets/*}\332A\rresour" +
      "ce_name\022\316\001\n\014MutateAssets\0225.google.ads.go" +
      "ogleads.v9.services.MutateAssetsRequest\032" +
      "6.google.ads.googleads.v9.services.Mutat" +
      "eAssetsResponse\"O\202\323\344\223\0020\"+/v9/customers/{" +
      "customer_id=*}/assets:mutate:\001*\332A\026custom" +
      "er_id,operations\032E\312A\030googleads.googleapi" +
      "s.com\322A\'https://www.googleapis.com/auth/" +
      "adwordsB\370\001\n$com.google.ads.googleads.v9." +
      "servicesB\021AssetServiceProtoP\001ZHgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v9/services;services\242\002\003GAA\252\002 Google.A" +
      "ds.GoogleAds.V9.Services\312\002 Google\\Ads\\Go" +
      "ogleAds\\V9\\Services\352\002$Google::Ads::Googl" +
      "eAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.AssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetAssetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetAssetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetAssetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_MutateAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_MutateAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ResponseContentType", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_AssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_AssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_AssetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAssetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v9_services_MutateAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_MutateAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAssetResult_descriptor,
        new java.lang.String[] { "ResourceName", "Asset", });
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
    com.google.ads.googleads.v9.resources.AssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
