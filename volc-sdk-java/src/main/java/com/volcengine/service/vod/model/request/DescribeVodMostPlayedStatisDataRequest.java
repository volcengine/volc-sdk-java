// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * <pre>
 * 查询播放 TopN 的视频
 * </pre>
 *
 * Protobuf type {@code Volcengine.Vod.Models.Request.DescribeVodMostPlayedStatisDataRequest}
 */
public final class DescribeVodMostPlayedStatisDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.DescribeVodMostPlayedStatisDataRequest)
    DescribeVodMostPlayedStatisDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeVodMostPlayedStatisDataRequest.newBuilder() to construct.
  private DescribeVodMostPlayedStatisDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeVodMostPlayedStatisDataRequest() {
    space_ = "";
    startTime_ = "";
    endTime_ = "";
    orderType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeVodMostPlayedStatisDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeVodMostPlayedStatisDataRequest(
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

            space_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            startTime_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            endTime_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            orderType_ = s;
            break;
          }
          case 40: {

            topN_ = input.readInt64();
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_DescribeVodMostPlayedStatisDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_DescribeVodMostPlayedStatisDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest.class, com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest.Builder.class);
  }

  public static final int SPACE_FIELD_NUMBER = 1;
  private volatile java.lang.Object space_;
  /**
   * <pre>
   * 空间
   * </pre>
   *
   * <code>string Space = 1;</code>
   * @return The space.
   */
  @java.lang.Override
  public java.lang.String getSpace() {
    java.lang.Object ref = space_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      space_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 空间
   * </pre>
   *
   * <code>string Space = 1;</code>
   * @return The bytes for space.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceBytes() {
    java.lang.Object ref = space_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      space_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIME_FIELD_NUMBER = 2;
  private volatile java.lang.Object startTime_;
  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public java.lang.String getStartTime() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The bytes for startTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartTimeBytes() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDTIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object endTime_;
  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public java.lang.String getEndTime() {
    java.lang.Object ref = endTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The bytes for endTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndTimeBytes() {
    java.lang.Object ref = endTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERTYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object orderType_;
  /**
   * <pre>
   * 排序类型
   * </pre>
   *
   * <code>string OrderType = 4;</code>
   * @return The orderType.
   */
  @java.lang.Override
  public java.lang.String getOrderType() {
    java.lang.Object ref = orderType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 排序类型
   * </pre>
   *
   * <code>string OrderType = 4;</code>
   * @return The bytes for orderType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderTypeBytes() {
    java.lang.Object ref = orderType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOPN_FIELD_NUMBER = 5;
  private long topN_;
  /**
   * <pre>
   * 返回视频的个数。默认值为 100。最大为 100。
   * </pre>
   *
   * <code>int64 TopN = 5;</code>
   * @return The topN.
   */
  @java.lang.Override
  public long getTopN() {
    return topN_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(space_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, space_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, startTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, endTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, orderType_);
    }
    if (topN_ != 0L) {
      output.writeInt64(5, topN_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(space_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, space_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, startTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, endTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, orderType_);
    }
    if (topN_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, topN_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest other = (com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest) obj;

    if (!getSpace()
        .equals(other.getSpace())) return false;
    if (!getStartTime()
        .equals(other.getStartTime())) return false;
    if (!getEndTime()
        .equals(other.getEndTime())) return false;
    if (!getOrderType()
        .equals(other.getOrderType())) return false;
    if (getTopN()
        != other.getTopN()) return false;
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
    hash = (37 * hash) + SPACE_FIELD_NUMBER;
    hash = (53 * hash) + getSpace().hashCode();
    hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + getStartTime().hashCode();
    hash = (37 * hash) + ENDTIME_FIELD_NUMBER;
    hash = (53 * hash) + getEndTime().hashCode();
    hash = (37 * hash) + ORDERTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getOrderType().hashCode();
    hash = (37 * hash) + TOPN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTopN());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.DescribeVodMostPlayedStatisDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.DescribeVodMostPlayedStatisDataRequest)
      com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_DescribeVodMostPlayedStatisDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_DescribeVodMostPlayedStatisDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest.class, com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest.newBuilder()
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
      space_ = "";

      startTime_ = "";

      endTime_ = "";

      orderType_ = "";

      topN_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_DescribeVodMostPlayedStatisDataRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest build() {
      com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest buildPartial() {
      com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest result = new com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest(this);
      result.space_ = space_;
      result.startTime_ = startTime_;
      result.endTime_ = endTime_;
      result.orderType_ = orderType_;
      result.topN_ = topN_;
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
      if (other instanceof com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest other) {
      if (other == com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest.getDefaultInstance()) return this;
      if (!other.getSpace().isEmpty()) {
        space_ = other.space_;
        onChanged();
      }
      if (!other.getStartTime().isEmpty()) {
        startTime_ = other.startTime_;
        onChanged();
      }
      if (!other.getEndTime().isEmpty()) {
        endTime_ = other.endTime_;
        onChanged();
      }
      if (!other.getOrderType().isEmpty()) {
        orderType_ = other.orderType_;
        onChanged();
      }
      if (other.getTopN() != 0L) {
        setTopN(other.getTopN());
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
      com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object space_ = "";
    /**
     * <pre>
     * 空间
     * </pre>
     *
     * <code>string Space = 1;</code>
     * @return The space.
     */
    public java.lang.String getSpace() {
      java.lang.Object ref = space_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        space_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 空间
     * </pre>
     *
     * <code>string Space = 1;</code>
     * @return The bytes for space.
     */
    public com.google.protobuf.ByteString
        getSpaceBytes() {
      java.lang.Object ref = space_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        space_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 空间
     * </pre>
     *
     * <code>string Space = 1;</code>
     * @param value The space to set.
     * @return This builder for chaining.
     */
    public Builder setSpace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      space_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 空间
     * </pre>
     *
     * <code>string Space = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpace() {
      
      space_ = getDefaultInstance().getSpace();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 空间
     * </pre>
     *
     * <code>string Space = 1;</code>
     * @param value The bytes for space to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      space_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object startTime_ = "";
    /**
     * <pre>
     * 查询的起始时间, rfc3339
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @return The startTime.
     */
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 查询的起始时间, rfc3339
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @return The bytes for startTime.
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 查询的起始时间, rfc3339
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询的起始时间, rfc3339
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      
      startTime_ = getDefaultInstance().getStartTime();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询的起始时间, rfc3339
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @param value The bytes for startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startTime_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endTime_ = "";
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @return The endTime.
     */
    public java.lang.String getEndTime() {
      java.lang.Object ref = endTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @return The bytes for endTime.
     */
    public com.google.protobuf.ByteString
        getEndTimeBytes() {
      java.lang.Object ref = endTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @param value The endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTime() {
      
      endTime_ = getDefaultInstance().getEndTime();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @param value The bytes for endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endTime_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object orderType_ = "";
    /**
     * <pre>
     * 排序类型
     * </pre>
     *
     * <code>string OrderType = 4;</code>
     * @return The orderType.
     */
    public java.lang.String getOrderType() {
      java.lang.Object ref = orderType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 排序类型
     * </pre>
     *
     * <code>string OrderType = 4;</code>
     * @return The bytes for orderType.
     */
    public com.google.protobuf.ByteString
        getOrderTypeBytes() {
      java.lang.Object ref = orderType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 排序类型
     * </pre>
     *
     * <code>string OrderType = 4;</code>
     * @param value The orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 排序类型
     * </pre>
     *
     * <code>string OrderType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderType() {
      
      orderType_ = getDefaultInstance().getOrderType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 排序类型
     * </pre>
     *
     * <code>string OrderType = 4;</code>
     * @param value The bytes for orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderType_ = value;
      onChanged();
      return this;
    }

    private long topN_ ;
    /**
     * <pre>
     * 返回视频的个数。默认值为 100。最大为 100。
     * </pre>
     *
     * <code>int64 TopN = 5;</code>
     * @return The topN.
     */
    @java.lang.Override
    public long getTopN() {
      return topN_;
    }
    /**
     * <pre>
     * 返回视频的个数。默认值为 100。最大为 100。
     * </pre>
     *
     * <code>int64 TopN = 5;</code>
     * @param value The topN to set.
     * @return This builder for chaining.
     */
    public Builder setTopN(long value) {
      
      topN_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 返回视频的个数。默认值为 100。最大为 100。
     * </pre>
     *
     * <code>int64 TopN = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopN() {
      
      topN_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.DescribeVodMostPlayedStatisDataRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.DescribeVodMostPlayedStatisDataRequest)
  private static final com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest();
  }

  public static com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeVodMostPlayedStatisDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<DescribeVodMostPlayedStatisDataRequest>() {
    @java.lang.Override
    public DescribeVodMostPlayedStatisDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeVodMostPlayedStatisDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeVodMostPlayedStatisDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeVodMostPlayedStatisDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.DescribeVodMostPlayedStatisDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
