// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/invoice.proto

package com.google.ads.googleads.v9.resources;

public final class InvoiceProto {
  private InvoiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_Invoice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_Invoice_AccountBudgetSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_Invoice_AccountBudgetSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/ads/googleads/v9/resources/invo" +
      "ice.proto\022!google.ads.googleads.v9.resou" +
      "rces\032*google/ads/googleads/v9/common/dat" +
      "es.proto\0320google/ads/googleads/v9/enums/" +
      "invoice_type.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032\034" +
      "google/api/annotations.proto\"\271\017\n\007Invoice" +
      "\022?\n\rresource_name\030\001 \001(\tB(\340A\003\372A\"\n googlea" +
      "ds.googleapis.com/Invoice\022\024\n\002id\030\031 \001(\tB\003\340" +
      "A\003H\000\210\001\001\022M\n\004type\030\003 \001(\0162:.google.ads.googl" +
      "eads.v9.enums.InvoiceTypeEnum.InvoiceTyp" +
      "eB\003\340A\003\022\037\n\rbilling_setup\030\032 \001(\tB\003\340A\003H\001\210\001\001\022" +
      "%\n\023payments_account_id\030\033 \001(\tB\003\340A\003H\002\210\001\001\022%" +
      "\n\023payments_profile_id\030\034 \001(\tB\003\340A\003H\003\210\001\001\022\034\n" +
      "\nissue_date\030\035 \001(\tB\003\340A\003H\004\210\001\001\022\032\n\010due_date\030" +
      "\036 \001(\tB\003\340A\003H\005\210\001\001\022J\n\022service_date_range\030\t " +
      "\001(\0132).google.ads.googleads.v9.common.Dat" +
      "eRangeB\003\340A\003\022\037\n\rcurrency_code\030\037 \001(\tB\003\340A\003H" +
      "\006\210\001\001\022/\n\"adjustments_subtotal_amount_micr" +
      "os\030\023 \001(\003B\003\340A\003\022*\n\035adjustments_tax_amount_" +
      "micros\030\024 \001(\003B\003\340A\003\022,\n\037adjustments_total_a" +
      "mount_micros\030\025 \001(\003B\003\340A\003\0224\n\'regulatory_co" +
      "sts_subtotal_amount_micros\030\026 \001(\003B\003\340A\003\022/\n" +
      "\"regulatory_costs_tax_amount_micros\030\027 \001(" +
      "\003B\003\340A\003\0221\n$regulatory_costs_total_amount_" +
      "micros\030\030 \001(\003B\003\340A\003\022(\n\026subtotal_amount_mic" +
      "ros\030! \001(\003B\003\340A\003H\007\210\001\001\022#\n\021tax_amount_micros" +
      "\030\" \001(\003B\003\340A\003H\010\210\001\001\022%\n\023total_amount_micros\030" +
      "# \001(\003B\003\340A\003H\t\210\001\001\022#\n\021corrected_invoice\030$ \001" +
      "(\tB\003\340A\003H\n\210\001\001\022\036\n\021replaced_invoices\030% \003(\tB" +
      "\003\340A\003\022\031\n\007pdf_url\030& \001(\tB\003\340A\003H\013\210\001\001\022f\n\030accou" +
      "nt_budget_summaries\030\022 \003(\0132?.google.ads.g" +
      "oogleads.v9.resources.Invoice.AccountBud" +
      "getSummaryB\003\340A\003\032\326\004\n\024AccountBudgetSummary" +
      "\022\032\n\010customer\030\n \001(\tB\003\340A\003H\000\210\001\001\022+\n\031customer" +
      "_descriptive_name\030\013 \001(\tB\003\340A\003H\001\210\001\001\022 \n\016acc" +
      "ount_budget\030\014 \001(\tB\003\340A\003H\002\210\001\001\022%\n\023account_b" +
      "udget_name\030\r \001(\tB\003\340A\003H\003\210\001\001\022\'\n\025purchase_o" +
      "rder_number\030\016 \001(\tB\003\340A\003H\004\210\001\001\022(\n\026subtotal_" +
      "amount_micros\030\017 \001(\003B\003\340A\003H\005\210\001\001\022#\n\021tax_amo" +
      "unt_micros\030\020 \001(\003B\003\340A\003H\006\210\001\001\022%\n\023total_amou" +
      "nt_micros\030\021 \001(\003B\003\340A\003H\007\210\001\001\022T\n\034billable_ac" +
      "tivity_date_range\030\t \001(\0132).google.ads.goo" +
      "gleads.v9.common.DateRangeB\003\340A\003B\013\n\t_cust" +
      "omerB\034\n\032_customer_descriptive_nameB\021\n\017_a" +
      "ccount_budgetB\026\n\024_account_budget_nameB\030\n" +
      "\026_purchase_order_numberB\031\n\027_subtotal_amo" +
      "unt_microsB\024\n\022_tax_amount_microsB\026\n\024_tot" +
      "al_amount_micros:T\352AQ\n googleads.googlea" +
      "pis.com/Invoice\022-customers/{customer_id}" +
      "/invoices/{invoice_id}B\005\n\003_idB\020\n\016_billin" +
      "g_setupB\026\n\024_payments_account_idB\026\n\024_paym" +
      "ents_profile_idB\r\n\013_issue_dateB\013\n\t_due_d" +
      "ateB\020\n\016_currency_codeB\031\n\027_subtotal_amoun" +
      "t_microsB\024\n\022_tax_amount_microsB\026\n\024_total" +
      "_amount_microsB\024\n\022_corrected_invoiceB\n\n\010" +
      "_pdf_urlB\371\001\n%com.google.ads.googleads.v9" +
      ".resourcesB\014InvoiceProtoP\001ZJgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v9/resources;resources\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V9.Resources\312\002!Google\\Ads\\Go" +
      "ogleAds\\V9\\Resources\352\002%Google::Ads::Goog" +
      "leAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.DatesProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.InvoiceTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_Invoice_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "BillingSetup", "PaymentsAccountId", "PaymentsProfileId", "IssueDate", "DueDate", "ServiceDateRange", "CurrencyCode", "AdjustmentsSubtotalAmountMicros", "AdjustmentsTaxAmountMicros", "AdjustmentsTotalAmountMicros", "RegulatoryCostsSubtotalAmountMicros", "RegulatoryCostsTaxAmountMicros", "RegulatoryCostsTotalAmountMicros", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "CorrectedInvoice", "ReplacedInvoices", "PdfUrl", "AccountBudgetSummaries", "Id", "BillingSetup", "PaymentsAccountId", "PaymentsProfileId", "IssueDate", "DueDate", "CurrencyCode", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "CorrectedInvoice", "PdfUrl", });
    internal_static_google_ads_googleads_v9_resources_Invoice_AccountBudgetSummary_descriptor =
      internal_static_google_ads_googleads_v9_resources_Invoice_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_Invoice_AccountBudgetSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_Invoice_AccountBudgetSummary_descriptor,
        new java.lang.String[] { "Customer", "CustomerDescriptiveName", "AccountBudget", "AccountBudgetName", "PurchaseOrderNumber", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "BillableActivityDateRange", "Customer", "CustomerDescriptiveName", "AccountBudget", "AccountBudgetName", "PurchaseOrderNumber", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.DatesProto.getDescriptor();
    com.google.ads.googleads.v9.enums.InvoiceTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
