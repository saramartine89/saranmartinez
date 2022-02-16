// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/reach_plan_service.proto

package com.google.ads.googleads.v8.services;

public interface GenerateProductMixIdeasRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.GenerateProductMixIdeasRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The ID of the location, this is one of the ids returned by
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v8.services.ReachPlanService.ListPlannableLocations].
   * </pre>
   *
   * <code>string plannable_location_id = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The plannableLocationId.
   */
  java.lang.String getPlannableLocationId();
  /**
   * <pre>
   * Required. The ID of the location, this is one of the ids returned by
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v8.services.ReachPlanService.ListPlannableLocations].
   * </pre>
   *
   * <code>string plannable_location_id = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for plannableLocationId.
   */
  com.google.protobuf.ByteString
      getPlannableLocationIdBytes();

  /**
   * <pre>
   * Required. Currency code.
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>string currency_code = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Required. Currency code.
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>string currency_code = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * Required. Total budget.
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>int64 budget_micros = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The budgetMicros.
   */
  long getBudgetMicros();

  /**
   * <pre>
   * The preferences of the suggested product mix.
   * An unset preference is interpreted as all possible values are allowed,
   * unless explicitly specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.Preferences preferences = 5;</code>
   * @return Whether the preferences field is set.
   */
  boolean hasPreferences();
  /**
   * <pre>
   * The preferences of the suggested product mix.
   * An unset preference is interpreted as all possible values are allowed,
   * unless explicitly specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.Preferences preferences = 5;</code>
   * @return The preferences.
   */
  com.google.ads.googleads.v8.services.Preferences getPreferences();
  /**
   * <pre>
   * The preferences of the suggested product mix.
   * An unset preference is interpreted as all possible values are allowed,
   * unless explicitly specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.Preferences preferences = 5;</code>
   */
  com.google.ads.googleads.v8.services.PreferencesOrBuilder getPreferencesOrBuilder();
}