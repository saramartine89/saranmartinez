// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/access_invitation_error.proto

package com.google.ads.googleads.v10.errors;

public final class AccessInvitationErrorProto {
  private AccessInvitationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_AccessInvitationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_AccessInvitationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v10/errors/access" +
      "_invitation_error.proto\022\037google.ads.goog" +
      "leads.v10.errors\032\034google/api/annotations" +
      ".proto\"\363\002\n\031AccessInvitationErrorEnum\"\325\002\n" +
      "\025AccessInvitationError\022\017\n\013UNSPECIFIED\020\000\022" +
      "\013\n\007UNKNOWN\020\001\022\031\n\025INVALID_EMAIL_ADDRESS\020\002\022" +
      "$\n EMAIL_ADDRESS_ALREADY_HAS_ACCESS\020\003\022\035\n" +
      "\031INVALID_INVITATION_STATUS\020\004\022\'\n#GOOGLE_C" +
      "ONSUMER_ACCOUNT_NOT_ALLOWED\020\005\022\031\n\025INVALID" +
      "_INVITATION_ID\020\006\0220\n,EMAIL_ADDRESS_ALREAD" +
      "Y_HAS_PENDING_INVITATION\020\007\022&\n\"PENDING_IN" +
      "VITATIONS_LIMIT_EXCEEDED\020\010\022 \n\034EMAIL_DOMA" +
      "IN_POLICY_VIOLATED\020\tB\372\001\n#com.google.ads." +
      "googleads.v10.errorsB\032AccessInvitationEr" +
      "rorProtoP\001ZEgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v10/errors;error" +
      "s\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10.Error" +
      "s\312\002\037Google\\Ads\\GoogleAds\\V10\\Errors\352\002#Go" +
      "ogle::Ads::GoogleAds::V10::Errorsb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_AccessInvitationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_AccessInvitationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_AccessInvitationErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
