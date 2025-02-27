// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodSubmitBlockTasksRequest}
 */
public final class VodSubmitBlockTasksRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodSubmitBlockTasksRequest)
    VodSubmitBlockTasksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodSubmitBlockTasksRequest.newBuilder() to construct.
  private VodSubmitBlockTasksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodSubmitBlockTasksRequest() {
    fileUrls_ = "";
    operation_ = "";
    spaceName_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodSubmitBlockTasksRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodSubmitBlockTasksRequest(
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
            String s = input.readStringRequireUtf8();

            fileUrls_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            operation_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            spaceName_ = s;
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
    return VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitBlockTasksRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitBlockTasksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            VodSubmitBlockTasksRequest.class, Builder.class);
  }

  public static final int FILEURLS_FIELD_NUMBER = 1;
  private volatile Object fileUrls_;
  /**
   * <pre>
   *媒体Url列表：
   *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
   *用&#92;n分隔。 每次最多可提交 100 条。
   * </pre>
   *
   * <code>string FileUrls = 1;</code>
   * @return The fileUrls.
   */
  @Override
  public String getFileUrls() {
    Object ref = fileUrls_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      fileUrls_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *媒体Url列表：
   *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
   *用&#92;n分隔。 每次最多可提交 100 条。
   * </pre>
   *
   * <code>string FileUrls = 1;</code>
   * @return The bytes for fileUrls.
   */
  @Override
  public com.google.protobuf.ByteString
      getFileUrlsBytes() {
    Object ref = fileUrls_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      fileUrls_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATION_FIELD_NUMBER = 2;
  private volatile Object operation_;
  /**
   * <pre>
   * forbid：禁播，recover：解禁。
   * </pre>
   *
   * <code>string Operation = 2;</code>
   * @return The operation.
   */
  @Override
  public String getOperation() {
    Object ref = operation_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      operation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * forbid：禁播，recover：解禁。
   * </pre>
   *
   * <code>string Operation = 2;</code>
   * @return The bytes for operation.
   */
  @Override
  public com.google.protobuf.ByteString
      getOperationBytes() {
    Object ref = operation_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      operation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPACENAME_FIELD_NUMBER = 3;
  private volatile Object spaceName_;
  /**
   * <pre>
   * 点播空间名，非必填
   * </pre>
   *
   * <code>string SpaceName = 3;</code>
   * @return The spaceName.
   */
  @Override
  public String getSpaceName() {
    Object ref = spaceName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      spaceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 点播空间名，非必填
   * </pre>
   *
   * <code>string SpaceName = 3;</code>
   * @return The bytes for spaceName.
   */
  @Override
  public com.google.protobuf.ByteString
      getSpaceNameBytes() {
    Object ref = spaceName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      spaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileUrls_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileUrls_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, spaceName_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileUrls_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileUrls_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, spaceName_);
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
    if (!(obj instanceof VodSubmitBlockTasksRequest)) {
      return super.equals(obj);
    }
    VodSubmitBlockTasksRequest other = (VodSubmitBlockTasksRequest) obj;

    if (!getFileUrls()
        .equals(other.getFileUrls())) return false;
    if (!getOperation()
        .equals(other.getOperation())) return false;
    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
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
    hash = (37 * hash) + FILEURLS_FIELD_NUMBER;
    hash = (53 * hash) + getFileUrls().hashCode();
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + getOperation().hashCode();
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static VodSubmitBlockTasksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodSubmitBlockTasksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodSubmitBlockTasksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodSubmitBlockTasksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodSubmitBlockTasksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodSubmitBlockTasksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodSubmitBlockTasksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VodSubmitBlockTasksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static VodSubmitBlockTasksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static VodSubmitBlockTasksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static VodSubmitBlockTasksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VodSubmitBlockTasksRequest parseFrom(
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
  public static Builder newBuilder(VodSubmitBlockTasksRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodSubmitBlockTasksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodSubmitBlockTasksRequest)
      VodSubmitBlockTasksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitBlockTasksRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitBlockTasksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VodSubmitBlockTasksRequest.class, Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodSubmitBlockTasksRequest.newBuilder()
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
      fileUrls_ = "";

      operation_ = "";

      spaceName_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitBlockTasksRequest_descriptor;
    }

    @Override
    public VodSubmitBlockTasksRequest getDefaultInstanceForType() {
      return VodSubmitBlockTasksRequest.getDefaultInstance();
    }

    @Override
    public VodSubmitBlockTasksRequest build() {
      VodSubmitBlockTasksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public VodSubmitBlockTasksRequest buildPartial() {
      VodSubmitBlockTasksRequest result = new VodSubmitBlockTasksRequest(this);
      result.fileUrls_ = fileUrls_;
      result.operation_ = operation_;
      result.spaceName_ = spaceName_;
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
      if (other instanceof VodSubmitBlockTasksRequest) {
        return mergeFrom((VodSubmitBlockTasksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(VodSubmitBlockTasksRequest other) {
      if (other == VodSubmitBlockTasksRequest.getDefaultInstance()) return this;
      if (!other.getFileUrls().isEmpty()) {
        fileUrls_ = other.fileUrls_;
        onChanged();
      }
      if (!other.getOperation().isEmpty()) {
        operation_ = other.operation_;
        onChanged();
      }
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
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
      VodSubmitBlockTasksRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (VodSubmitBlockTasksRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object fileUrls_ = "";
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @return The fileUrls.
     */
    public String getFileUrls() {
      Object ref = fileUrls_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        fileUrls_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @return The bytes for fileUrls.
     */
    public com.google.protobuf.ByteString
        getFileUrlsBytes() {
      Object ref = fileUrls_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        fileUrls_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @param value The fileUrls to set.
     * @return This builder for chaining.
     */
    public Builder setFileUrls(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileUrls_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileUrls() {
      
      fileUrls_ = getDefaultInstance().getFileUrls();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @param value The bytes for fileUrls to set.
     * @return This builder for chaining.
     */
    public Builder setFileUrlsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileUrls_ = value;
      onChanged();
      return this;
    }

    private Object operation_ = "";
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @return The operation.
     */
    public String getOperation() {
      Object ref = operation_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        operation_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @return The bytes for operation.
     */
    public com.google.protobuf.ByteString
        getOperationBytes() {
      Object ref = operation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        operation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @param value The operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperation(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperation() {
      
      operation_ = getDefaultInstance().getOperation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @param value The bytes for operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operation_ = value;
      onChanged();
      return this;
    }

    private Object spaceName_ = "";
    /**
     * <pre>
     * 点播空间名，非必填
     * </pre>
     *
     * <code>string SpaceName = 3;</code>
     * @return The spaceName.
     */
    public String getSpaceName() {
      Object ref = spaceName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        spaceName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 点播空间名，非必填
     * </pre>
     *
     * <code>string SpaceName = 3;</code>
     * @return The bytes for spaceName.
     */
    public com.google.protobuf.ByteString
        getSpaceNameBytes() {
      Object ref = spaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        spaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 点播空间名，非必填
     * </pre>
     *
     * <code>string SpaceName = 3;</code>
     * @param value The spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点播空间名，非必填
     * </pre>
     *
     * <code>string SpaceName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点播空间名，非必填
     * </pre>
     *
     * <code>string SpaceName = 3;</code>
     * @param value The bytes for spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceName_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodSubmitBlockTasksRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodSubmitBlockTasksRequest)
  private static final VodSubmitBlockTasksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VodSubmitBlockTasksRequest();
  }

  public static VodSubmitBlockTasksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodSubmitBlockTasksRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodSubmitBlockTasksRequest>() {
    @Override
    public VodSubmitBlockTasksRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodSubmitBlockTasksRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodSubmitBlockTasksRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<VodSubmitBlockTasksRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public VodSubmitBlockTasksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

