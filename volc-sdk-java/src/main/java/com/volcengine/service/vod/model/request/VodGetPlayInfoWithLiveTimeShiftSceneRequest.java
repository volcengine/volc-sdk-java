// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodGetPlayInfoWithLiveTimeShiftSceneRequest}
 */
public final class VodGetPlayInfoWithLiveTimeShiftSceneRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodGetPlayInfoWithLiveTimeShiftSceneRequest)
    VodGetPlayInfoWithLiveTimeShiftSceneRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetPlayInfoWithLiveTimeShiftSceneRequest.newBuilder() to construct.
  private VodGetPlayInfoWithLiveTimeShiftSceneRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetPlayInfoWithLiveTimeShiftSceneRequest() {
    storeUris_ = "";
    spaceName_ = "";
    ssl_ = "";
    expireTimestamp_ = "";
    needComposeBucketName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetPlayInfoWithLiveTimeShiftSceneRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetPlayInfoWithLiveTimeShiftSceneRequest(
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

            storeUris_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            spaceName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            ssl_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            expireTimestamp_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            needComposeBucketName_ = s;
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetPlayInfoWithLiveTimeShiftSceneRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetPlayInfoWithLiveTimeShiftSceneRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest.class, com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest.Builder.class);
  }

  public static final int STOREURIS_FIELD_NUMBER = 1;
  private volatile java.lang.Object storeUris_;
  /**
   * <pre>
   * 播放URI
   * </pre>
   *
   * <code>string StoreUris = 1;</code>
   * @return The storeUris.
   */
  @java.lang.Override
  public java.lang.String getStoreUris() {
    java.lang.Object ref = storeUris_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeUris_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 播放URI
   * </pre>
   *
   * <code>string StoreUris = 1;</code>
   * @return The bytes for storeUris.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStoreUrisBytes() {
    java.lang.Object ref = storeUris_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeUris_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPACENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 空间名称
   * </pre>
   *
   * <code>string SpaceName = 2;</code>
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
   * 空间名称
   * </pre>
   *
   * <code>string SpaceName = 2;</code>
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

  public static final int SSL_FIELD_NUMBER = 3;
  private volatile java.lang.Object ssl_;
  /**
   * <pre>
   *返回https播放地址，默认否, 1-是；0-否
   * </pre>
   *
   * <code>string Ssl = 3;</code>
   * @return The ssl.
   */
  @java.lang.Override
  public java.lang.String getSsl() {
    java.lang.Object ref = ssl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ssl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *返回https播放地址，默认否, 1-是；0-否
   * </pre>
   *
   * <code>string Ssl = 3;</code>
   * @return The bytes for ssl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSslBytes() {
    java.lang.Object ref = ssl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ssl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRETIMESTAMP_FIELD_NUMBER = 4;
  private volatile java.lang.Object expireTimestamp_;
  /**
   * <pre>
   * 过期时间戳：毫秒。若不传，则为当前时间+1小时
   * </pre>
   *
   * <code>string ExpireTimestamp = 4;</code>
   * @return The expireTimestamp.
   */
  @java.lang.Override
  public java.lang.String getExpireTimestamp() {
    java.lang.Object ref = expireTimestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expireTimestamp_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 过期时间戳：毫秒。若不传，则为当前时间+1小时
   * </pre>
   *
   * <code>string ExpireTimestamp = 4;</code>
   * @return The bytes for expireTimestamp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExpireTimestampBytes() {
    java.lang.Object ref = expireTimestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expireTimestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEEDCOMPOSEBUCKETNAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object needComposeBucketName_;
  /**
   * <pre>
   *生成地址时填充BucketName，默认否, 1-是；0-否
   * </pre>
   *
   * <code>string NeedComposeBucketName = 5;</code>
   * @return The needComposeBucketName.
   */
  @java.lang.Override
  public java.lang.String getNeedComposeBucketName() {
    java.lang.Object ref = needComposeBucketName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      needComposeBucketName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *生成地址时填充BucketName，默认否, 1-是；0-否
   * </pre>
   *
   * <code>string NeedComposeBucketName = 5;</code>
   * @return The bytes for needComposeBucketName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNeedComposeBucketNameBytes() {
    java.lang.Object ref = needComposeBucketName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      needComposeBucketName_ = b;
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
    if (!getStoreUrisBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, storeUris_);
    }
    if (!getSpaceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, spaceName_);
    }
    if (!getSslBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ssl_);
    }
    if (!getExpireTimestampBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, expireTimestamp_);
    }
    if (!getNeedComposeBucketNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, needComposeBucketName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStoreUrisBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, storeUris_);
    }
    if (!getSpaceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, spaceName_);
    }
    if (!getSslBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ssl_);
    }
    if (!getExpireTimestampBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, expireTimestamp_);
    }
    if (!getNeedComposeBucketNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, needComposeBucketName_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest other = (com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest) obj;

    if (!getStoreUris()
        .equals(other.getStoreUris())) return false;
    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getSsl()
        .equals(other.getSsl())) return false;
    if (!getExpireTimestamp()
        .equals(other.getExpireTimestamp())) return false;
    if (!getNeedComposeBucketName()
        .equals(other.getNeedComposeBucketName())) return false;
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
    hash = (37 * hash) + STOREURIS_FIELD_NUMBER;
    hash = (53 * hash) + getStoreUris().hashCode();
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (37 * hash) + SSL_FIELD_NUMBER;
    hash = (53 * hash) + getSsl().hashCode();
    hash = (37 * hash) + EXPIRETIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getExpireTimestamp().hashCode();
    hash = (37 * hash) + NEEDCOMPOSEBUCKETNAME_FIELD_NUMBER;
    hash = (53 * hash) + getNeedComposeBucketName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodGetPlayInfoWithLiveTimeShiftSceneRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodGetPlayInfoWithLiveTimeShiftSceneRequest)
      com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetPlayInfoWithLiveTimeShiftSceneRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetPlayInfoWithLiveTimeShiftSceneRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest.class, com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest.newBuilder()
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
      storeUris_ = "";

      spaceName_ = "";

      ssl_ = "";

      expireTimestamp_ = "";

      needComposeBucketName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodGetPlayInfoWithLiveTimeShiftSceneRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest build() {
      com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest result = new com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest(this);
      result.storeUris_ = storeUris_;
      result.spaceName_ = spaceName_;
      result.ssl_ = ssl_;
      result.expireTimestamp_ = expireTimestamp_;
      result.needComposeBucketName_ = needComposeBucketName_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest.getDefaultInstance()) return this;
      if (!other.getStoreUris().isEmpty()) {
        storeUris_ = other.storeUris_;
        onChanged();
      }
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getSsl().isEmpty()) {
        ssl_ = other.ssl_;
        onChanged();
      }
      if (!other.getExpireTimestamp().isEmpty()) {
        expireTimestamp_ = other.expireTimestamp_;
        onChanged();
      }
      if (!other.getNeedComposeBucketName().isEmpty()) {
        needComposeBucketName_ = other.needComposeBucketName_;
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
      com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object storeUris_ = "";
    /**
     * <pre>
     * 播放URI
     * </pre>
     *
     * <code>string StoreUris = 1;</code>
     * @return The storeUris.
     */
    public java.lang.String getStoreUris() {
      java.lang.Object ref = storeUris_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeUris_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 播放URI
     * </pre>
     *
     * <code>string StoreUris = 1;</code>
     * @return The bytes for storeUris.
     */
    public com.google.protobuf.ByteString
        getStoreUrisBytes() {
      java.lang.Object ref = storeUris_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeUris_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 播放URI
     * </pre>
     *
     * <code>string StoreUris = 1;</code>
     * @param value The storeUris to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUris(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      storeUris_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放URI
     * </pre>
     *
     * <code>string StoreUris = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreUris() {
      
      storeUris_ = getDefaultInstance().getStoreUris();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放URI
     * </pre>
     *
     * <code>string StoreUris = 1;</code>
     * @param value The bytes for storeUris to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUrisBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      storeUris_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object spaceName_ = "";
    /**
     * <pre>
     * 空间名称
     * </pre>
     *
     * <code>string SpaceName = 2;</code>
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
     * 空间名称
     * </pre>
     *
     * <code>string SpaceName = 2;</code>
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
     * 空间名称
     * </pre>
     *
     * <code>string SpaceName = 2;</code>
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
     * 空间名称
     * </pre>
     *
     * <code>string SpaceName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 空间名称
     * </pre>
     *
     * <code>string SpaceName = 2;</code>
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

    private java.lang.Object ssl_ = "";
    /**
     * <pre>
     *返回https播放地址，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string Ssl = 3;</code>
     * @return The ssl.
     */
    public java.lang.String getSsl() {
      java.lang.Object ref = ssl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ssl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *返回https播放地址，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string Ssl = 3;</code>
     * @return The bytes for ssl.
     */
    public com.google.protobuf.ByteString
        getSslBytes() {
      java.lang.Object ref = ssl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ssl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *返回https播放地址，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string Ssl = 3;</code>
     * @param value The ssl to set.
     * @return This builder for chaining.
     */
    public Builder setSsl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ssl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *返回https播放地址，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string Ssl = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSsl() {
      
      ssl_ = getDefaultInstance().getSsl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *返回https播放地址，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string Ssl = 3;</code>
     * @param value The bytes for ssl to set.
     * @return This builder for chaining.
     */
    public Builder setSslBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ssl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expireTimestamp_ = "";
    /**
     * <pre>
     * 过期时间戳：毫秒。若不传，则为当前时间+1小时
     * </pre>
     *
     * <code>string ExpireTimestamp = 4;</code>
     * @return The expireTimestamp.
     */
    public java.lang.String getExpireTimestamp() {
      java.lang.Object ref = expireTimestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expireTimestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 过期时间戳：毫秒。若不传，则为当前时间+1小时
     * </pre>
     *
     * <code>string ExpireTimestamp = 4;</code>
     * @return The bytes for expireTimestamp.
     */
    public com.google.protobuf.ByteString
        getExpireTimestampBytes() {
      java.lang.Object ref = expireTimestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expireTimestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 过期时间戳：毫秒。若不传，则为当前时间+1小时
     * </pre>
     *
     * <code>string ExpireTimestamp = 4;</code>
     * @param value The expireTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setExpireTimestamp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expireTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 过期时间戳：毫秒。若不传，则为当前时间+1小时
     * </pre>
     *
     * <code>string ExpireTimestamp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpireTimestamp() {
      
      expireTimestamp_ = getDefaultInstance().getExpireTimestamp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 过期时间戳：毫秒。若不传，则为当前时间+1小时
     * </pre>
     *
     * <code>string ExpireTimestamp = 4;</code>
     * @param value The bytes for expireTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setExpireTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      expireTimestamp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object needComposeBucketName_ = "";
    /**
     * <pre>
     *生成地址时填充BucketName，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string NeedComposeBucketName = 5;</code>
     * @return The needComposeBucketName.
     */
    public java.lang.String getNeedComposeBucketName() {
      java.lang.Object ref = needComposeBucketName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        needComposeBucketName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *生成地址时填充BucketName，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string NeedComposeBucketName = 5;</code>
     * @return The bytes for needComposeBucketName.
     */
    public com.google.protobuf.ByteString
        getNeedComposeBucketNameBytes() {
      java.lang.Object ref = needComposeBucketName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        needComposeBucketName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *生成地址时填充BucketName，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string NeedComposeBucketName = 5;</code>
     * @param value The needComposeBucketName to set.
     * @return This builder for chaining.
     */
    public Builder setNeedComposeBucketName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      needComposeBucketName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *生成地址时填充BucketName，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string NeedComposeBucketName = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeedComposeBucketName() {
      
      needComposeBucketName_ = getDefaultInstance().getNeedComposeBucketName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *生成地址时填充BucketName，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string NeedComposeBucketName = 5;</code>
     * @param value The bytes for needComposeBucketName to set.
     * @return This builder for chaining.
     */
    public Builder setNeedComposeBucketNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      needComposeBucketName_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodGetPlayInfoWithLiveTimeShiftSceneRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodGetPlayInfoWithLiveTimeShiftSceneRequest)
  private static final com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest();
  }

  public static com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetPlayInfoWithLiveTimeShiftSceneRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodGetPlayInfoWithLiveTimeShiftSceneRequest>() {
    @java.lang.Override
    public VodGetPlayInfoWithLiveTimeShiftSceneRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetPlayInfoWithLiveTimeShiftSceneRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetPlayInfoWithLiveTimeShiftSceneRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetPlayInfoWithLiveTimeShiftSceneRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
