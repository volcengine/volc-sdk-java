// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.PosterSnapshotParams}
 */
public final class PosterSnapshotParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.PosterSnapshotParams)
    PosterSnapshotParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PosterSnapshotParams.newBuilder() to construct.
  private PosterSnapshotParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PosterSnapshotParams() {
    format_ = "";
    fillType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PosterSnapshotParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PosterSnapshotParams(
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

            format_ = s;
            break;
          }
          case 16: {

            resAdapt_ = input.readBool();
            break;
          }
          case 24: {

            resLimit_ = input.readInt32();
            break;
          }
          case 32: {

            width_ = input.readInt32();
            break;
          }
          case 40: {

            height_ = input.readInt32();
            break;
          }
          case 48: {

            offsetTime_ = input.readInt32();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            fillType_ = s;
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
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_PosterSnapshotParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_PosterSnapshotParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.PosterSnapshotParams.class, com.volcengine.service.vod.model.business.PosterSnapshotParams.Builder.class);
  }

  public static final int FORMAT_FIELD_NUMBER = 1;
  private volatile java.lang.Object format_;
  /**
   * <code>string Format = 1;</code>
   * @return The format.
   */
  @java.lang.Override
  public java.lang.String getFormat() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      format_ = s;
      return s;
    }
  }
  /**
   * <code>string Format = 1;</code>
   * @return The bytes for format.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFormatBytes() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      format_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESADAPT_FIELD_NUMBER = 2;
  private boolean resAdapt_;
  /**
   * <code>bool ResAdapt = 2;</code>
   * @return The resAdapt.
   */
  @java.lang.Override
  public boolean getResAdapt() {
    return resAdapt_;
  }

  public static final int RESLIMIT_FIELD_NUMBER = 3;
  private int resLimit_;
  /**
   * <code>int32 ResLimit = 3;</code>
   * @return The resLimit.
   */
  @java.lang.Override
  public int getResLimit() {
    return resLimit_;
  }

  public static final int WIDTH_FIELD_NUMBER = 4;
  private int width_;
  /**
   * <code>int32 Width = 4;</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 5;
  private int height_;
  /**
   * <code>int32 Height = 5;</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }

  public static final int OFFSETTIME_FIELD_NUMBER = 6;
  private int offsetTime_;
  /**
   * <code>int32 OffsetTime = 6;</code>
   * @return The offsetTime.
   */
  @java.lang.Override
  public int getOffsetTime() {
    return offsetTime_;
  }

  public static final int FILLTYPE_FIELD_NUMBER = 7;
  private volatile java.lang.Object fillType_;
  /**
   * <pre>
   * 填充类型 
   * </pre>
   *
   * <code>string FillType = 7;</code>
   * @return The fillType.
   */
  @java.lang.Override
  public java.lang.String getFillType() {
    java.lang.Object ref = fillType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fillType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 填充类型 
   * </pre>
   *
   * <code>string FillType = 7;</code>
   * @return The bytes for fillType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFillTypeBytes() {
    java.lang.Object ref = fillType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fillType_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, format_);
    }
    if (resAdapt_ != false) {
      output.writeBool(2, resAdapt_);
    }
    if (resLimit_ != 0) {
      output.writeInt32(3, resLimit_);
    }
    if (width_ != 0) {
      output.writeInt32(4, width_);
    }
    if (height_ != 0) {
      output.writeInt32(5, height_);
    }
    if (offsetTime_ != 0) {
      output.writeInt32(6, offsetTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fillType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, fillType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, format_);
    }
    if (resAdapt_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, resAdapt_);
    }
    if (resLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, resLimit_);
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, width_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, height_);
    }
    if (offsetTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, offsetTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fillType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, fillType_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.PosterSnapshotParams)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.PosterSnapshotParams other = (com.volcengine.service.vod.model.business.PosterSnapshotParams) obj;

    if (!getFormat()
        .equals(other.getFormat())) return false;
    if (getResAdapt()
        != other.getResAdapt()) return false;
    if (getResLimit()
        != other.getResLimit()) return false;
    if (getWidth()
        != other.getWidth()) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getOffsetTime()
        != other.getOffsetTime()) return false;
    if (!getFillType()
        .equals(other.getFillType())) return false;
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
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getFormat().hashCode();
    hash = (37 * hash) + RESADAPT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getResAdapt());
    hash = (37 * hash) + RESLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getResLimit();
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (37 * hash) + OFFSETTIME_FIELD_NUMBER;
    hash = (53 * hash) + getOffsetTime();
    hash = (37 * hash) + FILLTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFillType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.PosterSnapshotParams parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.PosterSnapshotParams prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.PosterSnapshotParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.PosterSnapshotParams)
      com.volcengine.service.vod.model.business.PosterSnapshotParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_PosterSnapshotParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_PosterSnapshotParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.PosterSnapshotParams.class, com.volcengine.service.vod.model.business.PosterSnapshotParams.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.PosterSnapshotParams.newBuilder()
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
      format_ = "";

      resAdapt_ = false;

      resLimit_ = 0;

      width_ = 0;

      height_ = 0;

      offsetTime_ = 0;

      fillType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_PosterSnapshotParams_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.PosterSnapshotParams getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.PosterSnapshotParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.PosterSnapshotParams build() {
      com.volcengine.service.vod.model.business.PosterSnapshotParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.PosterSnapshotParams buildPartial() {
      com.volcengine.service.vod.model.business.PosterSnapshotParams result = new com.volcengine.service.vod.model.business.PosterSnapshotParams(this);
      result.format_ = format_;
      result.resAdapt_ = resAdapt_;
      result.resLimit_ = resLimit_;
      result.width_ = width_;
      result.height_ = height_;
      result.offsetTime_ = offsetTime_;
      result.fillType_ = fillType_;
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
      if (other instanceof com.volcengine.service.vod.model.business.PosterSnapshotParams) {
        return mergeFrom((com.volcengine.service.vod.model.business.PosterSnapshotParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.PosterSnapshotParams other) {
      if (other == com.volcengine.service.vod.model.business.PosterSnapshotParams.getDefaultInstance()) return this;
      if (!other.getFormat().isEmpty()) {
        format_ = other.format_;
        onChanged();
      }
      if (other.getResAdapt() != false) {
        setResAdapt(other.getResAdapt());
      }
      if (other.getResLimit() != 0) {
        setResLimit(other.getResLimit());
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (other.getOffsetTime() != 0) {
        setOffsetTime(other.getOffsetTime());
      }
      if (!other.getFillType().isEmpty()) {
        fillType_ = other.fillType_;
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
      com.volcengine.service.vod.model.business.PosterSnapshotParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.PosterSnapshotParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object format_ = "";
    /**
     * <code>string Format = 1;</code>
     * @return The format.
     */
    public java.lang.String getFormat() {
      java.lang.Object ref = format_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        format_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Format = 1;</code>
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString
        getFormatBytes() {
      java.lang.Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Format = 1;</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Format = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      
      format_ = getDefaultInstance().getFormat();
      onChanged();
      return this;
    }
    /**
     * <code>string Format = 1;</code>
     * @param value The bytes for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      format_ = value;
      onChanged();
      return this;
    }

    private boolean resAdapt_ ;
    /**
     * <code>bool ResAdapt = 2;</code>
     * @return The resAdapt.
     */
    @java.lang.Override
    public boolean getResAdapt() {
      return resAdapt_;
    }
    /**
     * <code>bool ResAdapt = 2;</code>
     * @param value The resAdapt to set.
     * @return This builder for chaining.
     */
    public Builder setResAdapt(boolean value) {
      
      resAdapt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ResAdapt = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResAdapt() {
      
      resAdapt_ = false;
      onChanged();
      return this;
    }

    private int resLimit_ ;
    /**
     * <code>int32 ResLimit = 3;</code>
     * @return The resLimit.
     */
    @java.lang.Override
    public int getResLimit() {
      return resLimit_;
    }
    /**
     * <code>int32 ResLimit = 3;</code>
     * @param value The resLimit to set.
     * @return This builder for chaining.
     */
    public Builder setResLimit(int value) {
      
      resLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ResLimit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResLimit() {
      
      resLimit_ = 0;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <code>int32 Width = 4;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     * <code>int32 Width = 4;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Width = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <code>int32 Height = 5;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     * <code>int32 Height = 5;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Height = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0;
      onChanged();
      return this;
    }

    private int offsetTime_ ;
    /**
     * <code>int32 OffsetTime = 6;</code>
     * @return The offsetTime.
     */
    @java.lang.Override
    public int getOffsetTime() {
      return offsetTime_;
    }
    /**
     * <code>int32 OffsetTime = 6;</code>
     * @param value The offsetTime to set.
     * @return This builder for chaining.
     */
    public Builder setOffsetTime(int value) {
      
      offsetTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 OffsetTime = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffsetTime() {
      
      offsetTime_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fillType_ = "";
    /**
     * <pre>
     * 填充类型 
     * </pre>
     *
     * <code>string FillType = 7;</code>
     * @return The fillType.
     */
    public java.lang.String getFillType() {
      java.lang.Object ref = fillType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fillType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 填充类型 
     * </pre>
     *
     * <code>string FillType = 7;</code>
     * @return The bytes for fillType.
     */
    public com.google.protobuf.ByteString
        getFillTypeBytes() {
      java.lang.Object ref = fillType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fillType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 填充类型 
     * </pre>
     *
     * <code>string FillType = 7;</code>
     * @param value The fillType to set.
     * @return This builder for chaining.
     */
    public Builder setFillType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fillType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 填充类型 
     * </pre>
     *
     * <code>string FillType = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFillType() {
      
      fillType_ = getDefaultInstance().getFillType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 填充类型 
     * </pre>
     *
     * <code>string FillType = 7;</code>
     * @param value The bytes for fillType to set.
     * @return This builder for chaining.
     */
    public Builder setFillTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fillType_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.PosterSnapshotParams)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.PosterSnapshotParams)
  private static final com.volcengine.service.vod.model.business.PosterSnapshotParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.PosterSnapshotParams();
  }

  public static com.volcengine.service.vod.model.business.PosterSnapshotParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PosterSnapshotParams>
      PARSER = new com.google.protobuf.AbstractParser<PosterSnapshotParams>() {
    @java.lang.Override
    public PosterSnapshotParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PosterSnapshotParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PosterSnapshotParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PosterSnapshotParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.PosterSnapshotParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

