// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodDomainDNSVerifyInfo}
 */
public final class VodDomainDNSVerifyInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodDomainDNSVerifyInfo)
    VodDomainDNSVerifyInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDomainDNSVerifyInfo.newBuilder() to construct.
  private VodDomainDNSVerifyInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDomainDNSVerifyInfo() {
    host_ = "";
    recordType_ = "";
    recordValue_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDomainDNSVerifyInfo();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDomainDNSVerifyInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            host_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            recordType_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            recordValue_ = s;
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
    return VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainDNSVerifyInfo_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainDNSVerifyInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            VodDomainDNSVerifyInfo.class, Builder.class);
  }

  public static final int HOST_FIELD_NUMBER = 1;
  private volatile Object host_;
  /**
   * <pre>
   * 主机记录，表示该 TXT 记录中的主机名。
   * </pre>
   *
   * <code>string Host = 1;</code>
   * @return The host.
   */
  @Override
  public String getHost() {
    Object ref = host_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 主机记录，表示该 TXT 记录中的主机名。
   * </pre>
   *
   * <code>string Host = 1;</code>
   * @return The bytes for host.
   */
  @Override
  public com.google.protobuf.ByteString
      getHostBytes() {
    Object ref = host_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORDTYPE_FIELD_NUMBER = 2;
  private volatile Object recordType_;
  /**
   * <pre>
   * 记录类型，表示该 DNS 记录的类型。该参数值是 TXT，表示 TXT 记录。
   * </pre>
   *
   * <code>string RecordType = 2;</code>
   * @return The recordType.
   */
  @Override
  public String getRecordType() {
    Object ref = recordType_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      recordType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 记录类型，表示该 DNS 记录的类型。该参数值是 TXT，表示 TXT 记录。
   * </pre>
   *
   * <code>string RecordType = 2;</code>
   * @return The bytes for recordType.
   */
  @Override
  public com.google.protobuf.ByteString
      getRecordTypeBytes() {
    Object ref = recordType_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      recordType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORDVALUE_FIELD_NUMBER = 3;
  private volatile Object recordValue_;
  /**
   * <pre>
   * 记录值，表示该 TXT 记录的记录值。
   * </pre>
   *
   * <code>string RecordValue = 3;</code>
   * @return The recordValue.
   */
  @Override
  public String getRecordValue() {
    Object ref = recordValue_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      recordValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 记录值，表示该 TXT 记录的记录值。
   * </pre>
   *
   * <code>string RecordValue = 3;</code>
   * @return The bytes for recordValue.
   */
  @Override
  public com.google.protobuf.ByteString
      getRecordValueBytes() {
    Object ref = recordValue_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      recordValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, host_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recordType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, recordValue_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, host_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recordType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, recordValue_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof VodDomainDNSVerifyInfo)) {
      return super.equals(obj);
    }
    VodDomainDNSVerifyInfo other = (VodDomainDNSVerifyInfo) obj;

    if (!getHost()
        .equals(other.getHost())) return false;
    if (!getRecordType()
        .equals(other.getRecordType())) return false;
    if (!getRecordValue()
        .equals(other.getRecordValue())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + RECORDTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getRecordType().hashCode();
    hash = (37 * hash) + RECORDVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getRecordValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static VodDomainDNSVerifyInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodDomainDNSVerifyInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodDomainDNSVerifyInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodDomainDNSVerifyInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodDomainDNSVerifyInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VodDomainDNSVerifyInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VodDomainDNSVerifyInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VodDomainDNSVerifyInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static VodDomainDNSVerifyInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static VodDomainDNSVerifyInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static VodDomainDNSVerifyInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VodDomainDNSVerifyInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(VodDomainDNSVerifyInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodDomainDNSVerifyInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodDomainDNSVerifyInfo)
      VodDomainDNSVerifyInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainDNSVerifyInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainDNSVerifyInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VodDomainDNSVerifyInfo.class, Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodDomainDNSVerifyInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      host_ = "";

      recordType_ = "";

      recordValue_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainDNSVerifyInfo_descriptor;
    }

    @Override
    public VodDomainDNSVerifyInfo getDefaultInstanceForType() {
      return VodDomainDNSVerifyInfo.getDefaultInstance();
    }

    @Override
    public VodDomainDNSVerifyInfo build() {
      VodDomainDNSVerifyInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public VodDomainDNSVerifyInfo buildPartial() {
      VodDomainDNSVerifyInfo result = new VodDomainDNSVerifyInfo(this);
      result.host_ = host_;
      result.recordType_ = recordType_;
      result.recordValue_ = recordValue_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof VodDomainDNSVerifyInfo) {
        return mergeFrom((VodDomainDNSVerifyInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(VodDomainDNSVerifyInfo other) {
      if (other == VodDomainDNSVerifyInfo.getDefaultInstance()) return this;
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        onChanged();
      }
      if (!other.getRecordType().isEmpty()) {
        recordType_ = other.recordType_;
        onChanged();
      }
      if (!other.getRecordValue().isEmpty()) {
        recordValue_ = other.recordValue_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      VodDomainDNSVerifyInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (VodDomainDNSVerifyInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object host_ = "";
    /**
     * <pre>
     * 主机记录，表示该 TXT 记录中的主机名。
     * </pre>
     *
     * <code>string Host = 1;</code>
     * @return The host.
     */
    public String getHost() {
      Object ref = host_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 主机记录，表示该 TXT 记录中的主机名。
     * </pre>
     *
     * <code>string Host = 1;</code>
     * @return The bytes for host.
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 主机记录，表示该 TXT 记录中的主机名。
     * </pre>
     *
     * <code>string Host = 1;</code>
     * @param value The host to set.
     * @return This builder for chaining.
     */
    public Builder setHost(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      host_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主机记录，表示该 TXT 记录中的主机名。
     * </pre>
     *
     * <code>string Host = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHost() {
      
      host_ = getDefaultInstance().getHost();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主机记录，表示该 TXT 记录中的主机名。
     * </pre>
     *
     * <code>string Host = 1;</code>
     * @param value The bytes for host to set.
     * @return This builder for chaining.
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      host_ = value;
      onChanged();
      return this;
    }

    private Object recordType_ = "";
    /**
     * <pre>
     * 记录类型，表示该 DNS 记录的类型。该参数值是 TXT，表示 TXT 记录。
     * </pre>
     *
     * <code>string RecordType = 2;</code>
     * @return The recordType.
     */
    public String getRecordType() {
      Object ref = recordType_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        recordType_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 记录类型，表示该 DNS 记录的类型。该参数值是 TXT，表示 TXT 记录。
     * </pre>
     *
     * <code>string RecordType = 2;</code>
     * @return The bytes for recordType.
     */
    public com.google.protobuf.ByteString
        getRecordTypeBytes() {
      Object ref = recordType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        recordType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 记录类型，表示该 DNS 记录的类型。该参数值是 TXT，表示 TXT 记录。
     * </pre>
     *
     * <code>string RecordType = 2;</code>
     * @param value The recordType to set.
     * @return This builder for chaining.
     */
    public Builder setRecordType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 记录类型，表示该 DNS 记录的类型。该参数值是 TXT，表示 TXT 记录。
     * </pre>
     *
     * <code>string RecordType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordType() {
      
      recordType_ = getDefaultInstance().getRecordType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 记录类型，表示该 DNS 记录的类型。该参数值是 TXT，表示 TXT 记录。
     * </pre>
     *
     * <code>string RecordType = 2;</code>
     * @param value The bytes for recordType to set.
     * @return This builder for chaining.
     */
    public Builder setRecordTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordType_ = value;
      onChanged();
      return this;
    }

    private Object recordValue_ = "";
    /**
     * <pre>
     * 记录值，表示该 TXT 记录的记录值。
     * </pre>
     *
     * <code>string RecordValue = 3;</code>
     * @return The recordValue.
     */
    public String getRecordValue() {
      Object ref = recordValue_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        recordValue_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 记录值，表示该 TXT 记录的记录值。
     * </pre>
     *
     * <code>string RecordValue = 3;</code>
     * @return The bytes for recordValue.
     */
    public com.google.protobuf.ByteString
        getRecordValueBytes() {
      Object ref = recordValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        recordValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 记录值，表示该 TXT 记录的记录值。
     * </pre>
     *
     * <code>string RecordValue = 3;</code>
     * @param value The recordValue to set.
     * @return This builder for chaining.
     */
    public Builder setRecordValue(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 记录值，表示该 TXT 记录的记录值。
     * </pre>
     *
     * <code>string RecordValue = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordValue() {
      
      recordValue_ = getDefaultInstance().getRecordValue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 记录值，表示该 TXT 记录的记录值。
     * </pre>
     *
     * <code>string RecordValue = 3;</code>
     * @param value The bytes for recordValue to set.
     * @return This builder for chaining.
     */
    public Builder setRecordValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordValue_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodDomainDNSVerifyInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodDomainDNSVerifyInfo)
  private static final VodDomainDNSVerifyInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VodDomainDNSVerifyInfo();
  }

  public static VodDomainDNSVerifyInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDomainDNSVerifyInfo>
      PARSER = new com.google.protobuf.AbstractParser<VodDomainDNSVerifyInfo>() {
    @Override
    public VodDomainDNSVerifyInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDomainDNSVerifyInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDomainDNSVerifyInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<VodDomainDNSVerifyInfo> getParserForType() {
    return PARSER;
  }

  @Override
  public VodDomainDNSVerifyInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

