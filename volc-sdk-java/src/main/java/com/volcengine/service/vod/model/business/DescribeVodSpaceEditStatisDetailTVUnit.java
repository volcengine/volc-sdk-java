// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_measure.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDetailTVUnit}
 */
public final class DescribeVodSpaceEditStatisDetailTVUnit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDetailTVUnit)
    DescribeVodSpaceEditStatisDetailTVUnitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeVodSpaceEditStatisDetailTVUnit.newBuilder() to construct.
  private DescribeVodSpaceEditStatisDetailTVUnit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeVodSpaceEditStatisDetailTVUnit() {
    time_ = "";
    editUsageItemList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeVodSpaceEditStatisDetailTVUnit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeVodSpaceEditStatisDetailTVUnit(
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

            time_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              editUsageItemList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            editUsageItemList_.add(
                input.readMessage(com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.parser(), extensionRegistry));
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
        editUsageItemList_ = java.util.Collections.unmodifiableList(editUsageItemList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceEditStatisDetailTVUnit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceEditStatisDetailTVUnit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit.class, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private volatile java.lang.Object time_;
  /**
   * <code>string Time = 1;</code>
   * @return The time.
   */
  @java.lang.Override
  public java.lang.String getTime() {
    java.lang.Object ref = time_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      time_ = s;
      return s;
    }
  }
  /**
   * <code>string Time = 1;</code>
   * @return The bytes for time.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeBytes() {
    java.lang.Object ref = time_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      time_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EDITUSAGEITEMLIST_FIELD_NUMBER = 2;
  private java.util.List<com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem> editUsageItemList_;
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem> getEditUsageItemListList() {
    return editUsageItemList_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItemOrBuilder> 
      getEditUsageItemListOrBuilderList() {
    return editUsageItemList_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
   */
  @java.lang.Override
  public int getEditUsageItemListCount() {
    return editUsageItemList_.size();
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem getEditUsageItemList(int index) {
    return editUsageItemList_.get(index);
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItemOrBuilder getEditUsageItemListOrBuilder(
      int index) {
    return editUsageItemList_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(time_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, time_);
    }
    for (int i = 0; i < editUsageItemList_.size(); i++) {
      output.writeMessage(2, editUsageItemList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(time_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, time_);
    }
    for (int i = 0; i < editUsageItemList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, editUsageItemList_.get(i));
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit other = (com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit) obj;

    if (!getTime()
        .equals(other.getTime())) return false;
    if (!getEditUsageItemListList()
        .equals(other.getEditUsageItemListList())) return false;
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
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + getTime().hashCode();
    if (getEditUsageItemListCount() > 0) {
      hash = (37 * hash) + EDITUSAGEITEMLIST_FIELD_NUMBER;
      hash = (53 * hash) + getEditUsageItemListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDetailTVUnit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDetailTVUnit)
      com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceEditStatisDetailTVUnit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceEditStatisDetailTVUnit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit.class, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit.newBuilder()
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
        getEditUsageItemListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      time_ = "";

      if (editUsageItemListBuilder_ == null) {
        editUsageItemList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        editUsageItemListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceEditStatisDetailTVUnit_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit build() {
      com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit buildPartial() {
      com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit result = new com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit(this);
      int from_bitField0_ = bitField0_;
      result.time_ = time_;
      if (editUsageItemListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          editUsageItemList_ = java.util.Collections.unmodifiableList(editUsageItemList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.editUsageItemList_ = editUsageItemList_;
      } else {
        result.editUsageItemList_ = editUsageItemListBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit) {
        return mergeFrom((com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit other) {
      if (other == com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit.getDefaultInstance()) return this;
      if (!other.getTime().isEmpty()) {
        time_ = other.time_;
        onChanged();
      }
      if (editUsageItemListBuilder_ == null) {
        if (!other.editUsageItemList_.isEmpty()) {
          if (editUsageItemList_.isEmpty()) {
            editUsageItemList_ = other.editUsageItemList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEditUsageItemListIsMutable();
            editUsageItemList_.addAll(other.editUsageItemList_);
          }
          onChanged();
        }
      } else {
        if (!other.editUsageItemList_.isEmpty()) {
          if (editUsageItemListBuilder_.isEmpty()) {
            editUsageItemListBuilder_.dispose();
            editUsageItemListBuilder_ = null;
            editUsageItemList_ = other.editUsageItemList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            editUsageItemListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEditUsageItemListFieldBuilder() : null;
          } else {
            editUsageItemListBuilder_.addAllMessages(other.editUsageItemList_);
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
      com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object time_ = "";
    /**
     * <code>string Time = 1;</code>
     * @return The time.
     */
    public java.lang.String getTime() {
      java.lang.Object ref = time_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        time_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Time = 1;</code>
     * @return The bytes for time.
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      java.lang.Object ref = time_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Time = 1;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      
      time_ = getDefaultInstance().getTime();
      onChanged();
      return this;
    }
    /**
     * <code>string Time = 1;</code>
     * @param value The bytes for time to set.
     * @return This builder for chaining.
     */
    public Builder setTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      time_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem> editUsageItemList_ =
      java.util.Collections.emptyList();
    private void ensureEditUsageItemListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        editUsageItemList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem>(editUsageItemList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItemOrBuilder> editUsageItemListBuilder_;

    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem> getEditUsageItemListList() {
      if (editUsageItemListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(editUsageItemList_);
      } else {
        return editUsageItemListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public int getEditUsageItemListCount() {
      if (editUsageItemListBuilder_ == null) {
        return editUsageItemList_.size();
      } else {
        return editUsageItemListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem getEditUsageItemList(int index) {
      if (editUsageItemListBuilder_ == null) {
        return editUsageItemList_.get(index);
      } else {
        return editUsageItemListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder setEditUsageItemList(
        int index, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem value) {
      if (editUsageItemListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditUsageItemListIsMutable();
        editUsageItemList_.set(index, value);
        onChanged();
      } else {
        editUsageItemListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder setEditUsageItemList(
        int index, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder builderForValue) {
      if (editUsageItemListBuilder_ == null) {
        ensureEditUsageItemListIsMutable();
        editUsageItemList_.set(index, builderForValue.build());
        onChanged();
      } else {
        editUsageItemListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder addEditUsageItemList(com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem value) {
      if (editUsageItemListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditUsageItemListIsMutable();
        editUsageItemList_.add(value);
        onChanged();
      } else {
        editUsageItemListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder addEditUsageItemList(
        int index, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem value) {
      if (editUsageItemListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditUsageItemListIsMutable();
        editUsageItemList_.add(index, value);
        onChanged();
      } else {
        editUsageItemListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder addEditUsageItemList(
        com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder builderForValue) {
      if (editUsageItemListBuilder_ == null) {
        ensureEditUsageItemListIsMutable();
        editUsageItemList_.add(builderForValue.build());
        onChanged();
      } else {
        editUsageItemListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder addEditUsageItemList(
        int index, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder builderForValue) {
      if (editUsageItemListBuilder_ == null) {
        ensureEditUsageItemListIsMutable();
        editUsageItemList_.add(index, builderForValue.build());
        onChanged();
      } else {
        editUsageItemListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder addAllEditUsageItemList(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem> values) {
      if (editUsageItemListBuilder_ == null) {
        ensureEditUsageItemListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, editUsageItemList_);
        onChanged();
      } else {
        editUsageItemListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder clearEditUsageItemList() {
      if (editUsageItemListBuilder_ == null) {
        editUsageItemList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        editUsageItemListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public Builder removeEditUsageItemList(int index) {
      if (editUsageItemListBuilder_ == null) {
        ensureEditUsageItemListIsMutable();
        editUsageItemList_.remove(index);
        onChanged();
      } else {
        editUsageItemListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder getEditUsageItemListBuilder(
        int index) {
      return getEditUsageItemListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItemOrBuilder getEditUsageItemListOrBuilder(
        int index) {
      if (editUsageItemListBuilder_ == null) {
        return editUsageItemList_.get(index);  } else {
        return editUsageItemListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItemOrBuilder> 
         getEditUsageItemListOrBuilderList() {
      if (editUsageItemListBuilder_ != null) {
        return editUsageItemListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(editUsageItemList_);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder addEditUsageItemListBuilder() {
      return getEditUsageItemListFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder addEditUsageItemListBuilder(
        int index) {
      return getEditUsageItemListFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDataItem EditUsageItemList = 2;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder> 
         getEditUsageItemListBuilderList() {
      return getEditUsageItemListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItemOrBuilder> 
        getEditUsageItemListFieldBuilder() {
      if (editUsageItemListBuilder_ == null) {
        editUsageItemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItem.Builder, com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDataItemOrBuilder>(
                editUsageItemList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        editUsageItemList_ = null;
      }
      return editUsageItemListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDetailTVUnit)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.DescribeVodSpaceEditStatisDetailTVUnit)
  private static final com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit();
  }

  public static com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeVodSpaceEditStatisDetailTVUnit>
      PARSER = new com.google.protobuf.AbstractParser<DescribeVodSpaceEditStatisDetailTVUnit>() {
    @java.lang.Override
    public DescribeVodSpaceEditStatisDetailTVUnit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeVodSpaceEditStatisDetailTVUnit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeVodSpaceEditStatisDetailTVUnit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeVodSpaceEditStatisDetailTVUnit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.DescribeVodSpaceEditStatisDetailTVUnit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

