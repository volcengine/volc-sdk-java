// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_measure.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo}
 */
public final class DescribeVodSpaceWorkflowSnapshotInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo)
    DescribeVodSpaceWorkflowSnapshotInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeVodSpaceWorkflowSnapshotInfo.newBuilder() to construct.
  private DescribeVodSpaceWorkflowSnapshotInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeVodSpaceWorkflowSnapshotInfo() {
    templateType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeVodSpaceWorkflowSnapshotInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeVodSpaceWorkflowSnapshotInfo(
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

            templateType_ = s;
            break;
          }
          case 16: {

            number_ = input.readInt64();
            break;
          }
          case 24: {

            isLowPriority_ = input.readBool();
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
    return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceWorkflowSnapshotInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceWorkflowSnapshotInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo.class, com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo.Builder.class);
  }

  public static final int TEMPLATETYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object templateType_;
  /**
   * <code>string TemplateType = 1;</code>
   * @return The templateType.
   */
  @java.lang.Override
  public java.lang.String getTemplateType() {
    java.lang.Object ref = templateType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      templateType_ = s;
      return s;
    }
  }
  /**
   * <code>string TemplateType = 1;</code>
   * @return The bytes for templateType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTemplateTypeBytes() {
    java.lang.Object ref = templateType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      templateType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMBER_FIELD_NUMBER = 2;
  private long number_;
  /**
   * <code>int64 Number = 2;</code>
   * @return The number.
   */
  @java.lang.Override
  public long getNumber() {
    return number_;
  }

  public static final int ISLOWPRIORITY_FIELD_NUMBER = 3;
  private boolean isLowPriority_;
  /**
   * <code>bool IsLowPriority = 3;</code>
   * @return The isLowPriority.
   */
  @java.lang.Override
  public boolean getIsLowPriority() {
    return isLowPriority_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(templateType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, templateType_);
    }
    if (number_ != 0L) {
      output.writeInt64(2, number_);
    }
    if (isLowPriority_ != false) {
      output.writeBool(3, isLowPriority_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(templateType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, templateType_);
    }
    if (number_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, number_);
    }
    if (isLowPriority_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isLowPriority_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo other = (com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo) obj;

    if (!getTemplateType()
        .equals(other.getTemplateType())) return false;
    if (getNumber()
        != other.getNumber()) return false;
    if (getIsLowPriority()
        != other.getIsLowPriority()) return false;
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
    hash = (37 * hash) + TEMPLATETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateType().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumber());
    hash = (37 * hash) + ISLOWPRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsLowPriority());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo)
      com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceWorkflowSnapshotInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceWorkflowSnapshotInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo.class, com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo.newBuilder()
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
      templateType_ = "";

      number_ = 0L;

      isLowPriority_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMeasure.internal_static_Volcengine_Vod_Models_Business_DescribeVodSpaceWorkflowSnapshotInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo build() {
      com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo buildPartial() {
      com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo result = new com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo(this);
      result.templateType_ = templateType_;
      result.number_ = number_;
      result.isLowPriority_ = isLowPriority_;
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
      if (other instanceof com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo other) {
      if (other == com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo.getDefaultInstance()) return this;
      if (!other.getTemplateType().isEmpty()) {
        templateType_ = other.templateType_;
        onChanged();
      }
      if (other.getNumber() != 0L) {
        setNumber(other.getNumber());
      }
      if (other.getIsLowPriority() != false) {
        setIsLowPriority(other.getIsLowPriority());
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
      com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object templateType_ = "";
    /**
     * <code>string TemplateType = 1;</code>
     * @return The templateType.
     */
    public java.lang.String getTemplateType() {
      java.lang.Object ref = templateType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        templateType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TemplateType = 1;</code>
     * @return The bytes for templateType.
     */
    public com.google.protobuf.ByteString
        getTemplateTypeBytes() {
      java.lang.Object ref = templateType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        templateType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TemplateType = 1;</code>
     * @param value The templateType to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TemplateType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemplateType() {
      
      templateType_ = getDefaultInstance().getTemplateType();
      onChanged();
      return this;
    }
    /**
     * <code>string TemplateType = 1;</code>
     * @param value The bytes for templateType to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateType_ = value;
      onChanged();
      return this;
    }

    private long number_ ;
    /**
     * <code>int64 Number = 2;</code>
     * @return The number.
     */
    @java.lang.Override
    public long getNumber() {
      return number_;
    }
    /**
     * <code>int64 Number = 2;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(long value) {
      
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      
      number_ = 0L;
      onChanged();
      return this;
    }

    private boolean isLowPriority_ ;
    /**
     * <code>bool IsLowPriority = 3;</code>
     * @return The isLowPriority.
     */
    @java.lang.Override
    public boolean getIsLowPriority() {
      return isLowPriority_;
    }
    /**
     * <code>bool IsLowPriority = 3;</code>
     * @param value The isLowPriority to set.
     * @return This builder for chaining.
     */
    public Builder setIsLowPriority(boolean value) {
      
      isLowPriority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool IsLowPriority = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLowPriority() {
      
      isLowPriority_ = false;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo)
  private static final com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo();
  }

  public static com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeVodSpaceWorkflowSnapshotInfo>
      PARSER = new com.google.protobuf.AbstractParser<DescribeVodSpaceWorkflowSnapshotInfo>() {
    @java.lang.Override
    public DescribeVodSpaceWorkflowSnapshotInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeVodSpaceWorkflowSnapshotInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeVodSpaceWorkflowSnapshotInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeVodSpaceWorkflowSnapshotInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
