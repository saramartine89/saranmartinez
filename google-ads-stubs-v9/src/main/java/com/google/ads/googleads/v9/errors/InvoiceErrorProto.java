// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/invoice_error.proto

package com.google.ads.googleads.v9.errors;

public final class InvoiceErrorProto {
  private InvoiceErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_errors_InvoiceErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_errors_InvoiceErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v9/errors/invoice" +
      "_error.proto\022\036google.ads.googleads.v9.er" +
      "rors\032\034google/api/annotations.proto\"\332\001\n\020I" +
      "nvoiceErrorEnum\"\305\001\n\014InvoiceError\022\017\n\013UNSP" +
      "ECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\026\n\022YEAR_MONTH_TOO" +
      "_OLD\020\002\022\031\n\025NOT_INVOICED_CUSTOMER\020\003\022\036\n\032BIL" +
      "LING_SETUP_NOT_APPROVED\020\004\022*\n&BILLING_SET" +
      "UP_NOT_ON_MONTHLY_INVOICING\020\005\022\030\n\024NON_SER" +
      "VING_CUSTOMER\020\006B\354\001\n\"com.google.ads.googl" +
      "eads.v9.errorsB\021InvoiceErrorProtoP\001ZDgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v9/errors;errors\242\002\003GAA\252\002\036Google" +
      ".Ads.GoogleAds.V9.Errors\312\002\036Google\\Ads\\Go" +
      "ogleAds\\V9\\Errors\352\002\"Google::Ads::GoogleA" +
      "ds::V9::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_errors_InvoiceErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_errors_InvoiceErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_errors_InvoiceErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
