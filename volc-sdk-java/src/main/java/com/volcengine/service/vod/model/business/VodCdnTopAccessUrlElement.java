// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement}
 */
public final class VodCdnTopAccessUrlElement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement)
    VodCdnTopAccessUrlElementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodCdnTopAccessUrlElement.newBuilder() to construct.
  private VodCdnTopAccessUrlElement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodCdnTopAccessUrlElement() {
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodCdnTopAccessUrlElement();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodCdnTopAccessUrlElement(
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
          case 16: {

            pv_ = input.readInt64();
            break;
          }
          case 24: {

            flux_ = input.readInt64();
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
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessUrlElement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessUrlElement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement.class, com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * URL
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
   * URL
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

  public static final int PV_FIELD_NUMBER = 2;
  private long pv_;
  /**
   * <pre>
   * 请求次数计数
   * </pre>
   *
   * <code>int64 Pv = 2;</code>
   * @return The pv.
   */
  @java.lang.Override
  public long getPv() {
    return pv_;
  }

  public static final int FLUX_FIELD_NUMBER = 3;
  private long flux_;
  /**
   * <pre>
   * 流量计数，单位：Byte
   * </pre>
   *
   * <code>int64 Flux = 3;</code>
   * @return The flux.
   */
  @java.lang.Override
  public long getFlux() {
    return flux_;
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
    if (!getUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (pv_ != 0L) {
      output.writeInt64(2, pv_);
    }
    if (flux_ != 0L) {
      output.writeInt64(3, flux_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (pv_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, pv_);
    }
    if (flux_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, flux_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement other = (com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement) obj;

    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (getPv()
        != other.getPv()) return false;
    if (getFlux()
        != other.getFlux()) return false;
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
    hash = (37 * hash) + PV_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPv());
    hash = (37 * hash) + FLUX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFlux());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement)
      com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessUrlElement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessUrlElement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement.class, com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement.newBuilder()
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

      pv_ = 0L;

      flux_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessUrlElement_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement build() {
      com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement buildPartial() {
      com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement result = new com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement(this);
      result.url_ = url_;
      result.pv_ = pv_;
      result.flux_ = flux_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement other) {
      if (other == com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (other.getPv() != 0L) {
        setPv(other.getPv());
      }
      if (other.getFlux() != 0L) {
        setFlux(other.getFlux());
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
      com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement) e.getUnfinishedMessage();
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
     * URL
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
     * URL
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
     * URL
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
     * URL
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
     * URL
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

    private long pv_ ;
    /**
     * <pre>
     * 请求次数计数
     * </pre>
     *
     * <code>int64 Pv = 2;</code>
     * @return The pv.
     */
    @java.lang.Override
    public long getPv() {
      return pv_;
    }
    /**
     * <pre>
     * 请求次数计数
     * </pre>
     *
     * <code>int64 Pv = 2;</code>
     * @param value The pv to set.
     * @return This builder for chaining.
     */
    public Builder setPv(long value) {
      
      pv_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求次数计数
     * </pre>
     *
     * <code>int64 Pv = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPv() {
      
      pv_ = 0L;
      onChanged();
      return this;
    }

    private long flux_ ;
    /**
     * <pre>
     * 流量计数，单位：Byte
     * </pre>
     *
     * <code>int64 Flux = 3;</code>
     * @return The flux.
     */
    @java.lang.Override
    public long getFlux() {
      return flux_;
    }
    /**
     * <pre>
     * 流量计数，单位：Byte
     * </pre>
     *
     * <code>int64 Flux = 3;</code>
     * @param value The flux to set.
     * @return This builder for chaining.
     */
    public Builder setFlux(long value) {
      
      flux_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 流量计数，单位：Byte
     * </pre>
     *
     * <code>int64 Flux = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlux() {
      
      flux_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement)
  private static final com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement();
  }

  public static com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodCdnTopAccessUrlElement>
      PARSER = new com.google.protobuf.AbstractParser<VodCdnTopAccessUrlElement>() {
    @java.lang.Override
    public VodCdnTopAccessUrlElement parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodCdnTopAccessUrlElement(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodCdnTopAccessUrlElement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodCdnTopAccessUrlElement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

