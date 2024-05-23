// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodQueryMoveObjectTaskInfoResData}
 */
public final class VodQueryMoveObjectTaskInfoResData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodQueryMoveObjectTaskInfoResData)
    VodQueryMoveObjectTaskInfoResDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodQueryMoveObjectTaskInfoResData.newBuilder() to construct.
  private VodQueryMoveObjectTaskInfoResData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodQueryMoveObjectTaskInfoResData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodQueryMoveObjectTaskInfoResData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodQueryMoveObjectTaskInfoResData(
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
            com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
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
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryMoveObjectTaskInfoResData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryMoveObjectTaskInfoResData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData.class, com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData data_;
  /**
   * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData getData() {
    return data_ == null ? com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.getDefaultInstance() : data_;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespDataOrBuilder getDataOrBuilder() {
    return getData();
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
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData other = (com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodQueryMoveObjectTaskInfoResData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodQueryMoveObjectTaskInfoResData)
      com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryMoveObjectTaskInfoResData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryMoveObjectTaskInfoResData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData.class, com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData.newBuilder()
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
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryMoveObjectTaskInfoResData_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData build() {
      com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData buildPartial() {
      com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData result = new com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData(this);
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData other) {
      if (other == com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
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
      com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData, com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.Builder, com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespDataOrBuilder> dataBuilder_;
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     * @return Whether the data field is set.
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     * @return The data.
     */
    public com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     */
    public Builder setData(com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     */
    public Builder setData(
        com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     */
    public Builder mergeData(com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     */
    public com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     */
    public com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespDataOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.QueryMoveObjectTaskInfoRespData Data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData, com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.Builder, com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespDataOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData, com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespData.Builder, com.volcengine.service.vod.model.business.QueryMoveObjectTaskInfoRespDataOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodQueryMoveObjectTaskInfoResData)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodQueryMoveObjectTaskInfoResData)
  private static final com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData();
  }

  public static com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodQueryMoveObjectTaskInfoResData>
      PARSER = new com.google.protobuf.AbstractParser<VodQueryMoveObjectTaskInfoResData>() {
    @java.lang.Override
    public VodQueryMoveObjectTaskInfoResData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodQueryMoveObjectTaskInfoResData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodQueryMoveObjectTaskInfoResData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodQueryMoveObjectTaskInfoResData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodQueryMoveObjectTaskInfoResData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

