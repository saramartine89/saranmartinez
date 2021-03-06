// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/feed.proto

package com.google.ads.googleads.v10.resources;

public final class FeedProto {
  private FeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_Feed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_Feed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_OAuthInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_Feed_AffiliateLocationFeedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_Feed_AffiliateLocationFeedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_FeedAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_FeedAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v10/resources/fee" +
      "d.proto\022\"google.ads.googleads.v10.resour" +
      "ces\032Ngoogle/ads/googleads/v10/enums/affi" +
      "liate_location_feed_relationship_type.pr" +
      "oto\0328google/ads/googleads/v10/enums/feed" +
      "_attribute_type.proto\0320google/ads/google" +
      "ads/v10/enums/feed_origin.proto\0320google/" +
      "ads/googleads/v10/enums/feed_status.prot" +
      "o\032\034google/api/annotations.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\"\250\013\n\004Feed\022<\n\rresource_name\030\001 " +
      "\001(\tB%\340A\005\372A\037\n\035googleads.googleapis.com/Fe" +
      "ed\022\024\n\002id\030\013 \001(\003B\003\340A\003H\001\210\001\001\022\026\n\004name\030\014 \001(\tB\003" +
      "\340A\005H\002\210\001\001\022E\n\nattributes\030\004 \003(\01321.google.ad" +
      "s.googleads.v10.resources.FeedAttribute\022" +
      "X\n\024attribute_operations\030\t \003(\0132:.google.a" +
      "ds.googleads.v10.resources.FeedAttribute" +
      "Operation\022N\n\006origin\030\005 \001(\01629.google.ads.g" +
      "oogleads.v10.enums.FeedOriginEnum.FeedOr" +
      "iginB\003\340A\005\022N\n\006status\030\010 \001(\01629.google.ads.g" +
      "oogleads.v10.enums.FeedStatusEnum.FeedSt" +
      "atusB\003\340A\003\022d\n\031places_location_feed_data\030\006" +
      " \001(\0132?.google.ads.googleads.v10.resource" +
      "s.Feed.PlacesLocationFeedDataH\000\022j\n\034affil" +
      "iate_location_feed_data\030\007 \001(\0132B.google.a" +
      "ds.googleads.v10.resources.Feed.Affiliat" +
      "eLocationFeedDataH\000\032\346\003\n\026PlacesLocationFe" +
      "edData\022b\n\noauth_info\030\001 \001(\0132I.google.ads." +
      "googleads.v10.resources.Feed.PlacesLocat" +
      "ionFeedData.OAuthInfoB\003\340A\005\022\032\n\remail_addr" +
      "ess\030\007 \001(\tH\000\210\001\001\022\033\n\023business_account_id\030\010 " +
      "\001(\t\022!\n\024business_name_filter\030\t \001(\tH\001\210\001\001\022\030" +
      "\n\020category_filters\030\013 \003(\t\022\025\n\rlabel_filter" +
      "s\030\014 \003(\t\032\257\001\n\tOAuthInfo\022\030\n\013http_method\030\004 \001" +
      "(\tH\000\210\001\001\022\035\n\020http_request_url\030\005 \001(\tH\001\210\001\001\022&" +
      "\n\031http_authorization_header\030\006 \001(\tH\002\210\001\001B\016" +
      "\n\014_http_methodB\023\n\021_http_request_urlB\034\n\032_" +
      "http_authorization_headerB\020\n\016_email_addr" +
      "essB\027\n\025_business_name_filter\032\273\001\n\031Affilia" +
      "teLocationFeedData\022\021\n\tchain_ids\030\003 \003(\003\022\212\001" +
      "\n\021relationship_type\030\002 \001(\0162o.google.ads.g" +
      "oogleads.v10.enums.AffiliateLocationFeed" +
      "RelationshipTypeEnum.AffiliateLocationFe" +
      "edRelationshipType:K\352AH\n\035googleads.googl" +
      "eapis.com/Feed\022\'customers/{customer_id}/" +
      "feeds/{feed_id}B\035\n\033system_feed_generatio" +
      "n_dataB\005\n\003_idB\007\n\005_name\"\312\001\n\rFeedAttribute" +
      "\022\017\n\002id\030\005 \001(\003H\000\210\001\001\022\021\n\004name\030\006 \001(\tH\001\210\001\001\022U\n\004" +
      "type\030\003 \001(\0162G.google.ads.googleads.v10.en" +
      "ums.FeedAttributeTypeEnum.FeedAttributeT" +
      "ype\022\033\n\016is_part_of_key\030\007 \001(\010H\002\210\001\001B\005\n\003_idB" +
      "\007\n\005_nameB\021\n\017_is_part_of_key\"\356\001\n\026FeedAttr" +
      "ibuteOperation\022Z\n\010operator\030\001 \001(\0162C.googl" +
      "e.ads.googleads.v10.resources.FeedAttrib" +
      "uteOperation.OperatorB\003\340A\003\022E\n\005value\030\002 \001(" +
      "\01321.google.ads.googleads.v10.resources.F" +
      "eedAttributeB\003\340A\003\"1\n\010Operator\022\017\n\013UNSPECI" +
      "FIED\020\000\022\013\n\007UNKNOWN\020\001\022\007\n\003ADD\020\002B\373\001\n&com.goo" +
      "gle.ads.googleads.v10.resourcesB\tFeedPro" +
      "toP\001ZKgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v10/resources;resource" +
      "s\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resou" +
      "rces\312\002\"Google\\Ads\\GoogleAds\\V10\\Resource" +
      "s\352\002&Google::Ads::GoogleAds::V10::Resourc" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AffiliateLocationFeedRelationshipTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedAttributeTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedOriginProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedStatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_Feed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_Feed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_Feed_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Attributes", "AttributeOperations", "Origin", "Status", "PlacesLocationFeedData", "AffiliateLocationFeedData", "SystemFeedGenerationData", "Id", "Name", });
    internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_descriptor =
      internal_static_google_ads_googleads_v10_resources_Feed_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_descriptor,
        new java.lang.String[] { "OauthInfo", "EmailAddress", "BusinessAccountId", "BusinessNameFilter", "CategoryFilters", "LabelFilters", "EmailAddress", "BusinessNameFilter", });
    internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor =
      internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_OAuthInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor,
        new java.lang.String[] { "HttpMethod", "HttpRequestUrl", "HttpAuthorizationHeader", "HttpMethod", "HttpRequestUrl", "HttpAuthorizationHeader", });
    internal_static_google_ads_googleads_v10_resources_Feed_AffiliateLocationFeedData_descriptor =
      internal_static_google_ads_googleads_v10_resources_Feed_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_Feed_AffiliateLocationFeedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_Feed_AffiliateLocationFeedData_descriptor,
        new java.lang.String[] { "ChainIds", "RelationshipType", });
    internal_static_google_ads_googleads_v10_resources_FeedAttribute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_FeedAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_FeedAttribute_descriptor,
        new java.lang.String[] { "Id", "Name", "Type", "IsPartOfKey", "Id", "Name", "IsPartOfKey", });
    internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_descriptor,
        new java.lang.String[] { "Operator", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.AffiliateLocationFeedRelationshipTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedAttributeTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedOriginProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedStatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
