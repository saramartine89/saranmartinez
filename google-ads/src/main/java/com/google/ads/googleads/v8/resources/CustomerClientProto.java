// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/customer_client.proto

package com.google.ads.googleads.v8.resources;

public final class CustomerClientProto {
  private CustomerClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_CustomerClient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_CustomerClient_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v8/resources/cust" +
      "omer_client.proto\022!google.ads.googleads." +
      "v8.resources\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\032\034google" +
      "/api/annotations.proto\"\265\005\n\016CustomerClien" +
      "t\022F\n\rresource_name\030\001 \001(\tB/\340A\003\372A)\n\'google" +
      "ads.googleapis.com/CustomerClient\022G\n\017cli" +
      "ent_customer\030\014 \001(\tB)\340A\003\372A#\n!googleads.go" +
      "ogleapis.com/CustomerH\000\210\001\001\022\030\n\006hidden\030\r \001" +
      "(\010B\003\340A\003H\001\210\001\001\022\027\n\005level\030\016 \001(\003B\003\340A\003H\002\210\001\001\022\033\n" +
      "\ttime_zone\030\017 \001(\tB\003\340A\003H\003\210\001\001\022\036\n\014test_accou" +
      "nt\030\020 \001(\010B\003\340A\003H\004\210\001\001\022\031\n\007manager\030\021 \001(\010B\003\340A\003" +
      "H\005\210\001\001\022\"\n\020descriptive_name\030\022 \001(\tB\003\340A\003H\006\210\001" +
      "\001\022\037\n\rcurrency_code\030\023 \001(\tB\003\340A\003H\007\210\001\001\022\024\n\002id" +
      "\030\024 \001(\003B\003\340A\003H\010\210\001\001\022>\n\016applied_labels\030\025 \003(\t" +
      "B&\340A\003\372A \n\036googleads.googleapis.com/Label" +
      ":j\352Ag\n\'googleads.googleapis.com/Customer" +
      "Client\022<customers/{customer_id}/customer" +
      "Clients/{client_customer_id}B\022\n\020_client_" +
      "customerB\t\n\007_hiddenB\010\n\006_levelB\014\n\n_time_z" +
      "oneB\017\n\r_test_accountB\n\n\010_managerB\023\n\021_des" +
      "criptive_nameB\020\n\016_currency_codeB\005\n\003_idB\200" +
      "\002\n%com.google.ads.googleads.v8.resources" +
      "B\023CustomerClientProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v8/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V8.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V8\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V8::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_CustomerClient_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_CustomerClient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_CustomerClient_descriptor,
        new java.lang.String[] { "ResourceName", "ClientCustomer", "Hidden", "Level", "TimeZone", "TestAccount", "Manager", "DescriptiveName", "CurrencyCode", "Id", "AppliedLabels", "ClientCustomer", "Hidden", "Level", "TimeZone", "TestAccount", "Manager", "DescriptiveName", "CurrencyCode", "Id", });
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