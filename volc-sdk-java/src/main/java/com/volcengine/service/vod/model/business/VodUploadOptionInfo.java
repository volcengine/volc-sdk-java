// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodUploadOptionInfo}
 */
public final class VodUploadOptionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodUploadOptionInfo)
    VodUploadOptionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUploadOptionInfo.newBuilder() to construct.
  private VodUploadOptionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUploadOptionInfo() {
    templateId_ = "";
    templateIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    templates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUploadOptionInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUploadOptionInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            templateId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              templateIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            templateIds_.add(s);
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              templates_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodUploadTemplate>();
              mutable_bitField0_ |= 0x00000002;
            }
            templates_.add(
                input.readMessage(com.volcengine.service.vod.model.business.VodUploadTemplate.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        templateIds_ = templateIds_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        templates_ = java.util.Collections.unmodifiableList(templates_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadOptionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadOptionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodUploadOptionInfo.class, com.volcengine.service.vod.model.business.VodUploadOptionInfo.Builder.class);
  }

  public static final int TEMPLATEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object templateId_;
  /**
   * <code>string TemplateId = 1;</code>
   * @return The templateId.
   */
  @java.lang.Override
  public java.lang.String getTemplateId() {
    java.lang.Object ref = templateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      templateId_ = s;
      return s;
    }
  }
  /**
   * <code>string TemplateId = 1;</code>
   * @return The bytes for templateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTemplateIdBytes() {
    java.lang.Object ref = templateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      templateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPLATEIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList templateIds_;
  /**
   * <code>repeated string TemplateIds = 2;</code>
   * @return A list containing the templateIds.
   */
  public com.google.protobuf.ProtocolStringList
      getTemplateIdsList() {
    return templateIds_;
  }
  /**
   * <code>repeated string TemplateIds = 2;</code>
   * @return The count of templateIds.
   */
  public int getTemplateIdsCount() {
    return templateIds_.size();
  }
  /**
   * <code>repeated string TemplateIds = 2;</code>
   * @param index The index of the element to return.
   * @return The templateIds at the given index.
   */
  public java.lang.String getTemplateIds(int index) {
    return templateIds_.get(index);
  }
  /**
   * <code>repeated string TemplateIds = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the templateIds at the given index.
   */
  public com.google.protobuf.ByteString
      getTemplateIdsBytes(int index) {
    return templateIds_.getByteString(index);
  }

  public static final int TEMPLATES_FIELD_NUMBER = 3;
  private java.util.List<com.volcengine.service.vod.model.business.VodUploadTemplate> templates_;
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.VodUploadTemplate> getTemplatesList() {
    return templates_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder> 
      getTemplatesOrBuilderList() {
    return templates_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  @java.lang.Override
  public int getTemplatesCount() {
    return templates_.size();
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodUploadTemplate getTemplates(int index) {
    return templates_.get(index);
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder getTemplatesOrBuilder(
      int index) {
    return templates_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(templateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, templateId_);
    }
    for (int i = 0; i < templateIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, templateIds_.getRaw(i));
    }
    for (int i = 0; i < templates_.size(); i++) {
      output.writeMessage(3, templates_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(templateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, templateId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < templateIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(templateIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTemplateIdsList().size();
    }
    for (int i = 0; i < templates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, templates_.get(i));
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodUploadOptionInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodUploadOptionInfo other = (com.volcengine.service.vod.model.business.VodUploadOptionInfo) obj;

    if (!getTemplateId()
        .equals(other.getTemplateId())) return false;
    if (!getTemplateIdsList()
        .equals(other.getTemplateIdsList())) return false;
    if (!getTemplatesList()
        .equals(other.getTemplatesList())) return false;
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
    hash = (37 * hash) + TEMPLATEID_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateId().hashCode();
    if (getTemplateIdsCount() > 0) {
      hash = (37 * hash) + TEMPLATEIDS_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateIdsList().hashCode();
    }
    if (getTemplatesCount() > 0) {
      hash = (37 * hash) + TEMPLATES_FIELD_NUMBER;
      hash = (53 * hash) + getTemplatesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodUploadOptionInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodUploadOptionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodUploadOptionInfo)
      com.volcengine.service.vod.model.business.VodUploadOptionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadOptionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadOptionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodUploadOptionInfo.class, com.volcengine.service.vod.model.business.VodUploadOptionInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodUploadOptionInfo.newBuilder()
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
        getTemplatesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      templateId_ = "";

      templateIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (templatesBuilder_ == null) {
        templates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        templatesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadOptionInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodUploadOptionInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodUploadOptionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodUploadOptionInfo build() {
      com.volcengine.service.vod.model.business.VodUploadOptionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodUploadOptionInfo buildPartial() {
      com.volcengine.service.vod.model.business.VodUploadOptionInfo result = new com.volcengine.service.vod.model.business.VodUploadOptionInfo(this);
      int from_bitField0_ = bitField0_;
      result.templateId_ = templateId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        templateIds_ = templateIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.templateIds_ = templateIds_;
      if (templatesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          templates_ = java.util.Collections.unmodifiableList(templates_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.templates_ = templates_;
      } else {
        result.templates_ = templatesBuilder_.build();
      }
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
      if (other instanceof com.volcengine.service.vod.model.business.VodUploadOptionInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodUploadOptionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodUploadOptionInfo other) {
      if (other == com.volcengine.service.vod.model.business.VodUploadOptionInfo.getDefaultInstance()) return this;
      if (!other.getTemplateId().isEmpty()) {
        templateId_ = other.templateId_;
        onChanged();
      }
      if (!other.templateIds_.isEmpty()) {
        if (templateIds_.isEmpty()) {
          templateIds_ = other.templateIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTemplateIdsIsMutable();
          templateIds_.addAll(other.templateIds_);
        }
        onChanged();
      }
      if (templatesBuilder_ == null) {
        if (!other.templates_.isEmpty()) {
          if (templates_.isEmpty()) {
            templates_ = other.templates_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTemplatesIsMutable();
            templates_.addAll(other.templates_);
          }
          onChanged();
        }
      } else {
        if (!other.templates_.isEmpty()) {
          if (templatesBuilder_.isEmpty()) {
            templatesBuilder_.dispose();
            templatesBuilder_ = null;
            templates_ = other.templates_;
            bitField0_ = (bitField0_ & ~0x00000002);
            templatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTemplatesFieldBuilder() : null;
          } else {
            templatesBuilder_.addAllMessages(other.templates_);
          }
        }
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
      com.volcengine.service.vod.model.business.VodUploadOptionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodUploadOptionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object templateId_ = "";
    /**
     * <code>string TemplateId = 1;</code>
     * @return The templateId.
     */
    public java.lang.String getTemplateId() {
      java.lang.Object ref = templateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        templateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TemplateId = 1;</code>
     * @return The bytes for templateId.
     */
    public com.google.protobuf.ByteString
        getTemplateIdBytes() {
      java.lang.Object ref = templateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        templateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TemplateId = 1;</code>
     * @param value The templateId to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TemplateId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemplateId() {
      
      templateId_ = getDefaultInstance().getTemplateId();
      onChanged();
      return this;
    }
    /**
     * <code>string TemplateId = 1;</code>
     * @param value The bytes for templateId to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList templateIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTemplateIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        templateIds_ = new com.google.protobuf.LazyStringArrayList(templateIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @return A list containing the templateIds.
     */
    public com.google.protobuf.ProtocolStringList
        getTemplateIdsList() {
      return templateIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @return The count of templateIds.
     */
    public int getTemplateIdsCount() {
      return templateIds_.size();
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @param index The index of the element to return.
     * @return The templateIds at the given index.
     */
    public java.lang.String getTemplateIds(int index) {
      return templateIds_.get(index);
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the templateIds at the given index.
     */
    public com.google.protobuf.ByteString
        getTemplateIdsBytes(int index) {
      return templateIds_.getByteString(index);
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @param index The index to set the value at.
     * @param value The templateIds to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTemplateIdsIsMutable();
      templateIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @param value The templateIds to add.
     * @return This builder for chaining.
     */
    public Builder addTemplateIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTemplateIdsIsMutable();
      templateIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @param values The templateIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllTemplateIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureTemplateIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, templateIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemplateIds() {
      templateIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string TemplateIds = 2;</code>
     * @param value The bytes of the templateIds to add.
     * @return This builder for chaining.
     */
    public Builder addTemplateIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTemplateIdsIsMutable();
      templateIds_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<com.volcengine.service.vod.model.business.VodUploadTemplate> templates_ =
      java.util.Collections.emptyList();
    private void ensureTemplatesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        templates_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodUploadTemplate>(templates_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodUploadTemplate, com.volcengine.service.vod.model.business.VodUploadTemplate.Builder, com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder> templatesBuilder_;

    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodUploadTemplate> getTemplatesList() {
      if (templatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(templates_);
      } else {
        return templatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public int getTemplatesCount() {
      if (templatesBuilder_ == null) {
        return templates_.size();
      } else {
        return templatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodUploadTemplate getTemplates(int index) {
      if (templatesBuilder_ == null) {
        return templates_.get(index);
      } else {
        return templatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder setTemplates(
        int index, com.volcengine.service.vod.model.business.VodUploadTemplate value) {
      if (templatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplatesIsMutable();
        templates_.set(index, value);
        onChanged();
      } else {
        templatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder setTemplates(
        int index, com.volcengine.service.vod.model.business.VodUploadTemplate.Builder builderForValue) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        templates_.set(index, builderForValue.build());
        onChanged();
      } else {
        templatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder addTemplates(com.volcengine.service.vod.model.business.VodUploadTemplate value) {
      if (templatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplatesIsMutable();
        templates_.add(value);
        onChanged();
      } else {
        templatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder addTemplates(
        int index, com.volcengine.service.vod.model.business.VodUploadTemplate value) {
      if (templatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplatesIsMutable();
        templates_.add(index, value);
        onChanged();
      } else {
        templatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder addTemplates(
        com.volcengine.service.vod.model.business.VodUploadTemplate.Builder builderForValue) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        templates_.add(builderForValue.build());
        onChanged();
      } else {
        templatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder addTemplates(
        int index, com.volcengine.service.vod.model.business.VodUploadTemplate.Builder builderForValue) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        templates_.add(index, builderForValue.build());
        onChanged();
      } else {
        templatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder addAllTemplates(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.VodUploadTemplate> values) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, templates_);
        onChanged();
      } else {
        templatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder clearTemplates() {
      if (templatesBuilder_ == null) {
        templates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        templatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public Builder removeTemplates(int index) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        templates_.remove(index);
        onChanged();
      } else {
        templatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodUploadTemplate.Builder getTemplatesBuilder(
        int index) {
      return getTemplatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder getTemplatesOrBuilder(
        int index) {
      if (templatesBuilder_ == null) {
        return templates_.get(index);  } else {
        return templatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder> 
         getTemplatesOrBuilderList() {
      if (templatesBuilder_ != null) {
        return templatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(templates_);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodUploadTemplate.Builder addTemplatesBuilder() {
      return getTemplatesFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.VodUploadTemplate.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodUploadTemplate.Builder addTemplatesBuilder(
        int index) {
      return getTemplatesFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.VodUploadTemplate.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodUploadTemplate.Builder> 
         getTemplatesBuilderList() {
      return getTemplatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodUploadTemplate, com.volcengine.service.vod.model.business.VodUploadTemplate.Builder, com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder> 
        getTemplatesFieldBuilder() {
      if (templatesBuilder_ == null) {
        templatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodUploadTemplate, com.volcengine.service.vod.model.business.VodUploadTemplate.Builder, com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder>(
                templates_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        templates_ = null;
      }
      return templatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodUploadOptionInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodUploadOptionInfo)
  private static final com.volcengine.service.vod.model.business.VodUploadOptionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodUploadOptionInfo();
  }

  public static com.volcengine.service.vod.model.business.VodUploadOptionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUploadOptionInfo>
      PARSER = new com.google.protobuf.AbstractParser<VodUploadOptionInfo>() {
    @java.lang.Override
    public VodUploadOptionInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUploadOptionInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUploadOptionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUploadOptionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodUploadOptionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

