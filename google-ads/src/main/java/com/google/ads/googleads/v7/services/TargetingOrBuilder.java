// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/reach_plan_service.proto

package com.google.ads.googleads.v7.services;

public interface TargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.services.Targeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the selected location.
   * Plannable locations ID can be obtained from ListPlannableLocations.
   * </pre>
   *
   * <code>string plannable_location_id = 6;</code>
   * @return Whether the plannableLocationId field is set.
   */
  boolean hasPlannableLocationId();
  /**
   * <pre>
   * Required. The ID of the selected location.
   * Plannable locations ID can be obtained from ListPlannableLocations.
   * </pre>
   *
   * <code>string plannable_location_id = 6;</code>
   * @return The plannableLocationId.
   */
  java.lang.String getPlannableLocationId();
  /**
   * <pre>
   * Required. The ID of the selected location.
   * Plannable locations ID can be obtained from ListPlannableLocations.
   * </pre>
   *
   * <code>string plannable_location_id = 6;</code>
   * @return The bytes for plannableLocationId.
   */
  com.google.protobuf.ByteString
      getPlannableLocationIdBytes();

  /**
   * <pre>
   * Targeted age range.
   * If not specified, targets all age ranges.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_range = 2;</code>
   * @return The enum numeric value on the wire for ageRange.
   */
  int getAgeRangeValue();
  /**
   * <pre>
   * Targeted age range.
   * If not specified, targets all age ranges.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_range = 2;</code>
   * @return The ageRange.
   */
  com.google.ads.googleads.v7.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange getAgeRange();

  /**
   * <pre>
   * Targeted genders.
   * If not specified, targets all genders.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.GenderInfo genders = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v7.common.GenderInfo> 
      getGendersList();
  /**
   * <pre>
   * Targeted genders.
   * If not specified, targets all genders.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.GenderInfo genders = 3;</code>
   */
  com.google.ads.googleads.v7.common.GenderInfo getGenders(int index);
  /**
   * <pre>
   * Targeted genders.
   * If not specified, targets all genders.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.GenderInfo genders = 3;</code>
   */
  int getGendersCount();
  /**
   * <pre>
   * Targeted genders.
   * If not specified, targets all genders.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.GenderInfo genders = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v7.common.GenderInfoOrBuilder> 
      getGendersOrBuilderList();
  /**
   * <pre>
   * Targeted genders.
   * If not specified, targets all genders.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.GenderInfo genders = 3;</code>
   */
  com.google.ads.googleads.v7.common.GenderInfoOrBuilder getGendersOrBuilder(
      int index);

  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.DeviceInfo devices = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v7.common.DeviceInfo> 
      getDevicesList();
  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.DeviceInfo devices = 4;</code>
   */
  com.google.ads.googleads.v7.common.DeviceInfo getDevices(int index);
  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.DeviceInfo devices = 4;</code>
   */
  int getDevicesCount();
  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.DeviceInfo devices = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v7.common.DeviceInfoOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.DeviceInfo devices = 4;</code>
   */
  com.google.ads.googleads.v7.common.DeviceInfoOrBuilder getDevicesOrBuilder(
      int index);

  /**
   * <pre>
   * Targetable network for the ad product.
   * If not specified, targets all applicable networks. Applicable networks vary
   * by product and region and can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.ReachPlanNetworkEnum.ReachPlanNetwork network = 5;</code>
   * @return The enum numeric value on the wire for network.
   */
  int getNetworkValue();
  /**
   * <pre>
   * Targetable network for the ad product.
   * If not specified, targets all applicable networks. Applicable networks vary
   * by product and region and can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.ReachPlanNetworkEnum.ReachPlanNetwork network = 5;</code>
   * @return The network.
   */
  com.google.ads.googleads.v7.enums.ReachPlanNetworkEnum.ReachPlanNetwork getNetwork();
}