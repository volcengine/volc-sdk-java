// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodAudioStreamMeta}
 */
public final class VodAudioStreamMeta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodAudioStreamMeta)
    VodAudioStreamMetaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodAudioStreamMeta.newBuilder() to construct.
  private VodAudioStreamMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodAudioStreamMeta() {
    codec_ = "";
    quality_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodAudioStreamMeta();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodAudioStreamMeta(
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

            codec_ = s;
            break;
          }
          case 21: {

            duration_ = input.readFloat();
            break;
          }
          case 24: {

            sampleRate_ = input.readInt32();
            break;
          }
          case 32: {

            bitrate_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            quality_ = s;
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
    return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodAudioStreamMeta.class, com.volcengine.service.vod.model.business.VodAudioStreamMeta.Builder.class);
  }

  public static final int CODEC_FIELD_NUMBER = 1;
  private volatile java.lang.Object codec_;
  /**
   * <pre>
   *音频编码格式
   * </pre>
   *
   * <code>string Codec = 1;</code>
   * @return The codec.
   */
  @java.lang.Override
  public java.lang.String getCodec() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codec_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *音频编码格式
   * </pre>
   *
   * <code>string Codec = 1;</code>
   * @return The bytes for codec.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodecBytes() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codec_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_FIELD_NUMBER = 2;
  private float duration_;
  /**
   * <pre>
   *音频时长
   * </pre>
   *
   * <code>float Duration = 2;</code>
   * @return The duration.
   */
  @java.lang.Override
  public float getDuration() {
    return duration_;
  }

  public static final int SAMPLERATE_FIELD_NUMBER = 3;
  private int sampleRate_;
  /**
   * <pre>
   *音频采样率
   * </pre>
   *
   * <code>int32 SampleRate = 3;</code>
   * @return The sampleRate.
   */
  @java.lang.Override
  public int getSampleRate() {
    return sampleRate_;
  }

  public static final int BITRATE_FIELD_NUMBER = 4;
  private int bitrate_;
  /**
   * <pre>
   *音频码率(Kbps)
   * </pre>
   *
   * <code>int32 Bitrate = 4;</code>
   * @return The bitrate.
   */
  @java.lang.Override
  public int getBitrate() {
    return bitrate_;
  }

  public static final int QUALITY_FIELD_NUMBER = 5;
  private volatile java.lang.Object quality_;
  /**
   * <pre>
   *音频质量
   * </pre>
   *
   * <code>string Quality = 5;</code>
   * @return The quality.
   */
  @java.lang.Override
  public java.lang.String getQuality() {
    java.lang.Object ref = quality_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quality_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *音频质量
   * </pre>
   *
   * <code>string Quality = 5;</code>
   * @return The bytes for quality.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQualityBytes() {
    java.lang.Object ref = quality_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quality_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getCodecBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, codec_);
    }
    if (duration_ != 0F) {
      output.writeFloat(2, duration_);
    }
    if (sampleRate_ != 0) {
      output.writeInt32(3, sampleRate_);
    }
    if (bitrate_ != 0) {
      output.writeInt32(4, bitrate_);
    }
    if (!getQualityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, quality_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCodecBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, codec_);
    }
    if (duration_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, duration_);
    }
    if (sampleRate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, sampleRate_);
    }
    if (bitrate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, bitrate_);
    }
    if (!getQualityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, quality_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodAudioStreamMeta)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodAudioStreamMeta other = (com.volcengine.service.vod.model.business.VodAudioStreamMeta) obj;

    if (!getCodec()
        .equals(other.getCodec())) return false;
    if (java.lang.Float.floatToIntBits(getDuration())
        != java.lang.Float.floatToIntBits(
            other.getDuration())) return false;
    if (getSampleRate()
        != other.getSampleRate()) return false;
    if (getBitrate()
        != other.getBitrate()) return false;
    if (!getQuality()
        .equals(other.getQuality())) return false;
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
    hash = (37 * hash) + CODEC_FIELD_NUMBER;
    hash = (53 * hash) + getCodec().hashCode();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDuration());
    hash = (37 * hash) + SAMPLERATE_FIELD_NUMBER;
    hash = (53 * hash) + getSampleRate();
    hash = (37 * hash) + BITRATE_FIELD_NUMBER;
    hash = (53 * hash) + getBitrate();
    hash = (37 * hash) + QUALITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuality().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodAudioStreamMeta prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodAudioStreamMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodAudioStreamMeta)
      com.volcengine.service.vod.model.business.VodAudioStreamMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodAudioStreamMeta.class, com.volcengine.service.vod.model.business.VodAudioStreamMeta.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodAudioStreamMeta.newBuilder()
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
      codec_ = "";

      duration_ = 0F;

      sampleRate_ = 0;

      bitrate_ = 0;

      quality_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodAudioStreamMeta getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodAudioStreamMeta.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodAudioStreamMeta build() {
      com.volcengine.service.vod.model.business.VodAudioStreamMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodAudioStreamMeta buildPartial() {
      com.volcengine.service.vod.model.business.VodAudioStreamMeta result = new com.volcengine.service.vod.model.business.VodAudioStreamMeta(this);
      result.codec_ = codec_;
      result.duration_ = duration_;
      result.sampleRate_ = sampleRate_;
      result.bitrate_ = bitrate_;
      result.quality_ = quality_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodAudioStreamMeta) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodAudioStreamMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodAudioStreamMeta other) {
      if (other == com.volcengine.service.vod.model.business.VodAudioStreamMeta.getDefaultInstance()) return this;
      if (!other.getCodec().isEmpty()) {
        codec_ = other.codec_;
        onChanged();
      }
      if (other.getDuration() != 0F) {
        setDuration(other.getDuration());
      }
      if (other.getSampleRate() != 0) {
        setSampleRate(other.getSampleRate());
      }
      if (other.getBitrate() != 0) {
        setBitrate(other.getBitrate());
      }
      if (!other.getQuality().isEmpty()) {
        quality_ = other.quality_;
        onChanged();
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
      com.volcengine.service.vod.model.business.VodAudioStreamMeta parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodAudioStreamMeta) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object codec_ = "";
    /**
     * <pre>
     *音频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @return The codec.
     */
    public java.lang.String getCodec() {
      java.lang.Object ref = codec_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codec_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *音频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @return The bytes for codec.
     */
    public com.google.protobuf.ByteString
        getCodecBytes() {
      java.lang.Object ref = codec_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codec_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *音频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @param value The codec to set.
     * @return This builder for chaining.
     */
    public Builder setCodec(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codec_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *音频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodec() {
      
      codec_ = getDefaultInstance().getCodec();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *音频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @param value The bytes for codec to set.
     * @return This builder for chaining.
     */
    public Builder setCodecBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codec_ = value;
      onChanged();
      return this;
    }

    private float duration_ ;
    /**
     * <pre>
     *音频时长
     * </pre>
     *
     * <code>float Duration = 2;</code>
     * @return The duration.
     */
    @java.lang.Override
    public float getDuration() {
      return duration_;
    }
    /**
     * <pre>
     *音频时长
     * </pre>
     *
     * <code>float Duration = 2;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(float value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *音频时长
     * </pre>
     *
     * <code>float Duration = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0F;
      onChanged();
      return this;
    }

    private int sampleRate_ ;
    /**
     * <pre>
     *音频采样率
     * </pre>
     *
     * <code>int32 SampleRate = 3;</code>
     * @return The sampleRate.
     */
    @java.lang.Override
    public int getSampleRate() {
      return sampleRate_;
    }
    /**
     * <pre>
     *音频采样率
     * </pre>
     *
     * <code>int32 SampleRate = 3;</code>
     * @param value The sampleRate to set.
     * @return This builder for chaining.
     */
    public Builder setSampleRate(int value) {
      
      sampleRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *音频采样率
     * </pre>
     *
     * <code>int32 SampleRate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSampleRate() {
      
      sampleRate_ = 0;
      onChanged();
      return this;
    }

    private int bitrate_ ;
    /**
     * <pre>
     *音频码率(Kbps)
     * </pre>
     *
     * <code>int32 Bitrate = 4;</code>
     * @return The bitrate.
     */
    @java.lang.Override
    public int getBitrate() {
      return bitrate_;
    }
    /**
     * <pre>
     *音频码率(Kbps)
     * </pre>
     *
     * <code>int32 Bitrate = 4;</code>
     * @param value The bitrate to set.
     * @return This builder for chaining.
     */
    public Builder setBitrate(int value) {
      
      bitrate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *音频码率(Kbps)
     * </pre>
     *
     * <code>int32 Bitrate = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBitrate() {
      
      bitrate_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object quality_ = "";
    /**
     * <pre>
     *音频质量
     * </pre>
     *
     * <code>string Quality = 5;</code>
     * @return The quality.
     */
    public java.lang.String getQuality() {
      java.lang.Object ref = quality_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quality_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *音频质量
     * </pre>
     *
     * <code>string Quality = 5;</code>
     * @return The bytes for quality.
     */
    public com.google.protobuf.ByteString
        getQualityBytes() {
      java.lang.Object ref = quality_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quality_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *音频质量
     * </pre>
     *
     * <code>string Quality = 5;</code>
     * @param value The quality to set.
     * @return This builder for chaining.
     */
    public Builder setQuality(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      quality_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *音频质量
     * </pre>
     *
     * <code>string Quality = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuality() {
      
      quality_ = getDefaultInstance().getQuality();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *音频质量
     * </pre>
     *
     * <code>string Quality = 5;</code>
     * @param value The bytes for quality to set.
     * @return This builder for chaining.
     */
    public Builder setQualityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      quality_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodAudioStreamMeta)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodAudioStreamMeta)
  private static final com.volcengine.service.vod.model.business.VodAudioStreamMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodAudioStreamMeta();
  }

  public static com.volcengine.service.vod.model.business.VodAudioStreamMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodAudioStreamMeta>
      PARSER = new com.google.protobuf.AbstractParser<VodAudioStreamMeta>() {
    @java.lang.Override
    public VodAudioStreamMeta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodAudioStreamMeta(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodAudioStreamMeta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodAudioStreamMeta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodAudioStreamMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

