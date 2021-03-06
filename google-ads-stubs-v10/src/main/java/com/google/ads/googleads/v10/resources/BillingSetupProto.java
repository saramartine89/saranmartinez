// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/billing_setup.proto

package com.google.ads.googleads.v10.resources;

public final class BillingSetupProto {
  private BillingSetupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_BillingSetup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_BillingSetup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_BillingSetup_PaymentsAccountInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_BillingSetup_PaymentsAccountInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v10/resources/bil" +
      "ling_setup.proto\022\"google.ads.googleads.v" +
      "10.resources\0329google/ads/googleads/v10/e" +
      "nums/billing_setup_status.proto\032.google/" +
      "ads/googleads/v10/enums/time_type.proto\032" +
      "\034google/api/annotations.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\372\010\n\014BillingSetup\022D\n\rresource_n" +
      "ame\030\001 \001(\tB-\340A\005\372A\'\n%googleads.googleapis." +
      "com/BillingSetup\022\024\n\002id\030\017 \001(\003B\003\340A\003H\002\210\001\001\022^" +
      "\n\006status\030\003 \001(\0162I.google.ads.googleads.v1" +
      "0.enums.BillingSetupStatusEnum.BillingSe" +
      "tupStatusB\003\340A\003\022O\n\020payments_account\030\022 \001(\t" +
      "B0\340A\005\372A*\n(googleads.googleapis.com/Payme" +
      "ntsAccountH\003\210\001\001\022h\n\025payments_account_info" +
      "\030\014 \001(\0132D.google.ads.googleads.v10.resour" +
      "ces.BillingSetup.PaymentsAccountInfoB\003\340A" +
      "\005\022\036\n\017start_date_time\030\020 \001(\tB\003\340A\005H\000\022U\n\017sta" +
      "rt_time_type\030\n \001(\01625.google.ads.googlead" +
      "s.v10.enums.TimeTypeEnum.TimeTypeB\003\340A\005H\000" +
      "\022\034\n\rend_date_time\030\021 \001(\tB\003\340A\003H\001\022S\n\rend_ti" +
      "me_type\030\016 \001(\01625.google.ads.googleads.v10" +
      ".enums.TimeTypeEnum.TimeTypeB\003\340A\003H\001\032\354\002\n\023" +
      "PaymentsAccountInfo\022%\n\023payments_account_" +
      "id\030\006 \001(\tB\003\340A\003H\000\210\001\001\022\'\n\025payments_account_n" +
      "ame\030\007 \001(\tB\003\340A\005H\001\210\001\001\022%\n\023payments_profile_" +
      "id\030\010 \001(\tB\003\340A\005H\002\210\001\001\022\'\n\025payments_profile_n" +
      "ame\030\t \001(\tB\003\340A\003H\003\210\001\001\022/\n\035secondary_payment" +
      "s_profile_id\030\n \001(\tB\003\340A\003H\004\210\001\001B\026\n\024_payment" +
      "s_account_idB\030\n\026_payments_account_nameB\026" +
      "\n\024_payments_profile_idB\030\n\026_payments_prof" +
      "ile_nameB \n\036_secondary_payments_profile_" +
      "id:d\352Aa\n%googleads.googleapis.com/Billin" +
      "gSetup\0228customers/{customer_id}/billingS" +
      "etups/{billing_setup_id}B\014\n\nstart_timeB\n" +
      "\n\010end_timeB\005\n\003_idB\023\n\021_payments_accountB\203" +
      "\002\n&com.google.ads.googleads.v10.resource" +
      "sB\021BillingSetupProtoP\001ZKgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v10/" +
      "resources;resources\242\002\003GAA\252\002\"Google.Ads.G" +
      "oogleAds.V10.Resources\312\002\"Google\\Ads\\Goog" +
      "leAds\\V10\\Resources\352\002&Google::Ads::Googl" +
      "eAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.BillingSetupStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.TimeTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_BillingSetup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_BillingSetup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_BillingSetup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Status", "PaymentsAccount", "PaymentsAccountInfo", "StartDateTime", "StartTimeType", "EndDateTime", "EndTimeType", "StartTime", "EndTime", "Id", "PaymentsAccount", });
    internal_static_google_ads_googleads_v10_resources_BillingSetup_PaymentsAccountInfo_descriptor =
      internal_static_google_ads_googleads_v10_resources_BillingSetup_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_BillingSetup_PaymentsAccountInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_BillingSetup_PaymentsAccountInfo_descriptor,
        new java.lang.String[] { "PaymentsAccountId", "PaymentsAccountName", "PaymentsProfileId", "PaymentsProfileName", "SecondaryPaymentsProfileId", "PaymentsAccountId", "PaymentsAccountName", "PaymentsProfileId", "PaymentsProfileName", "SecondaryPaymentsProfileId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.BillingSetupStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.TimeTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
