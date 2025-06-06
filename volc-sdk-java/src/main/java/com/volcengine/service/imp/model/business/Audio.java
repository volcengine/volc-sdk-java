// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

/**
 * Protobuf type {@code Volcengine.Imp.Models.Business.Audio}
 */
public final class Audio extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Imp.Models.Business.Audio)
    AudioOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Audio.newBuilder() to construct.
  private Audio(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Audio() {
    codec_ = "";
    profile_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Audio();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Audio(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            profile_ = s;
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
          case 40: {

            channels_ = input.readInt32();
            break;
          }
          case 50: {
            com.volcengine.service.imp.model.business.Volume.Builder subBuilder = null;
            if (volume_ != null) {
              subBuilder = volume_.toBuilder();
            }
            volume_ = input.readMessage(com.volcengine.service.imp.model.business.Volume.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(volume_);
              volume_ = subBuilder.buildPartial();
            }

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
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Audio_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Audio_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.imp.model.business.Audio.class, com.volcengine.service.imp.model.business.Audio.Builder.class);
  }

  public static final int CODEC_FIELD_NUMBER = 1;
  private volatile java.lang.Object codec_;
  /**
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

  public static final int PROFILE_FIELD_NUMBER = 2;
  private volatile java.lang.Object profile_;
  /**
   * <code>string Profile = 2;</code>
   * @return The profile.
   */
  @java.lang.Override
  public java.lang.String getProfile() {
    java.lang.Object ref = profile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      profile_ = s;
      return s;
    }
  }
  /**
   * <code>string Profile = 2;</code>
   * @return The bytes for profile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProfileBytes() {
    java.lang.Object ref = profile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      profile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAMPLERATE_FIELD_NUMBER = 3;
  private int sampleRate_;
  /**
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
   * <code>int32 Bitrate = 4;</code>
   * @return The bitrate.
   */
  @java.lang.Override
  public int getBitrate() {
    return bitrate_;
  }

  public static final int CHANNELS_FIELD_NUMBER = 5;
  private int channels_;
  /**
   * <code>int32 Channels = 5;</code>
   * @return The channels.
   */
  @java.lang.Override
  public int getChannels() {
    return channels_;
  }

  public static final int VOLUME_FIELD_NUMBER = 6;
  private com.volcengine.service.imp.model.business.Volume volume_;
  /**
   * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
   * @return Whether the volume field is set.
   */
  @java.lang.Override
  public boolean hasVolume() {
    return volume_ != null;
  }
  /**
   * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
   * @return The volume.
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.Volume getVolume() {
    return volume_ == null ? com.volcengine.service.imp.model.business.Volume.getDefaultInstance() : volume_;
  }
  /**
   * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.VolumeOrBuilder getVolumeOrBuilder() {
    return getVolume();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codec_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, codec_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(profile_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, profile_);
    }
    if (sampleRate_ != 0) {
      output.writeInt32(3, sampleRate_);
    }
    if (bitrate_ != 0) {
      output.writeInt32(4, bitrate_);
    }
    if (channels_ != 0) {
      output.writeInt32(5, channels_);
    }
    if (volume_ != null) {
      output.writeMessage(6, getVolume());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codec_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, codec_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(profile_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, profile_);
    }
    if (sampleRate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, sampleRate_);
    }
    if (bitrate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, bitrate_);
    }
    if (channels_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, channels_);
    }
    if (volume_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getVolume());
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
    if (!(obj instanceof com.volcengine.service.imp.model.business.Audio)) {
      return super.equals(obj);
    }
    com.volcengine.service.imp.model.business.Audio other = (com.volcengine.service.imp.model.business.Audio) obj;

    if (!getCodec()
        .equals(other.getCodec())) return false;
    if (!getProfile()
        .equals(other.getProfile())) return false;
    if (getSampleRate()
        != other.getSampleRate()) return false;
    if (getBitrate()
        != other.getBitrate()) return false;
    if (getChannels()
        != other.getChannels()) return false;
    if (hasVolume() != other.hasVolume()) return false;
    if (hasVolume()) {
      if (!getVolume()
          .equals(other.getVolume())) return false;
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
    hash = (37 * hash) + CODEC_FIELD_NUMBER;
    hash = (53 * hash) + getCodec().hashCode();
    hash = (37 * hash) + PROFILE_FIELD_NUMBER;
    hash = (53 * hash) + getProfile().hashCode();
    hash = (37 * hash) + SAMPLERATE_FIELD_NUMBER;
    hash = (53 * hash) + getSampleRate();
    hash = (37 * hash) + BITRATE_FIELD_NUMBER;
    hash = (53 * hash) + getBitrate();
    hash = (37 * hash) + CHANNELS_FIELD_NUMBER;
    hash = (53 * hash) + getChannels();
    if (hasVolume()) {
      hash = (37 * hash) + VOLUME_FIELD_NUMBER;
      hash = (53 * hash) + getVolume().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.imp.model.business.Audio parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Audio parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Audio parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Audio parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.imp.model.business.Audio prototype) {
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
   * Protobuf type {@code Volcengine.Imp.Models.Business.Audio}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Imp.Models.Business.Audio)
      com.volcengine.service.imp.model.business.AudioOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Audio_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Audio_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.imp.model.business.Audio.class, com.volcengine.service.imp.model.business.Audio.Builder.class);
    }

    // Construct using com.volcengine.service.imp.model.business.Audio.newBuilder()
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

      profile_ = "";

      sampleRate_ = 0;

      bitrate_ = 0;

      channels_ = 0;

      if (volumeBuilder_ == null) {
        volume_ = null;
      } else {
        volume_ = null;
        volumeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Audio_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Audio getDefaultInstanceForType() {
      return com.volcengine.service.imp.model.business.Audio.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Audio build() {
      com.volcengine.service.imp.model.business.Audio result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Audio buildPartial() {
      com.volcengine.service.imp.model.business.Audio result = new com.volcengine.service.imp.model.business.Audio(this);
      result.codec_ = codec_;
      result.profile_ = profile_;
      result.sampleRate_ = sampleRate_;
      result.bitrate_ = bitrate_;
      result.channels_ = channels_;
      if (volumeBuilder_ == null) {
        result.volume_ = volume_;
      } else {
        result.volume_ = volumeBuilder_.build();
      }
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
      if (other instanceof com.volcengine.service.imp.model.business.Audio) {
        return mergeFrom((com.volcengine.service.imp.model.business.Audio)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.imp.model.business.Audio other) {
      if (other == com.volcengine.service.imp.model.business.Audio.getDefaultInstance()) return this;
      if (!other.getCodec().isEmpty()) {
        codec_ = other.codec_;
        onChanged();
      }
      if (!other.getProfile().isEmpty()) {
        profile_ = other.profile_;
        onChanged();
      }
      if (other.getSampleRate() != 0) {
        setSampleRate(other.getSampleRate());
      }
      if (other.getBitrate() != 0) {
        setBitrate(other.getBitrate());
      }
      if (other.getChannels() != 0) {
        setChannels(other.getChannels());
      }
      if (other.hasVolume()) {
        mergeVolume(other.getVolume());
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
      com.volcengine.service.imp.model.business.Audio parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.imp.model.business.Audio) e.getUnfinishedMessage();
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
     * <code>string Codec = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodec() {
      
      codec_ = getDefaultInstance().getCodec();
      onChanged();
      return this;
    }
    /**
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

    private java.lang.Object profile_ = "";
    /**
     * <code>string Profile = 2;</code>
     * @return The profile.
     */
    public java.lang.String getProfile() {
      java.lang.Object ref = profile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        profile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Profile = 2;</code>
     * @return The bytes for profile.
     */
    public com.google.protobuf.ByteString
        getProfileBytes() {
      java.lang.Object ref = profile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        profile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Profile = 2;</code>
     * @param value The profile to set.
     * @return This builder for chaining.
     */
    public Builder setProfile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      profile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Profile = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProfile() {
      
      profile_ = getDefaultInstance().getProfile();
      onChanged();
      return this;
    }
    /**
     * <code>string Profile = 2;</code>
     * @param value The bytes for profile to set.
     * @return This builder for chaining.
     */
    public Builder setProfileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      profile_ = value;
      onChanged();
      return this;
    }

    private int sampleRate_ ;
    /**
     * <code>int32 SampleRate = 3;</code>
     * @return The sampleRate.
     */
    @java.lang.Override
    public int getSampleRate() {
      return sampleRate_;
    }
    /**
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
     * <code>int32 Bitrate = 4;</code>
     * @return The bitrate.
     */
    @java.lang.Override
    public int getBitrate() {
      return bitrate_;
    }
    /**
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
     * <code>int32 Bitrate = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBitrate() {
      
      bitrate_ = 0;
      onChanged();
      return this;
    }

    private int channels_ ;
    /**
     * <code>int32 Channels = 5;</code>
     * @return The channels.
     */
    @java.lang.Override
    public int getChannels() {
      return channels_;
    }
    /**
     * <code>int32 Channels = 5;</code>
     * @param value The channels to set.
     * @return This builder for chaining.
     */
    public Builder setChannels(int value) {
      
      channels_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Channels = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearChannels() {
      
      channels_ = 0;
      onChanged();
      return this;
    }

    private com.volcengine.service.imp.model.business.Volume volume_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.imp.model.business.Volume, com.volcengine.service.imp.model.business.Volume.Builder, com.volcengine.service.imp.model.business.VolumeOrBuilder> volumeBuilder_;
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     * @return Whether the volume field is set.
     */
    public boolean hasVolume() {
      return volumeBuilder_ != null || volume_ != null;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     * @return The volume.
     */
    public com.volcengine.service.imp.model.business.Volume getVolume() {
      if (volumeBuilder_ == null) {
        return volume_ == null ? com.volcengine.service.imp.model.business.Volume.getDefaultInstance() : volume_;
      } else {
        return volumeBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     */
    public Builder setVolume(com.volcengine.service.imp.model.business.Volume value) {
      if (volumeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        volume_ = value;
        onChanged();
      } else {
        volumeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     */
    public Builder setVolume(
        com.volcengine.service.imp.model.business.Volume.Builder builderForValue) {
      if (volumeBuilder_ == null) {
        volume_ = builderForValue.build();
        onChanged();
      } else {
        volumeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     */
    public Builder mergeVolume(com.volcengine.service.imp.model.business.Volume value) {
      if (volumeBuilder_ == null) {
        if (volume_ != null) {
          volume_ =
            com.volcengine.service.imp.model.business.Volume.newBuilder(volume_).mergeFrom(value).buildPartial();
        } else {
          volume_ = value;
        }
        onChanged();
      } else {
        volumeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     */
    public Builder clearVolume() {
      if (volumeBuilder_ == null) {
        volume_ = null;
        onChanged();
      } else {
        volume_ = null;
        volumeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     */
    public com.volcengine.service.imp.model.business.Volume.Builder getVolumeBuilder() {
      
      onChanged();
      return getVolumeFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     */
    public com.volcengine.service.imp.model.business.VolumeOrBuilder getVolumeOrBuilder() {
      if (volumeBuilder_ != null) {
        return volumeBuilder_.getMessageOrBuilder();
      } else {
        return volume_ == null ?
            com.volcengine.service.imp.model.business.Volume.getDefaultInstance() : volume_;
      }
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.imp.model.business.Volume, com.volcengine.service.imp.model.business.Volume.Builder, com.volcengine.service.imp.model.business.VolumeOrBuilder> 
        getVolumeFieldBuilder() {
      if (volumeBuilder_ == null) {
        volumeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.imp.model.business.Volume, com.volcengine.service.imp.model.business.Volume.Builder, com.volcengine.service.imp.model.business.VolumeOrBuilder>(
                getVolume(),
                getParentForChildren(),
                isClean());
        volume_ = null;
      }
      return volumeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Imp.Models.Business.Audio)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Imp.Models.Business.Audio)
  private static final com.volcengine.service.imp.model.business.Audio DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.imp.model.business.Audio();
  }

  public static com.volcengine.service.imp.model.business.Audio getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Audio>
      PARSER = new com.google.protobuf.AbstractParser<Audio>() {
    @java.lang.Override
    public Audio parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Audio(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Audio> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Audio> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.imp.model.business.Audio getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

