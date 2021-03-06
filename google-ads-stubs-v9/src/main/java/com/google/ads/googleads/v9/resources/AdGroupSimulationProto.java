// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/ad_group_simulation.proto

package com.google.ads.googleads.v9.resources;

public final class AdGroupSimulationProto {
  private AdGroupSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AdGroupSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AdGroupSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v9/resources/ad_g" +
      "roup_simulation.proto\022!google.ads.google" +
      "ads.v9.resources\032/google/ads/googleads/v" +
      "9/common/simulation.proto\032Bgoogle/ads/go" +
      "ogleads/v9/enums/simulation_modification" +
      "_method.proto\0323google/ads/googleads/v9/e" +
      "nums/simulation_type.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\034google/api/annotations.proto\"\356\007\n" +
      "\021AdGroupSimulation\022I\n\rresource_name\030\001 \001(" +
      "\tB2\340A\003\372A,\n*googleads.googleapis.com/AdGr" +
      "oupSimulation\022\035\n\013ad_group_id\030\014 \001(\003B\003\340A\003H" +
      "\001\210\001\001\022S\n\004type\030\003 \001(\0162@.google.ads.googlead" +
      "s.v9.enums.SimulationTypeEnum.Simulation" +
      "TypeB\003\340A\003\022~\n\023modification_method\030\004 \001(\0162\\" +
      ".google.ads.googleads.v9.enums.Simulatio" +
      "nModificationMethodEnum.SimulationModifi" +
      "cationMethodB\003\340A\003\022\034\n\nstart_date\030\r \001(\tB\003\340" +
      "A\003H\002\210\001\001\022\032\n\010end_date\030\016 \001(\tB\003\340A\003H\003\210\001\001\022\\\n\022c" +
      "pc_bid_point_list\030\010 \001(\01329.google.ads.goo" +
      "gleads.v9.common.CpcBidSimulationPointLi" +
      "stB\003\340A\003H\000\022\\\n\022cpv_bid_point_list\030\n \001(\01329." +
      "google.ads.googleads.v9.common.CpvBidSim" +
      "ulationPointListB\003\340A\003H\000\022b\n\025target_cpa_po" +
      "int_list\030\t \001(\0132<.google.ads.googleads.v9" +
      ".common.TargetCpaSimulationPointListB\003\340A" +
      "\003H\000\022d\n\026target_roas_point_list\030\013 \001(\0132=.go" +
      "ogle.ads.googleads.v9.common.TargetRoasS" +
      "imulationPointListB\003\340A\003H\000:\237\001\352A\233\001\n*google" +
      "ads.googleapis.com/AdGroupSimulation\022mcu" +
      "stomers/{customer_id}/adGroupSimulations" +
      "/{ad_group_id}~{type}~{modification_meth" +
      "od}~{start_date}~{end_date}B\014\n\npoint_lis" +
      "tB\016\n\014_ad_group_idB\r\n\013_start_dateB\013\n\t_end" +
      "_dateB\203\002\n%com.google.ads.googleads.v9.re" +
      "sourcesB\026AdGroupSimulationProtoP\001ZJgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v9/resources;resources\242\002\003GAA\252\002!Go" +
      "ogle.Ads.GoogleAds.V9.Resources\312\002!Google" +
      "\\Ads\\GoogleAds\\V9\\Resources\352\002%Google::Ad" +
      "s::GoogleAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_AdGroupSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_AdGroupSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AdGroupSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupId", "Type", "ModificationMethod", "StartDate", "EndDate", "CpcBidPointList", "CpvBidPointList", "TargetCpaPointList", "TargetRoasPointList", "PointList", "AdGroupId", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v9.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v9.enums.SimulationTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
