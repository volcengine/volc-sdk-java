// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodDescribeDomainConfigRequest}
 */
public final class VodDescribeDomainConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodDescribeDomainConfigRequest)
    VodDescribeDomainConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDescribeDomainConfigRequest.newBuilder() to construct.
  private VodDescribeDomainConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDescribeDomainConfigRequest() {
    spaceName_ = "";
    domainType_ = "";
    domain_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDescribeDomainConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDescribeDomainConfigRequest(
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

            domainType_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            domain_ = s;
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDomainConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDomainConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest.class, com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 点播空间名称
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
   * 点播空间名称
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

  public static final int DOMAINTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object domainType_;
  /**
   * <pre>
   * 域名类型（play、image）
   * </pre>
   *
   * <code>string DomainType = 2;</code>
   * @return The domainType.
   */
  @java.lang.Override
  public java.lang.String getDomainType() {
    java.lang.Object ref = domainType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domainType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 域名类型（play、image）
   * </pre>
   *
   * <code>string DomainType = 2;</code>
   * @return The bytes for domainType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainTypeBytes() {
    java.lang.Object ref = domainType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domainType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOMAIN_FIELD_NUMBER = 3;
  private volatile java.lang.Object domain_;
  /**
   * <pre>
   * 指定一个加速域名修改其配置
   * </pre>
   *
   * <code>string Domain = 3;</code>
   * @return The domain.
   */
  @java.lang.Override
  public java.lang.String getDomain() {
    java.lang.Object ref = domain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domain_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 指定一个加速域名修改其配置
   * </pre>
   *
   * <code>string Domain = 3;</code>
   * @return The bytes for domain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainBytes() {
    java.lang.Object ref = domain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domain_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, domainType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, domain_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, domainType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, domain_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest other = (com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getDomainType()
        .equals(other.getDomainType())) return false;
    if (!getDomain()
        .equals(other.getDomain())) return false;
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
    hash = (37 * hash) + DOMAINTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDomainType().hashCode();
    hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
    hash = (53 * hash) + getDomain().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodDescribeDomainConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodDescribeDomainConfigRequest)
      com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDomainConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDomainConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest.class, com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest.newBuilder()
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

      domainType_ = "";

      domain_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDomainConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest build() {
      com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest result = new com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest(this);
      result.spaceName_ = spaceName_;
      result.domainType_ = domainType_;
      result.domain_ = domain_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getDomainType().isEmpty()) {
        domainType_ = other.domainType_;
        onChanged();
      }
      if (!other.getDomain().isEmpty()) {
        domain_ = other.domain_;
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
      com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest) e.getUnfinishedMessage();
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
     * 点播空间名称
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
     * 点播空间名称
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
     * 点播空间名称
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
     * 点播空间名称
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
     * 点播空间名称
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

    private java.lang.Object domainType_ = "";
    /**
     * <pre>
     * 域名类型（play、image）
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @return The domainType.
     */
    public java.lang.String getDomainType() {
      java.lang.Object ref = domainType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domainType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 域名类型（play、image）
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @return The bytes for domainType.
     */
    public com.google.protobuf.ByteString
        getDomainTypeBytes() {
      java.lang.Object ref = domainType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domainType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 域名类型（play、image）
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @param value The domainType to set.
     * @return This builder for chaining.
     */
    public Builder setDomainType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domainType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 域名类型（play、image）
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomainType() {
      
      domainType_ = getDefaultInstance().getDomainType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 域名类型（play、image）
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @param value The bytes for domainType to set.
     * @return This builder for chaining.
     */
    public Builder setDomainTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domainType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object domain_ = "";
    /**
     * <pre>
     * 指定一个加速域名修改其配置
     * </pre>
     *
     * <code>string Domain = 3;</code>
     * @return The domain.
     */
    public java.lang.String getDomain() {
      java.lang.Object ref = domain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 指定一个加速域名修改其配置
     * </pre>
     *
     * <code>string Domain = 3;</code>
     * @return The bytes for domain.
     */
    public com.google.protobuf.ByteString
        getDomainBytes() {
      java.lang.Object ref = domain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 指定一个加速域名修改其配置
     * </pre>
     *
     * <code>string Domain = 3;</code>
     * @param value The domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomain(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domain_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 指定一个加速域名修改其配置
     * </pre>
     *
     * <code>string Domain = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomain() {
      
      domain_ = getDefaultInstance().getDomain();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 指定一个加速域名修改其配置
     * </pre>
     *
     * <code>string Domain = 3;</code>
     * @param value The bytes for domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domain_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodDescribeDomainConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodDescribeDomainConfigRequest)
  private static final com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest();
  }

  public static com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDescribeDomainConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodDescribeDomainConfigRequest>() {
    @java.lang.Override
    public VodDescribeDomainConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDescribeDomainConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDescribeDomainConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodDescribeDomainConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodDescribeDomainConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

