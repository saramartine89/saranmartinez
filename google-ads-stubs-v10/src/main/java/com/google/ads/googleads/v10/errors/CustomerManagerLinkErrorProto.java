// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/customer_manager_link_error.proto

package com.google.ads.googleads.v10.errors;

public final class CustomerManagerLinkErrorProto {
  private CustomerManagerLinkErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_CustomerManagerLinkErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_CustomerManagerLinkErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v10/errors/custom" +
      "er_manager_link_error.proto\022\037google.ads." +
      "googleads.v10.errors\032\034google/api/annotat" +
      "ions.proto\"\320\003\n\034CustomerManagerLinkErrorE" +
      "num\"\257\003\n\030CustomerManagerLinkError\022\017\n\013UNSP" +
      "ECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\025\n\021NO_PENDING_INV" +
      "ITE\020\002\022\'\n#SAME_CLIENT_MORE_THAN_ONCE_PER_" +
      "CALL\020\003\022-\n)MANAGER_HAS_MAX_NUMBER_OF_LINK" +
      "ED_ACCOUNTS\020\004\022-\n)CANNOT_UNLINK_ACCOUNT_W" +
      "ITHOUT_ACTIVE_USER\020\005\022+\n\'CANNOT_REMOVE_LA" +
      "ST_CLIENT_ACCOUNT_OWNER\020\006\022+\n\'CANNOT_CHAN" +
      "GE_ROLE_BY_NON_ACCOUNT_OWNER\020\007\0222\n.CANNOT" +
      "_CHANGE_ROLE_FOR_NON_ACTIVE_LINK_ACCOUNT" +
      "\020\010\022\031\n\025DUPLICATE_CHILD_FOUND\020\t\022.\n*TEST_AC" +
      "COUNT_LINKS_TOO_MANY_CHILD_ACCOUNTS\020\nB\375\001" +
      "\n#com.google.ads.googleads.v10.errorsB\035C" +
      "ustomerManagerLinkErrorProtoP\001ZEgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v10/errors;errors\242\002\003GAA\252\002\037Google.Ads" +
      ".GoogleAds.V10.Errors\312\002\037Google\\Ads\\Googl" +
      "eAds\\V10\\Errors\352\002#Google::Ads::GoogleAds" +
      "::V10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_CustomerManagerLinkErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_CustomerManagerLinkErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_CustomerManagerLinkErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
