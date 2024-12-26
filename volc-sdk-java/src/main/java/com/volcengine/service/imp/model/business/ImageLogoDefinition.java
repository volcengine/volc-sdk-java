// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

/**
 * Protobuf type {@code Volcengine.Imp.Models.Business.ImageLogoDefinition}
 */
public final class ImageLogoDefinition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Imp.Models.Business.ImageLogoDefinition)
    ImageLogoDefinitionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageLogoDefinition.newBuilder() to construct.
  private ImageLogoDefinition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageLogoDefinition() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageLogoDefinition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageLogoDefinition(
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
            com.volcengine.service.imp.model.business.InputPath.Builder subBuilder = null;
            if (content_ != null) {
              subBuilder = content_.toBuilder();
            }
            content_ = input.readMessage(com.volcengine.service.imp.model.business.InputPath.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(content_);
              content_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            loopTimes_ = input.readInt32();
            break;
          }
          case 24: {

            repeatLast_ = input.readBool();
            break;
          }
          case 32: {

            transparency_ = input.readInt32();
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
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_ImageLogoDefinition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_ImageLogoDefinition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.imp.model.business.ImageLogoDefinition.class, com.volcengine.service.imp.model.business.ImageLogoDefinition.Builder.class);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  private com.volcengine.service.imp.model.business.InputPath content_;
  /**
   * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return content_ != null;
  }
  /**
   * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
   * @return The content.
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.InputPath getContent() {
    return content_ == null ? com.volcengine.service.imp.model.business.InputPath.getDefaultInstance() : content_;
  }
  /**
   * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.InputPathOrBuilder getContentOrBuilder() {
    return getContent();
  }

  public static final int LOOPTIMES_FIELD_NUMBER = 2;
  private int loopTimes_;
  /**
   * <code>int32 LoopTimes = 2;</code>
   * @return The loopTimes.
   */
  @java.lang.Override
  public int getLoopTimes() {
    return loopTimes_;
  }

  public static final int REPEATLAST_FIELD_NUMBER = 3;
  private boolean repeatLast_;
  /**
   * <code>bool RepeatLast = 3;</code>
   * @return The repeatLast.
   */
  @java.lang.Override
  public boolean getRepeatLast() {
    return repeatLast_;
  }

  public static final int TRANSPARENCY_FIELD_NUMBER = 4;
  private int transparency_;
  /**
   * <code>int32 Transparency = 4;</code>
   * @return The transparency.
   */
  @java.lang.Override
  public int getTransparency() {
    return transparency_;
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
    if (content_ != null) {
      output.writeMessage(1, getContent());
    }
    if (loopTimes_ != 0) {
      output.writeInt32(2, loopTimes_);
    }
    if (repeatLast_ != false) {
      output.writeBool(3, repeatLast_);
    }
    if (transparency_ != 0) {
      output.writeInt32(4, transparency_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (content_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContent());
    }
    if (loopTimes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, loopTimes_);
    }
    if (repeatLast_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, repeatLast_);
    }
    if (transparency_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, transparency_);
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
    if (!(obj instanceof com.volcengine.service.imp.model.business.ImageLogoDefinition)) {
      return super.equals(obj);
    }
    com.volcengine.service.imp.model.business.ImageLogoDefinition other = (com.volcengine.service.imp.model.business.ImageLogoDefinition) obj;

    if (hasContent() != other.hasContent()) return false;
    if (hasContent()) {
      if (!getContent()
          .equals(other.getContent())) return false;
    }
    if (getLoopTimes()
        != other.getLoopTimes()) return false;
    if (getRepeatLast()
        != other.getRepeatLast()) return false;
    if (getTransparency()
        != other.getTransparency()) return false;
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
    if (hasContent()) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
    }
    hash = (37 * hash) + LOOPTIMES_FIELD_NUMBER;
    hash = (53 * hash) + getLoopTimes();
    hash = (37 * hash) + REPEATLAST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRepeatLast());
    hash = (37 * hash) + TRANSPARENCY_FIELD_NUMBER;
    hash = (53 * hash) + getTransparency();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.ImageLogoDefinition parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.imp.model.business.ImageLogoDefinition prototype) {
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
   * Protobuf type {@code Volcengine.Imp.Models.Business.ImageLogoDefinition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Imp.Models.Business.ImageLogoDefinition)
      com.volcengine.service.imp.model.business.ImageLogoDefinitionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_ImageLogoDefinition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_ImageLogoDefinition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.imp.model.business.ImageLogoDefinition.class, com.volcengine.service.imp.model.business.ImageLogoDefinition.Builder.class);
    }

    // Construct using com.volcengine.service.imp.model.business.ImageLogoDefinition.newBuilder()
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
      if (contentBuilder_ == null) {
        content_ = null;
      } else {
        content_ = null;
        contentBuilder_ = null;
      }
      loopTimes_ = 0;

      repeatLast_ = false;

      transparency_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_ImageLogoDefinition_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.ImageLogoDefinition getDefaultInstanceForType() {
      return com.volcengine.service.imp.model.business.ImageLogoDefinition.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.ImageLogoDefinition build() {
      com.volcengine.service.imp.model.business.ImageLogoDefinition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.ImageLogoDefinition buildPartial() {
      com.volcengine.service.imp.model.business.ImageLogoDefinition result = new com.volcengine.service.imp.model.business.ImageLogoDefinition(this);
      if (contentBuilder_ == null) {
        result.content_ = content_;
      } else {
        result.content_ = contentBuilder_.build();
      }
      result.loopTimes_ = loopTimes_;
      result.repeatLast_ = repeatLast_;
      result.transparency_ = transparency_;
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
      if (other instanceof com.volcengine.service.imp.model.business.ImageLogoDefinition) {
        return mergeFrom((com.volcengine.service.imp.model.business.ImageLogoDefinition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.imp.model.business.ImageLogoDefinition other) {
      if (other == com.volcengine.service.imp.model.business.ImageLogoDefinition.getDefaultInstance()) return this;
      if (other.hasContent()) {
        mergeContent(other.getContent());
      }
      if (other.getLoopTimes() != 0) {
        setLoopTimes(other.getLoopTimes());
      }
      if (other.getRepeatLast() != false) {
        setRepeatLast(other.getRepeatLast());
      }
      if (other.getTransparency() != 0) {
        setTransparency(other.getTransparency());
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
      com.volcengine.service.imp.model.business.ImageLogoDefinition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.imp.model.business.ImageLogoDefinition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.volcengine.service.imp.model.business.InputPath content_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.imp.model.business.InputPath, com.volcengine.service.imp.model.business.InputPath.Builder, com.volcengine.service.imp.model.business.InputPathOrBuilder> contentBuilder_;
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return contentBuilder_ != null || content_ != null;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     * @return The content.
     */
    public com.volcengine.service.imp.model.business.InputPath getContent() {
      if (contentBuilder_ == null) {
        return content_ == null ? com.volcengine.service.imp.model.business.InputPath.getDefaultInstance() : content_;
      } else {
        return contentBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     */
    public Builder setContent(com.volcengine.service.imp.model.business.InputPath value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        contentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     */
    public Builder setContent(
        com.volcengine.service.imp.model.business.InputPath.Builder builderForValue) {
      if (contentBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        contentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     */
    public Builder mergeContent(com.volcengine.service.imp.model.business.InputPath value) {
      if (contentBuilder_ == null) {
        if (content_ != null) {
          content_ =
            com.volcengine.service.imp.model.business.InputPath.newBuilder(content_).mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        contentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     */
    public Builder clearContent() {
      if (contentBuilder_ == null) {
        content_ = null;
        onChanged();
      } else {
        content_ = null;
        contentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     */
    public com.volcengine.service.imp.model.business.InputPath.Builder getContentBuilder() {
      
      onChanged();
      return getContentFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     */
    public com.volcengine.service.imp.model.business.InputPathOrBuilder getContentOrBuilder() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilder();
      } else {
        return content_ == null ?
            com.volcengine.service.imp.model.business.InputPath.getDefaultInstance() : content_;
      }
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.InputPath Content = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.imp.model.business.InputPath, com.volcengine.service.imp.model.business.InputPath.Builder, com.volcengine.service.imp.model.business.InputPathOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.imp.model.business.InputPath, com.volcengine.service.imp.model.business.InputPath.Builder, com.volcengine.service.imp.model.business.InputPathOrBuilder>(
                getContent(),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
    }

    private int loopTimes_ ;
    /**
     * <code>int32 LoopTimes = 2;</code>
     * @return The loopTimes.
     */
    @java.lang.Override
    public int getLoopTimes() {
      return loopTimes_;
    }
    /**
     * <code>int32 LoopTimes = 2;</code>
     * @param value The loopTimes to set.
     * @return This builder for chaining.
     */
    public Builder setLoopTimes(int value) {
      
      loopTimes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 LoopTimes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoopTimes() {
      
      loopTimes_ = 0;
      onChanged();
      return this;
    }

    private boolean repeatLast_ ;
    /**
     * <code>bool RepeatLast = 3;</code>
     * @return The repeatLast.
     */
    @java.lang.Override
    public boolean getRepeatLast() {
      return repeatLast_;
    }
    /**
     * <code>bool RepeatLast = 3;</code>
     * @param value The repeatLast to set.
     * @return This builder for chaining.
     */
    public Builder setRepeatLast(boolean value) {
      
      repeatLast_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool RepeatLast = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRepeatLast() {
      
      repeatLast_ = false;
      onChanged();
      return this;
    }

    private int transparency_ ;
    /**
     * <code>int32 Transparency = 4;</code>
     * @return The transparency.
     */
    @java.lang.Override
    public int getTransparency() {
      return transparency_;
    }
    /**
     * <code>int32 Transparency = 4;</code>
     * @param value The transparency to set.
     * @return This builder for chaining.
     */
    public Builder setTransparency(int value) {
      
      transparency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Transparency = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransparency() {
      
      transparency_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Imp.Models.Business.ImageLogoDefinition)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Imp.Models.Business.ImageLogoDefinition)
  private static final com.volcengine.service.imp.model.business.ImageLogoDefinition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.imp.model.business.ImageLogoDefinition();
  }

  public static com.volcengine.service.imp.model.business.ImageLogoDefinition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageLogoDefinition>
      PARSER = new com.google.protobuf.AbstractParser<ImageLogoDefinition>() {
    @java.lang.Override
    public ImageLogoDefinition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImageLogoDefinition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageLogoDefinition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageLogoDefinition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.imp.model.business.ImageLogoDefinition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

