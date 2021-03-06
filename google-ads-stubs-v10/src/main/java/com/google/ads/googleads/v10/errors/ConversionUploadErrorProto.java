// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/conversion_upload_error.proto

package com.google.ads.googleads.v10.errors;

public final class ConversionUploadErrorProto {
  private ConversionUploadErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v10/errors/conver" +
      "sion_upload_error.proto\022\037google.ads.goog" +
      "leads.v10.errors\032\034google/api/annotations" +
      ".proto\"\231\014\n\031ConversionUploadErrorEnum\"\373\013\n" +
      "\025ConversionUploadError\022\017\n\013UNSPECIFIED\020\000\022" +
      "\013\n\007UNKNOWN\020\001\022#\n\037TOO_MANY_CONVERSIONS_IN_" +
      "REQUEST\020\002\022\025\n\021UNPARSEABLE_GCLID\020\003\022\035\n\031CONV" +
      "ERSION_PRECEDES_EVENT\020*\022\021\n\rEXPIRED_EVENT" +
      "\020+\022\024\n\020TOO_RECENT_EVENT\020,\022\023\n\017EVENT_NOT_FO" +
      "UND\020-\022\031\n\025UNAUTHORIZED_CUSTOMER\020\010\022\035\n\031INVA" +
      "LID_CONVERSION_ACTION\020\t\022 \n\034TOO_RECENT_CO" +
      "NVERSION_ACTION\020\n\0226\n2CONVERSION_TRACKING" +
      "_NOT_ENABLED_AT_IMPRESSION_TIME\020\013\022Q\nMEXT" +
      "ERNAL_ATTRIBUTION_DATA_SET_FOR_NON_EXTER" +
      "NALLY_ATTRIBUTED_CONVERSION_ACTION\020\014\022Q\nM" +
      "EXTERNAL_ATTRIBUTION_DATA_NOT_SET_FOR_EX" +
      "TERNALLY_ATTRIBUTED_CONVERSION_ACTION\020\r\022" +
      "F\nBORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY" +
      "_ATTRIBUTED_CONVERSION_ACTION\020\016\022\033\n\027ORDER" +
      "_ID_ALREADY_IN_USE\020\017\022\026\n\022DUPLICATE_ORDER_" +
      "ID\020\020\022\023\n\017TOO_RECENT_CALL\020\021\022\020\n\014EXPIRED_CAL" +
      "L\020\022\022\022\n\016CALL_NOT_FOUND\020\023\022\034\n\030CONVERSION_PR" +
      "ECEDES_CALL\020\024\0220\n,CONVERSION_TRACKING_NOT" +
      "_ENABLED_AT_CALL_TIME\020\025\022$\n UNPARSEABLE_C" +
      "ALLERS_PHONE_NUMBER\020\026\022#\n\037CLICK_CONVERSIO" +
      "N_ALREADY_EXISTS\020\027\022\"\n\036CALL_CONVERSION_AL" +
      "READY_EXISTS\020\030\022)\n%DUPLICATE_CLICK_CONVER" +
      "SION_IN_REQUEST\020\031\022(\n$DUPLICATE_CALL_CONV" +
      "ERSION_IN_REQUEST\020\032\022\037\n\033CUSTOM_VARIABLE_N" +
      "OT_ENABLED\020\034\022&\n\"CUSTOM_VARIABLE_VALUE_CO" +
      "NTAINS_PII\020\035\022\036\n\032INVALID_CUSTOMER_FOR_CLI" +
      "CK\020\036\022\035\n\031INVALID_CUSTOMER_FOR_CALL\020\037\022,\n(C" +
      "ONVERSION_NOT_COMPLIANT_WITH_ATT_POLICY\020" +
      " \022\023\n\017CLICK_NOT_FOUND\020!\022\033\n\027INVALID_USER_I" +
      "DENTIFIER\020\"\022N\nJEXTERNALLY_ATTRIBUTED_CON" +
      "VERSION_ACTION_NOT_PERMITTED_WITH_USER_I" +
      "DENTIFIER\020#\022\037\n\033UNSUPPORTED_USER_IDENTIFI" +
      "ER\020$\022\032\n\026GBRAID_WBRAID_BOTH_SET\020&\022\026\n\022UNPA" +
      "RSEABLE_WBRAID\020\'\022\026\n\022UNPARSEABLE_GBRAID\020(" +
      "\022B\n>EXTERNALLY_ATTRIBUTED_CONVERSION_TYP" +
      "E_NOT_PERMITTED_WITH_BRAID\020)\022<\n8ONE_PER_" +
      "CLICK_CONVERSION_ACTION_NOT_PERMITTED_WI" +
      "TH_BRAID\020.B\372\001\n#com.google.ads.googleads." +
      "v10.errorsB\032ConversionUploadErrorProtoP\001" +
      "ZEgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v10/errors;errors\242\002\003GAA\252\002\037" +
      "Google.Ads.GoogleAds.V10.Errors\312\002\037Google" +
      "\\Ads\\GoogleAds\\V10\\Errors\352\002#Google::Ads:" +
      ":GoogleAds::V10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
