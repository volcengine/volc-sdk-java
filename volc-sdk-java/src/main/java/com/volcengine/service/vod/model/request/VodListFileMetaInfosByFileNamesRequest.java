// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodListFileMetaInfosByFileNamesRequest}
 */
public final class VodListFileMetaInfosByFileNamesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodListFileMetaInfosByFileNamesRequest)
    VodListFileMetaInfosByFileNamesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodListFileMetaInfosByFileNamesRequest.newBuilder() to construct.
  private VodListFileMetaInfosByFileNamesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodListFileMetaInfosByFileNamesRequest() {
    spaceName_ = "";
    fileNameEncodeds_ = "";
    bucketName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodListFileMetaInfosByFileNamesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodListFileMetaInfosByFileNamesRequest(
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

            spaceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fileNameEncodeds_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            bucketName_ = s;
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListFileMetaInfosByFileNamesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListFileMetaInfosByFileNamesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.class, com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 必传 filename所属空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  @java.lang.Override
  public java.lang.String getSpaceName() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 必传 filename所属空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceNameBytes() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILENAMEENCODEDS_FIELD_NUMBER = 2;
  private volatile java.lang.Object fileNameEncodeds_;
  /**
   * <pre>
   * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
   * 用,连接进行传入  一次最多传30个
   * </pre>
   *
   * <code>string FileNameEncodeds = 2;</code>
   * @return The fileNameEncodeds.
   */
  @java.lang.Override
  public java.lang.String getFileNameEncodeds() {
    java.lang.Object ref = fileNameEncodeds_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileNameEncodeds_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
   * 用,连接进行传入  一次最多传30个
   * </pre>
   *
   * <code>string FileNameEncodeds = 2;</code>
   * @return The bytes for fileNameEncodeds.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileNameEncodedsBytes() {
    java.lang.Object ref = fileNameEncodeds_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileNameEncodeds_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUCKETNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object bucketName_;
  /**
   * <pre>
   *非必选 挂载Bucket专用
   * </pre>
   *
   * <code>string BucketName = 3;</code>
   * @return The bucketName.
   */
  @java.lang.Override
  public java.lang.String getBucketName() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucketName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *非必选 挂载Bucket专用
   * </pre>
   *
   * <code>string BucketName = 3;</code>
   * @return The bytes for bucketName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBucketNameBytes() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucketName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileNameEncodeds_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileNameEncodeds_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucketName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bucketName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileNameEncodeds_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileNameEncodeds_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucketName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bucketName_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest other = (com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getFileNameEncodeds()
        .equals(other.getFileNameEncodeds())) return false;
    if (!getBucketName()
        .equals(other.getBucketName())) return false;
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
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (37 * hash) + FILENAMEENCODEDS_FIELD_NUMBER;
    hash = (53 * hash) + getFileNameEncodeds().hashCode();
    hash = (37 * hash) + BUCKETNAME_FIELD_NUMBER;
    hash = (53 * hash) + getBucketName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodListFileMetaInfosByFileNamesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodListFileMetaInfosByFileNamesRequest)
      com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListFileMetaInfosByFileNamesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListFileMetaInfosByFileNamesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.class, com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.newBuilder()
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
      spaceName_ = "";

      fileNameEncodeds_ = "";

      bucketName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListFileMetaInfosByFileNamesRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest build() {
      com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest result = new com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest(this);
      result.spaceName_ = spaceName_;
      result.fileNameEncodeds_ = fileNameEncodeds_;
      result.bucketName_ = bucketName_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getFileNameEncodeds().isEmpty()) {
        fileNameEncodeds_ = other.fileNameEncodeds_;
        onChanged();
      }
      if (!other.getBucketName().isEmpty()) {
        bucketName_ = other.bucketName_;
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
      com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spaceName_ = "";
    /**
     * <pre>
     * 必传 filename所属空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return The spaceName.
     */
    public java.lang.String getSpaceName() {
      java.lang.Object ref = spaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 必传 filename所属空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return The bytes for spaceName.
     */
    public com.google.protobuf.ByteString
        getSpaceNameBytes() {
      java.lang.Object ref = spaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 必传 filename所属空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @param value The spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必传 filename所属空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必传 filename所属空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
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

    private java.lang.Object fileNameEncodeds_ = "";
    /**
     * <pre>
     * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
     * 用,连接进行传入  一次最多传30个
     * </pre>
     *
     * <code>string FileNameEncodeds = 2;</code>
     * @return The fileNameEncodeds.
     */
    public java.lang.String getFileNameEncodeds() {
      java.lang.Object ref = fileNameEncodeds_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileNameEncodeds_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
     * 用,连接进行传入  一次最多传30个
     * </pre>
     *
     * <code>string FileNameEncodeds = 2;</code>
     * @return The bytes for fileNameEncodeds.
     */
    public com.google.protobuf.ByteString
        getFileNameEncodedsBytes() {
      java.lang.Object ref = fileNameEncodeds_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileNameEncodeds_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
     * 用,连接进行传入  一次最多传30个
     * </pre>
     *
     * <code>string FileNameEncodeds = 2;</code>
     * @param value The fileNameEncodeds to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameEncodeds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileNameEncodeds_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
     * 用,连接进行传入  一次最多传30个
     * </pre>
     *
     * <code>string FileNameEncodeds = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileNameEncodeds() {
      
      fileNameEncodeds_ = getDefaultInstance().getFileNameEncodeds();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
     * 用,连接进行传入  一次最多传30个
     * </pre>
     *
     * <code>string FileNameEncodeds = 2;</code>
     * @param value The bytes for fileNameEncodeds to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameEncodedsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileNameEncodeds_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object bucketName_ = "";
    /**
     * <pre>
     *非必选 挂载Bucket专用
     * </pre>
     *
     * <code>string BucketName = 3;</code>
     * @return The bucketName.
     */
    public java.lang.String getBucketName() {
      java.lang.Object ref = bucketName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucketName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *非必选 挂载Bucket专用
     * </pre>
     *
     * <code>string BucketName = 3;</code>
     * @return The bytes for bucketName.
     */
    public com.google.protobuf.ByteString
        getBucketNameBytes() {
      java.lang.Object ref = bucketName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucketName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *非必选 挂载Bucket专用
     * </pre>
     *
     * <code>string BucketName = 3;</code>
     * @param value The bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bucketName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *非必选 挂载Bucket专用
     * </pre>
     *
     * <code>string BucketName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBucketName() {
      
      bucketName_ = getDefaultInstance().getBucketName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *非必选 挂载Bucket专用
     * </pre>
     *
     * <code>string BucketName = 3;</code>
     * @param value The bytes for bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bucketName_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodListFileMetaInfosByFileNamesRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodListFileMetaInfosByFileNamesRequest)
  private static final com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest();
  }

  public static com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodListFileMetaInfosByFileNamesRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodListFileMetaInfosByFileNamesRequest>() {
    @java.lang.Override
    public VodListFileMetaInfosByFileNamesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodListFileMetaInfosByFileNamesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodListFileMetaInfosByFileNamesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodListFileMetaInfosByFileNamesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

