// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/enums/lead_form_call_to_action_type.proto

package com.google.ads.googleads.v8.enums;

/**
 * <pre>
 * Describes the type of call-to-action phrases in a lead form.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum}
 */
public final class LeadFormCallToActionTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum)
    LeadFormCallToActionTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeadFormCallToActionTypeEnum.newBuilder() to construct.
  private LeadFormCallToActionTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeadFormCallToActionTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeadFormCallToActionTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LeadFormCallToActionTypeEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeProto.internal_static_google_ads_googleads_v8_enums_LeadFormCallToActionTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeProto.internal_static_google_ads_googleads_v8_enums_LeadFormCallToActionTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.class, com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the type of call-to-action phrases in a lead form.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.LeadFormCallToActionType}
   */
  public enum LeadFormCallToActionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Learn more.
     * </pre>
     *
     * <code>LEARN_MORE = 2;</code>
     */
    LEARN_MORE(2),
    /**
     * <pre>
     * Get quote.
     * </pre>
     *
     * <code>GET_QUOTE = 3;</code>
     */
    GET_QUOTE(3),
    /**
     * <pre>
     * Apply now.
     * </pre>
     *
     * <code>APPLY_NOW = 4;</code>
     */
    APPLY_NOW(4),
    /**
     * <pre>
     * Sign Up.
     * </pre>
     *
     * <code>SIGN_UP = 5;</code>
     */
    SIGN_UP(5),
    /**
     * <pre>
     * Contact us.
     * </pre>
     *
     * <code>CONTACT_US = 6;</code>
     */
    CONTACT_US(6),
    /**
     * <pre>
     * Subscribe.
     * </pre>
     *
     * <code>SUBSCRIBE = 7;</code>
     */
    SUBSCRIBE(7),
    /**
     * <pre>
     * Download.
     * </pre>
     *
     * <code>DOWNLOAD = 8;</code>
     */
    DOWNLOAD(8),
    /**
     * <pre>
     * Book now.
     * </pre>
     *
     * <code>BOOK_NOW = 9;</code>
     */
    BOOK_NOW(9),
    /**
     * <pre>
     * Get offer.
     * </pre>
     *
     * <code>GET_OFFER = 10;</code>
     */
    GET_OFFER(10),
    /**
     * <pre>
     * Register.
     * </pre>
     *
     * <code>REGISTER = 11;</code>
     */
    REGISTER(11),
    /**
     * <pre>
     * Get info.
     * </pre>
     *
     * <code>GET_INFO = 12;</code>
     */
    GET_INFO(12),
    /**
     * <pre>
     * Request a demo.
     * </pre>
     *
     * <code>REQUEST_DEMO = 13;</code>
     */
    REQUEST_DEMO(13),
    /**
     * <pre>
     * Join now.
     * </pre>
     *
     * <code>JOIN_NOW = 14;</code>
     */
    JOIN_NOW(14),
    /**
     * <pre>
     * Get started.
     * </pre>
     *
     * <code>GET_STARTED = 15;</code>
     */
    GET_STARTED(15),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Learn more.
     * </pre>
     *
     * <code>LEARN_MORE = 2;</code>
     */
    public static final int LEARN_MORE_VALUE = 2;
    /**
     * <pre>
     * Get quote.
     * </pre>
     *
     * <code>GET_QUOTE = 3;</code>
     */
    public static final int GET_QUOTE_VALUE = 3;
    /**
     * <pre>
     * Apply now.
     * </pre>
     *
     * <code>APPLY_NOW = 4;</code>
     */
    public static final int APPLY_NOW_VALUE = 4;
    /**
     * <pre>
     * Sign Up.
     * </pre>
     *
     * <code>SIGN_UP = 5;</code>
     */
    public static final int SIGN_UP_VALUE = 5;
    /**
     * <pre>
     * Contact us.
     * </pre>
     *
     * <code>CONTACT_US = 6;</code>
     */
    public static final int CONTACT_US_VALUE = 6;
    /**
     * <pre>
     * Subscribe.
     * </pre>
     *
     * <code>SUBSCRIBE = 7;</code>
     */
    public static final int SUBSCRIBE_VALUE = 7;
    /**
     * <pre>
     * Download.
     * </pre>
     *
     * <code>DOWNLOAD = 8;</code>
     */
    public static final int DOWNLOAD_VALUE = 8;
    /**
     * <pre>
     * Book now.
     * </pre>
     *
     * <code>BOOK_NOW = 9;</code>
     */
    public static final int BOOK_NOW_VALUE = 9;
    /**
     * <pre>
     * Get offer.
     * </pre>
     *
     * <code>GET_OFFER = 10;</code>
     */
    public static final int GET_OFFER_VALUE = 10;
    /**
     * <pre>
     * Register.
     * </pre>
     *
     * <code>REGISTER = 11;</code>
     */
    public static final int REGISTER_VALUE = 11;
    /**
     * <pre>
     * Get info.
     * </pre>
     *
     * <code>GET_INFO = 12;</code>
     */
    public static final int GET_INFO_VALUE = 12;
    /**
     * <pre>
     * Request a demo.
     * </pre>
     *
     * <code>REQUEST_DEMO = 13;</code>
     */
    public static final int REQUEST_DEMO_VALUE = 13;
    /**
     * <pre>
     * Join now.
     * </pre>
     *
     * <code>JOIN_NOW = 14;</code>
     */
    public static final int JOIN_NOW_VALUE = 14;
    /**
     * <pre>
     * Get started.
     * </pre>
     *
     * <code>GET_STARTED = 15;</code>
     */
    public static final int GET_STARTED_VALUE = 15;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LeadFormCallToActionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LeadFormCallToActionType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return LEARN_MORE;
        case 3: return GET_QUOTE;
        case 4: return APPLY_NOW;
        case 5: return SIGN_UP;
        case 6: return CONTACT_US;
        case 7: return SUBSCRIBE;
        case 8: return DOWNLOAD;
        case 9: return BOOK_NOW;
        case 10: return GET_OFFER;
        case 11: return REGISTER;
        case 12: return GET_INFO;
        case 13: return REQUEST_DEMO;
        case 14: return JOIN_NOW;
        case 15: return GET_STARTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LeadFormCallToActionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LeadFormCallToActionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LeadFormCallToActionType>() {
            public LeadFormCallToActionType findValueByNumber(int number) {
              return LeadFormCallToActionType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final LeadFormCallToActionType[] VALUES = values();

    public static LeadFormCallToActionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LeadFormCallToActionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.LeadFormCallToActionType)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum other = (com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes the type of call-to-action phrases in a lead form.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum)
      com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeProto.internal_static_google_ads_googleads_v8_enums_LeadFormCallToActionTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeProto.internal_static_google_ads_googleads_v8_enums_LeadFormCallToActionTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.class, com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeProto.internal_static_google_ads_googleads_v8_enums_LeadFormCallToActionTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum build() {
      com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum buildPartial() {
      com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum result = new com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum other) {
      if (other == com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum)
  private static final com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum();
  }

  public static com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeadFormCallToActionTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<LeadFormCallToActionTypeEnum>() {
    @java.lang.Override
    public LeadFormCallToActionTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LeadFormCallToActionTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LeadFormCallToActionTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeadFormCallToActionTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.enums.LeadFormCallToActionTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
