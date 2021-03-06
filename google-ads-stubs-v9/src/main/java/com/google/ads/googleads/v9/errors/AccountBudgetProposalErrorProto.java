// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/account_budget_proposal_error.proto

package com.google.ads.googleads.v9.errors;

public final class AccountBudgetProposalErrorProto {
  private AccountBudgetProposalErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_errors_AccountBudgetProposalErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_errors_AccountBudgetProposalErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v9/errors/account" +
      "_budget_proposal_error.proto\022\036google.ads" +
      ".googleads.v9.errors\032\034google/api/annotat" +
      "ions.proto\"\230\007\n\036AccountBudgetProposalErro" +
      "rEnum\"\365\006\n\032AccountBudgetProposalError\022\017\n\013" +
      "UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\032\n\026FIELD_MASK" +
      "_NOT_ALLOWED\020\002\022\023\n\017IMMUTABLE_FIELD\020\003\022\032\n\026R" +
      "EQUIRED_FIELD_MISSING\020\004\022#\n\037CANNOT_CANCEL" +
      "_APPROVED_PROPOSAL\020\005\022#\n\037CANNOT_REMOVE_UN" +
      "APPROVED_BUDGET\020\006\022 \n\034CANNOT_REMOVE_RUNNI" +
      "NG_BUDGET\020\007\022 \n\034CANNOT_END_UNAPPROVED_BUD" +
      "GET\020\010\022\036\n\032CANNOT_END_INACTIVE_BUDGET\020\t\022\030\n" +
      "\024BUDGET_NAME_REQUIRED\020\n\022\034\n\030CANNOT_UPDATE" +
      "_OLD_BUDGET\020\013\022\026\n\022CANNOT_END_IN_PAST\020\014\022\032\n" +
      "\026CANNOT_EXTEND_END_TIME\020\r\022\"\n\036PURCHASE_OR" +
      "DER_NUMBER_REQUIRED\020\016\022\"\n\036PENDING_UPDATE_" +
      "PROPOSAL_EXISTS\020\017\022=\n9MULTIPLE_BUDGETS_NO" +
      "T_ALLOWED_FOR_UNAPPROVED_BILLING_SETUP\020\020" +
      "\022/\n+CANNOT_UPDATE_START_TIME_FOR_STARTED" +
      "_BUDGET\020\021\0226\n2SPENDING_LIMIT_LOWER_THAN_A" +
      "CCRUED_COST_NOT_ALLOWED\020\022\022\023\n\017UPDATE_IS_N" +
      "O_OP\020\023\022#\n\037END_TIME_MUST_FOLLOW_START_TIM" +
      "E\020\024\0225\n1BUDGET_DATE_RANGE_INCOMPATIBLE_WI" +
      "TH_BILLING_SETUP\020\025\022\022\n\016NOT_AUTHORIZED\020\026\022\031" +
      "\n\025INVALID_BILLING_SETUP\020\027\022\034\n\030OVERLAPS_EX" +
      "ISTING_BUDGET\020\030\022$\n CANNOT_CREATE_BUDGET_" +
      "THROUGH_API\020\031B\372\001\n\"com.google.ads.googlea" +
      "ds.v9.errorsB\037AccountBudgetProposalError" +
      "ProtoP\001ZDgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v9/errors;errors\242\002\003" +
      "GAA\252\002\036Google.Ads.GoogleAds.V9.Errors\312\002\036G" +
      "oogle\\Ads\\GoogleAds\\V9\\Errors\352\002\"Google::" +
      "Ads::GoogleAds::V9::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_errors_AccountBudgetProposalErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_errors_AccountBudgetProposalErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_errors_AccountBudgetProposalErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
