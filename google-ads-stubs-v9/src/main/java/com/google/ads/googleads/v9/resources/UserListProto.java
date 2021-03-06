// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/user_list.proto

package com.google.ads.googleads.v9.resources;

public final class UserListProto {
  private UserListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_UserList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_UserList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v9/resources/user" +
      "_list.proto\022!google.ads.googleads.v9.res" +
      "ources\032/google/ads/googleads/v9/common/u" +
      "ser_lists.proto\0321google/ads/googleads/v9" +
      "/enums/access_reason.proto\032;google/ads/g" +
      "oogleads/v9/enums/user_list_access_statu" +
      "s.proto\032<google/ads/googleads/v9/enums/u" +
      "ser_list_closing_reason.proto\032?google/ad" +
      "s/googleads/v9/enums/user_list_membershi" +
      "p_status.proto\0328google/ads/googleads/v9/" +
      "enums/user_list_size_range.proto\0322google" +
      "/ads/googleads/v9/enums/user_list_type.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032\034google/api/ann" +
      "otations.proto\"\317\016\n\010UserList\022@\n\rresource_" +
      "name\030\001 \001(\tB)\340A\005\372A#\n!googleads.googleapis" +
      ".com/UserList\022\024\n\002id\030\031 \001(\003B\003\340A\003H\001\210\001\001\022\033\n\tr" +
      "ead_only\030\032 \001(\010B\003\340A\003H\002\210\001\001\022\021\n\004name\030\033 \001(\tH\003" +
      "\210\001\001\022\030\n\013description\030\034 \001(\tH\004\210\001\001\022o\n\021members" +
      "hip_status\030\006 \001(\0162T.google.ads.googleads." +
      "v9.enums.UserListMembershipStatusEnum.Us" +
      "erListMembershipStatus\022\035\n\020integration_co" +
      "de\030\035 \001(\tH\005\210\001\001\022!\n\024membership_life_span\030\036 " +
      "\001(\003H\006\210\001\001\022\"\n\020size_for_display\030\037 \001(\003B\003\340A\003H" +
      "\007\210\001\001\022k\n\026size_range_for_display\030\n \001(\0162F.g" +
      "oogle.ads.googleads.v9.enums.UserListSiz" +
      "eRangeEnum.UserListSizeRangeB\003\340A\003\022!\n\017siz" +
      "e_for_search\030  \001(\003B\003\340A\003H\010\210\001\001\022j\n\025size_ran" +
      "ge_for_search\030\014 \001(\0162F.google.ads.googlea" +
      "ds.v9.enums.UserListSizeRangeEnum.UserLi" +
      "stSizeRangeB\003\340A\003\022O\n\004type\030\r \001(\0162<.google." +
      "ads.googleads.v9.enums.UserListTypeEnum." +
      "UserListTypeB\003\340A\003\022f\n\016closing_reason\030\016 \001(" +
      "\0162N.google.ads.googleads.v9.enums.UserLi" +
      "stClosingReasonEnum.UserListClosingReaso" +
      "n\022X\n\raccess_reason\030\017 \001(\0162<.google.ads.go" +
      "ogleads.v9.enums.AccessReasonEnum.Access" +
      "ReasonB\003\340A\003\022n\n\030account_user_list_status\030" +
      "\020 \001(\0162L.google.ads.googleads.v9.enums.Us" +
      "erListAccessStatusEnum.UserListAccessSta" +
      "tus\022 \n\023eligible_for_search\030! \001(\010H\t\210\001\001\022&\n" +
      "\024eligible_for_display\030\" \001(\010B\003\340A\003H\n\210\001\001\022\'\n" +
      "\025match_rate_percentage\030\030 \001(\005B\003\340A\003H\013\210\001\001\022S" +
      "\n\023crm_based_user_list\030\023 \001(\01324.google.ads" +
      ".googleads.v9.common.CrmBasedUserListInf" +
      "oH\000\022U\n\021similar_user_list\030\024 \001(\01323.google." +
      "ads.googleads.v9.common.SimilarUserListI" +
      "nfoB\003\340A\003H\000\022U\n\024rule_based_user_list\030\025 \001(\013" +
      "25.google.ads.googleads.v9.common.RuleBa" +
      "sedUserListInfoH\000\022P\n\021logical_user_list\030\026" +
      " \001(\01323.google.ads.googleads.v9.common.Lo" +
      "gicalUserListInfoH\000\022L\n\017basic_user_list\030\027" +
      " \001(\01321.google.ads.googleads.v9.common.Ba" +
      "sicUserListInfoH\000:X\352AU\n!googleads.google" +
      "apis.com/UserList\0220customers/{customer_i" +
      "d}/userLists/{user_list_id}B\013\n\tuser_list" +
      "B\005\n\003_idB\014\n\n_read_onlyB\007\n\005_nameB\016\n\014_descr" +
      "iptionB\023\n\021_integration_codeB\027\n\025_membersh" +
      "ip_life_spanB\023\n\021_size_for_displayB\022\n\020_si" +
      "ze_for_searchB\026\n\024_eligible_for_searchB\027\n" +
      "\025_eligible_for_displayB\030\n\026_match_rate_pe" +
      "rcentageB\372\001\n%com.google.ads.googleads.v9" +
      ".resourcesB\rUserListProtoP\001ZJgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v9/resources;resources\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V9.Resources\312\002!Google\\Ads\\G" +
      "oogleAds\\V9\\Resources\352\002%Google::Ads::Goo" +
      "gleAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.UserListsProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.AccessReasonProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.UserListAccessStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.UserListClosingReasonProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.UserListMembershipStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.UserListSizeRangeProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.UserListTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_UserList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_UserList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_UserList_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ReadOnly", "Name", "Description", "MembershipStatus", "IntegrationCode", "MembershipLifeSpan", "SizeForDisplay", "SizeRangeForDisplay", "SizeForSearch", "SizeRangeForSearch", "Type", "ClosingReason", "AccessReason", "AccountUserListStatus", "EligibleForSearch", "EligibleForDisplay", "MatchRatePercentage", "CrmBasedUserList", "SimilarUserList", "RuleBasedUserList", "LogicalUserList", "BasicUserList", "UserList", "Id", "ReadOnly", "Name", "Description", "IntegrationCode", "MembershipLifeSpan", "SizeForDisplay", "SizeForSearch", "EligibleForSearch", "EligibleForDisplay", "MatchRatePercentage", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.UserListsProto.getDescriptor();
    com.google.ads.googleads.v9.enums.AccessReasonProto.getDescriptor();
    com.google.ads.googleads.v9.enums.UserListAccessStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.UserListClosingReasonProto.getDescriptor();
    com.google.ads.googleads.v9.enums.UserListMembershipStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.UserListSizeRangeProto.getDescriptor();
    com.google.ads.googleads.v9.enums.UserListTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
