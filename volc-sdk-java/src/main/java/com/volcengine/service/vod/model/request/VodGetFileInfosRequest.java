// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodGetFileInfosRequest}
 */
public final class VodGetFileInfosRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodGetFileInfosRequest)
    VodGetFileInfosRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetFileInfosRequest.newBuilder() to construct.
  private VodGetFileInfosRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetFileInfosRequest() {
    spaceName_ = "";
    encodedFileNames_ = "";
    bucketName_ = "";
    downloadUrlNetworkType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetFileInfosRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetFileInfosRequest(
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

            encodedFileNames_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            bucketName_ = s;
            break;
          }
          case 32: {

            needDownloadUrl_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            downloadUrlNetworkType_ = s;
            break;
          }
          case 48: {

            downloadUrlExpire_ = input.readInt64();
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetFileInfosRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetFileInfosRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodGetFileInfosRequest.class, com.volcengine.service.vod.model.request.VodGetFileInfosRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
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

  public static final int ENCODEDFILENAMES_FIELD_NUMBER = 2;
  private volatile java.lang.Object encodedFileNames_;
  /**
   * <code>string EncodedFileNames = 2;</code>
   * @return The encodedFileNames.
   */
  @java.lang.Override
  public java.lang.String getEncodedFileNames() {
    java.lang.Object ref = encodedFileNames_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encodedFileNames_ = s;
      return s;
    }
  }
  /**
   * <code>string EncodedFileNames = 2;</code>
   * @return The bytes for encodedFileNames.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncodedFileNamesBytes() {
    java.lang.Object ref = encodedFileNames_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encodedFileNames_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUCKETNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object bucketName_;
  /**
   * <pre>
   * bucket名
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
   * bucket名
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

  public static final int NEEDDOWNLOADURL_FIELD_NUMBER = 4;
  private boolean needDownloadUrl_;
  /**
   * <pre>
   * 是否需要下载链接
   * </pre>
   *
   * <code>bool NeedDownloadUrl = 4;</code>
   * @return The needDownloadUrl.
   */
  @java.lang.Override
  public boolean getNeedDownloadUrl() {
    return needDownloadUrl_;
  }

  public static final int DOWNLOADURLNETWORKTYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object downloadUrlNetworkType_;
  /**
   * <pre>
   *下载链接网络类型
   * </pre>
   *
   * <code>string DownloadUrlNetworkType = 5;</code>
   * @return The downloadUrlNetworkType.
   */
  @java.lang.Override
  public java.lang.String getDownloadUrlNetworkType() {
    java.lang.Object ref = downloadUrlNetworkType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      downloadUrlNetworkType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *下载链接网络类型
   * </pre>
   *
   * <code>string DownloadUrlNetworkType = 5;</code>
   * @return The bytes for downloadUrlNetworkType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDownloadUrlNetworkTypeBytes() {
    java.lang.Object ref = downloadUrlNetworkType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      downloadUrlNetworkType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOWNLOADURLEXPIRE_FIELD_NUMBER = 6;
  private long downloadUrlExpire_;
  /**
   * <pre>
   *下载链接过期时间
   * </pre>
   *
   * <code>int64 DownloadUrlExpire = 6;</code>
   * @return The downloadUrlExpire.
   */
  @java.lang.Override
  public long getDownloadUrlExpire() {
    return downloadUrlExpire_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encodedFileNames_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, encodedFileNames_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucketName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bucketName_);
    }
    if (needDownloadUrl_ != false) {
      output.writeBool(4, needDownloadUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(downloadUrlNetworkType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, downloadUrlNetworkType_);
    }
    if (downloadUrlExpire_ != 0L) {
      output.writeInt64(6, downloadUrlExpire_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encodedFileNames_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, encodedFileNames_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucketName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bucketName_);
    }
    if (needDownloadUrl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, needDownloadUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(downloadUrlNetworkType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, downloadUrlNetworkType_);
    }
    if (downloadUrlExpire_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, downloadUrlExpire_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodGetFileInfosRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodGetFileInfosRequest other = (com.volcengine.service.vod.model.request.VodGetFileInfosRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getEncodedFileNames()
        .equals(other.getEncodedFileNames())) return false;
    if (!getBucketName()
        .equals(other.getBucketName())) return false;
    if (getNeedDownloadUrl()
        != other.getNeedDownloadUrl()) return false;
    if (!getDownloadUrlNetworkType()
        .equals(other.getDownloadUrlNetworkType())) return false;
    if (getDownloadUrlExpire()
        != other.getDownloadUrlExpire()) return false;
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
    hash = (37 * hash) + ENCODEDFILENAMES_FIELD_NUMBER;
    hash = (53 * hash) + getEncodedFileNames().hashCode();
    hash = (37 * hash) + BUCKETNAME_FIELD_NUMBER;
    hash = (53 * hash) + getBucketName().hashCode();
    hash = (37 * hash) + NEEDDOWNLOADURL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNeedDownloadUrl());
    hash = (37 * hash) + DOWNLOADURLNETWORKTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDownloadUrlNetworkType().hashCode();
    hash = (37 * hash) + DOWNLOADURLEXPIRE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDownloadUrlExpire());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodGetFileInfosRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodGetFileInfosRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodGetFileInfosRequest)
      com.volcengine.service.vod.model.request.VodGetFileInfosRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetFileInfosRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetFileInfosRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodGetFileInfosRequest.class, com.volcengine.service.vod.model.request.VodGetFileInfosRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodGetFileInfosRequest.newBuilder()
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

      encodedFileNames_ = "";

      bucketName_ = "";

      needDownloadUrl_ = false;

      downloadUrlNetworkType_ = "";

      downloadUrlExpire_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetFileInfosRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodGetFileInfosRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodGetFileInfosRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodGetFileInfosRequest build() {
      com.volcengine.service.vod.model.request.VodGetFileInfosRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodGetFileInfosRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodGetFileInfosRequest result = new com.volcengine.service.vod.model.request.VodGetFileInfosRequest(this);
      result.spaceName_ = spaceName_;
      result.encodedFileNames_ = encodedFileNames_;
      result.bucketName_ = bucketName_;
      result.needDownloadUrl_ = needDownloadUrl_;
      result.downloadUrlNetworkType_ = downloadUrlNetworkType_;
      result.downloadUrlExpire_ = downloadUrlExpire_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodGetFileInfosRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodGetFileInfosRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodGetFileInfosRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodGetFileInfosRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getEncodedFileNames().isEmpty()) {
        encodedFileNames_ = other.encodedFileNames_;
        onChanged();
      }
      if (!other.getBucketName().isEmpty()) {
        bucketName_ = other.bucketName_;
        onChanged();
      }
      if (other.getNeedDownloadUrl() != false) {
        setNeedDownloadUrl(other.getNeedDownloadUrl());
      }
      if (!other.getDownloadUrlNetworkType().isEmpty()) {
        downloadUrlNetworkType_ = other.downloadUrlNetworkType_;
        onChanged();
      }
      if (other.getDownloadUrlExpire() != 0L) {
        setDownloadUrlExpire(other.getDownloadUrlExpire());
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
      com.volcengine.service.vod.model.request.VodGetFileInfosRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodGetFileInfosRequest) e.getUnfinishedMessage();
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
     * <code>string SpaceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
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

    private java.lang.Object encodedFileNames_ = "";
    /**
     * <code>string EncodedFileNames = 2;</code>
     * @return The encodedFileNames.
     */
    public java.lang.String getEncodedFileNames() {
      java.lang.Object ref = encodedFileNames_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encodedFileNames_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string EncodedFileNames = 2;</code>
     * @return The bytes for encodedFileNames.
     */
    public com.google.protobuf.ByteString
        getEncodedFileNamesBytes() {
      java.lang.Object ref = encodedFileNames_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encodedFileNames_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string EncodedFileNames = 2;</code>
     * @param value The encodedFileNames to set.
     * @return This builder for chaining.
     */
    public Builder setEncodedFileNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encodedFileNames_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string EncodedFileNames = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncodedFileNames() {
      
      encodedFileNames_ = getDefaultInstance().getEncodedFileNames();
      onChanged();
      return this;
    }
    /**
     * <code>string EncodedFileNames = 2;</code>
     * @param value The bytes for encodedFileNames to set.
     * @return This builder for chaining.
     */
    public Builder setEncodedFileNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      encodedFileNames_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object bucketName_ = "";
    /**
     * <pre>
     * bucket名
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
     * bucket名
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
     * bucket名
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
     * bucket名
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
     * bucket名
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

    private boolean needDownloadUrl_ ;
    /**
     * <pre>
     * 是否需要下载链接
     * </pre>
     *
     * <code>bool NeedDownloadUrl = 4;</code>
     * @return The needDownloadUrl.
     */
    @java.lang.Override
    public boolean getNeedDownloadUrl() {
      return needDownloadUrl_;
    }
    /**
     * <pre>
     * 是否需要下载链接
     * </pre>
     *
     * <code>bool NeedDownloadUrl = 4;</code>
     * @param value The needDownloadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setNeedDownloadUrl(boolean value) {
      
      needDownloadUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否需要下载链接
     * </pre>
     *
     * <code>bool NeedDownloadUrl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeedDownloadUrl() {
      
      needDownloadUrl_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object downloadUrlNetworkType_ = "";
    /**
     * <pre>
     *下载链接网络类型
     * </pre>
     *
     * <code>string DownloadUrlNetworkType = 5;</code>
     * @return The downloadUrlNetworkType.
     */
    public java.lang.String getDownloadUrlNetworkType() {
      java.lang.Object ref = downloadUrlNetworkType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        downloadUrlNetworkType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *下载链接网络类型
     * </pre>
     *
     * <code>string DownloadUrlNetworkType = 5;</code>
     * @return The bytes for downloadUrlNetworkType.
     */
    public com.google.protobuf.ByteString
        getDownloadUrlNetworkTypeBytes() {
      java.lang.Object ref = downloadUrlNetworkType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        downloadUrlNetworkType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *下载链接网络类型
     * </pre>
     *
     * <code>string DownloadUrlNetworkType = 5;</code>
     * @param value The downloadUrlNetworkType to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUrlNetworkType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      downloadUrlNetworkType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *下载链接网络类型
     * </pre>
     *
     * <code>string DownloadUrlNetworkType = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownloadUrlNetworkType() {
      
      downloadUrlNetworkType_ = getDefaultInstance().getDownloadUrlNetworkType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *下载链接网络类型
     * </pre>
     *
     * <code>string DownloadUrlNetworkType = 5;</code>
     * @param value The bytes for downloadUrlNetworkType to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUrlNetworkTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      downloadUrlNetworkType_ = value;
      onChanged();
      return this;
    }

    private long downloadUrlExpire_ ;
    /**
     * <pre>
     *下载链接过期时间
     * </pre>
     *
     * <code>int64 DownloadUrlExpire = 6;</code>
     * @return The downloadUrlExpire.
     */
    @java.lang.Override
    public long getDownloadUrlExpire() {
      return downloadUrlExpire_;
    }
    /**
     * <pre>
     *下载链接过期时间
     * </pre>
     *
     * <code>int64 DownloadUrlExpire = 6;</code>
     * @param value The downloadUrlExpire to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUrlExpire(long value) {
      
      downloadUrlExpire_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *下载链接过期时间
     * </pre>
     *
     * <code>int64 DownloadUrlExpire = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownloadUrlExpire() {
      
      downloadUrlExpire_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodGetFileInfosRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodGetFileInfosRequest)
  private static final com.volcengine.service.vod.model.request.VodGetFileInfosRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodGetFileInfosRequest();
  }

  public static com.volcengine.service.vod.model.request.VodGetFileInfosRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetFileInfosRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodGetFileInfosRequest>() {
    @java.lang.Override
    public VodGetFileInfosRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetFileInfosRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetFileInfosRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetFileInfosRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodGetFileInfosRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

