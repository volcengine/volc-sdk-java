// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/response/response_vod.proto

package com.volcengine.service.vod.model.response;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Response.VodSubmitCloudMigrateJobResponse}
 */
public final class VodSubmitCloudMigrateJobResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Response.VodSubmitCloudMigrateJobResponse)
    VodSubmitCloudMigrateJobResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodSubmitCloudMigrateJobResponse.newBuilder() to construct.
  private VodSubmitCloudMigrateJobResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodSubmitCloudMigrateJobResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodSubmitCloudMigrateJobResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodSubmitCloudMigrateJobResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
    return VodResponse.internal_static_Volcengine_Vod_Models_Response_VodSubmitCloudMigrateJobResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return VodResponse.internal_static_Volcengine_Vod_Models_Response_VodSubmitCloudMigrateJobResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            VodSubmitCloudMigrateJobResponse.class, Builder.class);
  }

  public static final int RESPONSEMETADATA_FIELD_NUMBER = 1;
  private com.volcengine.service.base.model.base.ResponseMetadata responseMetadata_;
  /**
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  @Override
  public boolean hasResponseMetadata() {
    return responseMetadata_ != null;
  }
  /**
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  @Override
  public com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata() {
    return responseMetadata_ == null ? com.volcengine.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
  }
  /**
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  @Override
  public com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder() {
    return getResponseMetadata();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (responseMetadata_ != null) {
      output.writeMessage(1, getResponseMetadata());
    }
    unknownFields.writeTo(output);
  }

  @Override
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

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof VodSubmitCloudMigrateJobResponse)) {
      return super.equals(obj);
    }
    VodSubmitCloudMigrateJobResponse other = (VodSubmitCloudMigrateJobResponse) obj;

    if (hasResponseMetadata() != other.hasResponseMetadata()) return false;
    if (hasResponseMetadata()) {
      if (!getResponseMetadata()
          .equals(other.getResponseMetadata())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
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

  public static VodSubmitCloudMigrateJobResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static VodSubmitCloudMigrateJobResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static VodSubmitCloudMigrateJobResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VodSubmitCloudMigrateJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(VodSubmitCloudMigrateJobResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Vod.Models.Response.VodSubmitCloudMigrateJobResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Response.VodSubmitCloudMigrateJobResponse)
      VodSubmitCloudMigrateJobResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return VodResponse.internal_static_Volcengine_Vod_Models_Response_VodSubmitCloudMigrateJobResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VodResponse.internal_static_Volcengine_Vod_Models_Response_VodSubmitCloudMigrateJobResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VodSubmitCloudMigrateJobResponse.class, Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.response.VodSubmitCloudMigrateJobResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
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

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return VodResponse.internal_static_Volcengine_Vod_Models_Response_VodSubmitCloudMigrateJobResponse_descriptor;
    }

    @Override
    public VodSubmitCloudMigrateJobResponse getDefaultInstanceForType() {
      return VodSubmitCloudMigrateJobResponse.getDefaultInstance();
    }

    @Override
    public VodSubmitCloudMigrateJobResponse build() {
      VodSubmitCloudMigrateJobResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public VodSubmitCloudMigrateJobResponse buildPartial() {
      VodSubmitCloudMigrateJobResponse result = new VodSubmitCloudMigrateJobResponse(this);
      if (responseMetadataBuilder_ == null) {
        result.responseMetadata_ = responseMetadata_;
      } else {
        result.responseMetadata_ = responseMetadataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof VodSubmitCloudMigrateJobResponse) {
        return mergeFrom((VodSubmitCloudMigrateJobResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(VodSubmitCloudMigrateJobResponse other) {
      if (other == VodSubmitCloudMigrateJobResponse.getDefaultInstance()) return this;
      if (other.hasResponseMetadata()) {
        mergeResponseMetadata(other.getResponseMetadata());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      VodSubmitCloudMigrateJobResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (VodSubmitCloudMigrateJobResponse) e.getUnfinishedMessage();
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
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     * @return Whether the responseMetadata field is set.
     */
    public boolean hasResponseMetadata() {
      return responseMetadataBuilder_ != null || responseMetadata_ != null;
    }
    /**
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
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public com.volcengine.service.base.model.base.ResponseMetadata.Builder getResponseMetadataBuilder() {
      
      onChanged();
      return getResponseMetadataFieldBuilder().getBuilder();
    }
    /**
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
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Response.VodSubmitCloudMigrateJobResponse)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Response.VodSubmitCloudMigrateJobResponse)
  private static final VodSubmitCloudMigrateJobResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VodSubmitCloudMigrateJobResponse();
  }

  public static VodSubmitCloudMigrateJobResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodSubmitCloudMigrateJobResponse>
      PARSER = new com.google.protobuf.AbstractParser<VodSubmitCloudMigrateJobResponse>() {
    @Override
    public VodSubmitCloudMigrateJobResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodSubmitCloudMigrateJobResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodSubmitCloudMigrateJobResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<VodSubmitCloudMigrateJobResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public VodSubmitCloudMigrateJobResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

