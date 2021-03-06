// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/extension_feed_item_error.proto

package com.google.ads.googleads.v10.errors;

public final class ExtensionFeedItemErrorProto {
  private ExtensionFeedItemErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_ExtensionFeedItemErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_ExtensionFeedItemErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v10/errors/extens" +
      "ion_feed_item_error.proto\022\037google.ads.go" +
      "ogleads.v10.errors\032\034google/api/annotatio" +
      "ns.proto\"\366\r\n\032ExtensionFeedItemErrorEnum\"" +
      "\327\r\n\026ExtensionFeedItemError\022\017\n\013UNSPECIFIE" +
      "D\020\000\022\013\n\007UNKNOWN\020\001\022\026\n\022VALUE_OUT_OF_RANGE\020\002" +
      "\022\025\n\021URL_LIST_TOO_LONG\020\003\0222\n.CANNOT_HAVE_R" +
      "ESTRICTION_ON_EMPTY_GEO_TARGETING\020\004\022\036\n\032C" +
      "ANNOT_SET_WITH_FINAL_URLS\020\005\022!\n\035CANNOT_SE" +
      "T_WITHOUT_FINAL_URLS\020\006\022\030\n\024INVALID_PHONE_" +
      "NUMBER\020\007\022*\n&PHONE_NUMBER_NOT_SUPPORTED_F" +
      "OR_COUNTRY\020\010\022-\n)CARRIER_SPECIFIC_SHORT_N" +
      "UMBER_NOT_ALLOWED\020\t\022#\n\037PREMIUM_RATE_NUMB" +
      "ER_NOT_ALLOWED\020\n\022\032\n\026DISALLOWED_NUMBER_TY" +
      "PE\020\013\022(\n$INVALID_DOMESTIC_PHONE_NUMBER_FO" +
      "RMAT\020\014\022#\n\037VANITY_PHONE_NUMBER_NOT_ALLOWE" +
      "D\020\r\022\"\n\036INVALID_CALL_CONVERSION_ACTION\020\016\022" +
      ".\n*CUSTOMER_NOT_ON_ALLOWLIST_FOR_CALLTRA" +
      "CKING\020/\022*\n&CALLTRACKING_NOT_SUPPORTED_FO" +
      "R_COUNTRY\020\020\0220\n,CUSTOMER_CONSENT_FOR_CALL" +
      "_RECORDING_REQUIRED\020\021\022\022\n\016INVALID_APP_ID\020" +
      "\022\022&\n\"QUOTES_IN_REVIEW_EXTENSION_SNIPPET\020" +
      "\023\022\'\n#HYPHENS_IN_REVIEW_EXTENSION_SNIPPET" +
      "\020\024\022&\n\"REVIEW_EXTENSION_SOURCE_INELIGIBLE" +
      "\020\025\022(\n$SOURCE_NAME_IN_REVIEW_EXTENSION_TE" +
      "XT\020\026\022\037\n\033INCONSISTENT_CURRENCY_CODES\020\027\022*\n" +
      "&PRICE_EXTENSION_HAS_DUPLICATED_HEADERS\020" +
      "\030\0224\n0PRICE_ITEM_HAS_DUPLICATED_HEADER_AN" +
      "D_DESCRIPTION\020\031\022%\n!PRICE_EXTENSION_HAS_T" +
      "OO_FEW_ITEMS\020\032\022&\n\"PRICE_EXTENSION_HAS_TO" +
      "O_MANY_ITEMS\020\033\022\025\n\021UNSUPPORTED_VALUE\020\034\022*\n" +
      "&UNSUPPORTED_VALUE_IN_SELECTED_LANGUAGE\020" +
      "\035\022\035\n\031INVALID_DEVICE_PREFERENCE\020\036\022\030\n\024INVA" +
      "LID_SCHEDULE_END\020\037\022*\n&DATE_TIME_MUST_BE_" +
      "IN_ACCOUNT_TIME_ZONE\020 \022\033\n\027INVALID_SNIPPE" +
      "TS_HEADER\020!\022\'\n#CANNOT_OPERATE_ON_REMOVED" +
      "_FEED_ITEM\020\"\022<\n8PHONE_NUMBER_NOT_SUPPORT" +
      "ED_WITH_CALLTRACKING_FOR_COUNTRY\020#\022(\n$CO" +
      "NFLICTING_CALL_CONVERSION_SETTINGS\020$\022\033\n\027" +
      "EXTENSION_TYPE_MISMATCH\020%\022\036\n\032EXTENSION_S" +
      "UBTYPE_REQUIRED\020&\022\036\n\032EXTENSION_TYPE_UNSU" +
      "PPORTED\020\'\0221\n-CANNOT_OPERATE_ON_FEED_WITH" +
      "_MULTIPLE_MAPPINGS\020(\022.\n*CANNOT_OPERATE_O" +
      "N_FEED_WITH_KEY_ATTRIBUTES\020)\022\030\n\024INVALID_" +
      "PRICE_FORMAT\020*\022\032\n\026PROMOTION_INVALID_TIME" +
      "\020+\022%\n!TOO_MANY_DECIMAL_PLACES_SPECIFIED\020" +
      ",\022$\n CONCRETE_EXTENSION_TYPE_REQUIRED\020-\022" +
      " \n\034SCHEDULE_END_NOT_AFTER_START\020.B\373\001\n#co" +
      "m.google.ads.googleads.v10.errorsB\033Exten" +
      "sionFeedItemErrorProtoP\001ZEgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "0/errors;errors\242\002\003GAA\252\002\037Google.Ads.Googl" +
      "eAds.V10.Errors\312\002\037Google\\Ads\\GoogleAds\\V" +
      "10\\Errors\352\002#Google::Ads::GoogleAds::V10:" +
      ":Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_ExtensionFeedItemErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_ExtensionFeedItemErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_ExtensionFeedItemErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
