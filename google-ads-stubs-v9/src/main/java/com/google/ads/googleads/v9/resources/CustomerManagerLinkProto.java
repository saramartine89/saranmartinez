// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/customer_manager_link.proto

package com.google.ads.googleads.v9.resources;

public final class CustomerManagerLinkProto {
  private CustomerManagerLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_CustomerManagerLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_CustomerManagerLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v9/resources/cust" +
      "omer_manager_link.proto\022!google.ads.goog" +
      "leads.v9.resources\0327google/ads/googleads" +
      "/v9/enums/manager_link_status.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\034google/api/annotations." +
      "proto\"\333\003\n\023CustomerManagerLink\022K\n\rresourc" +
      "e_name\030\001 \001(\tB4\340A\005\372A.\n,googleads.googleap" +
      "is.com/CustomerManagerLink\022H\n\020manager_cu" +
      "stomer\030\006 \001(\tB)\340A\003\372A#\n!googleads.googleap" +
      "is.com/CustomerH\000\210\001\001\022!\n\017manager_link_id\030" +
      "\007 \001(\003B\003\340A\003H\001\210\001\001\022V\n\006status\030\005 \001(\0162F.google" +
      ".ads.googleads.v9.enums.ManagerLinkStatu" +
      "sEnum.ManagerLinkStatus:\210\001\352A\204\001\n,googlead" +
      "s.googleapis.com/CustomerManagerLink\022Tcu" +
      "stomers/{customer_id}/customerManagerLin" +
      "ks/{manager_customer_id}~{manager_link_i" +
      "d}B\023\n\021_manager_customerB\022\n\020_manager_link" +
      "_idB\205\002\n%com.google.ads.googleads.v9.reso" +
      "urcesB\030CustomerManagerLinkProtoP\001ZJgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v9/resources;resources\242\002\003GAA\252\002!Go" +
      "ogle.Ads.GoogleAds.V9.Resources\312\002!Google" +
      "\\Ads\\GoogleAds\\V9\\Resources\352\002%Google::Ad" +
      "s::GoogleAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.ManagerLinkStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_CustomerManagerLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_CustomerManagerLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_CustomerManagerLink_descriptor,
        new java.lang.String[] { "ResourceName", "ManagerCustomer", "ManagerLinkId", "Status", "ManagerCustomer", "ManagerLinkId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.ManagerLinkStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
