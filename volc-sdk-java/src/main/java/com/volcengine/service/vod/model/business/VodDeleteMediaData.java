// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodDeleteMediaData}
 */
public final class VodDeleteMediaData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodDeleteMediaData)
    VodDeleteMediaDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDeleteMediaData.newBuilder() to construct.
  private VodDeleteMediaData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDeleteMediaData() {
    notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDeleteMediaData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDeleteMediaData(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              notExistVids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            notExistVids_.add(s);
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
        notExistVids_ = notExistVids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteMediaData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteMediaData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodDeleteMediaData.class, com.volcengine.service.vod.model.business.VodDeleteMediaData.Builder.class);
  }

  public static final int NOTEXISTVIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList notExistVids_;
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @return A list containing the notExistVids.
   */
  public com.google.protobuf.ProtocolStringList
      getNotExistVidsList() {
    return notExistVids_;
  }
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @return The count of notExistVids.
   */
  public int getNotExistVidsCount() {
    return notExistVids_.size();
  }
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @param index The index of the element to return.
   * @return The notExistVids at the given index.
   */
  public java.lang.String getNotExistVids(int index) {
    return notExistVids_.get(index);
  }
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistVids at the given index.
   */
  public com.google.protobuf.ByteString
      getNotExistVidsBytes(int index) {
    return notExistVids_.getByteString(index);
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
    for (int i = 0; i < notExistVids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notExistVids_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < notExistVids_.size(); i++) {
        dataSize += computeStringSizeNoTag(notExistVids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotExistVidsList().size();
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodDeleteMediaData)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodDeleteMediaData other = (com.volcengine.service.vod.model.business.VodDeleteMediaData) obj;

    if (!getNotExistVidsList()
        .equals(other.getNotExistVidsList())) return false;
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
    if (getNotExistVidsCount() > 0) {
      hash = (37 * hash) + NOTEXISTVIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotExistVidsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteMediaData parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodDeleteMediaData prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodDeleteMediaData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodDeleteMediaData)
      com.volcengine.service.vod.model.business.VodDeleteMediaDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteMediaData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteMediaData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodDeleteMediaData.class, com.volcengine.service.vod.model.business.VodDeleteMediaData.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodDeleteMediaData.newBuilder()
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
      notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteMediaData_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDeleteMediaData getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodDeleteMediaData.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDeleteMediaData build() {
      com.volcengine.service.vod.model.business.VodDeleteMediaData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDeleteMediaData buildPartial() {
      com.volcengine.service.vod.model.business.VodDeleteMediaData result = new com.volcengine.service.vod.model.business.VodDeleteMediaData(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        notExistVids_ = notExistVids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.notExistVids_ = notExistVids_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodDeleteMediaData) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodDeleteMediaData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodDeleteMediaData other) {
      if (other == com.volcengine.service.vod.model.business.VodDeleteMediaData.getDefaultInstance()) return this;
      if (!other.notExistVids_.isEmpty()) {
        if (notExistVids_.isEmpty()) {
          notExistVids_ = other.notExistVids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNotExistVidsIsMutable();
          notExistVids_.addAll(other.notExistVids_);
        }
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
      com.volcengine.service.vod.model.business.VodDeleteMediaData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodDeleteMediaData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNotExistVidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        notExistVids_ = new com.google.protobuf.LazyStringArrayList(notExistVids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @return A list containing the notExistVids.
     */
    public com.google.protobuf.ProtocolStringList
        getNotExistVidsList() {
      return notExistVids_.getUnmodifiableView();
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @return The count of notExistVids.
     */
    public int getNotExistVidsCount() {
      return notExistVids_.size();
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param index The index of the element to return.
     * @return The notExistVids at the given index.
     */
    public java.lang.String getNotExistVids(int index) {
      return notExistVids_.get(index);
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the notExistVids at the given index.
     */
    public com.google.protobuf.ByteString
        getNotExistVidsBytes(int index) {
      return notExistVids_.getByteString(index);
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param index The index to set the value at.
     * @param value The notExistVids to set.
     * @return This builder for chaining.
     */
    public Builder setNotExistVids(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistVidsIsMutable();
      notExistVids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param value The notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistVids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistVidsIsMutable();
      notExistVids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param values The notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotExistVids(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotExistVidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notExistVids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotExistVids() {
      notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param value The bytes of the notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistVidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNotExistVidsIsMutable();
      notExistVids_.add(value);
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodDeleteMediaData)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodDeleteMediaData)
  private static final com.volcengine.service.vod.model.business.VodDeleteMediaData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodDeleteMediaData();
  }

  public static com.volcengine.service.vod.model.business.VodDeleteMediaData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDeleteMediaData>
      PARSER = new com.google.protobuf.AbstractParser<VodDeleteMediaData>() {
    @java.lang.Override
    public VodDeleteMediaData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDeleteMediaData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDeleteMediaData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodDeleteMediaData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodDeleteMediaData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

