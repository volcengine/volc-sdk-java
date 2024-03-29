// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

/**
 * Protobuf type {@code Volcengine.Live.Models.Request.DescribeVQScoreTaskRequest}
 */
public final class DescribeVQScoreTaskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Request.DescribeVQScoreTaskRequest)
    DescribeVQScoreTaskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeVQScoreTaskRequest.newBuilder() to construct.
  private DescribeVQScoreTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeVQScoreTaskRequest() {
    iD_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeVQScoreTaskRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeVQScoreTaskRequest(
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

            iD_ = s;
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
    return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeVQScoreTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeVQScoreTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.class, com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object iD_;
  /**
   * <pre>
   * 测评任务ID
   * </pre>
   *
   * <code>string ID = 1;</code>
   * @return The iD.
   */
  @java.lang.Override
  public java.lang.String getID() {
    java.lang.Object ref = iD_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iD_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 测评任务ID
   * </pre>
   *
   * <code>string ID = 1;</code>
   * @return The bytes for iD.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIDBytes() {
    java.lang.Object ref = iD_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iD_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iD_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iD_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iD_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iD_);
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
    if (!(obj instanceof com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest other = (com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest) obj;

    if (!getID()
        .equals(other.getID())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest prototype) {
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
   * Protobuf type {@code Volcengine.Live.Models.Request.DescribeVQScoreTaskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Request.DescribeVQScoreTaskRequest)
      com.volcengine.service.live.model.request.DescribeVQScoreTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeVQScoreTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeVQScoreTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.class, com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.Builder.class);
    }

    // Construct using com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.newBuilder()
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
      iD_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeVQScoreTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest getDefaultInstanceForType() {
      return com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest build() {
      com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest buildPartial() {
      com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest result = new com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest(this);
      result.iD_ = iD_;
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
      if (other instanceof com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest) {
        return mergeFrom((com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest other) {
      if (other == com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.getDefaultInstance()) return this;
      if (!other.getID().isEmpty()) {
        iD_ = other.iD_;
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
      com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object iD_ = "";
    /**
     * <pre>
     * 测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @return The iD.
     */
    public java.lang.String getID() {
      java.lang.Object ref = iD_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iD_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @return The bytes for iD.
     */
    public com.google.protobuf.ByteString
        getIDBytes() {
      java.lang.Object ref = iD_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iD_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @param value The iD to set.
     * @return This builder for chaining.
     */
    public Builder setID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearID() {
      
      iD_ = getDefaultInstance().getID();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @param value The bytes for iD to set.
     * @return This builder for chaining.
     */
    public Builder setIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      iD_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Request.DescribeVQScoreTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Request.DescribeVQScoreTaskRequest)
  private static final com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest();
  }

  public static com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeVQScoreTaskRequest>
      PARSER = new com.google.protobuf.AbstractParser<DescribeVQScoreTaskRequest>() {
    @java.lang.Override
    public DescribeVQScoreTaskRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeVQScoreTaskRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeVQScoreTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeVQScoreTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

