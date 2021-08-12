// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/smart_campaign_suggest_service.proto

package com.google.ads.googleads.v8.services;

public interface SuggestSmartCampaignAdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest)
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
   * Required. Inputs used to suggest a Smart campaign ad.
   * Required fields: final_url, language_code, keyword_themes.
   * Optional but recommended fields to improve the quality of the suggestion:
   * business_setting and geo_target.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the suggestionInfo field is set.
   */
  boolean hasSuggestionInfo();
  /**
   * <pre>
   * Required. Inputs used to suggest a Smart campaign ad.
   * Required fields: final_url, language_code, keyword_themes.
   * Optional but recommended fields to improve the quality of the suggestion:
   * business_setting and geo_target.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The suggestionInfo.
   */
  com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo getSuggestionInfo();
  /**
   * <pre>
   * Required. Inputs used to suggest a Smart campaign ad.
   * Required fields: final_url, language_code, keyword_themes.
   * Optional but recommended fields to improve the quality of the suggestion:
   * business_setting and geo_target.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfoOrBuilder getSuggestionInfoOrBuilder();
}
