// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodPCDNDomainConfigInfo}
 */
public final class VodPCDNDomainConfigInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodPCDNDomainConfigInfo)
    VodPCDNDomainConfigInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodPCDNDomainConfigInfo.newBuilder() to construct.
  private VodPCDNDomainConfigInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodPCDNDomainConfigInfo() {
    spaceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodPCDNDomainConfigInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodPCDNDomainConfigInfo(
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
            com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.Builder subBuilder = null;
            if (pCDNInstanceInfo_ != null) {
              subBuilder = pCDNInstanceInfo_.toBuilder();
            }
            pCDNInstanceInfo_ = input.readMessage(com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pCDNInstanceInfo_);
              pCDNInstanceInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            total_ = input.readInt64();
            break;
          }
          case 32: {

            offset_ = input.readInt64();
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
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodPCDNDomainConfigInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodPCDNDomainConfigInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo.class, com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 空间名称
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
   * 空间名称
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

  public static final int PCDNINSTANCEINFO_FIELD_NUMBER = 2;
  private com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos pCDNInstanceInfo_;
  /**
   * <pre>
   * PCDN分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
   * @return Whether the pCDNInstanceInfo field is set.
   */
  @java.lang.Override
  public boolean hasPCDNInstanceInfo() {
    return pCDNInstanceInfo_ != null;
  }
  /**
   * <pre>
   * PCDN分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
   * @return The pCDNInstanceInfo.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos getPCDNInstanceInfo() {
    return pCDNInstanceInfo_ == null ? com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.getDefaultInstance() : pCDNInstanceInfo_;
  }
  /**
   * <pre>
   * PCDN分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfosOrBuilder getPCDNInstanceInfoOrBuilder() {
    return getPCDNInstanceInfo();
  }

  public static final int TOTAL_FIELD_NUMBER = 3;
  private long total_;
  /**
   * <pre>
   *符合要求的域名总数
   * </pre>
   *
   * <code>int64 Total = 3;</code>
   * @return The total.
   */
  @java.lang.Override
  public long getTotal() {
    return total_;
  }

  public static final int OFFSET_FIELD_NUMBER = 4;
  private long offset_;
  /**
   * <pre>
   *已显示多少条域名
   * </pre>
   *
   * <code>int64 Offset = 4;</code>
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
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
    if (pCDNInstanceInfo_ != null) {
      output.writeMessage(2, getPCDNInstanceInfo());
    }
    if (total_ != 0L) {
      output.writeInt64(3, total_);
    }
    if (offset_ != 0L) {
      output.writeInt64(4, offset_);
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
    if (pCDNInstanceInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPCDNInstanceInfo());
    }
    if (total_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, total_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, offset_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo other = (com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (hasPCDNInstanceInfo() != other.hasPCDNInstanceInfo()) return false;
    if (hasPCDNInstanceInfo()) {
      if (!getPCDNInstanceInfo()
          .equals(other.getPCDNInstanceInfo())) return false;
    }
    if (getTotal()
        != other.getTotal()) return false;
    if (getOffset()
        != other.getOffset()) return false;
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
    if (hasPCDNInstanceInfo()) {
      hash = (37 * hash) + PCDNINSTANCEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getPCDNInstanceInfo().hashCode();
    }
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotal());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodPCDNDomainConfigInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodPCDNDomainConfigInfo)
      com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodPCDNDomainConfigInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodPCDNDomainConfigInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo.class, com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo.newBuilder()
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

      if (pCDNInstanceInfoBuilder_ == null) {
        pCDNInstanceInfo_ = null;
      } else {
        pCDNInstanceInfo_ = null;
        pCDNInstanceInfoBuilder_ = null;
      }
      total_ = 0L;

      offset_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodPCDNDomainConfigInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo build() {
      com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo buildPartial() {
      com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo result = new com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo(this);
      result.spaceName_ = spaceName_;
      if (pCDNInstanceInfoBuilder_ == null) {
        result.pCDNInstanceInfo_ = pCDNInstanceInfo_;
      } else {
        result.pCDNInstanceInfo_ = pCDNInstanceInfoBuilder_.build();
      }
      result.total_ = total_;
      result.offset_ = offset_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo other) {
      if (other == com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (other.hasPCDNInstanceInfo()) {
        mergePCDNInstanceInfo(other.getPCDNInstanceInfo());
      }
      if (other.getTotal() != 0L) {
        setTotal(other.getTotal());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
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
      com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo) e.getUnfinishedMessage();
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
     * 空间名称
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
     * 空间名称
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
     * 空间名称
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
     * 空间名称
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
     * 空间名称
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

    private com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos pCDNInstanceInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos, com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfosOrBuilder> pCDNInstanceInfoBuilder_;
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     * @return Whether the pCDNInstanceInfo field is set.
     */
    public boolean hasPCDNInstanceInfo() {
      return pCDNInstanceInfoBuilder_ != null || pCDNInstanceInfo_ != null;
    }
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     * @return The pCDNInstanceInfo.
     */
    public com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos getPCDNInstanceInfo() {
      if (pCDNInstanceInfoBuilder_ == null) {
        return pCDNInstanceInfo_ == null ? com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.getDefaultInstance() : pCDNInstanceInfo_;
      } else {
        return pCDNInstanceInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     */
    public Builder setPCDNInstanceInfo(com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos value) {
      if (pCDNInstanceInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pCDNInstanceInfo_ = value;
        onChanged();
      } else {
        pCDNInstanceInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     */
    public Builder setPCDNInstanceInfo(
        com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.Builder builderForValue) {
      if (pCDNInstanceInfoBuilder_ == null) {
        pCDNInstanceInfo_ = builderForValue.build();
        onChanged();
      } else {
        pCDNInstanceInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     */
    public Builder mergePCDNInstanceInfo(com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos value) {
      if (pCDNInstanceInfoBuilder_ == null) {
        if (pCDNInstanceInfo_ != null) {
          pCDNInstanceInfo_ =
            com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.newBuilder(pCDNInstanceInfo_).mergeFrom(value).buildPartial();
        } else {
          pCDNInstanceInfo_ = value;
        }
        onChanged();
      } else {
        pCDNInstanceInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     */
    public Builder clearPCDNInstanceInfo() {
      if (pCDNInstanceInfoBuilder_ == null) {
        pCDNInstanceInfo_ = null;
        onChanged();
      } else {
        pCDNInstanceInfo_ = null;
        pCDNInstanceInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.Builder getPCDNInstanceInfoBuilder() {
      
      onChanged();
      return getPCDNInstanceInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfosOrBuilder getPCDNInstanceInfoOrBuilder() {
      if (pCDNInstanceInfoBuilder_ != null) {
        return pCDNInstanceInfoBuilder_.getMessageOrBuilder();
      } else {
        return pCDNInstanceInfo_ == null ?
            com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.getDefaultInstance() : pCDNInstanceInfo_;
      }
    }
    /**
     * <pre>
     * PCDN分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPCDNDomainInstanceInfos PCDNInstanceInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos, com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfosOrBuilder> 
        getPCDNInstanceInfoFieldBuilder() {
      if (pCDNInstanceInfoBuilder_ == null) {
        pCDNInstanceInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos, com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodPCDNDomainInstanceInfosOrBuilder>(
                getPCDNInstanceInfo(),
                getParentForChildren(),
                isClean());
        pCDNInstanceInfo_ = null;
      }
      return pCDNInstanceInfoBuilder_;
    }

    private long total_ ;
    /**
     * <pre>
     *符合要求的域名总数
     * </pre>
     *
     * <code>int64 Total = 3;</code>
     * @return The total.
     */
    @java.lang.Override
    public long getTotal() {
      return total_;
    }
    /**
     * <pre>
     *符合要求的域名总数
     * </pre>
     *
     * <code>int64 Total = 3;</code>
     * @param value The total to set.
     * @return This builder for chaining.
     */
    public Builder setTotal(long value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *符合要求的域名总数
     * </pre>
     *
     * <code>int64 Total = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotal() {
      
      total_ = 0L;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <pre>
     *已显示多少条域名
     * </pre>
     *
     * <code>int64 Offset = 4;</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <pre>
     *已显示多少条域名
     * </pre>
     *
     * <code>int64 Offset = 4;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *已显示多少条域名
     * </pre>
     *
     * <code>int64 Offset = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodPCDNDomainConfigInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodPCDNDomainConfigInfo)
  private static final com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo();
  }

  public static com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodPCDNDomainConfigInfo>
      PARSER = new com.google.protobuf.AbstractParser<VodPCDNDomainConfigInfo>() {
    @java.lang.Override
    public VodPCDNDomainConfigInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodPCDNDomainConfigInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodPCDNDomainConfigInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodPCDNDomainConfigInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodPCDNDomainConfigInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

