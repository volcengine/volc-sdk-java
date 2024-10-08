// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_object.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.RefreshInfo}
 */
public final class RefreshInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.RefreshInfo)
    RefreshInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RefreshInfo.newBuilder() to construct.
  private RefreshInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RefreshInfo() {
    url_ = "";
    status_ = "";
    process_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RefreshInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RefreshInfo(
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

            url_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            process_ = s;
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
    return com.volcengine.service.vod.model.business.VodObject.internal_static_Volcengine_Vod_Models_Business_RefreshInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodObject.internal_static_Volcengine_Vod_Models_Business_RefreshInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.RefreshInfo.class, com.volcengine.service.vod.model.business.RefreshInfo.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   *刷新的url
   * </pre>
   *
   * <code>string Url = 1;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *刷新的url
   * </pre>
   *
   * <code>string Url = 1;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object status_;
  /**
   * <pre>
   *表示任务的状态。该参数有以下取值：
   *complete：表示任务已完成。
   *running：表示任务正在执行中。
   *failed：表示任务执行失败。
   * </pre>
   *
   * <code>string Status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *表示任务的状态。该参数有以下取值：
   *complete：表示任务已完成。
   *running：表示任务正在执行中。
   *failed：表示任务执行失败。
   * </pre>
   *
   * <code>string Status = 2;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROCESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object process_;
  /**
   * <pre>
   *表示任务的进度。比如70%
   * </pre>
   *
   * <code>string Process = 3;</code>
   * @return The process.
   */
  @java.lang.Override
  public java.lang.String getProcess() {
    java.lang.Object ref = process_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      process_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *表示任务的进度。比如70%
   * </pre>
   *
   * <code>string Process = 3;</code>
   * @return The bytes for process.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProcessBytes() {
    java.lang.Object ref = process_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      process_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(process_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, process_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(process_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, process_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.RefreshInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.RefreshInfo other = (com.volcengine.service.vod.model.business.RefreshInfo) obj;

    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (!getStatus()
        .equals(other.getStatus())) return false;
    if (!getProcess()
        .equals(other.getProcess())) return false;
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
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + PROCESS_FIELD_NUMBER;
    hash = (53 * hash) + getProcess().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.RefreshInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.RefreshInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.RefreshInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.RefreshInfo)
      com.volcengine.service.vod.model.business.RefreshInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodObject.internal_static_Volcengine_Vod_Models_Business_RefreshInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodObject.internal_static_Volcengine_Vod_Models_Business_RefreshInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.RefreshInfo.class, com.volcengine.service.vod.model.business.RefreshInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.RefreshInfo.newBuilder()
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
      url_ = "";

      status_ = "";

      process_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodObject.internal_static_Volcengine_Vod_Models_Business_RefreshInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.RefreshInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.RefreshInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.RefreshInfo build() {
      com.volcengine.service.vod.model.business.RefreshInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.RefreshInfo buildPartial() {
      com.volcengine.service.vod.model.business.RefreshInfo result = new com.volcengine.service.vod.model.business.RefreshInfo(this);
      result.url_ = url_;
      result.status_ = status_;
      result.process_ = process_;
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
      if (other instanceof com.volcengine.service.vod.model.business.RefreshInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.RefreshInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.RefreshInfo other) {
      if (other == com.volcengine.service.vod.model.business.RefreshInfo.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (!other.getProcess().isEmpty()) {
        process_ = other.process_;
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
      com.volcengine.service.vod.model.business.RefreshInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.RefreshInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     *刷新的url
     * </pre>
     *
     * <code>string Url = 1;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *刷新的url
     * </pre>
     *
     * <code>string Url = 1;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *刷新的url
     * </pre>
     *
     * <code>string Url = 1;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *刷新的url
     * </pre>
     *
     * <code>string Url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *刷新的url
     * </pre>
     *
     * <code>string Url = 1;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     *表示任务的状态。该参数有以下取值：
     *complete：表示任务已完成。
     *running：表示任务正在执行中。
     *failed：表示任务执行失败。
     * </pre>
     *
     * <code>string Status = 2;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *表示任务的状态。该参数有以下取值：
     *complete：表示任务已完成。
     *running：表示任务正在执行中。
     *failed：表示任务执行失败。
     * </pre>
     *
     * <code>string Status = 2;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *表示任务的状态。该参数有以下取值：
     *complete：表示任务已完成。
     *running：表示任务正在执行中。
     *failed：表示任务执行失败。
     * </pre>
     *
     * <code>string Status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *表示任务的状态。该参数有以下取值：
     *complete：表示任务已完成。
     *running：表示任务正在执行中。
     *failed：表示任务执行失败。
     * </pre>
     *
     * <code>string Status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *表示任务的状态。该参数有以下取值：
     *complete：表示任务已完成。
     *running：表示任务正在执行中。
     *failed：表示任务执行失败。
     * </pre>
     *
     * <code>string Status = 2;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object process_ = "";
    /**
     * <pre>
     *表示任务的进度。比如70%
     * </pre>
     *
     * <code>string Process = 3;</code>
     * @return The process.
     */
    public java.lang.String getProcess() {
      java.lang.Object ref = process_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        process_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *表示任务的进度。比如70%
     * </pre>
     *
     * <code>string Process = 3;</code>
     * @return The bytes for process.
     */
    public com.google.protobuf.ByteString
        getProcessBytes() {
      java.lang.Object ref = process_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        process_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *表示任务的进度。比如70%
     * </pre>
     *
     * <code>string Process = 3;</code>
     * @param value The process to set.
     * @return This builder for chaining.
     */
    public Builder setProcess(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      process_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *表示任务的进度。比如70%
     * </pre>
     *
     * <code>string Process = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProcess() {
      
      process_ = getDefaultInstance().getProcess();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *表示任务的进度。比如70%
     * </pre>
     *
     * <code>string Process = 3;</code>
     * @param value The bytes for process to set.
     * @return This builder for chaining.
     */
    public Builder setProcessBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      process_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.RefreshInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.RefreshInfo)
  private static final com.volcengine.service.vod.model.business.RefreshInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.RefreshInfo();
  }

  public static com.volcengine.service.vod.model.business.RefreshInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RefreshInfo>
      PARSER = new com.google.protobuf.AbstractParser<RefreshInfo>() {
    @java.lang.Override
    public RefreshInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RefreshInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RefreshInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RefreshInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.RefreshInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

