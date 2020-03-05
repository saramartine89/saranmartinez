// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/customer_manager_link_service.proto

package com.google.ads.googleads.v3.services;

public interface MutateCustomerManagerLinkResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.MutateCustomerManagerLinkResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A result that identifies the resource affected by the mutate request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateCustomerManagerLinkResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v3.services.MutateCustomerManagerLinkResult> 
      getResultsList();
  /**
   * <pre>
   * A result that identifies the resource affected by the mutate request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateCustomerManagerLinkResult results = 1;</code>
   */
  com.google.ads.googleads.v3.services.MutateCustomerManagerLinkResult getResults(int index);
  /**
   * <pre>
   * A result that identifies the resource affected by the mutate request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateCustomerManagerLinkResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * A result that identifies the resource affected by the mutate request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateCustomerManagerLinkResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.services.MutateCustomerManagerLinkResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * A result that identifies the resource affected by the mutate request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateCustomerManagerLinkResult results = 1;</code>
   */
  com.google.ads.googleads.v3.services.MutateCustomerManagerLinkResultOrBuilder getResultsOrBuilder(
      int index);
}