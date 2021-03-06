// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/campaign_draft_error.proto

package com.google.ads.googleads.v10.errors;

public final class CampaignDraftErrorProto {
  private CampaignDraftErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_CampaignDraftErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_CampaignDraftErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v10/errors/campai" +
      "gn_draft_error.proto\022\037google.ads.googlea" +
      "ds.v10.errors\032\034google/api/annotations.pr" +
      "oto\"\310\003\n\026CampaignDraftErrorEnum\"\255\003\n\022Campa" +
      "ignDraftError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOW" +
      "N\020\001\022\030\n\024DUPLICATE_DRAFT_NAME\020\002\022*\n&INVALID" +
      "_STATUS_TRANSITION_FROM_REMOVED\020\003\022+\n\'INV" +
      "ALID_STATUS_TRANSITION_FROM_PROMOTED\020\004\0221" +
      "\n-INVALID_STATUS_TRANSITION_FROM_PROMOTE" +
      "_FAILED\020\005\022 \n\034CUSTOMER_CANNOT_CREATE_DRAF" +
      "T\020\006\022 \n\034CAMPAIGN_CANNOT_CREATE_DRAFT\020\007\022\030\n" +
      "\024INVALID_DRAFT_CHANGE\020\010\022\035\n\031INVALID_STATU" +
      "S_TRANSITION\020\t\022-\n)MAX_NUMBER_OF_DRAFTS_P" +
      "ER_CAMPAIGN_REACHED\020\n\022\'\n#LIST_ERRORS_FOR" +
      "_PROMOTED_DRAFT_ONLY\020\013B\367\001\n#com.google.ad" +
      "s.googleads.v10.errorsB\027CampaignDraftErr" +
      "orProtoP\001ZEgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v10/errors;errors" +
      "\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10.Errors" +
      "\312\002\037Google\\Ads\\GoogleAds\\V10\\Errors\352\002#Goo" +
      "gle::Ads::GoogleAds::V10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_CampaignDraftErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_CampaignDraftErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_CampaignDraftErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
