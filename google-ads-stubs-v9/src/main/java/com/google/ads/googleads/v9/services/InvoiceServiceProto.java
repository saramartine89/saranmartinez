// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/invoice_service.proto

package com.google.ads.googleads.v9.services;

public final class InvoiceServiceProto {
  private InvoiceServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_ListInvoicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_ListInvoicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_ListInvoicesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_ListInvoicesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v9/services/invoi" +
      "ce_service.proto\022 google.ads.googleads.v" +
      "9.services\0321google/ads/googleads/v9/enum" +
      "s/month_of_year.proto\032/google/ads/google" +
      "ads/v9/resources/invoice.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\"\272" +
      "\001\n\023ListInvoicesRequest\022\030\n\013customer_id\030\001 " +
      "\001(\tB\003\340A\002\022\032\n\rbilling_setup\030\002 \001(\tB\003\340A\002\022\027\n\n" +
      "issue_year\030\003 \001(\tB\003\340A\002\022T\n\013issue_month\030\004 \001" +
      "(\0162:.google.ads.googleads.v9.enums.Month" +
      "OfYearEnum.MonthOfYearB\003\340A\002\"T\n\024ListInvoi" +
      "cesResponse\022<\n\010invoices\030\001 \003(\0132*.google.a" +
      "ds.googleads.v9.resources.Invoice2\272\002\n\016In" +
      "voiceService\022\340\001\n\014ListInvoices\0225.google.a" +
      "ds.googleads.v9.services.ListInvoicesReq" +
      "uest\0326.google.ads.googleads.v9.services." +
      "ListInvoicesResponse\"a\202\323\344\223\002(\022&/v9/custom" +
      "ers/{customer_id=*}/invoices\332A0customer_" +
      "id,billing_setup,issue_year,issue_month\032" +
      "E\312A\030googleads.googleapis.com\322A\'https://w" +
      "ww.googleapis.com/auth/adwordsB\372\001\n$com.g" +
      "oogle.ads.googleads.v9.servicesB\023Invoice" +
      "ServiceProtoP\001ZHgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v9/services;" +
      "services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9" +
      ".Services\312\002 Google\\Ads\\GoogleAds\\V9\\Serv" +
      "ices\352\002$Google::Ads::GoogleAds::V9::Servi" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.InvoiceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_ListInvoicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_ListInvoicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_ListInvoicesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "BillingSetup", "IssueYear", "IssueMonth", });
    internal_static_google_ads_googleads_v9_services_ListInvoicesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_ListInvoicesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_ListInvoicesResponse_descriptor,
        new java.lang.String[] { "Invoices", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v9.resources.InvoiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
