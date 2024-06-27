// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

/**
 * Protobuf type {@code Volcengine.Imp.Models.Business.OverrideParams}
 */
public final class OverrideParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Imp.Models.Business.OverrideParams)
    OverrideParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OverrideParams.newBuilder() to construct.
  private OverrideParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OverrideParams() {
    smartErase_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OverrideParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OverrideParams(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              smartErase_ = new java.util.ArrayList<com.volcengine.service.imp.model.business.SmartEraseOverrideParams>();
              mutable_bitField0_ |= 0x00000001;
            }
            smartErase_.add(
                input.readMessage(com.volcengine.service.imp.model.business.SmartEraseOverrideParams.parser(), extensionRegistry));
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
        smartErase_ = java.util.Collections.unmodifiableList(smartErase_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_OverrideParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_OverrideParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.imp.model.business.OverrideParams.class, com.volcengine.service.imp.model.business.OverrideParams.Builder.class);
  }

  public static final int SMARTERASE_FIELD_NUMBER = 1;
  private java.util.List<com.volcengine.service.imp.model.business.SmartEraseOverrideParams> smartErase_;
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.imp.model.business.SmartEraseOverrideParams> getSmartEraseList() {
    return smartErase_;
  }
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.imp.model.business.SmartEraseOverrideParamsOrBuilder> 
      getSmartEraseOrBuilderList() {
    return smartErase_;
  }
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
   */
  @java.lang.Override
  public int getSmartEraseCount() {
    return smartErase_.size();
  }
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.SmartEraseOverrideParams getSmartErase(int index) {
    return smartErase_.get(index);
  }
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.SmartEraseOverrideParamsOrBuilder getSmartEraseOrBuilder(
      int index) {
    return smartErase_.get(index);
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
    for (int i = 0; i < smartErase_.size(); i++) {
      output.writeMessage(1, smartErase_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < smartErase_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, smartErase_.get(i));
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
    if (!(obj instanceof com.volcengine.service.imp.model.business.OverrideParams)) {
      return super.equals(obj);
    }
    com.volcengine.service.imp.model.business.OverrideParams other = (com.volcengine.service.imp.model.business.OverrideParams) obj;

    if (!getSmartEraseList()
        .equals(other.getSmartEraseList())) return false;
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
    if (getSmartEraseCount() > 0) {
      hash = (37 * hash) + SMARTERASE_FIELD_NUMBER;
      hash = (53 * hash) + getSmartEraseList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.OverrideParams parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.imp.model.business.OverrideParams prototype) {
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
   * Protobuf type {@code Volcengine.Imp.Models.Business.OverrideParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Imp.Models.Business.OverrideParams)
      com.volcengine.service.imp.model.business.OverrideParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_OverrideParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_OverrideParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.imp.model.business.OverrideParams.class, com.volcengine.service.imp.model.business.OverrideParams.Builder.class);
    }

    // Construct using com.volcengine.service.imp.model.business.OverrideParams.newBuilder()
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
        getSmartEraseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (smartEraseBuilder_ == null) {
        smartErase_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        smartEraseBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_OverrideParams_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.OverrideParams getDefaultInstanceForType() {
      return com.volcengine.service.imp.model.business.OverrideParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.OverrideParams build() {
      com.volcengine.service.imp.model.business.OverrideParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.OverrideParams buildPartial() {
      com.volcengine.service.imp.model.business.OverrideParams result = new com.volcengine.service.imp.model.business.OverrideParams(this);
      int from_bitField0_ = bitField0_;
      if (smartEraseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          smartErase_ = java.util.Collections.unmodifiableList(smartErase_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.smartErase_ = smartErase_;
      } else {
        result.smartErase_ = smartEraseBuilder_.build();
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
      if (other instanceof com.volcengine.service.imp.model.business.OverrideParams) {
        return mergeFrom((com.volcengine.service.imp.model.business.OverrideParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.imp.model.business.OverrideParams other) {
      if (other == com.volcengine.service.imp.model.business.OverrideParams.getDefaultInstance()) return this;
      if (smartEraseBuilder_ == null) {
        if (!other.smartErase_.isEmpty()) {
          if (smartErase_.isEmpty()) {
            smartErase_ = other.smartErase_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSmartEraseIsMutable();
            smartErase_.addAll(other.smartErase_);
          }
          onChanged();
        }
      } else {
        if (!other.smartErase_.isEmpty()) {
          if (smartEraseBuilder_.isEmpty()) {
            smartEraseBuilder_.dispose();
            smartEraseBuilder_ = null;
            smartErase_ = other.smartErase_;
            bitField0_ = (bitField0_ & ~0x00000001);
            smartEraseBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSmartEraseFieldBuilder() : null;
          } else {
            smartEraseBuilder_.addAllMessages(other.smartErase_);
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
      com.volcengine.service.imp.model.business.OverrideParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.imp.model.business.OverrideParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.volcengine.service.imp.model.business.SmartEraseOverrideParams> smartErase_ =
      java.util.Collections.emptyList();
    private void ensureSmartEraseIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        smartErase_ = new java.util.ArrayList<com.volcengine.service.imp.model.business.SmartEraseOverrideParams>(smartErase_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.imp.model.business.SmartEraseOverrideParams, com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder, com.volcengine.service.imp.model.business.SmartEraseOverrideParamsOrBuilder> smartEraseBuilder_;

    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public java.util.List<com.volcengine.service.imp.model.business.SmartEraseOverrideParams> getSmartEraseList() {
      if (smartEraseBuilder_ == null) {
        return java.util.Collections.unmodifiableList(smartErase_);
      } else {
        return smartEraseBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public int getSmartEraseCount() {
      if (smartEraseBuilder_ == null) {
        return smartErase_.size();
      } else {
        return smartEraseBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public com.volcengine.service.imp.model.business.SmartEraseOverrideParams getSmartErase(int index) {
      if (smartEraseBuilder_ == null) {
        return smartErase_.get(index);
      } else {
        return smartEraseBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder setSmartErase(
        int index, com.volcengine.service.imp.model.business.SmartEraseOverrideParams value) {
      if (smartEraseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmartEraseIsMutable();
        smartErase_.set(index, value);
        onChanged();
      } else {
        smartEraseBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder setSmartErase(
        int index, com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder builderForValue) {
      if (smartEraseBuilder_ == null) {
        ensureSmartEraseIsMutable();
        smartErase_.set(index, builderForValue.build());
        onChanged();
      } else {
        smartEraseBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder addSmartErase(com.volcengine.service.imp.model.business.SmartEraseOverrideParams value) {
      if (smartEraseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmartEraseIsMutable();
        smartErase_.add(value);
        onChanged();
      } else {
        smartEraseBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder addSmartErase(
        int index, com.volcengine.service.imp.model.business.SmartEraseOverrideParams value) {
      if (smartEraseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmartEraseIsMutable();
        smartErase_.add(index, value);
        onChanged();
      } else {
        smartEraseBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder addSmartErase(
        com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder builderForValue) {
      if (smartEraseBuilder_ == null) {
        ensureSmartEraseIsMutable();
        smartErase_.add(builderForValue.build());
        onChanged();
      } else {
        smartEraseBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder addSmartErase(
        int index, com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder builderForValue) {
      if (smartEraseBuilder_ == null) {
        ensureSmartEraseIsMutable();
        smartErase_.add(index, builderForValue.build());
        onChanged();
      } else {
        smartEraseBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder addAllSmartErase(
        java.lang.Iterable<? extends com.volcengine.service.imp.model.business.SmartEraseOverrideParams> values) {
      if (smartEraseBuilder_ == null) {
        ensureSmartEraseIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, smartErase_);
        onChanged();
      } else {
        smartEraseBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder clearSmartErase() {
      if (smartEraseBuilder_ == null) {
        smartErase_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        smartEraseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public Builder removeSmartErase(int index) {
      if (smartEraseBuilder_ == null) {
        ensureSmartEraseIsMutable();
        smartErase_.remove(index);
        onChanged();
      } else {
        smartEraseBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder getSmartEraseBuilder(
        int index) {
      return getSmartEraseFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public com.volcengine.service.imp.model.business.SmartEraseOverrideParamsOrBuilder getSmartEraseOrBuilder(
        int index) {
      if (smartEraseBuilder_ == null) {
        return smartErase_.get(index);  } else {
        return smartEraseBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public java.util.List<? extends com.volcengine.service.imp.model.business.SmartEraseOverrideParamsOrBuilder> 
         getSmartEraseOrBuilderList() {
      if (smartEraseBuilder_ != null) {
        return smartEraseBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(smartErase_);
      }
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder addSmartEraseBuilder() {
      return getSmartEraseFieldBuilder().addBuilder(
          com.volcengine.service.imp.model.business.SmartEraseOverrideParams.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder addSmartEraseBuilder(
        int index) {
      return getSmartEraseFieldBuilder().addBuilder(
          index, com.volcengine.service.imp.model.business.SmartEraseOverrideParams.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Imp.Models.Business.SmartEraseOverrideParams SmartErase = 1;</code>
     */
    public java.util.List<com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder> 
         getSmartEraseBuilderList() {
      return getSmartEraseFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.imp.model.business.SmartEraseOverrideParams, com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder, com.volcengine.service.imp.model.business.SmartEraseOverrideParamsOrBuilder> 
        getSmartEraseFieldBuilder() {
      if (smartEraseBuilder_ == null) {
        smartEraseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.imp.model.business.SmartEraseOverrideParams, com.volcengine.service.imp.model.business.SmartEraseOverrideParams.Builder, com.volcengine.service.imp.model.business.SmartEraseOverrideParamsOrBuilder>(
                smartErase_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        smartErase_ = null;
      }
      return smartEraseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Imp.Models.Business.OverrideParams)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Imp.Models.Business.OverrideParams)
  private static final com.volcengine.service.imp.model.business.OverrideParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.imp.model.business.OverrideParams();
  }

  public static com.volcengine.service.imp.model.business.OverrideParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OverrideParams>
      PARSER = new com.google.protobuf.AbstractParser<OverrideParams>() {
    @java.lang.Override
    public OverrideParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OverrideParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OverrideParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OverrideParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.imp.model.business.OverrideParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
