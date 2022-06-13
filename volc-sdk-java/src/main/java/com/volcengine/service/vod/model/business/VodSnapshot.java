// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodSnapshot}
 */
public final class VodSnapshot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodSnapshot)
    VodSnapshotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodSnapshot.newBuilder() to construct.
  private VodSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodSnapshot() {
    format_ = "";
    storeUri_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodSnapshot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodSnapshot(
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

            format_ = s;
            break;
          }
          case 16: {

            height_ = input.readInt32();
            break;
          }
          case 24: {

            width_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            storeUri_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            url_ = s;
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
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodSnapshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodSnapshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodSnapshot.class, com.volcengine.service.vod.model.business.VodSnapshot.Builder.class);
  }

  public static final int FORMAT_FIELD_NUMBER = 1;
  private volatile java.lang.Object format_;
  /**
   * <pre>
   *格式
   * </pre>
   *
   * <code>string Format = 1;</code>
   * @return The format.
   */
  @java.lang.Override
  public java.lang.String getFormat() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      format_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *格式
   * </pre>
   *
   * <code>string Format = 1;</code>
   * @return The bytes for format.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFormatBytes() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      format_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private int height_;
  /**
   * <pre>
   *高
   * </pre>
   *
   * <code>int32 Height = 2;</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }

  public static final int WIDTH_FIELD_NUMBER = 3;
  private int width_;
  /**
   * <pre>
   *宽
   * </pre>
   *
   * <code>int32 Width = 3;</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }

  public static final int STOREURI_FIELD_NUMBER = 4;
  private volatile java.lang.Object storeUri_;
  /**
   * <pre>
   *Uri
   * </pre>
   *
   * <code>string StoreUri = 4;</code>
   * @return The storeUri.
   */
  @java.lang.Override
  public java.lang.String getStoreUri() {
    java.lang.Object ref = storeUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *Uri
   * </pre>
   *
   * <code>string StoreUri = 4;</code>
   * @return The bytes for storeUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStoreUriBytes() {
    java.lang.Object ref = storeUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 5;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   *图片地址
   * </pre>
   *
   * <code>string Url = 5;</code>
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
   *图片地址
   * </pre>
   *
   * <code>string Url = 5;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, format_);
    }
    if (height_ != 0) {
      output.writeInt32(2, height_);
    }
    if (width_ != 0) {
      output.writeInt32(3, width_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, storeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, url_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, format_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, height_);
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, width_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, storeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, url_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodSnapshot)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodSnapshot other = (com.volcengine.service.vod.model.business.VodSnapshot) obj;

    if (!getFormat()
        .equals(other.getFormat())) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getWidth()
        != other.getWidth()) return false;
    if (!getStoreUri()
        .equals(other.getStoreUri())) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
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
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getFormat().hashCode();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (37 * hash) + STOREURI_FIELD_NUMBER;
    hash = (53 * hash) + getStoreUri().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodSnapshot parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodSnapshot prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodSnapshot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodSnapshot)
      com.volcengine.service.vod.model.business.VodSnapshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodSnapshot.class, com.volcengine.service.vod.model.business.VodSnapshot.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodSnapshot.newBuilder()
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
      format_ = "";

      height_ = 0;

      width_ = 0;

      storeUri_ = "";

      url_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodSnapshot_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodSnapshot getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodSnapshot.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodSnapshot build() {
      com.volcengine.service.vod.model.business.VodSnapshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodSnapshot buildPartial() {
      com.volcengine.service.vod.model.business.VodSnapshot result = new com.volcengine.service.vod.model.business.VodSnapshot(this);
      result.format_ = format_;
      result.height_ = height_;
      result.width_ = width_;
      result.storeUri_ = storeUri_;
      result.url_ = url_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodSnapshot) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodSnapshot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodSnapshot other) {
      if (other == com.volcengine.service.vod.model.business.VodSnapshot.getDefaultInstance()) return this;
      if (!other.getFormat().isEmpty()) {
        format_ = other.format_;
        onChanged();
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      if (!other.getStoreUri().isEmpty()) {
        storeUri_ = other.storeUri_;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
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
      com.volcengine.service.vod.model.business.VodSnapshot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodSnapshot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object format_ = "";
    /**
     * <pre>
     *格式
     * </pre>
     *
     * <code>string Format = 1;</code>
     * @return The format.
     */
    public java.lang.String getFormat() {
      java.lang.Object ref = format_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        format_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *格式
     * </pre>
     *
     * <code>string Format = 1;</code>
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString
        getFormatBytes() {
      java.lang.Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *格式
     * </pre>
     *
     * <code>string Format = 1;</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *格式
     * </pre>
     *
     * <code>string Format = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      
      format_ = getDefaultInstance().getFormat();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *格式
     * </pre>
     *
     * <code>string Format = 1;</code>
     * @param value The bytes for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      format_ = value;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <pre>
     *高
     * </pre>
     *
     * <code>int32 Height = 2;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     *高
     * </pre>
     *
     * <code>int32 Height = 2;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *高
     * </pre>
     *
     * <code>int32 Height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <pre>
     *宽
     * </pre>
     *
     * <code>int32 Width = 3;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     * <pre>
     *宽
     * </pre>
     *
     * <code>int32 Width = 3;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *宽
     * </pre>
     *
     * <code>int32 Width = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object storeUri_ = "";
    /**
     * <pre>
     *Uri
     * </pre>
     *
     * <code>string StoreUri = 4;</code>
     * @return The storeUri.
     */
    public java.lang.String getStoreUri() {
      java.lang.Object ref = storeUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *Uri
     * </pre>
     *
     * <code>string StoreUri = 4;</code>
     * @return The bytes for storeUri.
     */
    public com.google.protobuf.ByteString
        getStoreUriBytes() {
      java.lang.Object ref = storeUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *Uri
     * </pre>
     *
     * <code>string StoreUri = 4;</code>
     * @param value The storeUri to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      storeUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Uri
     * </pre>
     *
     * <code>string StoreUri = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreUri() {
      
      storeUri_ = getDefaultInstance().getStoreUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Uri
     * </pre>
     *
     * <code>string StoreUri = 4;</code>
     * @param value The bytes for storeUri to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      storeUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     *图片地址
     * </pre>
     *
     * <code>string Url = 5;</code>
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
     *图片地址
     * </pre>
     *
     * <code>string Url = 5;</code>
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
     *图片地址
     * </pre>
     *
     * <code>string Url = 5;</code>
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
     *图片地址
     * </pre>
     *
     * <code>string Url = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *图片地址
     * </pre>
     *
     * <code>string Url = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodSnapshot)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodSnapshot)
  private static final com.volcengine.service.vod.model.business.VodSnapshot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodSnapshot();
  }

  public static com.volcengine.service.vod.model.business.VodSnapshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodSnapshot>
      PARSER = new com.google.protobuf.AbstractParser<VodSnapshot>() {
    @java.lang.Override
    public VodSnapshot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodSnapshot(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodSnapshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodSnapshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodSnapshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

