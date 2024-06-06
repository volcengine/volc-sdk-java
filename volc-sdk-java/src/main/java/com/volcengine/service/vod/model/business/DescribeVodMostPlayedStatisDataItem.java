// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_measure.proto

package com.volcengine.service.vod.model.business;

/**
 * <pre>
 * 查询播放 TopN 的视频
 * </pre>
 *
 * Protobuf type {@code Volcengine.Vod.Models.Business.DescribeVodMostPlayedStatisDataItem}
 */
public final class DescribeVodMostPlayedStatisDataItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.DescribeVodMostPlayedStatisDataItem)
    DescribeVodMostPlayedStatisDataItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeVodMostPlayedStatisDataItem.newBuilder() to construct.
  private DescribeVodMostPlayedStatisDataItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeVodMostPlayedStatisDataItem() {
    vid_ = "";
    name_ = "";
    createTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeVodMostPlayedStatisDataItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeVodMostPlayedStatisDataItem(
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

            vid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            size_ = input.readInt64();
            break;
          }
          case 33: {

            duration_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            createTime_ = s;
            break;
          }
          case 48: {

            playCount_ = input.readInt64();
            break;
          }
          case 56: {

            traffic_ = input.readInt64();
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
    return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodMostPlayedStatisDataItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodMostPlayedStatisDataItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem.class, com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem.Builder.class);
  }

  public static final int VID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vid_;
  /**
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  @java.lang.Override
  public java.lang.String getVid() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vid_ = s;
      return s;
    }
  }
  /**
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVidBytes() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string Name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string Name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private long size_;
  /**
   * <code>int64 Size = 3;</code>
   * @return The size.
   */
  @java.lang.Override
  public long getSize() {
    return size_;
  }

  public static final int DURATION_FIELD_NUMBER = 4;
  private double duration_;
  /**
   * <code>double Duration = 4;</code>
   * @return The duration.
   */
  @java.lang.Override
  public double getDuration() {
    return duration_;
  }

  public static final int CREATETIME_FIELD_NUMBER = 5;
  private volatile java.lang.Object createTime_;
  /**
   * <code>string CreateTime = 5;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public java.lang.String getCreateTime() {
    java.lang.Object ref = createTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createTime_ = s;
      return s;
    }
  }
  /**
   * <code>string CreateTime = 5;</code>
   * @return The bytes for createTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreateTimeBytes() {
    java.lang.Object ref = createTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYCOUNT_FIELD_NUMBER = 6;
  private long playCount_;
  /**
   * <code>int64 PlayCount = 6;</code>
   * @return The playCount.
   */
  @java.lang.Override
  public long getPlayCount() {
    return playCount_;
  }

  public static final int TRAFFIC_FIELD_NUMBER = 7;
  private long traffic_;
  /**
   * <code>int64 Traffic = 7;</code>
   * @return The traffic.
   */
  @java.lang.Override
  public long getTraffic() {
    return traffic_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (size_ != 0L) {
      output.writeInt64(3, size_);
    }
    if (java.lang.Double.doubleToRawLongBits(duration_) != 0) {
      output.writeDouble(4, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(createTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, createTime_);
    }
    if (playCount_ != 0L) {
      output.writeInt64(6, playCount_);
    }
    if (traffic_ != 0L) {
      output.writeInt64(7, traffic_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, size_);
    }
    if (java.lang.Double.doubleToRawLongBits(duration_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(createTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, createTime_);
    }
    if (playCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, playCount_);
    }
    if (traffic_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, traffic_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem other = (com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem) obj;

    if (!getVid()
        .equals(other.getVid())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getSize()
        != other.getSize()) return false;
    if (java.lang.Double.doubleToLongBits(getDuration())
        != java.lang.Double.doubleToLongBits(
            other.getDuration())) return false;
    if (!getCreateTime()
        .equals(other.getCreateTime())) return false;
    if (getPlayCount()
        != other.getPlayCount()) return false;
    if (getTraffic()
        != other.getTraffic()) return false;
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
    hash = (37 * hash) + VID_FIELD_NUMBER;
    hash = (53 * hash) + getVid().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSize());
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDuration()));
    hash = (37 * hash) + CREATETIME_FIELD_NUMBER;
    hash = (53 * hash) + getCreateTime().hashCode();
    hash = (37 * hash) + PLAYCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPlayCount());
    hash = (37 * hash) + TRAFFIC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTraffic());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem prototype) {
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
   * 查询播放 TopN 的视频
   * </pre>
   *
   * Protobuf type {@code Volcengine.Vod.Models.Business.DescribeVodMostPlayedStatisDataItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.DescribeVodMostPlayedStatisDataItem)
      com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodMostPlayedStatisDataItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodMostPlayedStatisDataItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem.class, com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem.newBuilder()
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
      vid_ = "";

      name_ = "";

      size_ = 0L;

      duration_ = 0D;

      createTime_ = "";

      playCount_ = 0L;

      traffic_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodMostPlayedStatisDataItem_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem build() {
      com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem buildPartial() {
      com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem result = new com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem(this);
      result.vid_ = vid_;
      result.name_ = name_;
      result.size_ = size_;
      result.duration_ = duration_;
      result.createTime_ = createTime_;
      result.playCount_ = playCount_;
      result.traffic_ = traffic_;
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
      if (other instanceof com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem) {
        return mergeFrom((com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem other) {
      if (other == com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem.getDefaultInstance()) return this;
      if (!other.getVid().isEmpty()) {
        vid_ = other.vid_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      if (other.getDuration() != 0D) {
        setDuration(other.getDuration());
      }
      if (!other.getCreateTime().isEmpty()) {
        createTime_ = other.createTime_;
        onChanged();
      }
      if (other.getPlayCount() != 0L) {
        setPlayCount(other.getPlayCount());
      }
      if (other.getTraffic() != 0L) {
        setTraffic(other.getTraffic());
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
      com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vid_ = "";
    /**
     * <code>string Vid = 1;</code>
     * @return The vid.
     */
    public java.lang.String getVid() {
      java.lang.Object ref = vid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Vid = 1;</code>
     * @return The bytes for vid.
     */
    public com.google.protobuf.ByteString
        getVidBytes() {
      java.lang.Object ref = vid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Vid = 1;</code>
     * @param value The vid to set.
     * @return This builder for chaining.
     */
    public Builder setVid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Vid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVid() {
      
      vid_ = getDefaultInstance().getVid();
      onChanged();
      return this;
    }
    /**
     * <code>string Vid = 1;</code>
     * @param value The bytes for vid to set.
     * @return This builder for chaining.
     */
    public Builder setVidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string Name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string Name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private long size_ ;
    /**
     * <code>int64 Size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }
    /**
     * <code>int64 Size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0L;
      onChanged();
      return this;
    }

    private double duration_ ;
    /**
     * <code>double Duration = 4;</code>
     * @return The duration.
     */
    @java.lang.Override
    public double getDuration() {
      return duration_;
    }
    /**
     * <code>double Duration = 4;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(double value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double Duration = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object createTime_ = "";
    /**
     * <code>string CreateTime = 5;</code>
     * @return The createTime.
     */
    public java.lang.String getCreateTime() {
      java.lang.Object ref = createTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CreateTime = 5;</code>
     * @return The bytes for createTime.
     */
    public com.google.protobuf.ByteString
        getCreateTimeBytes() {
      java.lang.Object ref = createTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CreateTime = 5;</code>
     * @param value The createTime to set.
     * @return This builder for chaining.
     */
    public Builder setCreateTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CreateTime = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateTime() {
      
      createTime_ = getDefaultInstance().getCreateTime();
      onChanged();
      return this;
    }
    /**
     * <code>string CreateTime = 5;</code>
     * @param value The bytes for createTime to set.
     * @return This builder for chaining.
     */
    public Builder setCreateTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createTime_ = value;
      onChanged();
      return this;
    }

    private long playCount_ ;
    /**
     * <code>int64 PlayCount = 6;</code>
     * @return The playCount.
     */
    @java.lang.Override
    public long getPlayCount() {
      return playCount_;
    }
    /**
     * <code>int64 PlayCount = 6;</code>
     * @param value The playCount to set.
     * @return This builder for chaining.
     */
    public Builder setPlayCount(long value) {
      
      playCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 PlayCount = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayCount() {
      
      playCount_ = 0L;
      onChanged();
      return this;
    }

    private long traffic_ ;
    /**
     * <code>int64 Traffic = 7;</code>
     * @return The traffic.
     */
    @java.lang.Override
    public long getTraffic() {
      return traffic_;
    }
    /**
     * <code>int64 Traffic = 7;</code>
     * @param value The traffic to set.
     * @return This builder for chaining.
     */
    public Builder setTraffic(long value) {
      
      traffic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Traffic = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearTraffic() {
      
      traffic_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.DescribeVodMostPlayedStatisDataItem)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.DescribeVodMostPlayedStatisDataItem)
  private static final com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem();
  }

  public static com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeVodMostPlayedStatisDataItem>
      PARSER = new com.google.protobuf.AbstractParser<DescribeVodMostPlayedStatisDataItem>() {
    @java.lang.Override
    public DescribeVodMostPlayedStatisDataItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeVodMostPlayedStatisDataItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeVodMostPlayedStatisDataItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeVodMostPlayedStatisDataItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.DescribeVodMostPlayedStatisDataItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
