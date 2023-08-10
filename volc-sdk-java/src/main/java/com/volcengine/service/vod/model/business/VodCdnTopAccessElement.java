// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodCdnTopAccessElement}
 */
public final class VodCdnTopAccessElement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodCdnTopAccessElement)
    VodCdnTopAccessElementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodCdnTopAccessElement.newBuilder() to construct.
  private VodCdnTopAccessElement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodCdnTopAccessElement() {
    itemKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodCdnTopAccessElement();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodCdnTopAccessElement(
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

            itemKey_ = s;
            break;
          }
          case 17: {

            value_ = input.readDouble();
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
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessElement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessElement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodCdnTopAccessElement.class, com.volcengine.service.vod.model.business.VodCdnTopAccessElement.Builder.class);
  }

  public static final int ITEMKEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object itemKey_;
  /**
   * <pre>
   * 搜索Item对应key
   * </pre>
   *
   * <code>string ItemKey = 1;</code>
   * @return The itemKey.
   */
  @java.lang.Override
  public java.lang.String getItemKey() {
    java.lang.Object ref = itemKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 搜索Item对应key
   * </pre>
   *
   * <code>string ItemKey = 1;</code>
   * @return The bytes for itemKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getItemKeyBytes() {
    java.lang.Object ref = itemKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private double value_;
  /**
   * <pre>
   * 请求相应Item和Metric对应值
   * </pre>
   *
   * <code>double Value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    return value_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(itemKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemKey_);
    }
    if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
      output.writeDouble(2, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(itemKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, itemKey_);
    }
    if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, value_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodCdnTopAccessElement)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodCdnTopAccessElement other = (com.volcengine.service.vod.model.business.VodCdnTopAccessElement) obj;

    if (!getItemKey()
        .equals(other.getItemKey())) return false;
    if (java.lang.Double.doubleToLongBits(getValue())
        != java.lang.Double.doubleToLongBits(
            other.getValue())) return false;
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
    hash = (37 * hash) + ITEMKEY_FIELD_NUMBER;
    hash = (53 * hash) + getItemKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValue()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodCdnTopAccessElement prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodCdnTopAccessElement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodCdnTopAccessElement)
      com.volcengine.service.vod.model.business.VodCdnTopAccessElementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessElement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessElement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodCdnTopAccessElement.class, com.volcengine.service.vod.model.business.VodCdnTopAccessElement.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodCdnTopAccessElement.newBuilder()
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
      itemKey_ = "";

      value_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTopAccessElement_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTopAccessElement getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodCdnTopAccessElement.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTopAccessElement build() {
      com.volcengine.service.vod.model.business.VodCdnTopAccessElement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTopAccessElement buildPartial() {
      com.volcengine.service.vod.model.business.VodCdnTopAccessElement result = new com.volcengine.service.vod.model.business.VodCdnTopAccessElement(this);
      result.itemKey_ = itemKey_;
      result.value_ = value_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodCdnTopAccessElement) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodCdnTopAccessElement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodCdnTopAccessElement other) {
      if (other == com.volcengine.service.vod.model.business.VodCdnTopAccessElement.getDefaultInstance()) return this;
      if (!other.getItemKey().isEmpty()) {
        itemKey_ = other.itemKey_;
        onChanged();
      }
      if (other.getValue() != 0D) {
        setValue(other.getValue());
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
      com.volcengine.service.vod.model.business.VodCdnTopAccessElement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodCdnTopAccessElement) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object itemKey_ = "";
    /**
     * <pre>
     * 搜索Item对应key
     * </pre>
     *
     * <code>string ItemKey = 1;</code>
     * @return The itemKey.
     */
    public java.lang.String getItemKey() {
      java.lang.Object ref = itemKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 搜索Item对应key
     * </pre>
     *
     * <code>string ItemKey = 1;</code>
     * @return The bytes for itemKey.
     */
    public com.google.protobuf.ByteString
        getItemKeyBytes() {
      java.lang.Object ref = itemKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 搜索Item对应key
     * </pre>
     *
     * <code>string ItemKey = 1;</code>
     * @param value The itemKey to set.
     * @return This builder for chaining.
     */
    public Builder setItemKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 搜索Item对应key
     * </pre>
     *
     * <code>string ItemKey = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemKey() {
      
      itemKey_ = getDefaultInstance().getItemKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 搜索Item对应key
     * </pre>
     *
     * <code>string ItemKey = 1;</code>
     * @param value The bytes for itemKey to set.
     * @return This builder for chaining.
     */
    public Builder setItemKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemKey_ = value;
      onChanged();
      return this;
    }

    private double value_ ;
    /**
     * <pre>
     * 请求相应Item和Metric对应值
     * </pre>
     *
     * <code>double Value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }
    /**
     * <pre>
     * 请求相应Item和Metric对应值
     * </pre>
     *
     * <code>double Value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求相应Item和Metric对应值
     * </pre>
     *
     * <code>double Value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodCdnTopAccessElement)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodCdnTopAccessElement)
  private static final com.volcengine.service.vod.model.business.VodCdnTopAccessElement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodCdnTopAccessElement();
  }

  public static com.volcengine.service.vod.model.business.VodCdnTopAccessElement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodCdnTopAccessElement>
      PARSER = new com.google.protobuf.AbstractParser<VodCdnTopAccessElement>() {
    @java.lang.Override
    public VodCdnTopAccessElement parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodCdnTopAccessElement(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodCdnTopAccessElement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodCdnTopAccessElement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodCdnTopAccessElement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
