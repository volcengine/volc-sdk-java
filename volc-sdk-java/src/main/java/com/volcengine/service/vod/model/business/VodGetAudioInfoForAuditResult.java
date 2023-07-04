// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodGetAudioInfoForAuditResult}
 */
public final class VodGetAudioInfoForAuditResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodGetAudioInfoForAuditResult)
    VodGetAudioInfoForAuditResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetAudioInfoForAuditResult.newBuilder() to construct.
  private VodGetAudioInfoForAuditResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetAudioInfoForAuditResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetAudioInfoForAuditResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetAudioInfoForAuditResult(
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
            com.volcengine.service.vod.model.business.VodAudioInfoForAudit.Builder subBuilder = null;
            if (audioInfo_ != null) {
              subBuilder = audioInfo_.toBuilder();
            }
            audioInfo_ = input.readMessage(com.volcengine.service.vod.model.business.VodAudioInfoForAudit.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audioInfo_);
              audioInfo_ = subBuilder.buildPartial();
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
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetAudioInfoForAuditResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetAudioInfoForAuditResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult.class, com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult.Builder.class);
  }

  public static final int AUDIOINFO_FIELD_NUMBER = 1;
  private com.volcengine.service.vod.model.business.VodAudioInfoForAudit audioInfo_;
  /**
   * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
   * @return Whether the audioInfo field is set.
   */
  @java.lang.Override
  public boolean hasAudioInfo() {
    return audioInfo_ != null;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
   * @return The audioInfo.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodAudioInfoForAudit getAudioInfo() {
    return audioInfo_ == null ? com.volcengine.service.vod.model.business.VodAudioInfoForAudit.getDefaultInstance() : audioInfo_;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodAudioInfoForAuditOrBuilder getAudioInfoOrBuilder() {
    return getAudioInfo();
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
    if (audioInfo_ != null) {
      output.writeMessage(1, getAudioInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAudioInfo());
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult other = (com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult) obj;

    if (hasAudioInfo() != other.hasAudioInfo()) return false;
    if (hasAudioInfo()) {
      if (!getAudioInfo()
          .equals(other.getAudioInfo())) return false;
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
    if (hasAudioInfo()) {
      hash = (37 * hash) + AUDIOINFO_FIELD_NUMBER;
      hash = (53 * hash) + getAudioInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodGetAudioInfoForAuditResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodGetAudioInfoForAuditResult)
      com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetAudioInfoForAuditResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetAudioInfoForAuditResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult.class, com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult.newBuilder()
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
      if (audioInfoBuilder_ == null) {
        audioInfo_ = null;
      } else {
        audioInfo_ = null;
        audioInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetAudioInfoForAuditResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult build() {
      com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult buildPartial() {
      com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult result = new com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult(this);
      if (audioInfoBuilder_ == null) {
        result.audioInfo_ = audioInfo_;
      } else {
        result.audioInfo_ = audioInfoBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult other) {
      if (other == com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult.getDefaultInstance()) return this;
      if (other.hasAudioInfo()) {
        mergeAudioInfo(other.getAudioInfo());
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
      com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.volcengine.service.vod.model.business.VodAudioInfoForAudit audioInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodAudioInfoForAudit, com.volcengine.service.vod.model.business.VodAudioInfoForAudit.Builder, com.volcengine.service.vod.model.business.VodAudioInfoForAuditOrBuilder> audioInfoBuilder_;
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     * @return Whether the audioInfo field is set.
     */
    public boolean hasAudioInfo() {
      return audioInfoBuilder_ != null || audioInfo_ != null;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     * @return The audioInfo.
     */
    public com.volcengine.service.vod.model.business.VodAudioInfoForAudit getAudioInfo() {
      if (audioInfoBuilder_ == null) {
        return audioInfo_ == null ? com.volcengine.service.vod.model.business.VodAudioInfoForAudit.getDefaultInstance() : audioInfo_;
      } else {
        return audioInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     */
    public Builder setAudioInfo(com.volcengine.service.vod.model.business.VodAudioInfoForAudit value) {
      if (audioInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audioInfo_ = value;
        onChanged();
      } else {
        audioInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     */
    public Builder setAudioInfo(
        com.volcengine.service.vod.model.business.VodAudioInfoForAudit.Builder builderForValue) {
      if (audioInfoBuilder_ == null) {
        audioInfo_ = builderForValue.build();
        onChanged();
      } else {
        audioInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     */
    public Builder mergeAudioInfo(com.volcengine.service.vod.model.business.VodAudioInfoForAudit value) {
      if (audioInfoBuilder_ == null) {
        if (audioInfo_ != null) {
          audioInfo_ =
            com.volcengine.service.vod.model.business.VodAudioInfoForAudit.newBuilder(audioInfo_).mergeFrom(value).buildPartial();
        } else {
          audioInfo_ = value;
        }
        onChanged();
      } else {
        audioInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     */
    public Builder clearAudioInfo() {
      if (audioInfoBuilder_ == null) {
        audioInfo_ = null;
        onChanged();
      } else {
        audioInfo_ = null;
        audioInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodAudioInfoForAudit.Builder getAudioInfoBuilder() {
      
      onChanged();
      return getAudioInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodAudioInfoForAuditOrBuilder getAudioInfoOrBuilder() {
      if (audioInfoBuilder_ != null) {
        return audioInfoBuilder_.getMessageOrBuilder();
      } else {
        return audioInfo_ == null ?
            com.volcengine.service.vod.model.business.VodAudioInfoForAudit.getDefaultInstance() : audioInfo_;
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodAudioInfoForAudit AudioInfo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodAudioInfoForAudit, com.volcengine.service.vod.model.business.VodAudioInfoForAudit.Builder, com.volcengine.service.vod.model.business.VodAudioInfoForAuditOrBuilder> 
        getAudioInfoFieldBuilder() {
      if (audioInfoBuilder_ == null) {
        audioInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodAudioInfoForAudit, com.volcengine.service.vod.model.business.VodAudioInfoForAudit.Builder, com.volcengine.service.vod.model.business.VodAudioInfoForAuditOrBuilder>(
                getAudioInfo(),
                getParentForChildren(),
                isClean());
        audioInfo_ = null;
      }
      return audioInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodGetAudioInfoForAuditResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodGetAudioInfoForAuditResult)
  private static final com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult();
  }

  public static com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetAudioInfoForAuditResult>
      PARSER = new com.google.protobuf.AbstractParser<VodGetAudioInfoForAuditResult>() {
    @java.lang.Override
    public VodGetAudioInfoForAuditResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetAudioInfoForAuditResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetAudioInfoForAuditResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetAudioInfoForAuditResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodGetAudioInfoForAuditResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

