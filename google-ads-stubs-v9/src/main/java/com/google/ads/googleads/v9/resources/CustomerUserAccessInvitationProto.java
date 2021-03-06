// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/customer_user_access_invitation.proto

package com.google.ads.googleads.v9.resources;

public final class CustomerUserAccessInvitationProto {
  private CustomerUserAccessInvitationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_CustomerUserAccessInvitation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_CustomerUserAccessInvitation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v9/resources/cust" +
      "omer_user_access_invitation.proto\022!googl" +
      "e.ads.googleads.v9.resources\032<google/ads" +
      "/googleads/v9/enums/access_invitation_st" +
      "atus.proto\032/google/ads/googleads/v9/enum" +
      "s/access_role.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "\034google/api/annotations.proto\"\227\004\n\034Custom" +
      "erUserAccessInvitation\022T\n\rresource_name\030" +
      "\001 \001(\tB=\340A\005\372A7\n5googleads.googleapis.com/" +
      "CustomerUserAccessInvitation\022\032\n\rinvitati" +
      "on_id\030\002 \001(\003B\003\340A\003\022R\n\013access_role\030\003 \001(\01628." +
      "google.ads.googleads.v9.enums.AccessRole" +
      "Enum.AccessRoleB\003\340A\005\022\032\n\remail_address\030\004 " +
      "\001(\tB\003\340A\005\022\037\n\022creation_date_time\030\005 \001(\tB\003\340A" +
      "\003\022p\n\021invitation_status\030\006 \001(\0162P.google.ad" +
      "s.googleads.v9.enums.AccessInvitationSta" +
      "tusEnum.AccessInvitationStatusB\003\340A\003:\201\001\352A" +
      "~\n5googleads.googleapis.com/CustomerUser" +
      "AccessInvitation\022Ecustomers/{customer_id" +
      "}/customerUserAccessInvitations/{invitat" +
      "ion_id}B\216\002\n%com.google.ads.googleads.v9." +
      "resourcesB!CustomerUserAccessInvitationP" +
      "rotoP\001ZJgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v9/resources;resourc" +
      "es\242\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Resou" +
      "rces\312\002!Google\\Ads\\GoogleAds\\V9\\Resources" +
      "\352\002%Google::Ads::GoogleAds::V9::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.AccessInvitationStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.AccessRoleProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_CustomerUserAccessInvitation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_CustomerUserAccessInvitation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_CustomerUserAccessInvitation_descriptor,
        new java.lang.String[] { "ResourceName", "InvitationId", "AccessRole", "EmailAddress", "CreationDateTime", "InvitationStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.AccessInvitationStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.AccessRoleProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
