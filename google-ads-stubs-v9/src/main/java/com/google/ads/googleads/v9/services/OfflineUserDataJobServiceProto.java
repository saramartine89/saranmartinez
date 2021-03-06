// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/offline_user_data_job_service.proto

package com.google.ads.googleads.v9.services;

public final class OfflineUserDataJobServiceProto {
  private OfflineUserDataJobServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetOfflineUserDataJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetOfflineUserDataJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_RunOfflineUserDataJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_RunOfflineUserDataJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_OfflineUserDataJobOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_OfflineUserDataJobOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v9/services/offli" +
      "ne_user_data_job_service.proto\022 google.a" +
      "ds.googleads.v9.services\0326google/ads/goo" +
      "gleads/v9/common/offline_user_data.proto" +
      "\032=google/ads/googleads/v9/resources/offl" +
      "ine_user_data_job.proto\032\034google/api/anno" +
      "tations.proto\032\027google/api/client.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032#google/longrunning/o" +
      "perations.proto\032\027google/rpc/status.proto" +
      "\"\304\001\n\037CreateOfflineUserDataJobRequest\022\030\n\013" +
      "customer_id\030\001 \001(\tB\003\340A\002\022G\n\003job\030\002 \001(\01325.go" +
      "ogle.ads.googleads.v9.resources.OfflineU" +
      "serDataJobB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010\022\'" +
      "\n\037enable_match_rate_range_preview\030\005 \001(\010\"" +
      "9\n CreateOfflineUserDataJobResponse\022\025\n\rr" +
      "esource_name\030\001 \001(\t\"j\n\034GetOfflineUserData" +
      "JobRequest\022J\n\rresource_name\030\001 \001(\tB3\340A\002\372A" +
      "-\n+googleads.googleapis.com/OfflineUserD" +
      "ataJob\"\201\001\n\034RunOfflineUserDataJobRequest\022" +
      "J\n\rresource_name\030\001 \001(\tB3\340A\002\372A-\n+googlead" +
      "s.googleapis.com/OfflineUserDataJob\022\025\n\rv" +
      "alidate_only\030\002 \001(\010\"\325\002\n&AddOfflineUserDat" +
      "aJobOperationsRequest\022J\n\rresource_name\030\001" +
      " \001(\tB3\340A\002\372A-\n+googleads.googleapis.com/O" +
      "fflineUserDataJob\022#\n\026enable_partial_fail" +
      "ure\030\004 \001(\010H\000\210\001\001\022\034\n\017enable_warnings\030\006 \001(\010H" +
      "\001\210\001\001\022V\n\noperations\030\003 \003(\0132=.google.ads.go" +
      "ogleads.v9.services.OfflineUserDataJobOp" +
      "erationB\003\340A\002\022\025\n\rvalidate_only\030\005 \001(\010B\031\n\027_" +
      "enable_partial_failureB\022\n\020_enable_warnin" +
      "gs\"\270\001\n\033OfflineUserDataJobOperation\022:\n\006cr" +
      "eate\030\001 \001(\0132(.google.ads.googleads.v9.com" +
      "mon.UserDataH\000\022:\n\006remove\030\002 \001(\0132(.google." +
      "ads.googleads.v9.common.UserDataH\000\022\024\n\nre" +
      "move_all\030\003 \001(\010H\000B\013\n\toperation\"\201\001\n\'AddOff" +
      "lineUserDataJobOperationsResponse\0221\n\025par" +
      "tial_failure_error\030\001 \001(\0132\022.google.rpc.St" +
      "atus\022#\n\007warning\030\002 \001(\0132\022.google.rpc.Statu" +
      "s2\211\t\n\031OfflineUserDataJobService\022\370\001\n\030Crea" +
      "teOfflineUserDataJob\022A.google.ads.google" +
      "ads.v9.services.CreateOfflineUserDataJob" +
      "Request\032B.google.ads.googleads.v9.servic" +
      "es.CreateOfflineUserDataJobResponse\"U\202\323\344" +
      "\223\002=\"8/v9/customers/{customer_id=*}/offli" +
      "neUserDataJobs:create:\001*\332A\017customer_id,j" +
      "ob\022\335\001\n\025GetOfflineUserDataJob\022>.google.ad" +
      "s.googleads.v9.services.GetOfflineUserDa" +
      "taJobRequest\0325.google.ads.googleads.v9.r" +
      "esources.OfflineUserDataJob\"M\202\323\344\223\0027\0225/v9" +
      "/{resource_name=customers/*/offlineUserD" +
      "ataJobs/*}\332A\rresource_name\022\241\002\n\037AddOfflin" +
      "eUserDataJobOperations\022H.google.ads.goog" +
      "leads.v9.services.AddOfflineUserDataJobO" +
      "perationsRequest\032I.google.ads.googleads." +
      "v9.services.AddOfflineUserDataJobOperati" +
      "onsResponse\"i\202\323\344\223\002H\"C/v9/{resource_name=" +
      "customers/*/offlineUserDataJobs/*}:addOp" +
      "erations:\001*\332A\030resource_name,operations\022\245" +
      "\002\n\025RunOfflineUserDataJob\022>.google.ads.go" +
      "ogleads.v9.services.RunOfflineUserDataJo" +
      "bRequest\032\035.google.longrunning.Operation\"" +
      "\254\001\202\323\344\223\002>\"9/v9/{resource_name=customers/*" +
      "/offlineUserDataJobs/*}:run:\001*\332A\rresourc" +
      "e_name\312AU\n\025google.protobuf.Empty\022<google" +
      ".ads.googleads.v9.resources.OfflineUserD" +
      "ataJobMetadata\032E\312A\030googleads.googleapis." +
      "com\322A\'https://www.googleapis.com/auth/ad" +
      "wordsB\205\002\n$com.google.ads.googleads.v9.se" +
      "rvicesB\036OfflineUserDataJobServiceProtoP\001" +
      "ZHgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v9/services;services\242\002\003GAA" +
      "\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Go" +
      "ogle\\Ads\\GoogleAds\\V9\\Services\352\002$Google:" +
      ":Ads::GoogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.OfflineUserDataProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.OfflineUserDataJobProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Job", "ValidateOnly", "EnableMatchRateRangePreview", });
    internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CreateOfflineUserDataJobResponse_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_GetOfflineUserDataJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_GetOfflineUserDataJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetOfflineUserDataJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_RunOfflineUserDataJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_RunOfflineUserDataJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_RunOfflineUserDataJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "EnablePartialFailure", "EnableWarnings", "Operations", "ValidateOnly", "EnablePartialFailure", "EnableWarnings", });
    internal_static_google_ads_googleads_v9_services_OfflineUserDataJobOperation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v9_services_OfflineUserDataJobOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_OfflineUserDataJobOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "RemoveAll", "Operation", });
    internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_AddOfflineUserDataJobOperationsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Warning", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.OfflineUserDataProto.getDescriptor();
    com.google.ads.googleads.v9.resources.OfflineUserDataJobProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
