// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/query_error.proto

package com.google.ads.googleads.v9.errors;

public final class QueryErrorProto {
  private QueryErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_errors_QueryErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_errors_QueryErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v9/errors/query_e" +
      "rror.proto\022\036google.ads.googleads.v9.erro" +
      "rs\032\034google/api/annotations.proto\"\223\016\n\016Que" +
      "ryErrorEnum\"\200\016\n\nQueryError\022\017\n\013UNSPECIFIE" +
      "D\020\000\022\013\n\007UNKNOWN\020\001\022\017\n\013QUERY_ERROR\0202\022\025\n\021BAD" +
      "_ENUM_CONSTANT\020\022\022\027\n\023BAD_ESCAPE_SEQUENCE\020" +
      "\007\022\022\n\016BAD_FIELD_NAME\020\014\022\023\n\017BAD_LIMIT_VALUE" +
      "\020\017\022\016\n\nBAD_NUMBER\020\005\022\020\n\014BAD_OPERATOR\020\003\022\026\n\022" +
      "BAD_PARAMETER_NAME\020=\022\027\n\023BAD_PARAMETER_VA" +
      "LUE\020>\022$\n BAD_RESOURCE_TYPE_IN_FROM_CLAUS" +
      "E\020-\022\016\n\nBAD_SYMBOL\020\002\022\r\n\tBAD_VALUE\020\004\022\027\n\023DA" +
      "TE_RANGE_TOO_WIDE\020$\022\031\n\025DATE_RANGE_TOO_NA" +
      "RROW\020<\022\020\n\014EXPECTED_AND\020\036\022\017\n\013EXPECTED_BY\020" +
      "\016\022-\n)EXPECTED_DIMENSION_FIELD_IN_SELECT_" +
      "CLAUSE\020%\022\"\n\036EXPECTED_FILTERS_ON_DATE_RAN" +
      "GE\0207\022\021\n\rEXPECTED_FROM\020,\022\021\n\rEXPECTED_LIST" +
      "\020)\022.\n*EXPECTED_REFERENCED_FIELD_IN_SELEC" +
      "T_CLAUSE\020\020\022\023\n\017EXPECTED_SELECT\020\r\022\031\n\025EXPEC" +
      "TED_SINGLE_VALUE\020*\022(\n$EXPECTED_VALUE_WIT" +
      "H_BETWEEN_OPERATOR\020\035\022\027\n\023INVALID_DATE_FOR" +
      "MAT\020&\022\036\n\032MISALIGNED_DATE_FOR_FILTER\020@\022\030\n" +
      "\024INVALID_STRING_VALUE\0209\022\'\n#INVALID_VALUE" +
      "_WITH_BETWEEN_OPERATOR\020\032\022&\n\"INVALID_VALU" +
      "E_WITH_DURING_OPERATOR\020\026\022$\n INVALID_VALU" +
      "E_WITH_LIKE_OPERATOR\0208\022\033\n\027OPERATOR_FIELD" +
      "_MISMATCH\020#\022&\n\"PROHIBITED_EMPTY_LIST_IN_" +
      "CONDITION\020\034\022\034\n\030PROHIBITED_ENUM_CONSTANT\020" +
      "6\0221\n-PROHIBITED_FIELD_COMBINATION_IN_SEL" +
      "ECT_CLAUSE\020\037\022\'\n#PROHIBITED_FIELD_IN_ORDE" +
      "R_BY_CLAUSE\020(\022%\n!PROHIBITED_FIELD_IN_SEL" +
      "ECT_CLAUSE\020\027\022$\n PROHIBITED_FIELD_IN_WHER" +
      "E_CLAUSE\020\030\022+\n\'PROHIBITED_RESOURCE_TYPE_I" +
      "N_FROM_CLAUSE\020+\022-\n)PROHIBITED_RESOURCE_T" +
      "YPE_IN_SELECT_CLAUSE\0200\022,\n(PROHIBITED_RES" +
      "OURCE_TYPE_IN_WHERE_CLAUSE\020:\022/\n+PROHIBIT" +
      "ED_METRIC_IN_SELECT_OR_WHERE_CLAUSE\0201\0220\n" +
      ",PROHIBITED_SEGMENT_IN_SELECT_OR_WHERE_C" +
      "LAUSE\0203\022<\n8PROHIBITED_SEGMENT_WITH_METRI" +
      "C_IN_SELECT_OR_WHERE_CLAUSE\0205\022\027\n\023LIMIT_V" +
      "ALUE_TOO_LOW\020\031\022 \n\034PROHIBITED_NEWLINE_IN_" +
      "STRING\020\010\022(\n$PROHIBITED_VALUE_COMBINATION" +
      "_IN_LIST\020\n\0226\n2PROHIBITED_VALUE_COMBINATI" +
      "ON_WITH_BETWEEN_OPERATOR\020\025\022\031\n\025STRING_NOT" +
      "_TERMINATED\020\006\022\025\n\021TOO_MANY_SEGMENTS\020\"\022\033\n\027" +
      "UNEXPECTED_END_OF_QUERY\020\t\022\032\n\026UNEXPECTED_" +
      "FROM_CLAUSE\020/\022\026\n\022UNRECOGNIZED_FIELD\020 \022\024\n" +
      "\020UNEXPECTED_INPUT\020\013\022!\n\035REQUESTED_METRICS" +
      "_FOR_MANAGER\020;\022\036\n\032FILTER_HAS_TOO_MANY_VA" +
      "LUES\020?B\352\001\n\"com.google.ads.googleads.v9.e" +
      "rrorsB\017QueryErrorProtoP\001ZDgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v9" +
      "/errors;errors\242\002\003GAA\252\002\036Google.Ads.Google" +
      "Ads.V9.Errors\312\002\036Google\\Ads\\GoogleAds\\V9\\" +
      "Errors\352\002\"Google::Ads::GoogleAds::V9::Err" +
      "orsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_errors_QueryErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_errors_QueryErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_errors_QueryErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
