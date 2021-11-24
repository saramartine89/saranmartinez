// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/asset_set_asset.proto

package com.google.ads.googleads.v9.resources;

/**
 * <pre>
 * AssetSetAsset is the link between an asset and an asset set.
 * Adding an AssetSetAsset links an asset with an asset set.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.resources.AssetSetAsset}
 */
public final class AssetSetAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.resources.AssetSetAsset)
    AssetSetAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetSetAsset.newBuilder() to construct.
  private AssetSetAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetSetAsset() {
    resourceName_ = "";
    assetSet_ = "";
    asset_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetSetAsset();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetSetAsset(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            assetSet_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            asset_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
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
    return com.google.ads.googleads.v9.resources.AssetSetAssetProto.internal_static_google_ads_googleads_v9_resources_AssetSetAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.resources.AssetSetAssetProto.internal_static_google_ads_googleads_v9_resources_AssetSetAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.resources.AssetSetAsset.class, com.google.ads.googleads.v9.resources.AssetSetAsset.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Immutable. The resource name of the asset set asset.
   * Asset set asset resource names have the form:
   * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The resource name of the asset set asset.
   * Asset set asset resource names have the form:
   * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_SET_FIELD_NUMBER = 2;
  private volatile java.lang.Object assetSet_;
  /**
   * <pre>
   * Immutable. The asset set which this asset set asset is linking to.
   * </pre>
   *
   * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetSet.
   */
  @java.lang.Override
  public java.lang.String getAssetSet() {
    java.lang.Object ref = assetSet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetSet_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The asset set which this asset set asset is linking to.
   * </pre>
   *
   * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetSet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetSetBytes() {
    java.lang.Object ref = assetSet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetSet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_FIELD_NUMBER = 3;
  private volatile java.lang.Object asset_;
  /**
   * <pre>
   * Immutable. The asset which this asset set asset is linking to.
   * </pre>
   *
   * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  @java.lang.Override
  public java.lang.String getAsset() {
    java.lang.Object ref = asset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      asset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The asset which this asset set asset is linking to.
   * </pre>
   *
   * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetBytes() {
    java.lang.Object ref = asset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      asset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private int status_;
  /**
   * <pre>
   * Output only. The status of the asset set asset. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Output only. The status of the asset set asset. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  @java.lang.Override public com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus result = com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus.valueOf(status_);
    return result == null ? com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetSet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assetSet_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, asset_);
    }
    if (status_ != com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetSet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assetSet_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, asset_);
    }
    if (status_ != com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, status_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v9.resources.AssetSetAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.resources.AssetSetAsset other = (com.google.ads.googleads.v9.resources.AssetSetAsset) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getAssetSet()
        .equals(other.getAssetSet())) return false;
    if (!getAsset()
        .equals(other.getAsset())) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + ASSET_SET_FIELD_NUMBER;
    hash = (53 * hash) + getAssetSet().hashCode();
    hash = (37 * hash) + ASSET_FIELD_NUMBER;
    hash = (53 * hash) + getAsset().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.resources.AssetSetAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.resources.AssetSetAsset prototype) {
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
   * AssetSetAsset is the link between an asset and an asset set.
   * Adding an AssetSetAsset links an asset with an asset set.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.resources.AssetSetAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.resources.AssetSetAsset)
      com.google.ads.googleads.v9.resources.AssetSetAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.resources.AssetSetAssetProto.internal_static_google_ads_googleads_v9_resources_AssetSetAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.resources.AssetSetAssetProto.internal_static_google_ads_googleads_v9_resources_AssetSetAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.resources.AssetSetAsset.class, com.google.ads.googleads.v9.resources.AssetSetAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.resources.AssetSetAsset.newBuilder()
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
      resourceName_ = "";

      assetSet_ = "";

      asset_ = "";

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.resources.AssetSetAssetProto.internal_static_google_ads_googleads_v9_resources_AssetSetAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.resources.AssetSetAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.resources.AssetSetAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.resources.AssetSetAsset build() {
      com.google.ads.googleads.v9.resources.AssetSetAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.resources.AssetSetAsset buildPartial() {
      com.google.ads.googleads.v9.resources.AssetSetAsset result = new com.google.ads.googleads.v9.resources.AssetSetAsset(this);
      result.resourceName_ = resourceName_;
      result.assetSet_ = assetSet_;
      result.asset_ = asset_;
      result.status_ = status_;
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
      if (other instanceof com.google.ads.googleads.v9.resources.AssetSetAsset) {
        return mergeFrom((com.google.ads.googleads.v9.resources.AssetSetAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.resources.AssetSetAsset other) {
      if (other == com.google.ads.googleads.v9.resources.AssetSetAsset.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (!other.getAssetSet().isEmpty()) {
        assetSet_ = other.assetSet_;
        onChanged();
      }
      if (!other.getAsset().isEmpty()) {
        asset_ = other.asset_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
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
      com.google.ads.googleads.v9.resources.AssetSetAsset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.resources.AssetSetAsset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Immutable. The resource name of the asset set asset.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The resource name of the asset set asset.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The resource name of the asset set asset.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the asset set asset.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the asset set asset.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object assetSet_ = "";
    /**
     * <pre>
     * Immutable. The asset set which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The assetSet.
     */
    public java.lang.String getAssetSet() {
      java.lang.Object ref = assetSet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetSet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset set which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for assetSet.
     */
    public com.google.protobuf.ByteString
        getAssetSetBytes() {
      java.lang.Object ref = assetSet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetSet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset set which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The assetSet to set.
     * @return This builder for chaining.
     */
    public Builder setAssetSet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assetSet_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset set which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetSet() {
      
      assetSet_ = getDefaultInstance().getAssetSet();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset set which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for assetSet to set.
     * @return This builder for chaining.
     */
    public Builder setAssetSetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assetSet_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object asset_ = "";
    /**
     * <pre>
     * Immutable. The asset which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The asset.
     */
    public java.lang.String getAsset() {
      java.lang.Object ref = asset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        asset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for asset.
     */
    public com.google.protobuf.ByteString
        getAssetBytes() {
      java.lang.Object ref = asset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        asset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The asset to set.
     * @return This builder for chaining.
     */
    public Builder setAsset(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      asset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAsset() {
      
      asset_ = getDefaultInstance().getAsset();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset which this asset set asset is linking to.
     * </pre>
     *
     * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for asset to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      asset_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Output only. The status of the asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Output only. The status of the asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The status of the asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus result = com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus.valueOf(status_);
      return result == null ? com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. The status of the asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The status of the asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.resources.AssetSetAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.resources.AssetSetAsset)
  private static final com.google.ads.googleads.v9.resources.AssetSetAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.resources.AssetSetAsset();
  }

  public static com.google.ads.googleads.v9.resources.AssetSetAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetSetAsset>
      PARSER = new com.google.protobuf.AbstractParser<AssetSetAsset>() {
    @java.lang.Override
    public AssetSetAsset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetSetAsset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetSetAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetSetAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.resources.AssetSetAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
