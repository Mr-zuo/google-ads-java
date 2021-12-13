// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/segments.proto

package com.google.ads.googleads.v8.common;

/**
 * <pre>
 * An AssetInteractionTarget segment.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.common.AssetInteractionTarget}
 */
public final class AssetInteractionTarget extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.common.AssetInteractionTarget)
    AssetInteractionTargetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetInteractionTarget.newBuilder() to construct.
  private AssetInteractionTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetInteractionTarget() {
    asset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetInteractionTarget();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetInteractionTarget(
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

            asset_ = s;
            break;
          }
          case 16: {

            interactionOnThisAsset_ = input.readBool();
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
    return com.google.ads.googleads.v8.common.SegmentsProto.internal_static_google_ads_googleads_v8_common_AssetInteractionTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.common.SegmentsProto.internal_static_google_ads_googleads_v8_common_AssetInteractionTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.common.AssetInteractionTarget.class, com.google.ads.googleads.v8.common.AssetInteractionTarget.Builder.class);
  }

  public static final int ASSET_FIELD_NUMBER = 1;
  private volatile java.lang.Object asset_;
  /**
   * <pre>
   * The asset resource name.
   * </pre>
   *
   * <code>string asset = 1;</code>
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
   * The asset resource name.
   * </pre>
   *
   * <code>string asset = 1;</code>
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

  public static final int INTERACTION_ON_THIS_ASSET_FIELD_NUMBER = 2;
  private boolean interactionOnThisAsset_;
  /**
   * <pre>
   * Only used with CustomerAsset, CampaignAsset and AdGroupAsset metrics.
   * Indicates whether the interaction metrics occurred on the asset itself or a
   * different asset or ad unit.
   * </pre>
   *
   * <code>bool interaction_on_this_asset = 2;</code>
   * @return The interactionOnThisAsset.
   */
  @java.lang.Override
  public boolean getInteractionOnThisAsset() {
    return interactionOnThisAsset_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, asset_);
    }
    if (interactionOnThisAsset_ != false) {
      output.writeBool(2, interactionOnThisAsset_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, asset_);
    }
    if (interactionOnThisAsset_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, interactionOnThisAsset_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.common.AssetInteractionTarget)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.common.AssetInteractionTarget other = (com.google.ads.googleads.v8.common.AssetInteractionTarget) obj;

    if (!getAsset()
        .equals(other.getAsset())) return false;
    if (getInteractionOnThisAsset()
        != other.getInteractionOnThisAsset()) return false;
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
    hash = (37 * hash) + ASSET_FIELD_NUMBER;
    hash = (53 * hash) + getAsset().hashCode();
    hash = (37 * hash) + INTERACTION_ON_THIS_ASSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getInteractionOnThisAsset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.AssetInteractionTarget parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.common.AssetInteractionTarget prototype) {
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
   * An AssetInteractionTarget segment.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.common.AssetInteractionTarget}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.common.AssetInteractionTarget)
      com.google.ads.googleads.v8.common.AssetInteractionTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.common.SegmentsProto.internal_static_google_ads_googleads_v8_common_AssetInteractionTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.common.SegmentsProto.internal_static_google_ads_googleads_v8_common_AssetInteractionTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.common.AssetInteractionTarget.class, com.google.ads.googleads.v8.common.AssetInteractionTarget.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.common.AssetInteractionTarget.newBuilder()
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
      asset_ = "";

      interactionOnThisAsset_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.common.SegmentsProto.internal_static_google_ads_googleads_v8_common_AssetInteractionTarget_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.AssetInteractionTarget getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.common.AssetInteractionTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.AssetInteractionTarget build() {
      com.google.ads.googleads.v8.common.AssetInteractionTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.AssetInteractionTarget buildPartial() {
      com.google.ads.googleads.v8.common.AssetInteractionTarget result = new com.google.ads.googleads.v8.common.AssetInteractionTarget(this);
      result.asset_ = asset_;
      result.interactionOnThisAsset_ = interactionOnThisAsset_;
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
      if (other instanceof com.google.ads.googleads.v8.common.AssetInteractionTarget) {
        return mergeFrom((com.google.ads.googleads.v8.common.AssetInteractionTarget)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.common.AssetInteractionTarget other) {
      if (other == com.google.ads.googleads.v8.common.AssetInteractionTarget.getDefaultInstance()) return this;
      if (!other.getAsset().isEmpty()) {
        asset_ = other.asset_;
        onChanged();
      }
      if (other.getInteractionOnThisAsset() != false) {
        setInteractionOnThisAsset(other.getInteractionOnThisAsset());
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
      com.google.ads.googleads.v8.common.AssetInteractionTarget parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.common.AssetInteractionTarget) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object asset_ = "";
    /**
     * <pre>
     * The asset resource name.
     * </pre>
     *
     * <code>string asset = 1;</code>
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
     * The asset resource name.
     * </pre>
     *
     * <code>string asset = 1;</code>
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
     * The asset resource name.
     * </pre>
     *
     * <code>string asset = 1;</code>
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
     * The asset resource name.
     * </pre>
     *
     * <code>string asset = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAsset() {
      
      asset_ = getDefaultInstance().getAsset();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The asset resource name.
     * </pre>
     *
     * <code>string asset = 1;</code>
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

    private boolean interactionOnThisAsset_ ;
    /**
     * <pre>
     * Only used with CustomerAsset, CampaignAsset and AdGroupAsset metrics.
     * Indicates whether the interaction metrics occurred on the asset itself or a
     * different asset or ad unit.
     * </pre>
     *
     * <code>bool interaction_on_this_asset = 2;</code>
     * @return The interactionOnThisAsset.
     */
    @java.lang.Override
    public boolean getInteractionOnThisAsset() {
      return interactionOnThisAsset_;
    }
    /**
     * <pre>
     * Only used with CustomerAsset, CampaignAsset and AdGroupAsset metrics.
     * Indicates whether the interaction metrics occurred on the asset itself or a
     * different asset or ad unit.
     * </pre>
     *
     * <code>bool interaction_on_this_asset = 2;</code>
     * @param value The interactionOnThisAsset to set.
     * @return This builder for chaining.
     */
    public Builder setInteractionOnThisAsset(boolean value) {
      
      interactionOnThisAsset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Only used with CustomerAsset, CampaignAsset and AdGroupAsset metrics.
     * Indicates whether the interaction metrics occurred on the asset itself or a
     * different asset or ad unit.
     * </pre>
     *
     * <code>bool interaction_on_this_asset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInteractionOnThisAsset() {
      
      interactionOnThisAsset_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.common.AssetInteractionTarget)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.AssetInteractionTarget)
  private static final com.google.ads.googleads.v8.common.AssetInteractionTarget DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.common.AssetInteractionTarget();
  }

  public static com.google.ads.googleads.v8.common.AssetInteractionTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetInteractionTarget>
      PARSER = new com.google.protobuf.AbstractParser<AssetInteractionTarget>() {
    @java.lang.Override
    public AssetInteractionTarget parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetInteractionTarget(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetInteractionTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetInteractionTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.common.AssetInteractionTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
