// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/asset_group_listing_group_filter.proto

package com.google.ads.googleads.v10.resources;

public final class AssetGroupListingGroupFilterProto {
  private AssetGroupListingGroupFilterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AssetGroupListingGroupFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AssetGroupListingGroupFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBiddingCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBiddingCategory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBrand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBrand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductChannel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductChannel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCustomAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductItemId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductItemId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v10/resources/ass" +
      "et_group_listing_group_filter.proto\022\"goo" +
      "gle.ads.googleads.v10.resources\032Pgoogle/" +
      "ads/googleads/v10/enums/listing_group_fi" +
      "lter_bidding_category_level.proto\032Pgoogl" +
      "e/ads/googleads/v10/enums/listing_group_" +
      "filter_custom_attribute_index.proto\032Igoo" +
      "gle/ads/googleads/v10/enums/listing_grou" +
      "p_filter_product_channel.proto\032Kgoogle/a" +
      "ds/googleads/v10/enums/listing_group_fil" +
      "ter_product_condition.proto\032Lgoogle/ads/" +
      "googleads/v10/enums/listing_group_filter" +
      "_product_type_level.proto\032Cgoogle/ads/go" +
      "ogleads/v10/enums/listing_group_filter_t" +
      "ype_enum.proto\032Bgoogle/ads/googleads/v10" +
      "/enums/listing_group_filter_vertical.pro" +
      "to\032\034google/api/annotations.proto\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\"\370\005\n\034AssetGroupListingGroupF" +
      "ilter\022T\n\rresource_name\030\001 \001(\tB=\340A\005\372A7\n5go" +
      "ogleads.googleapis.com/AssetGroupListing" +
      "GroupFilter\022@\n\013asset_group\030\002 \001(\tB+\340A\005\372A%" +
      "\n#googleads.googleapis.com/AssetGroup\022\017\n" +
      "\002id\030\003 \001(\003B\003\340A\003\022d\n\004type\030\004 \001(\0162Q.google.ad" +
      "s.googleads.v10.enums.ListingGroupFilter" +
      "TypeEnum.ListingGroupFilterTypeB\003\340A\005\022p\n\010" +
      "vertical\030\005 \001(\0162Y.google.ads.googleads.v1" +
      "0.enums.ListingGroupFilterVerticalEnum.L" +
      "istingGroupFilterVerticalB\003\340A\005\022S\n\ncase_v" +
      "alue\030\006 \001(\0132?.google.ads.googleads.v10.re" +
      "sources.ListingGroupFilterDimension\022b\n\033p" +
      "arent_listing_group_filter\030\007 \001(\tB=\340A\005\372A7" +
      "\n5googleads.googleapis.com/AssetGroupLis" +
      "tingGroupFilter:\235\001\352A\231\001\n5googleads.google" +
      "apis.com/AssetGroupListingGroupFilter\022`c" +
      "ustomers/{customer_id}/assetGroupListing" +
      "GroupFilters/{asset_group_id}~{listing_g" +
      "roup_filter_id}\"\307\r\n\033ListingGroupFilterDi" +
      "mension\022z\n\030product_bidding_category\030\001 \001(" +
      "\0132V.google.ads.googleads.v10.resources.L" +
      "istingGroupFilterDimension.ProductBiddin" +
      "gCategoryH\000\022e\n\rproduct_brand\030\002 \001(\0132L.goo" +
      "gle.ads.googleads.v10.resources.ListingG" +
      "roupFilterDimension.ProductBrandH\000\022i\n\017pr" +
      "oduct_channel\030\003 \001(\0132N.google.ads.googlea" +
      "ds.v10.resources.ListingGroupFilterDimen" +
      "sion.ProductChannelH\000\022m\n\021product_conditi" +
      "on\030\004 \001(\0132P.google.ads.googleads.v10.reso" +
      "urces.ListingGroupFilterDimension.Produc" +
      "tConditionH\000\022z\n\030product_custom_attribute" +
      "\030\005 \001(\0132V.google.ads.googleads.v10.resour" +
      "ces.ListingGroupFilterDimension.ProductC" +
      "ustomAttributeH\000\022h\n\017product_item_id\030\006 \001(" +
      "\0132M.google.ads.googleads.v10.resources.L" +
      "istingGroupFilterDimension.ProductItemId" +
      "H\000\022c\n\014product_type\030\007 \001(\0132K.google.ads.go" +
      "ogleads.v10.resources.ListingGroupFilter" +
      "Dimension.ProductTypeH\000\032\263\001\n\026ProductBiddi" +
      "ngCategory\022\017\n\002id\030\001 \001(\003H\000\210\001\001\022\200\001\n\005level\030\002 " +
      "\001(\0162q.google.ads.googleads.v10.enums.Lis" +
      "tingGroupFilterBiddingCategoryLevelEnum." +
      "ListingGroupFilterBiddingCategoryLevelB\005" +
      "\n\003_id\032,\n\014ProductBrand\022\022\n\005value\030\001 \001(\tH\000\210\001" +
      "\001B\010\n\006_value\032\210\001\n\016ProductChannel\022v\n\007channe" +
      "l\030\001 \001(\0162e.google.ads.googleads.v10.enums" +
      ".ListingGroupFilterProductChannelEnum.Li" +
      "stingGroupFilterProductChannel\032\220\001\n\020Produ" +
      "ctCondition\022|\n\tcondition\030\001 \001(\0162i.google." +
      "ads.googleads.v10.enums.ListingGroupFilt" +
      "erProductConditionEnum.ListingGroupFilte" +
      "rProductCondition\032\271\001\n\026ProductCustomAttri" +
      "bute\022\022\n\005value\030\001 \001(\tH\000\210\001\001\022\200\001\n\005index\030\002 \001(\016" +
      "2q.google.ads.googleads.v10.enums.Listin" +
      "gGroupFilterCustomAttributeIndexEnum.Lis" +
      "tingGroupFilterCustomAttributeIndexB\010\n\006_" +
      "value\032-\n\rProductItemId\022\022\n\005value\030\001 \001(\tH\000\210" +
      "\001\001B\010\n\006_value\032\245\001\n\013ProductType\022\022\n\005value\030\001 " +
      "\001(\tH\000\210\001\001\022x\n\005level\030\002 \001(\0162i.google.ads.goo" +
      "gleads.v10.enums.ListingGroupFilterProdu" +
      "ctTypeLevelEnum.ListingGroupFilterProduc" +
      "tTypeLevelB\010\n\006_valueB\013\n\tdimensionB\223\002\n&co" +
      "m.google.ads.googleads.v10.resourcesB!As" +
      "setGroupListingGroupFilterProtoP\001ZKgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v10/resources;resources\242\002\003GAA\252\002\"G" +
      "oogle.Ads.GoogleAds.V10.Resources\312\002\"Goog" +
      "le\\Ads\\GoogleAds\\V10\\Resources\352\002&Google:" +
      ":Ads::GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ListingGroupFilterBiddingCategoryLevelProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ListingGroupFilterCustomAttributeIndexProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ListingGroupFilterProductChannelProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ListingGroupFilterProductConditionProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ListingGroupFilterProductTypeLevelProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ListingGroupFilterTypeEnumProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ListingGroupFilterVerticalProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_AssetGroupListingGroupFilter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AssetGroupListingGroupFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AssetGroupListingGroupFilter_descriptor,
        new java.lang.String[] { "ResourceName", "AssetGroup", "Id", "Type", "Vertical", "CaseValue", "ParentListingGroupFilter", });
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor,
        new java.lang.String[] { "ProductBiddingCategory", "ProductBrand", "ProductChannel", "ProductCondition", "ProductCustomAttribute", "ProductItemId", "ProductType", "Dimension", });
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBiddingCategory_descriptor =
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBiddingCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBiddingCategory_descriptor,
        new java.lang.String[] { "Id", "Level", "Id", });
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBrand_descriptor =
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBrand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductBrand_descriptor,
        new java.lang.String[] { "Value", "Value", });
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductChannel_descriptor =
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductChannel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductChannel_descriptor,
        new java.lang.String[] { "Channel", });
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCondition_descriptor =
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCondition_descriptor,
        new java.lang.String[] { "Condition", });
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCustomAttribute_descriptor =
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor.getNestedTypes().get(4);
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCustomAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductCustomAttribute_descriptor,
        new java.lang.String[] { "Value", "Index", "Value", });
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductItemId_descriptor =
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor.getNestedTypes().get(5);
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductItemId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductItemId_descriptor,
        new java.lang.String[] { "Value", "Value", });
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductType_descriptor =
      internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_descriptor.getNestedTypes().get(6);
    internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ListingGroupFilterDimension_ProductType_descriptor,
        new java.lang.String[] { "Value", "Level", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.ListingGroupFilterBiddingCategoryLevelProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ListingGroupFilterCustomAttributeIndexProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ListingGroupFilterProductChannelProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ListingGroupFilterProductConditionProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ListingGroupFilterProductTypeLevelProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ListingGroupFilterTypeEnumProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ListingGroupFilterVerticalProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
