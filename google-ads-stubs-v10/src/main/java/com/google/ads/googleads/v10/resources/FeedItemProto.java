// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/feed_item.proto

package com.google.ads.googleads.v10.resources;

public final class FeedItemProto {
  private FeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_FeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_FeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_FeedItemAttributeValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_FeedItemAttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_FeedItemPlaceholderPolicyInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_FeedItemValidationError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_FeedItemValidationError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v10/resources/fee" +
      "d_item.proto\022\"google.ads.googleads.v10.r" +
      "esources\0326google/ads/googleads/v10/commo" +
      "n/custom_parameter.proto\0321google/ads/goo" +
      "gleads/v10/common/feed_common.proto\032,goo" +
      "gle/ads/googleads/v10/common/policy.prot" +
      "o\032Fgoogle/ads/googleads/v10/enums/feed_i" +
      "tem_quality_approval_status.proto\032Igoogl" +
      "e/ads/googleads/v10/enums/feed_item_qual" +
      "ity_disapproval_reason.proto\0325google/ads" +
      "/googleads/v10/enums/feed_item_status.pr" +
      "oto\032@google/ads/googleads/v10/enums/feed" +
      "_item_validation_status.proto\032>google/ad" +
      "s/googleads/v10/enums/geo_targeting_rest" +
      "riction.proto\0325google/ads/googleads/v10/" +
      "enums/placeholder_type.proto\032;google/ads" +
      "/googleads/v10/enums/policy_approval_sta" +
      "tus.proto\0329google/ads/googleads/v10/enum" +
      "s/policy_review_status.proto\032@google/ads" +
      "/googleads/v10/errors/feed_item_validati" +
      "on_error.proto\032\034google/api/annotations.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\"\305\006\n\010FeedItem\022@\n" +
      "\rresource_name\030\001 \001(\tB)\340A\005\372A#\n!googleads." +
      "googleapis.com/FeedItem\0228\n\004feed\030\013 \001(\tB%\340" +
      "A\005\372A\037\n\035googleads.googleapis.com/FeedH\000\210\001" +
      "\001\022\024\n\002id\030\014 \001(\003B\003\340A\003H\001\210\001\001\022\034\n\017start_date_ti" +
      "me\030\r \001(\tH\002\210\001\001\022\032\n\rend_date_time\030\016 \001(\tH\003\210\001" +
      "\001\022T\n\020attribute_values\030\006 \003(\0132:.google.ads" +
      ".googleads.v10.resources.FeedItemAttribu" +
      "teValue\022v\n\031geo_targeting_restriction\030\007 \001" +
      "(\0162S.google.ads.googleads.v10.enums.GeoT" +
      "argetingRestrictionEnum.GeoTargetingRest" +
      "riction\022O\n\025url_custom_parameters\030\010 \003(\01320" +
      ".google.ads.googleads.v10.common.CustomP" +
      "arameter\022V\n\006status\030\t \001(\0162A.google.ads.go" +
      "ogleads.v10.enums.FeedItemStatusEnum.Fee" +
      "dItemStatusB\003\340A\003\022\\\n\014policy_infos\030\n \003(\0132A" +
      ".google.ads.googleads.v10.resources.Feed" +
      "ItemPlaceholderPolicyInfoB\003\340A\003:b\352A_\n!goo" +
      "gleads.googleapis.com/FeedItem\022:customer" +
      "s/{customer_id}/feedItems/{feed_id}~{fee" +
      "d_item_id}B\007\n\005_feedB\005\n\003_idB\022\n\020_start_dat" +
      "e_timeB\020\n\016_end_date_time\"\235\003\n\026FeedItemAtt" +
      "ributeValue\022\036\n\021feed_attribute_id\030\013 \001(\003H\000" +
      "\210\001\001\022\032\n\rinteger_value\030\014 \001(\003H\001\210\001\001\022\032\n\rboole" +
      "an_value\030\r \001(\010H\002\210\001\001\022\031\n\014string_value\030\016 \001(" +
      "\tH\003\210\001\001\022\031\n\014double_value\030\017 \001(\001H\004\210\001\001\022;\n\013pri" +
      "ce_value\030\006 \001(\0132&.google.ads.googleads.v1" +
      "0.common.Money\022\026\n\016integer_values\030\020 \003(\003\022\026" +
      "\n\016boolean_values\030\021 \003(\010\022\025\n\rstring_values\030" +
      "\022 \003(\t\022\025\n\rdouble_values\030\023 \003(\001B\024\n\022_feed_at" +
      "tribute_idB\020\n\016_integer_valueB\020\n\016_boolean" +
      "_valueB\017\n\r_string_valueB\017\n\r_double_value" +
      "\"\355\007\n\035FeedItemPlaceholderPolicyInfo\022g\n\025pl" +
      "aceholder_type_enum\030\n \001(\0162C.google.ads.g" +
      "oogleads.v10.enums.PlaceholderTypeEnum.P" +
      "laceholderTypeB\003\340A\003\022,\n\032feed_mapping_reso" +
      "urce_name\030\013 \001(\tB\003\340A\003H\000\210\001\001\022e\n\rreview_stat" +
      "us\030\003 \001(\0162I.google.ads.googleads.v10.enum" +
      "s.PolicyReviewStatusEnum.PolicyReviewSta" +
      "tusB\003\340A\003\022k\n\017approval_status\030\004 \001(\0162M.goog" +
      "le.ads.googleads.v10.enums.PolicyApprova" +
      "lStatusEnum.PolicyApprovalStatusB\003\340A\003\022T\n" +
      "\024policy_topic_entries\030\005 \003(\01321.google.ads" +
      ".googleads.v10.common.PolicyTopicEntryB\003" +
      "\340A\003\022u\n\021validation_status\030\006 \001(\0162U.google." +
      "ads.googleads.v10.enums.FeedItemValidati" +
      "onStatusEnum.FeedItemValidationStatusB\003\340" +
      "A\003\022[\n\021validation_errors\030\007 \003(\0132;.google.a" +
      "ds.googleads.v10.resources.FeedItemValid" +
      "ationErrorB\003\340A\003\022\205\001\n\027quality_approval_sta" +
      "tus\030\010 \001(\0162_.google.ads.googleads.v10.enu" +
      "ms.FeedItemQualityApprovalStatusEnum.Fee" +
      "dItemQualityApprovalStatusB\003\340A\003\022\217\001\n\033qual" +
      "ity_disapproval_reasons\030\t \003(\0162e.google.a" +
      "ds.googleads.v10.enums.FeedItemQualityDi" +
      "sapprovalReasonEnum.FeedItemQualityDisap" +
      "provalReasonB\003\340A\003B\035\n\033_feed_mapping_resou" +
      "rce_name\"\213\002\n\027FeedItemValidationError\022s\n\020" +
      "validation_error\030\001 \001(\0162T.google.ads.goog" +
      "leads.v10.errors.FeedItemValidationError" +
      "Enum.FeedItemValidationErrorB\003\340A\003\022\035\n\013des" +
      "cription\030\006 \001(\tB\003\340A\003H\000\210\001\001\022\037\n\022feed_attribu" +
      "te_ids\030\007 \003(\003B\003\340A\003\022\034\n\nextra_info\030\010 \001(\tB\003\340" +
      "A\003H\001\210\001\001B\016\n\014_descriptionB\r\n\013_extra_infoB\377" +
      "\001\n&com.google.ads.googleads.v10.resource" +
      "sB\rFeedItemProtoP\001ZKgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v10/reso" +
      "urces;resources\242\002\003GAA\252\002\"Google.Ads.Googl" +
      "eAds.V10.Resources\312\002\"Google\\Ads\\GoogleAd" +
      "s\\V10\\Resources\352\002&Google::Ads::GoogleAds" +
      "::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v10.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v10.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedItemQualityApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedItemValidationStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.GeoTargetingRestrictionProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.errors.FeedItemValidationErrorProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_FeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_FeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_FeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Id", "StartDateTime", "EndDateTime", "AttributeValues", "GeoTargetingRestriction", "UrlCustomParameters", "Status", "PolicyInfos", "Feed", "Id", "StartDateTime", "EndDateTime", });
    internal_static_google_ads_googleads_v10_resources_FeedItemAttributeValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_FeedItemAttributeValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_FeedItemAttributeValue_descriptor,
        new java.lang.String[] { "FeedAttributeId", "IntegerValue", "BooleanValue", "StringValue", "DoubleValue", "PriceValue", "IntegerValues", "BooleanValues", "StringValues", "DoubleValues", "FeedAttributeId", "IntegerValue", "BooleanValue", "StringValue", "DoubleValue", });
    internal_static_google_ads_googleads_v10_resources_FeedItemPlaceholderPolicyInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_FeedItemPlaceholderPolicyInfo_descriptor,
        new java.lang.String[] { "PlaceholderTypeEnum", "FeedMappingResourceName", "ReviewStatus", "ApprovalStatus", "PolicyTopicEntries", "ValidationStatus", "ValidationErrors", "QualityApprovalStatus", "QualityDisapprovalReasons", "FeedMappingResourceName", });
    internal_static_google_ads_googleads_v10_resources_FeedItemValidationError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_resources_FeedItemValidationError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_FeedItemValidationError_descriptor,
        new java.lang.String[] { "ValidationError", "Description", "FeedAttributeIds", "ExtraInfo", "Description", "ExtraInfo", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v10.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v10.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedItemQualityApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedItemValidationStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.GeoTargetingRestrictionProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v10.errors.FeedItemValidationErrorProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
