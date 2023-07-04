// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_play.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodGetPrivateDrmPlayAuthResult}
 */
public final class VodGetPrivateDrmPlayAuthResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodGetPrivateDrmPlayAuthResult)
    VodGetPrivateDrmPlayAuthResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetPrivateDrmPlayAuthResult.newBuilder() to construct.
  private VodGetPrivateDrmPlayAuthResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetPrivateDrmPlayAuthResult() {
    playAuthInfoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetPrivateDrmPlayAuthResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetPrivateDrmPlayAuthResult(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              playAuthInfoList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            playAuthInfoList_.add(
                input.readMessage(com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        playAuthInfoList_ = java.util.Collections.unmodifiableList(playAuthInfoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodPlay.internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodPlay.internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult.class, com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult.Builder.class);
  }

  public static final int PLAYAUTHINFOLIST_FIELD_NUMBER = 1;
  private java.util.List<com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo> playAuthInfoList_;
  /**
   * <pre>
   * 播放许可信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo> getPlayAuthInfoListList() {
    return playAuthInfoList_;
  }
  /**
   * <pre>
   * 播放许可信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfoOrBuilder> 
      getPlayAuthInfoListOrBuilderList() {
    return playAuthInfoList_;
  }
  /**
   * <pre>
   * 播放许可信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
   */
  @java.lang.Override
  public int getPlayAuthInfoListCount() {
    return playAuthInfoList_.size();
  }
  /**
   * <pre>
   * 播放许可信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo getPlayAuthInfoList(int index) {
    return playAuthInfoList_.get(index);
  }
  /**
   * <pre>
   * 播放许可信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfoOrBuilder getPlayAuthInfoListOrBuilder(
      int index) {
    return playAuthInfoList_.get(index);
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
    for (int i = 0; i < playAuthInfoList_.size(); i++) {
      output.writeMessage(1, playAuthInfoList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < playAuthInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, playAuthInfoList_.get(i));
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult other = (com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult) obj;

    if (!getPlayAuthInfoListList()
        .equals(other.getPlayAuthInfoListList())) return false;
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
    if (getPlayAuthInfoListCount() > 0) {
      hash = (37 * hash) + PLAYAUTHINFOLIST_FIELD_NUMBER;
      hash = (53 * hash) + getPlayAuthInfoListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodGetPrivateDrmPlayAuthResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodGetPrivateDrmPlayAuthResult)
      com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodPlay.internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodPlay.internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult.class, com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult.newBuilder()
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
        getPlayAuthInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (playAuthInfoListBuilder_ == null) {
        playAuthInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        playAuthInfoListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodPlay.internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult build() {
      com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult buildPartial() {
      com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult result = new com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult(this);
      int from_bitField0_ = bitField0_;
      if (playAuthInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          playAuthInfoList_ = java.util.Collections.unmodifiableList(playAuthInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.playAuthInfoList_ = playAuthInfoList_;
      } else {
        result.playAuthInfoList_ = playAuthInfoListBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult other) {
      if (other == com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult.getDefaultInstance()) return this;
      if (playAuthInfoListBuilder_ == null) {
        if (!other.playAuthInfoList_.isEmpty()) {
          if (playAuthInfoList_.isEmpty()) {
            playAuthInfoList_ = other.playAuthInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePlayAuthInfoListIsMutable();
            playAuthInfoList_.addAll(other.playAuthInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.playAuthInfoList_.isEmpty()) {
          if (playAuthInfoListBuilder_.isEmpty()) {
            playAuthInfoListBuilder_.dispose();
            playAuthInfoListBuilder_ = null;
            playAuthInfoList_ = other.playAuthInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            playAuthInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPlayAuthInfoListFieldBuilder() : null;
          } else {
            playAuthInfoListBuilder_.addAllMessages(other.playAuthInfoList_);
          }
        }
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
      com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo> playAuthInfoList_ =
      java.util.Collections.emptyList();
    private void ensurePlayAuthInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        playAuthInfoList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo>(playAuthInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfoOrBuilder> playAuthInfoListBuilder_;

    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo> getPlayAuthInfoListList() {
      if (playAuthInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(playAuthInfoList_);
      } else {
        return playAuthInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public int getPlayAuthInfoListCount() {
      if (playAuthInfoListBuilder_ == null) {
        return playAuthInfoList_.size();
      } else {
        return playAuthInfoListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo getPlayAuthInfoList(int index) {
      if (playAuthInfoListBuilder_ == null) {
        return playAuthInfoList_.get(index);
      } else {
        return playAuthInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder setPlayAuthInfoList(
        int index, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo value) {
      if (playAuthInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayAuthInfoListIsMutable();
        playAuthInfoList_.set(index, value);
        onChanged();
      } else {
        playAuthInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder setPlayAuthInfoList(
        int index, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder builderForValue) {
      if (playAuthInfoListBuilder_ == null) {
        ensurePlayAuthInfoListIsMutable();
        playAuthInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        playAuthInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder addPlayAuthInfoList(com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo value) {
      if (playAuthInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayAuthInfoListIsMutable();
        playAuthInfoList_.add(value);
        onChanged();
      } else {
        playAuthInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder addPlayAuthInfoList(
        int index, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo value) {
      if (playAuthInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayAuthInfoListIsMutable();
        playAuthInfoList_.add(index, value);
        onChanged();
      } else {
        playAuthInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder addPlayAuthInfoList(
        com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder builderForValue) {
      if (playAuthInfoListBuilder_ == null) {
        ensurePlayAuthInfoListIsMutable();
        playAuthInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        playAuthInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder addPlayAuthInfoList(
        int index, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder builderForValue) {
      if (playAuthInfoListBuilder_ == null) {
        ensurePlayAuthInfoListIsMutable();
        playAuthInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        playAuthInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder addAllPlayAuthInfoList(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo> values) {
      if (playAuthInfoListBuilder_ == null) {
        ensurePlayAuthInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, playAuthInfoList_);
        onChanged();
      } else {
        playAuthInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder clearPlayAuthInfoList() {
      if (playAuthInfoListBuilder_ == null) {
        playAuthInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        playAuthInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public Builder removePlayAuthInfoList(int index) {
      if (playAuthInfoListBuilder_ == null) {
        ensurePlayAuthInfoListIsMutable();
        playAuthInfoList_.remove(index);
        onChanged();
      } else {
        playAuthInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder getPlayAuthInfoListBuilder(
        int index) {
      return getPlayAuthInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfoOrBuilder getPlayAuthInfoListOrBuilder(
        int index) {
      if (playAuthInfoListBuilder_ == null) {
        return playAuthInfoList_.get(index);  } else {
        return playAuthInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfoOrBuilder> 
         getPlayAuthInfoListOrBuilderList() {
      if (playAuthInfoListBuilder_ != null) {
        return playAuthInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(playAuthInfoList_);
      }
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder addPlayAuthInfoListBuilder() {
      return getPlayAuthInfoListFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder addPlayAuthInfoListBuilder(
        int index) {
      return getPlayAuthInfoListFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * 播放许可信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo PlayAuthInfoList = 1;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder> 
         getPlayAuthInfoListBuilderList() {
      return getPlayAuthInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfoOrBuilder> 
        getPlayAuthInfoListFieldBuilder() {
      if (playAuthInfoListBuilder_ == null) {
        playAuthInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder, com.volcengine.service.vod.model.business.VodPrivateDrmPlayAuthInfoOrBuilder>(
                playAuthInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        playAuthInfoList_ = null;
      }
      return playAuthInfoListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodGetPrivateDrmPlayAuthResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodGetPrivateDrmPlayAuthResult)
  private static final com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult();
  }

  public static com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetPrivateDrmPlayAuthResult>
      PARSER = new com.google.protobuf.AbstractParser<VodGetPrivateDrmPlayAuthResult>() {
    @java.lang.Override
    public VodGetPrivateDrmPlayAuthResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetPrivateDrmPlayAuthResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetPrivateDrmPlayAuthResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetPrivateDrmPlayAuthResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodGetPrivateDrmPlayAuthResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

