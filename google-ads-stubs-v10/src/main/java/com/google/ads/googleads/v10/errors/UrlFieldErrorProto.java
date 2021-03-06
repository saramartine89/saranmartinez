// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/url_field_error.proto

package com.google.ads.googleads.v10.errors;

public final class UrlFieldErrorProto {
  private UrlFieldErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_UrlFieldErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_UrlFieldErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v10/errors/url_fi" +
      "eld_error.proto\022\037google.ads.googleads.v1" +
      "0.errors\032\034google/api/annotations.proto\"\337" +
      "\016\n\021UrlFieldErrorEnum\"\311\016\n\rUrlFieldError\022\017" +
      "\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022!\n\035INVALID_" +
      "TRACKING_URL_TEMPLATE\020\002\022(\n$INVALID_TAG_I" +
      "N_TRACKING_URL_TEMPLATE\020\003\022%\n!MISSING_TRA" +
      "CKING_URL_TEMPLATE_TAG\020\004\022-\n)MISSING_PROT" +
      "OCOL_IN_TRACKING_URL_TEMPLATE\020\005\022-\n)INVAL" +
      "ID_PROTOCOL_IN_TRACKING_URL_TEMPLATE\020\006\022#" +
      "\n\037MALFORMED_TRACKING_URL_TEMPLATE\020\007\022)\n%M" +
      "ISSING_HOST_IN_TRACKING_URL_TEMPLATE\020\010\022(" +
      "\n$INVALID_TLD_IN_TRACKING_URL_TEMPLATE\020\t" +
      "\022.\n*REDUNDANT_NESTED_TRACKING_URL_TEMPLA" +
      "TE_TAG\020\n\022\025\n\021INVALID_FINAL_URL\020\013\022\034\n\030INVAL" +
      "ID_TAG_IN_FINAL_URL\020\014\022\"\n\036REDUNDANT_NESTE" +
      "D_FINAL_URL_TAG\020\r\022!\n\035MISSING_PROTOCOL_IN" +
      "_FINAL_URL\020\016\022!\n\035INVALID_PROTOCOL_IN_FINA" +
      "L_URL\020\017\022\027\n\023MALFORMED_FINAL_URL\020\020\022\035\n\031MISS" +
      "ING_HOST_IN_FINAL_URL\020\021\022\034\n\030INVALID_TLD_I" +
      "N_FINAL_URL\020\022\022\034\n\030INVALID_FINAL_MOBILE_UR" +
      "L\020\023\022#\n\037INVALID_TAG_IN_FINAL_MOBILE_URL\020\024" +
      "\022)\n%REDUNDANT_NESTED_FINAL_MOBILE_URL_TA" +
      "G\020\025\022(\n$MISSING_PROTOCOL_IN_FINAL_MOBILE_" +
      "URL\020\026\022(\n$INVALID_PROTOCOL_IN_FINAL_MOBIL" +
      "E_URL\020\027\022\036\n\032MALFORMED_FINAL_MOBILE_URL\020\030\022" +
      "$\n MISSING_HOST_IN_FINAL_MOBILE_URL\020\031\022#\n" +
      "\037INVALID_TLD_IN_FINAL_MOBILE_URL\020\032\022\031\n\025IN" +
      "VALID_FINAL_APP_URL\020\033\022 \n\034INVALID_TAG_IN_" +
      "FINAL_APP_URL\020\034\022&\n\"REDUNDANT_NESTED_FINA" +
      "L_APP_URL_TAG\020\035\022 \n\034MULTIPLE_APP_URLS_FOR" +
      "_OSTYPE\020\036\022\022\n\016INVALID_OSTYPE\020\037\022 \n\034INVALID" +
      "_PROTOCOL_FOR_APP_URL\020 \022\"\n\036INVALID_PACKA" +
      "GE_ID_FOR_APP_URL\020!\022-\n)URL_CUSTOM_PARAME" +
      "TERS_COUNT_EXCEEDS_LIMIT\020\"\0222\n.INVALID_CH" +
      "ARACTERS_IN_URL_CUSTOM_PARAMETER_KEY\020\'\0224" +
      "\n0INVALID_CHARACTERS_IN_URL_CUSTOM_PARAM" +
      "ETER_VALUE\020(\022-\n)INVALID_TAG_IN_URL_CUSTO" +
      "M_PARAMETER_VALUE\020)\022-\n)REDUNDANT_NESTED_" +
      "URL_CUSTOM_PARAMETER_TAG\020*\022\024\n\020MISSING_PR" +
      "OTOCOL\020+\022\024\n\020INVALID_PROTOCOL\0204\022\017\n\013INVALI" +
      "D_URL\020,\022\036\n\032DESTINATION_URL_DEPRECATED\020-\022" +
      "\026\n\022INVALID_TAG_IN_URL\020.\022\023\n\017MISSING_URL_T" +
      "AG\020/\022\024\n\020DUPLICATE_URL_ID\0200\022\022\n\016INVALID_UR" +
      "L_ID\0201\022\036\n\032FINAL_URL_SUFFIX_MALFORMED\0202\022#" +
      "\n\037INVALID_TAG_IN_FINAL_URL_SUFFIX\0203\022\034\n\030I" +
      "NVALID_TOP_LEVEL_DOMAIN\0205\022\036\n\032MALFORMED_T" +
      "OP_LEVEL_DOMAIN\0206\022\021\n\rMALFORMED_URL\0207\022\020\n\014" +
      "MISSING_HOST\0208\022\037\n\033NULL_CUSTOM_PARAMETER_" +
      "VALUE\0209\022\'\n#VALUE_TRACK_PARAMETER_NOT_SUP" +
      "PORTED\020:B\362\001\n#com.google.ads.googleads.v1" +
      "0.errorsB\022UrlFieldErrorProtoP\001ZEgoogle.g" +
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
    internal_static_google_ads_googleads_v10_errors_UrlFieldErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_UrlFieldErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_UrlFieldErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
