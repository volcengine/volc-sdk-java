// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_space.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.CustomPosterConfig}
 */
public final class CustomPosterConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.CustomPosterConfig)
    CustomPosterConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomPosterConfig.newBuilder() to construct.
  private CustomPosterConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomPosterConfig() {
    customTemplateStatus_ = "";
    pathTemplate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomPosterConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomPosterConfig(
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

            customTemplateStatus_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            pathTemplate_ = s;
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
    return com.volcengine.service.vod.model.business.VodSpace.internal_static_Volcengine_Vod_Models_Business_CustomPosterConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodSpace.internal_static_Volcengine_Vod_Models_Business_CustomPosterConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.CustomPosterConfig.class, com.volcengine.service.vod.model.business.CustomPosterConfig.Builder.class);
  }

  public static final int CUSTOMTEMPLATESTATUS_FIELD_NUMBER = 1;
  private volatile java.lang.Object customTemplateStatus_;
  /**
   * <code>string CustomTemplateStatus = 1;</code>
   * @return The customTemplateStatus.
   */
  @java.lang.Override
  public java.lang.String getCustomTemplateStatus() {
    java.lang.Object ref = customTemplateStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customTemplateStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string CustomTemplateStatus = 1;</code>
   * @return The bytes for customTemplateStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomTemplateStatusBytes() {
    java.lang.Object ref = customTemplateStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customTemplateStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATHTEMPLATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object pathTemplate_;
  /**
   * <code>string PathTemplate = 2;</code>
   * @return The pathTemplate.
   */
  @java.lang.Override
  public java.lang.String getPathTemplate() {
    java.lang.Object ref = pathTemplate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pathTemplate_ = s;
      return s;
    }
  }
  /**
   * <code>string PathTemplate = 2;</code>
   * @return The bytes for pathTemplate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathTemplateBytes() {
    java.lang.Object ref = pathTemplate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pathTemplate_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customTemplateStatus_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customTemplateStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pathTemplate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pathTemplate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customTemplateStatus_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customTemplateStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pathTemplate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pathTemplate_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.CustomPosterConfig)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.CustomPosterConfig other = (com.volcengine.service.vod.model.business.CustomPosterConfig) obj;

    if (!getCustomTemplateStatus()
        .equals(other.getCustomTemplateStatus())) return false;
    if (!getPathTemplate()
        .equals(other.getPathTemplate())) return false;
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
    hash = (37 * hash) + CUSTOMTEMPLATESTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getCustomTemplateStatus().hashCode();
    hash = (37 * hash) + PATHTEMPLATE_FIELD_NUMBER;
    hash = (53 * hash) + getPathTemplate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.CustomPosterConfig parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.CustomPosterConfig prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.CustomPosterConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.CustomPosterConfig)
      com.volcengine.service.vod.model.business.CustomPosterConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodSpace.internal_static_Volcengine_Vod_Models_Business_CustomPosterConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodSpace.internal_static_Volcengine_Vod_Models_Business_CustomPosterConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.CustomPosterConfig.class, com.volcengine.service.vod.model.business.CustomPosterConfig.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.CustomPosterConfig.newBuilder()
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
      customTemplateStatus_ = "";

      pathTemplate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodSpace.internal_static_Volcengine_Vod_Models_Business_CustomPosterConfig_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.CustomPosterConfig getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.CustomPosterConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.CustomPosterConfig build() {
      com.volcengine.service.vod.model.business.CustomPosterConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.CustomPosterConfig buildPartial() {
      com.volcengine.service.vod.model.business.CustomPosterConfig result = new com.volcengine.service.vod.model.business.CustomPosterConfig(this);
      result.customTemplateStatus_ = customTemplateStatus_;
      result.pathTemplate_ = pathTemplate_;
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
      if (other instanceof com.volcengine.service.vod.model.business.CustomPosterConfig) {
        return mergeFrom((com.volcengine.service.vod.model.business.CustomPosterConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.CustomPosterConfig other) {
      if (other == com.volcengine.service.vod.model.business.CustomPosterConfig.getDefaultInstance()) return this;
      if (!other.getCustomTemplateStatus().isEmpty()) {
        customTemplateStatus_ = other.customTemplateStatus_;
        onChanged();
      }
      if (!other.getPathTemplate().isEmpty()) {
        pathTemplate_ = other.pathTemplate_;
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
      com.volcengine.service.vod.model.business.CustomPosterConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.CustomPosterConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customTemplateStatus_ = "";
    /**
     * <code>string CustomTemplateStatus = 1;</code>
     * @return The customTemplateStatus.
     */
    public java.lang.String getCustomTemplateStatus() {
      java.lang.Object ref = customTemplateStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customTemplateStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CustomTemplateStatus = 1;</code>
     * @return The bytes for customTemplateStatus.
     */
    public com.google.protobuf.ByteString
        getCustomTemplateStatusBytes() {
      java.lang.Object ref = customTemplateStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customTemplateStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CustomTemplateStatus = 1;</code>
     * @param value The customTemplateStatus to set.
     * @return This builder for chaining.
     */
    public Builder setCustomTemplateStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customTemplateStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CustomTemplateStatus = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomTemplateStatus() {
      
      customTemplateStatus_ = getDefaultInstance().getCustomTemplateStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string CustomTemplateStatus = 1;</code>
     * @param value The bytes for customTemplateStatus to set.
     * @return This builder for chaining.
     */
    public Builder setCustomTemplateStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customTemplateStatus_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pathTemplate_ = "";
    /**
     * <code>string PathTemplate = 2;</code>
     * @return The pathTemplate.
     */
    public java.lang.String getPathTemplate() {
      java.lang.Object ref = pathTemplate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pathTemplate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PathTemplate = 2;</code>
     * @return The bytes for pathTemplate.
     */
    public com.google.protobuf.ByteString
        getPathTemplateBytes() {
      java.lang.Object ref = pathTemplate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pathTemplate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PathTemplate = 2;</code>
     * @param value The pathTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setPathTemplate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pathTemplate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PathTemplate = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPathTemplate() {
      
      pathTemplate_ = getDefaultInstance().getPathTemplate();
      onChanged();
      return this;
    }
    /**
     * <code>string PathTemplate = 2;</code>
     * @param value The bytes for pathTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setPathTemplateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pathTemplate_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.CustomPosterConfig)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.CustomPosterConfig)
  private static final com.volcengine.service.vod.model.business.CustomPosterConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.CustomPosterConfig();
  }

  public static com.volcengine.service.vod.model.business.CustomPosterConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomPosterConfig>
      PARSER = new com.google.protobuf.AbstractParser<CustomPosterConfig>() {
    @java.lang.Override
    public CustomPosterConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomPosterConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomPosterConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomPosterConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.CustomPosterConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

