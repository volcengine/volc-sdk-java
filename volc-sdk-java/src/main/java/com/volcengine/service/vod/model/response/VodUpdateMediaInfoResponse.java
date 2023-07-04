// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/response/response_vod.proto

package com.volcengine.service.vod.model.response;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Response.VodUpdateMediaInfoResponse}
 */
public final class VodUpdateMediaInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Response.VodUpdateMediaInfoResponse)
    VodUpdateMediaInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUpdateMediaInfoResponse.newBuilder() to construct.
  private VodUpdateMediaInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUpdateMediaInfoResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUpdateMediaInfoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUpdateMediaInfoResponse(
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
            com.volcengine.service.base.model.base.ResponseMetadata.Builder subBuilder = null;
            if (responseMetadata_ != null) {
              subBuilder = responseMetadata_.toBuilder();
            }
            responseMetadata_ = input.readMessage(com.volcengine.service.base.model.base.ResponseMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(responseMetadata_);
              responseMetadata_ = subBuilder.buildPartial();
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
    return com.volcengine.service.vod.model.response.VodResponse.internal_static_Volcengine_Vod_Models_Response_VodUpdateMediaInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.response.VodResponse.internal_static_Volcengine_Vod_Models_Response_VodUpdateMediaInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse.class, com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse.Builder.class);
  }

  public static final int RESPONSEMETADATA_FIELD_NUMBER = 1;
  private com.volcengine.service.base.model.base.ResponseMetadata responseMetadata_;
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  @java.lang.Override
  public boolean hasResponseMetadata() {
    return responseMetadata_ != null;
  }
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  @java.lang.Override
  public com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata() {
    return responseMetadata_ == null ? com.volcengine.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
  }
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder() {
    return getResponseMetadata();
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
    if (responseMetadata_ != null) {
      output.writeMessage(1, getResponseMetadata());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponseMetadata());
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
    if (!(obj instanceof com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse other = (com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse) obj;

    if (hasResponseMetadata() != other.hasResponseMetadata()) return false;
    if (hasResponseMetadata()) {
      if (!getResponseMetadata()
          .equals(other.getResponseMetadata())) return false;
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
    if (hasResponseMetadata()) {
      hash = (37 * hash) + RESPONSEMETADATA_FIELD_NUMBER;
      hash = (53 * hash) + getResponseMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Response.VodUpdateMediaInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Response.VodUpdateMediaInfoResponse)
      com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.response.VodResponse.internal_static_Volcengine_Vod_Models_Response_VodUpdateMediaInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.response.VodResponse.internal_static_Volcengine_Vod_Models_Response_VodUpdateMediaInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse.class, com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse.newBuilder()
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
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = null;
      } else {
        responseMetadata_ = null;
        responseMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.response.VodResponse.internal_static_Volcengine_Vod_Models_Response_VodUpdateMediaInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse build() {
      com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse buildPartial() {
      com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse result = new com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse(this);
      if (responseMetadataBuilder_ == null) {
        result.responseMetadata_ = responseMetadata_;
      } else {
        result.responseMetadata_ = responseMetadataBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse) {
        return mergeFrom((com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse other) {
      if (other == com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse.getDefaultInstance()) return this;
      if (other.hasResponseMetadata()) {
        mergeResponseMetadata(other.getResponseMetadata());
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
      com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.volcengine.service.base.model.base.ResponseMetadata responseMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.base.model.base.ResponseMetadata, com.volcengine.service.base.model.base.ResponseMetadata.Builder, com.volcengine.service.base.model.base.ResponseMetadataOrBuilder> responseMetadataBuilder_;
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     * @return Whether the responseMetadata field is set.
     */
    public boolean hasResponseMetadata() {
      return responseMetadataBuilder_ != null || responseMetadata_ != null;
    }
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     * @return The responseMetadata.
     */
    public com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata() {
      if (responseMetadataBuilder_ == null) {
        return responseMetadata_ == null ? com.volcengine.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
      } else {
        return responseMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder setResponseMetadata(com.volcengine.service.base.model.base.ResponseMetadata value) {
      if (responseMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseMetadata_ = value;
        onChanged();
      } else {
        responseMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder setResponseMetadata(
        com.volcengine.service.base.model.base.ResponseMetadata.Builder builderForValue) {
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = builderForValue.build();
        onChanged();
      } else {
        responseMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder mergeResponseMetadata(com.volcengine.service.base.model.base.ResponseMetadata value) {
      if (responseMetadataBuilder_ == null) {
        if (responseMetadata_ != null) {
          responseMetadata_ =
            com.volcengine.service.base.model.base.ResponseMetadata.newBuilder(responseMetadata_).mergeFrom(value).buildPartial();
        } else {
          responseMetadata_ = value;
        }
        onChanged();
      } else {
        responseMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder clearResponseMetadata() {
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = null;
        onChanged();
      } else {
        responseMetadata_ = null;
        responseMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public com.volcengine.service.base.model.base.ResponseMetadata.Builder getResponseMetadataBuilder() {
      
      onChanged();
      return getResponseMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder() {
      if (responseMetadataBuilder_ != null) {
        return responseMetadataBuilder_.getMessageOrBuilder();
      } else {
        return responseMetadata_ == null ?
            com.volcengine.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
      }
    }
    /**
     * <pre>
     *响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.base.model.base.ResponseMetadata, com.volcengine.service.base.model.base.ResponseMetadata.Builder, com.volcengine.service.base.model.base.ResponseMetadataOrBuilder> 
        getResponseMetadataFieldBuilder() {
      if (responseMetadataBuilder_ == null) {
        responseMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.base.model.base.ResponseMetadata, com.volcengine.service.base.model.base.ResponseMetadata.Builder, com.volcengine.service.base.model.base.ResponseMetadataOrBuilder>(
                getResponseMetadata(),
                getParentForChildren(),
                isClean());
        responseMetadata_ = null;
      }
      return responseMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Response.VodUpdateMediaInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Response.VodUpdateMediaInfoResponse)
  private static final com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse();
  }

  public static com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUpdateMediaInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<VodUpdateMediaInfoResponse>() {
    @java.lang.Override
    public VodUpdateMediaInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUpdateMediaInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUpdateMediaInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUpdateMediaInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

