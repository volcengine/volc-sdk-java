// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodVerifyDomainOwnerResult}
 */
public final class VodVerifyDomainOwnerResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodVerifyDomainOwnerResult)
    VodVerifyDomainOwnerResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodVerifyDomainOwnerResult.newBuilder() to construct.
  private VodVerifyDomainOwnerResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodVerifyDomainOwnerResult() {
    errorMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodVerifyDomainOwnerResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodVerifyDomainOwnerResult(
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
          case 8: {

            verifyResult_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
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
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodVerifyDomainOwnerResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodVerifyDomainOwnerResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult.class, com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult.Builder.class);
  }

  public static final int VERIFYRESULT_FIELD_NUMBER = 1;
  private boolean verifyResult_;
  /**
   * <pre>
   * 校验是否成功，true-校验成功，false-校验失败
   * </pre>
   *
   * <code>bool VerifyResult = 1;</code>
   * @return The verifyResult.
   */
  @java.lang.Override
  public boolean getVerifyResult() {
    return verifyResult_;
  }

  public static final int ERRORMESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object errorMessage_;
  /**
   * <pre>
   * 校验失败的原因（Status=false时返回）
   * </pre>
   *
   * <code>string ErrorMessage = 2;</code>
   * @return The errorMessage.
   */
  @java.lang.Override
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 校验失败的原因（Status=false时返回）
   * </pre>
   *
   * <code>string ErrorMessage = 2;</code>
   * @return The bytes for errorMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
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
    if (verifyResult_ != false) {
      output.writeBool(1, verifyResult_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (verifyResult_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, verifyResult_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorMessage_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult other = (com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult) obj;

    if (getVerifyResult()
        != other.getVerifyResult()) return false;
    if (!getErrorMessage()
        .equals(other.getErrorMessage())) return false;
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
    hash = (37 * hash) + VERIFYRESULT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVerifyResult());
    hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodVerifyDomainOwnerResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodVerifyDomainOwnerResult)
      com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodVerifyDomainOwnerResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodVerifyDomainOwnerResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult.class, com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult.newBuilder()
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
      verifyResult_ = false;

      errorMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodVerifyDomainOwnerResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult build() {
      com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult buildPartial() {
      com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult result = new com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult(this);
      result.verifyResult_ = verifyResult_;
      result.errorMessage_ = errorMessage_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult other) {
      if (other == com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult.getDefaultInstance()) return this;
      if (other.getVerifyResult() != false) {
        setVerifyResult(other.getVerifyResult());
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
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
      com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean verifyResult_ ;
    /**
     * <pre>
     * 校验是否成功，true-校验成功，false-校验失败
     * </pre>
     *
     * <code>bool VerifyResult = 1;</code>
     * @return The verifyResult.
     */
    @java.lang.Override
    public boolean getVerifyResult() {
      return verifyResult_;
    }
    /**
     * <pre>
     * 校验是否成功，true-校验成功，false-校验失败
     * </pre>
     *
     * <code>bool VerifyResult = 1;</code>
     * @param value The verifyResult to set.
     * @return This builder for chaining.
     */
    public Builder setVerifyResult(boolean value) {
      
      verifyResult_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 校验是否成功，true-校验成功，false-校验失败
     * </pre>
     *
     * <code>bool VerifyResult = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerifyResult() {
      
      verifyResult_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <pre>
     * 校验失败的原因（Status=false时返回）
     * </pre>
     *
     * <code>string ErrorMessage = 2;</code>
     * @return The errorMessage.
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 校验失败的原因（Status=false时返回）
     * </pre>
     *
     * <code>string ErrorMessage = 2;</code>
     * @return The bytes for errorMessage.
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 校验失败的原因（Status=false时返回）
     * </pre>
     *
     * <code>string ErrorMessage = 2;</code>
     * @param value The errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 校验失败的原因（Status=false时返回）
     * </pre>
     *
     * <code>string ErrorMessage = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 校验失败的原因（Status=false时返回）
     * </pre>
     *
     * <code>string ErrorMessage = 2;</code>
     * @param value The bytes for errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodVerifyDomainOwnerResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodVerifyDomainOwnerResult)
  private static final com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult();
  }

  public static com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodVerifyDomainOwnerResult>
      PARSER = new com.google.protobuf.AbstractParser<VodVerifyDomainOwnerResult>() {
    @java.lang.Override
    public VodVerifyDomainOwnerResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodVerifyDomainOwnerResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodVerifyDomainOwnerResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodVerifyDomainOwnerResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodVerifyDomainOwnerResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

