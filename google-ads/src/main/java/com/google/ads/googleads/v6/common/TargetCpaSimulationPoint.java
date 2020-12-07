// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/simulation.proto

package com.google.ads.googleads.v6.common;

/**
 * <pre>
 * Projected metrics for a specific target CPA amount.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v6.common.TargetCpaSimulationPoint}
 */
public final class TargetCpaSimulationPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v6.common.TargetCpaSimulationPoint)
    TargetCpaSimulationPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetCpaSimulationPoint.newBuilder() to construct.
  private TargetCpaSimulationPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetCpaSimulationPoint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetCpaSimulationPoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TargetCpaSimulationPoint(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 64: {
            bitField0_ |= 0x00000001;
            targetCpaMicros_ = input.readInt64();
            break;
          }
          case 73: {
            bitField0_ |= 0x00000002;
            biddableConversions_ = input.readDouble();
            break;
          }
          case 81: {
            bitField0_ |= 0x00000004;
            biddableConversionsValue_ = input.readDouble();
            break;
          }
          case 88: {
            bitField0_ |= 0x00000008;
            clicks_ = input.readInt64();
            break;
          }
          case 96: {
            bitField0_ |= 0x00000010;
            costMicros_ = input.readInt64();
            break;
          }
          case 104: {
            bitField0_ |= 0x00000020;
            impressions_ = input.readInt64();
            break;
          }
          case 112: {
            bitField0_ |= 0x00000040;
            topSlotImpressions_ = input.readInt64();
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
    return com.google.ads.googleads.v6.common.SimulationProto.internal_static_google_ads_googleads_v6_common_TargetCpaSimulationPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v6.common.SimulationProto.internal_static_google_ads_googleads_v6_common_TargetCpaSimulationPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v6.common.TargetCpaSimulationPoint.class, com.google.ads.googleads.v6.common.TargetCpaSimulationPoint.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_CPA_MICROS_FIELD_NUMBER = 8;
  private long targetCpaMicros_;
  /**
   * <pre>
   * The simulated target CPA upon which projected metrics are based.
   * </pre>
   *
   * <code>int64 target_cpa_micros = 8;</code>
   * @return Whether the targetCpaMicros field is set.
   */
  @java.lang.Override
  public boolean hasTargetCpaMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The simulated target CPA upon which projected metrics are based.
   * </pre>
   *
   * <code>int64 target_cpa_micros = 8;</code>
   * @return The targetCpaMicros.
   */
  @java.lang.Override
  public long getTargetCpaMicros() {
    return targetCpaMicros_;
  }

  public static final int BIDDABLE_CONVERSIONS_FIELD_NUMBER = 9;
  private double biddableConversions_;
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions = 9;</code>
   * @return Whether the biddableConversions field is set.
   */
  @java.lang.Override
  public boolean hasBiddableConversions() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions = 9;</code>
   * @return The biddableConversions.
   */
  @java.lang.Override
  public double getBiddableConversions() {
    return biddableConversions_;
  }

  public static final int BIDDABLE_CONVERSIONS_VALUE_FIELD_NUMBER = 10;
  private double biddableConversionsValue_;
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions_value = 10;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  @java.lang.Override
  public boolean hasBiddableConversionsValue() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions_value = 10;</code>
   * @return The biddableConversionsValue.
   */
  @java.lang.Override
  public double getBiddableConversionsValue() {
    return biddableConversionsValue_;
  }

  public static final int CLICKS_FIELD_NUMBER = 11;
  private long clicks_;
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>int64 clicks = 11;</code>
   * @return Whether the clicks field is set.
   */
  @java.lang.Override
  public boolean hasClicks() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>int64 clicks = 11;</code>
   * @return The clicks.
   */
  @java.lang.Override
  public long getClicks() {
    return clicks_;
  }

  public static final int COST_MICROS_FIELD_NUMBER = 12;
  private long costMicros_;
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>int64 cost_micros = 12;</code>
   * @return Whether the costMicros field is set.
   */
  @java.lang.Override
  public boolean hasCostMicros() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>int64 cost_micros = 12;</code>
   * @return The costMicros.
   */
  @java.lang.Override
  public long getCostMicros() {
    return costMicros_;
  }

  public static final int IMPRESSIONS_FIELD_NUMBER = 13;
  private long impressions_;
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>int64 impressions = 13;</code>
   * @return Whether the impressions field is set.
   */
  @java.lang.Override
  public boolean hasImpressions() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>int64 impressions = 13;</code>
   * @return The impressions.
   */
  @java.lang.Override
  public long getImpressions() {
    return impressions_;
  }

  public static final int TOP_SLOT_IMPRESSIONS_FIELD_NUMBER = 14;
  private long topSlotImpressions_;
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 top_slot_impressions = 14;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  @java.lang.Override
  public boolean hasTopSlotImpressions() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 top_slot_impressions = 14;</code>
   * @return The topSlotImpressions.
   */
  @java.lang.Override
  public long getTopSlotImpressions() {
    return topSlotImpressions_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(8, targetCpaMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(9, biddableConversions_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeDouble(10, biddableConversionsValue_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt64(11, clicks_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt64(12, costMicros_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeInt64(13, impressions_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      output.writeInt64(14, topSlotImpressions_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, targetCpaMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(9, biddableConversions_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(10, biddableConversionsValue_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(11, clicks_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(12, costMicros_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(13, impressions_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(14, topSlotImpressions_);
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
    if (!(obj instanceof com.google.ads.googleads.v6.common.TargetCpaSimulationPoint)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v6.common.TargetCpaSimulationPoint other = (com.google.ads.googleads.v6.common.TargetCpaSimulationPoint) obj;

    if (hasTargetCpaMicros() != other.hasTargetCpaMicros()) return false;
    if (hasTargetCpaMicros()) {
      if (getTargetCpaMicros()
          != other.getTargetCpaMicros()) return false;
    }
    if (hasBiddableConversions() != other.hasBiddableConversions()) return false;
    if (hasBiddableConversions()) {
      if (java.lang.Double.doubleToLongBits(getBiddableConversions())
          != java.lang.Double.doubleToLongBits(
              other.getBiddableConversions())) return false;
    }
    if (hasBiddableConversionsValue() != other.hasBiddableConversionsValue()) return false;
    if (hasBiddableConversionsValue()) {
      if (java.lang.Double.doubleToLongBits(getBiddableConversionsValue())
          != java.lang.Double.doubleToLongBits(
              other.getBiddableConversionsValue())) return false;
    }
    if (hasClicks() != other.hasClicks()) return false;
    if (hasClicks()) {
      if (getClicks()
          != other.getClicks()) return false;
    }
    if (hasCostMicros() != other.hasCostMicros()) return false;
    if (hasCostMicros()) {
      if (getCostMicros()
          != other.getCostMicros()) return false;
    }
    if (hasImpressions() != other.hasImpressions()) return false;
    if (hasImpressions()) {
      if (getImpressions()
          != other.getImpressions()) return false;
    }
    if (hasTopSlotImpressions() != other.hasTopSlotImpressions()) return false;
    if (hasTopSlotImpressions()) {
      if (getTopSlotImpressions()
          != other.getTopSlotImpressions()) return false;
    }
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
    if (hasTargetCpaMicros()) {
      hash = (37 * hash) + TARGET_CPA_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetCpaMicros());
    }
    if (hasBiddableConversions()) {
      hash = (37 * hash) + BIDDABLE_CONVERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getBiddableConversions()));
    }
    if (hasBiddableConversionsValue()) {
      hash = (37 * hash) + BIDDABLE_CONVERSIONS_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getBiddableConversionsValue()));
    }
    if (hasClicks()) {
      hash = (37 * hash) + CLICKS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getClicks());
    }
    if (hasCostMicros()) {
      hash = (37 * hash) + COST_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCostMicros());
    }
    if (hasImpressions()) {
      hash = (37 * hash) + IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getImpressions());
    }
    if (hasTopSlotImpressions()) {
      hash = (37 * hash) + TOP_SLOT_IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTopSlotImpressions());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v6.common.TargetCpaSimulationPoint prototype) {
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
   * Projected metrics for a specific target CPA amount.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v6.common.TargetCpaSimulationPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v6.common.TargetCpaSimulationPoint)
      com.google.ads.googleads.v6.common.TargetCpaSimulationPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v6.common.SimulationProto.internal_static_google_ads_googleads_v6_common_TargetCpaSimulationPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v6.common.SimulationProto.internal_static_google_ads_googleads_v6_common_TargetCpaSimulationPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v6.common.TargetCpaSimulationPoint.class, com.google.ads.googleads.v6.common.TargetCpaSimulationPoint.Builder.class);
    }

    // Construct using com.google.ads.googleads.v6.common.TargetCpaSimulationPoint.newBuilder()
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
      targetCpaMicros_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      biddableConversions_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000002);
      biddableConversionsValue_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000004);
      clicks_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      costMicros_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      impressions_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000020);
      topSlotImpressions_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v6.common.SimulationProto.internal_static_google_ads_googleads_v6_common_TargetCpaSimulationPoint_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.common.TargetCpaSimulationPoint getDefaultInstanceForType() {
      return com.google.ads.googleads.v6.common.TargetCpaSimulationPoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.common.TargetCpaSimulationPoint build() {
      com.google.ads.googleads.v6.common.TargetCpaSimulationPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.common.TargetCpaSimulationPoint buildPartial() {
      com.google.ads.googleads.v6.common.TargetCpaSimulationPoint result = new com.google.ads.googleads.v6.common.TargetCpaSimulationPoint(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetCpaMicros_ = targetCpaMicros_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.biddableConversions_ = biddableConversions_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.biddableConversionsValue_ = biddableConversionsValue_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.clicks_ = clicks_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.costMicros_ = costMicros_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.impressions_ = impressions_;
        to_bitField0_ |= 0x00000020;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.topSlotImpressions_ = topSlotImpressions_;
        to_bitField0_ |= 0x00000040;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v6.common.TargetCpaSimulationPoint) {
        return mergeFrom((com.google.ads.googleads.v6.common.TargetCpaSimulationPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v6.common.TargetCpaSimulationPoint other) {
      if (other == com.google.ads.googleads.v6.common.TargetCpaSimulationPoint.getDefaultInstance()) return this;
      if (other.hasTargetCpaMicros()) {
        setTargetCpaMicros(other.getTargetCpaMicros());
      }
      if (other.hasBiddableConversions()) {
        setBiddableConversions(other.getBiddableConversions());
      }
      if (other.hasBiddableConversionsValue()) {
        setBiddableConversionsValue(other.getBiddableConversionsValue());
      }
      if (other.hasClicks()) {
        setClicks(other.getClicks());
      }
      if (other.hasCostMicros()) {
        setCostMicros(other.getCostMicros());
      }
      if (other.hasImpressions()) {
        setImpressions(other.getImpressions());
      }
      if (other.hasTopSlotImpressions()) {
        setTopSlotImpressions(other.getTopSlotImpressions());
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
      com.google.ads.googleads.v6.common.TargetCpaSimulationPoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v6.common.TargetCpaSimulationPoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long targetCpaMicros_ ;
    /**
     * <pre>
     * The simulated target CPA upon which projected metrics are based.
     * </pre>
     *
     * <code>int64 target_cpa_micros = 8;</code>
     * @return Whether the targetCpaMicros field is set.
     */
    @java.lang.Override
    public boolean hasTargetCpaMicros() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The simulated target CPA upon which projected metrics are based.
     * </pre>
     *
     * <code>int64 target_cpa_micros = 8;</code>
     * @return The targetCpaMicros.
     */
    @java.lang.Override
    public long getTargetCpaMicros() {
      return targetCpaMicros_;
    }
    /**
     * <pre>
     * The simulated target CPA upon which projected metrics are based.
     * </pre>
     *
     * <code>int64 target_cpa_micros = 8;</code>
     * @param value The targetCpaMicros to set.
     * @return This builder for chaining.
     */
    public Builder setTargetCpaMicros(long value) {
      bitField0_ |= 0x00000001;
      targetCpaMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The simulated target CPA upon which projected metrics are based.
     * </pre>
     *
     * <code>int64 target_cpa_micros = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetCpaMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetCpaMicros_ = 0L;
      onChanged();
      return this;
    }

    private double biddableConversions_ ;
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions = 9;</code>
     * @return Whether the biddableConversions field is set.
     */
    @java.lang.Override
    public boolean hasBiddableConversions() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions = 9;</code>
     * @return The biddableConversions.
     */
    @java.lang.Override
    public double getBiddableConversions() {
      return biddableConversions_;
    }
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions = 9;</code>
     * @param value The biddableConversions to set.
     * @return This builder for chaining.
     */
    public Builder setBiddableConversions(double value) {
      bitField0_ |= 0x00000002;
      biddableConversions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearBiddableConversions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      biddableConversions_ = 0D;
      onChanged();
      return this;
    }

    private double biddableConversionsValue_ ;
    /**
     * <pre>
     * Projected total value of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions_value = 10;</code>
     * @return Whether the biddableConversionsValue field is set.
     */
    @java.lang.Override
    public boolean hasBiddableConversionsValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Projected total value of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions_value = 10;</code>
     * @return The biddableConversionsValue.
     */
    @java.lang.Override
    public double getBiddableConversionsValue() {
      return biddableConversionsValue_;
    }
    /**
     * <pre>
     * Projected total value of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions_value = 10;</code>
     * @param value The biddableConversionsValue to set.
     * @return This builder for chaining.
     */
    public Builder setBiddableConversionsValue(double value) {
      bitField0_ |= 0x00000004;
      biddableConversionsValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected total value of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions_value = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearBiddableConversionsValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      biddableConversionsValue_ = 0D;
      onChanged();
      return this;
    }

    private long clicks_ ;
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>int64 clicks = 11;</code>
     * @return Whether the clicks field is set.
     */
    @java.lang.Override
    public boolean hasClicks() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>int64 clicks = 11;</code>
     * @return The clicks.
     */
    @java.lang.Override
    public long getClicks() {
      return clicks_;
    }
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>int64 clicks = 11;</code>
     * @param value The clicks to set.
     * @return This builder for chaining.
     */
    public Builder setClicks(long value) {
      bitField0_ |= 0x00000008;
      clicks_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>int64 clicks = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearClicks() {
      bitField0_ = (bitField0_ & ~0x00000008);
      clicks_ = 0L;
      onChanged();
      return this;
    }

    private long costMicros_ ;
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>int64 cost_micros = 12;</code>
     * @return Whether the costMicros field is set.
     */
    @java.lang.Override
    public boolean hasCostMicros() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>int64 cost_micros = 12;</code>
     * @return The costMicros.
     */
    @java.lang.Override
    public long getCostMicros() {
      return costMicros_;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>int64 cost_micros = 12;</code>
     * @param value The costMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCostMicros(long value) {
      bitField0_ |= 0x00000010;
      costMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>int64 cost_micros = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearCostMicros() {
      bitField0_ = (bitField0_ & ~0x00000010);
      costMicros_ = 0L;
      onChanged();
      return this;
    }

    private long impressions_ ;
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>int64 impressions = 13;</code>
     * @return Whether the impressions field is set.
     */
    @java.lang.Override
    public boolean hasImpressions() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>int64 impressions = 13;</code>
     * @return The impressions.
     */
    @java.lang.Override
    public long getImpressions() {
      return impressions_;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>int64 impressions = 13;</code>
     * @param value The impressions to set.
     * @return This builder for chaining.
     */
    public Builder setImpressions(long value) {
      bitField0_ |= 0x00000020;
      impressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>int64 impressions = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearImpressions() {
      bitField0_ = (bitField0_ & ~0x00000020);
      impressions_ = 0L;
      onChanged();
      return this;
    }

    private long topSlotImpressions_ ;
    /**
     * <pre>
     * Projected number of top slot impressions.
     * Only search advertising channel type supports this field.
     * </pre>
     *
     * <code>int64 top_slot_impressions = 14;</code>
     * @return Whether the topSlotImpressions field is set.
     */
    @java.lang.Override
    public boolean hasTopSlotImpressions() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Projected number of top slot impressions.
     * Only search advertising channel type supports this field.
     * </pre>
     *
     * <code>int64 top_slot_impressions = 14;</code>
     * @return The topSlotImpressions.
     */
    @java.lang.Override
    public long getTopSlotImpressions() {
      return topSlotImpressions_;
    }
    /**
     * <pre>
     * Projected number of top slot impressions.
     * Only search advertising channel type supports this field.
     * </pre>
     *
     * <code>int64 top_slot_impressions = 14;</code>
     * @param value The topSlotImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setTopSlotImpressions(long value) {
      bitField0_ |= 0x00000040;
      topSlotImpressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of top slot impressions.
     * Only search advertising channel type supports this field.
     * </pre>
     *
     * <code>int64 top_slot_impressions = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopSlotImpressions() {
      bitField0_ = (bitField0_ & ~0x00000040);
      topSlotImpressions_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v6.common.TargetCpaSimulationPoint)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v6.common.TargetCpaSimulationPoint)
  private static final com.google.ads.googleads.v6.common.TargetCpaSimulationPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v6.common.TargetCpaSimulationPoint();
  }

  public static com.google.ads.googleads.v6.common.TargetCpaSimulationPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetCpaSimulationPoint>
      PARSER = new com.google.protobuf.AbstractParser<TargetCpaSimulationPoint>() {
    @java.lang.Override
    public TargetCpaSimulationPoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TargetCpaSimulationPoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TargetCpaSimulationPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetCpaSimulationPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v6.common.TargetCpaSimulationPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
