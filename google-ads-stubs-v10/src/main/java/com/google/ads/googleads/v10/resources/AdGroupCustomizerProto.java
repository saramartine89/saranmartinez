// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/ad_group_customizer.proto

package com.google.ads.googleads.v10.resources;

public final class AdGroupCustomizerProto {
  private AdGroupCustomizerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AdGroupCustomizer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AdGroupCustomizer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v10/resources/ad_" +
      "group_customizer.proto\022\"google.ads.googl" +
      "eads.v10.resources\0326google/ads/googleads" +
      "/v10/common/customizer_value.proto\032<goog" +
      "le/ads/googleads/v10/enums/customizer_va" +
      "lue_status.proto\032\034google/api/annotations" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\244\004\n\021AdGroupCu" +
      "stomizer\022I\n\rresource_name\030\001 \001(\tB2\340A\005\372A,\n" +
      "*googleads.googleapis.com/AdGroupCustomi" +
      "zer\022:\n\010ad_group\030\002 \001(\tB(\340A\005\372A\"\n googleads" +
      ".googleapis.com/AdGroup\022U\n\024customizer_at" +
      "tribute\030\003 \001(\tB7\340A\002\340A\005\372A.\n,googleads.goog" +
      "leapis.com/CustomizerAttribute\022d\n\006status" +
      "\030\004 \001(\0162O.google.ads.googleads.v10.enums." +
      "CustomizerValueStatusEnum.CustomizerValu" +
      "eStatusB\003\340A\003\022D\n\005value\030\005 \001(\01320.google.ads" +
      ".googleads.v10.common.CustomizerValueB\003\340" +
      "A\002:\204\001\352A\200\001\n*googleads.googleapis.com/AdGr" +
      "oupCustomizer\022Rcustomers/{customer_id}/a" +
      "dGroupCustomizers/{ad_group_id}~{customi" +
      "zer_attribute_id}B\210\002\n&com.google.ads.goo" +
      "gleads.v10.resourcesB\026AdGroupCustomizerP" +
      "rotoP\001ZKgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v10/resources;resour" +
      "ces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Res" +
      "ources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resour" +
      "ces\352\002&Google::Ads::GoogleAds::V10::Resou" +
      "rcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.CustomizerValueProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CustomizerValueStatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_AdGroupCustomizer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AdGroupCustomizer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AdGroupCustomizer_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "CustomizerAttribute", "Status", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.CustomizerValueProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CustomizerValueStatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
