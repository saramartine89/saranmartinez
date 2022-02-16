// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/campaign_conversion_goal_service.proto

package com.google.ads.googleads.v10.services;

public interface CampaignConversionGoalOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.CampaignConversionGoalOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Update operation: The customer conversion goal is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.CampaignConversionGoal update = 1;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The customer conversion goal is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.CampaignConversionGoal update = 1;</code>
   * @return The update.
   */
  com.google.ads.googleads.v10.resources.CampaignConversionGoal getUpdate();
  /**
   * <pre>
   * Update operation: The customer conversion goal is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.CampaignConversionGoal update = 1;</code>
   */
  com.google.ads.googleads.v10.resources.CampaignConversionGoalOrBuilder getUpdateOrBuilder();

  public com.google.ads.googleads.v10.services.CampaignConversionGoalOperation.OperationCase getOperationCase();
}