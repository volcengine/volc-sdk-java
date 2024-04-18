// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodUpdateDomainPlayRuleRequest}
 */
public final class VodUpdateDomainPlayRuleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodUpdateDomainPlayRuleRequest)
    VodUpdateDomainPlayRuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUpdateDomainPlayRuleRequest.newBuilder() to construct.
  private VodUpdateDomainPlayRuleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUpdateDomainPlayRuleRequest() {
    spaceName_ = "";
    defaultDomain_ = "";
    playRule_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUpdateDomainPlayRuleRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUpdateDomainPlayRuleRequest(
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

            defaultDomain_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            playRule_ = s;
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUpdateDomainPlayRuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUpdateDomainPlayRuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest.class, com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest.Builder.class);
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

  public static final int DEFAULTDOMAIN_FIELD_NUMBER = 2;
  private volatile java.lang.Object defaultDomain_;
  /**
   * <pre>
   *默认域名
   * </pre>
   *
   * <code>string DefaultDomain = 2;</code>
   * @return The defaultDomain.
   */
  @java.lang.Override
  public java.lang.String getDefaultDomain() {
    java.lang.Object ref = defaultDomain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultDomain_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *默认域名
   * </pre>
   *
   * <code>string DefaultDomain = 2;</code>
   * @return The bytes for defaultDomain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDefaultDomainBytes() {
    java.lang.Object ref = defaultDomain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      defaultDomain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYRULE_FIELD_NUMBER = 3;
  private volatile java.lang.Object playRule_;
  /**
   * <pre>
   * 0 随机模式 1 默认域名模式
   * </pre>
   *
   * <code>string PlayRule = 3;</code>
   * @return The playRule.
   */
  @java.lang.Override
  public java.lang.String getPlayRule() {
    java.lang.Object ref = playRule_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      playRule_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 0 随机模式 1 默认域名模式
   * </pre>
   *
   * <code>string PlayRule = 3;</code>
   * @return The bytes for playRule.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlayRuleBytes() {
    java.lang.Object ref = playRule_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      playRule_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultDomain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, defaultDomain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(playRule_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, playRule_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultDomain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, defaultDomain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(playRule_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, playRule_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest other = (com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getDefaultDomain()
        .equals(other.getDefaultDomain())) return false;
    if (!getPlayRule()
        .equals(other.getPlayRule())) return false;
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
    hash = (37 * hash) + DEFAULTDOMAIN_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultDomain().hashCode();
    hash = (37 * hash) + PLAYRULE_FIELD_NUMBER;
    hash = (53 * hash) + getPlayRule().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodUpdateDomainPlayRuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodUpdateDomainPlayRuleRequest)
      com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUpdateDomainPlayRuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUpdateDomainPlayRuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest.class, com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest.newBuilder()
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

      defaultDomain_ = "";

      playRule_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUpdateDomainPlayRuleRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest build() {
      com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest result = new com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest(this);
      result.spaceName_ = spaceName_;
      result.defaultDomain_ = defaultDomain_;
      result.playRule_ = playRule_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getDefaultDomain().isEmpty()) {
        defaultDomain_ = other.defaultDomain_;
        onChanged();
      }
      if (!other.getPlayRule().isEmpty()) {
        playRule_ = other.playRule_;
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
      com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest) e.getUnfinishedMessage();
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

    private java.lang.Object defaultDomain_ = "";
    /**
     * <pre>
     *默认域名
     * </pre>
     *
     * <code>string DefaultDomain = 2;</code>
     * @return The defaultDomain.
     */
    public java.lang.String getDefaultDomain() {
      java.lang.Object ref = defaultDomain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultDomain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *默认域名
     * </pre>
     *
     * <code>string DefaultDomain = 2;</code>
     * @return The bytes for defaultDomain.
     */
    public com.google.protobuf.ByteString
        getDefaultDomainBytes() {
      java.lang.Object ref = defaultDomain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultDomain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *默认域名
     * </pre>
     *
     * <code>string DefaultDomain = 2;</code>
     * @param value The defaultDomain to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultDomain(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      defaultDomain_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *默认域名
     * </pre>
     *
     * <code>string DefaultDomain = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultDomain() {
      
      defaultDomain_ = getDefaultInstance().getDefaultDomain();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *默认域名
     * </pre>
     *
     * <code>string DefaultDomain = 2;</code>
     * @param value The bytes for defaultDomain to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      defaultDomain_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object playRule_ = "";
    /**
     * <pre>
     * 0 随机模式 1 默认域名模式
     * </pre>
     *
     * <code>string PlayRule = 3;</code>
     * @return The playRule.
     */
    public java.lang.String getPlayRule() {
      java.lang.Object ref = playRule_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        playRule_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 0 随机模式 1 默认域名模式
     * </pre>
     *
     * <code>string PlayRule = 3;</code>
     * @return The bytes for playRule.
     */
    public com.google.protobuf.ByteString
        getPlayRuleBytes() {
      java.lang.Object ref = playRule_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playRule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 0 随机模式 1 默认域名模式
     * </pre>
     *
     * <code>string PlayRule = 3;</code>
     * @param value The playRule to set.
     * @return This builder for chaining.
     */
    public Builder setPlayRule(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      playRule_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 0 随机模式 1 默认域名模式
     * </pre>
     *
     * <code>string PlayRule = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayRule() {
      
      playRule_ = getDefaultInstance().getPlayRule();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 0 随机模式 1 默认域名模式
     * </pre>
     *
     * <code>string PlayRule = 3;</code>
     * @param value The bytes for playRule to set.
     * @return This builder for chaining.
     */
    public Builder setPlayRuleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      playRule_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodUpdateDomainPlayRuleRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodUpdateDomainPlayRuleRequest)
  private static final com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest();
  }

  public static com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUpdateDomainPlayRuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodUpdateDomainPlayRuleRequest>() {
    @java.lang.Override
    public VodUpdateDomainPlayRuleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUpdateDomainPlayRuleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUpdateDomainPlayRuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUpdateDomainPlayRuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodUpdateDomainPlayRuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
