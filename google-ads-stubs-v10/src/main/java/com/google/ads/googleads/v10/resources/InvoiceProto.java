// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/invoice.proto

package com.google.ads.googleads.v10.resources;

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
    internal_static_google_ads_googleads_v10_resources_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_Invoice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_Invoice_AccountBudgetSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_Invoice_AccountBudgetSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v10/resources/inv" +
      "oice.proto\022\"google.ads.googleads.v10.res" +
      "ources\032+google/ads/googleads/v10/common/" +
      "dates.proto\0321google/ads/googleads/v10/en" +
      "ums/invoice_type.proto\032\034google/api/annot" +
      "ations.proto\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\"\275\017\n\007Inv" +
      "oice\022?\n\rresource_name\030\001 \001(\tB(\340A\003\372A\"\n goo" +
      "gleads.googleapis.com/Invoice\022\024\n\002id\030\031 \001(" +
      "\tB\003\340A\003H\000\210\001\001\022N\n\004type\030\003 \001(\0162;.google.ads.g" +
      "oogleads.v10.enums.InvoiceTypeEnum.Invoi" +
      "ceTypeB\003\340A\003\022\037\n\rbilling_setup\030\032 \001(\tB\003\340A\003H" +
      "\001\210\001\001\022%\n\023payments_account_id\030\033 \001(\tB\003\340A\003H\002" +
      "\210\001\001\022%\n\023payments_profile_id\030\034 \001(\tB\003\340A\003H\003\210" +
      "\001\001\022\034\n\nissue_date\030\035 \001(\tB\003\340A\003H\004\210\001\001\022\032\n\010due_" +
      "date\030\036 \001(\tB\003\340A\003H\005\210\001\001\022K\n\022service_date_ran" +
      "ge\030\t \001(\0132*.google.ads.googleads.v10.comm" +
      "on.DateRangeB\003\340A\003\022\037\n\rcurrency_code\030\037 \001(\t" +
      "B\003\340A\003H\006\210\001\001\022/\n\"adjustments_subtotal_amoun" +
      "t_micros\030\023 \001(\003B\003\340A\003\022*\n\035adjustments_tax_a" +
      "mount_micros\030\024 \001(\003B\003\340A\003\022,\n\037adjustments_t" +
      "otal_amount_micros\030\025 \001(\003B\003\340A\003\0224\n\'regulat" +
      "ory_costs_subtotal_amount_micros\030\026 \001(\003B\003" +
      "\340A\003\022/\n\"regulatory_costs_tax_amount_micro" +
      "s\030\027 \001(\003B\003\340A\003\0221\n$regulatory_costs_total_a" +
      "mount_micros\030\030 \001(\003B\003\340A\003\022(\n\026subtotal_amou" +
      "nt_micros\030! \001(\003B\003\340A\003H\007\210\001\001\022#\n\021tax_amount_" +
      "micros\030\" \001(\003B\003\340A\003H\010\210\001\001\022%\n\023total_amount_m" +
      "icros\030# \001(\003B\003\340A\003H\t\210\001\001\022#\n\021corrected_invoi" +
      "ce\030$ \001(\tB\003\340A\003H\n\210\001\001\022\036\n\021replaced_invoices\030" +
      "% \003(\tB\003\340A\003\022\031\n\007pdf_url\030& \001(\tB\003\340A\003H\013\210\001\001\022g\n" +
      "\030account_budget_summaries\030\022 \003(\0132@.google" +
      ".ads.googleads.v10.resources.Invoice.Acc" +
      "ountBudgetSummaryB\003\340A\003\032\327\004\n\024AccountBudget" +
      "Summary\022\032\n\010customer\030\n \001(\tB\003\340A\003H\000\210\001\001\022+\n\031c" +
      "ustomer_descriptive_name\030\013 \001(\tB\003\340A\003H\001\210\001\001" +
      "\022 \n\016account_budget\030\014 \001(\tB\003\340A\003H\002\210\001\001\022%\n\023ac" +
      "count_budget_name\030\r \001(\tB\003\340A\003H\003\210\001\001\022\'\n\025pur" +
      "chase_order_number\030\016 \001(\tB\003\340A\003H\004\210\001\001\022(\n\026su" +
      "btotal_amount_micros\030\017 \001(\003B\003\340A\003H\005\210\001\001\022#\n\021" +
      "tax_amount_micros\030\020 \001(\003B\003\340A\003H\006\210\001\001\022%\n\023tot" +
      "al_amount_micros\030\021 \001(\003B\003\340A\003H\007\210\001\001\022U\n\034bill" +
      "able_activity_date_range\030\t \001(\0132*.google." +
      "ads.googleads.v10.common.DateRangeB\003\340A\003B" +
      "\013\n\t_customerB\034\n\032_customer_descriptive_na" +
      "meB\021\n\017_account_budgetB\026\n\024_account_budget" +
      "_nameB\030\n\026_purchase_order_numberB\031\n\027_subt" +
      "otal_amount_microsB\024\n\022_tax_amount_micros" +
      "B\026\n\024_total_amount_micros:T\352AQ\n googleads" +
      ".googleapis.com/Invoice\022-customers/{cust" +
      "omer_id}/invoices/{invoice_id}B\005\n\003_idB\020\n" +
      "\016_billing_setupB\026\n\024_payments_account_idB" +
      "\026\n\024_payments_profile_idB\r\n\013_issue_dateB\013" +
      "\n\t_due_dateB\020\n\016_currency_codeB\031\n\027_subtot" +
      "al_amount_microsB\024\n\022_tax_amount_microsB\026" +
      "\n\024_total_amount_microsB\024\n\022_corrected_inv" +
      "oiceB\n\n\010_pdf_urlB\376\001\n&com.google.ads.goog" +
      "leads.v10.resourcesB\014InvoiceProtoP\001ZKgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v10/resources;resources\242\002\003GAA\252\002" +
      "\"Google.Ads.GoogleAds.V10.Resources\312\002\"Go" +
      "ogle\\Ads\\GoogleAds\\V10\\Resources\352\002&Googl" +
      "e::Ads::GoogleAds::V10::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.DatesProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.InvoiceTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_Invoice_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "BillingSetup", "PaymentsAccountId", "PaymentsProfileId", "IssueDate", "DueDate", "ServiceDateRange", "CurrencyCode", "AdjustmentsSubtotalAmountMicros", "AdjustmentsTaxAmountMicros", "AdjustmentsTotalAmountMicros", "RegulatoryCostsSubtotalAmountMicros", "RegulatoryCostsTaxAmountMicros", "RegulatoryCostsTotalAmountMicros", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "CorrectedInvoice", "ReplacedInvoices", "PdfUrl", "AccountBudgetSummaries", "Id", "BillingSetup", "PaymentsAccountId", "PaymentsProfileId", "IssueDate", "DueDate", "CurrencyCode", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "CorrectedInvoice", "PdfUrl", });
    internal_static_google_ads_googleads_v10_resources_Invoice_AccountBudgetSummary_descriptor =
      internal_static_google_ads_googleads_v10_resources_Invoice_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_Invoice_AccountBudgetSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_Invoice_AccountBudgetSummary_descriptor,
        new java.lang.String[] { "Customer", "CustomerDescriptiveName", "AccountBudget", "AccountBudgetName", "PurchaseOrderNumber", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "BillableActivityDateRange", "Customer", "CustomerDescriptiveName", "AccountBudget", "AccountBudgetName", "PurchaseOrderNumber", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.DatesProto.getDescriptor();
    com.google.ads.googleads.v10.enums.InvoiceTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
