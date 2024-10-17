// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.PartUploadInfo}
 */
public final class PartUploadInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.PartUploadInfo)
    PartUploadInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartUploadInfo.newBuilder() to construct.
  private PartUploadInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartUploadInfo() {
    partPutUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    completePartUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartUploadInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartUploadInfo(
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
          case 8: {

            partSize_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              partPutUrls_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            partPutUrls_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            completePartUrl_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              completeUrlHeaders_ = com.google.protobuf.MapField.newMapField(
                  CompleteUrlHeadersDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            completeUrlHeaders__ = input.readMessage(
                CompleteUrlHeadersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            completeUrlHeaders_.getMutableMap().put(
                completeUrlHeaders__.getKey(), completeUrlHeaders__.getValue());
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
        partPutUrls_ = partPutUrls_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_PartUploadInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetCompleteUrlHeaders();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_PartUploadInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.PartUploadInfo.class, com.volcengine.service.vod.model.business.PartUploadInfo.Builder.class);
  }

  public static final int PARTSIZE_FIELD_NUMBER = 1;
  private long partSize_;
  /**
   * <pre>
   * 分片大小 
   * </pre>
   *
   * <code>int64 PartSize = 1;</code>
   * @return The partSize.
   */
  @java.lang.Override
  public long getPartSize() {
    return partSize_;
  }

  public static final int PARTPUTURLS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList partPutUrls_;
  /**
   * <pre>
   * 分片上传URLs 
   * </pre>
   *
   * <code>repeated string PartPutUrls = 2;</code>
   * @return A list containing the partPutUrls.
   */
  public com.google.protobuf.ProtocolStringList
      getPartPutUrlsList() {
    return partPutUrls_;
  }
  /**
   * <pre>
   * 分片上传URLs 
   * </pre>
   *
   * <code>repeated string PartPutUrls = 2;</code>
   * @return The count of partPutUrls.
   */
  public int getPartPutUrlsCount() {
    return partPutUrls_.size();
  }
  /**
   * <pre>
   * 分片上传URLs 
   * </pre>
   *
   * <code>repeated string PartPutUrls = 2;</code>
   * @param index The index of the element to return.
   * @return The partPutUrls at the given index.
   */
  public java.lang.String getPartPutUrls(int index) {
    return partPutUrls_.get(index);
  }
  /**
   * <pre>
   * 分片上传URLs 
   * </pre>
   *
   * <code>repeated string PartPutUrls = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the partPutUrls at the given index.
   */
  public com.google.protobuf.ByteString
      getPartPutUrlsBytes(int index) {
    return partPutUrls_.getByteString(index);
  }

  public static final int COMPLETEPARTURL_FIELD_NUMBER = 3;
  private volatile java.lang.Object completePartUrl_;
  /**
   * <pre>
   * 合并分片URL 
   * </pre>
   *
   * <code>string CompletePartUrl = 3;</code>
   * @return The completePartUrl.
   */
  @java.lang.Override
  public java.lang.String getCompletePartUrl() {
    java.lang.Object ref = completePartUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      completePartUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 合并分片URL 
   * </pre>
   *
   * <code>string CompletePartUrl = 3;</code>
   * @return The bytes for completePartUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCompletePartUrlBytes() {
    java.lang.Object ref = completePartUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      completePartUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPLETEURLHEADERS_FIELD_NUMBER = 4;
  private static final class CompleteUrlHeadersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_PartUploadInfo_CompleteUrlHeadersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> completeUrlHeaders_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetCompleteUrlHeaders() {
    if (completeUrlHeaders_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CompleteUrlHeadersDefaultEntryHolder.defaultEntry);
    }
    return completeUrlHeaders_;
  }

  public int getCompleteUrlHeadersCount() {
    return internalGetCompleteUrlHeaders().getMap().size();
  }
  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */

  @java.lang.Override
  public boolean containsCompleteUrlHeaders(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetCompleteUrlHeaders().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCompleteUrlHeadersMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getCompleteUrlHeaders() {
    return getCompleteUrlHeadersMap();
  }
  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getCompleteUrlHeadersMap() {
    return internalGetCompleteUrlHeaders().getMap();
  }
  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */
  @java.lang.Override

  public java.lang.String getCompleteUrlHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCompleteUrlHeaders().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */
  @java.lang.Override

  public java.lang.String getCompleteUrlHeadersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCompleteUrlHeaders().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (partSize_ != 0L) {
      output.writeInt64(1, partSize_);
    }
    for (int i = 0; i < partPutUrls_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, partPutUrls_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(completePartUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, completePartUrl_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetCompleteUrlHeaders(),
        CompleteUrlHeadersDefaultEntryHolder.defaultEntry,
        4);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, partSize_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < partPutUrls_.size(); i++) {
        dataSize += computeStringSizeNoTag(partPutUrls_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPartPutUrlsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(completePartUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, completePartUrl_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetCompleteUrlHeaders().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      completeUrlHeaders__ = CompleteUrlHeadersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, completeUrlHeaders__);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.PartUploadInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.PartUploadInfo other = (com.volcengine.service.vod.model.business.PartUploadInfo) obj;

    if (getPartSize()
        != other.getPartSize()) return false;
    if (!getPartPutUrlsList()
        .equals(other.getPartPutUrlsList())) return false;
    if (!getCompletePartUrl()
        .equals(other.getCompletePartUrl())) return false;
    if (!internalGetCompleteUrlHeaders().equals(
        other.internalGetCompleteUrlHeaders())) return false;
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
    hash = (37 * hash) + PARTSIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPartSize());
    if (getPartPutUrlsCount() > 0) {
      hash = (37 * hash) + PARTPUTURLS_FIELD_NUMBER;
      hash = (53 * hash) + getPartPutUrlsList().hashCode();
    }
    hash = (37 * hash) + COMPLETEPARTURL_FIELD_NUMBER;
    hash = (53 * hash) + getCompletePartUrl().hashCode();
    if (!internalGetCompleteUrlHeaders().getMap().isEmpty()) {
      hash = (37 * hash) + COMPLETEURLHEADERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCompleteUrlHeaders().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.PartUploadInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.PartUploadInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.PartUploadInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.PartUploadInfo)
      com.volcengine.service.vod.model.business.PartUploadInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_PartUploadInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetCompleteUrlHeaders();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableCompleteUrlHeaders();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_PartUploadInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.PartUploadInfo.class, com.volcengine.service.vod.model.business.PartUploadInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.PartUploadInfo.newBuilder()
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
      partSize_ = 0L;

      partPutUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      completePartUrl_ = "";

      internalGetMutableCompleteUrlHeaders().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_PartUploadInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.PartUploadInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.PartUploadInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.PartUploadInfo build() {
      com.volcengine.service.vod.model.business.PartUploadInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.PartUploadInfo buildPartial() {
      com.volcengine.service.vod.model.business.PartUploadInfo result = new com.volcengine.service.vod.model.business.PartUploadInfo(this);
      int from_bitField0_ = bitField0_;
      result.partSize_ = partSize_;
      if (((bitField0_ & 0x00000001) != 0)) {
        partPutUrls_ = partPutUrls_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.partPutUrls_ = partPutUrls_;
      result.completePartUrl_ = completePartUrl_;
      result.completeUrlHeaders_ = internalGetCompleteUrlHeaders();
      result.completeUrlHeaders_.makeImmutable();
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
      if (other instanceof com.volcengine.service.vod.model.business.PartUploadInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.PartUploadInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.PartUploadInfo other) {
      if (other == com.volcengine.service.vod.model.business.PartUploadInfo.getDefaultInstance()) return this;
      if (other.getPartSize() != 0L) {
        setPartSize(other.getPartSize());
      }
      if (!other.partPutUrls_.isEmpty()) {
        if (partPutUrls_.isEmpty()) {
          partPutUrls_ = other.partPutUrls_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePartPutUrlsIsMutable();
          partPutUrls_.addAll(other.partPutUrls_);
        }
        onChanged();
      }
      if (!other.getCompletePartUrl().isEmpty()) {
        completePartUrl_ = other.completePartUrl_;
        onChanged();
      }
      internalGetMutableCompleteUrlHeaders().mergeFrom(
          other.internalGetCompleteUrlHeaders());
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
      com.volcengine.service.vod.model.business.PartUploadInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.PartUploadInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long partSize_ ;
    /**
     * <pre>
     * 分片大小 
     * </pre>
     *
     * <code>int64 PartSize = 1;</code>
     * @return The partSize.
     */
    @java.lang.Override
    public long getPartSize() {
      return partSize_;
    }
    /**
     * <pre>
     * 分片大小 
     * </pre>
     *
     * <code>int64 PartSize = 1;</code>
     * @param value The partSize to set.
     * @return This builder for chaining.
     */
    public Builder setPartSize(long value) {
      
      partSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 分片大小 
     * </pre>
     *
     * <code>int64 PartSize = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartSize() {
      
      partSize_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList partPutUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePartPutUrlsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        partPutUrls_ = new com.google.protobuf.LazyStringArrayList(partPutUrls_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @return A list containing the partPutUrls.
     */
    public com.google.protobuf.ProtocolStringList
        getPartPutUrlsList() {
      return partPutUrls_.getUnmodifiableView();
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @return The count of partPutUrls.
     */
    public int getPartPutUrlsCount() {
      return partPutUrls_.size();
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @param index The index of the element to return.
     * @return The partPutUrls at the given index.
     */
    public java.lang.String getPartPutUrls(int index) {
      return partPutUrls_.get(index);
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the partPutUrls at the given index.
     */
    public com.google.protobuf.ByteString
        getPartPutUrlsBytes(int index) {
      return partPutUrls_.getByteString(index);
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @param index The index to set the value at.
     * @param value The partPutUrls to set.
     * @return This builder for chaining.
     */
    public Builder setPartPutUrls(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePartPutUrlsIsMutable();
      partPutUrls_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @param value The partPutUrls to add.
     * @return This builder for chaining.
     */
    public Builder addPartPutUrls(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePartPutUrlsIsMutable();
      partPutUrls_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @param values The partPutUrls to add.
     * @return This builder for chaining.
     */
    public Builder addAllPartPutUrls(
        java.lang.Iterable<java.lang.String> values) {
      ensurePartPutUrlsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, partPutUrls_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartPutUrls() {
      partPutUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 分片上传URLs 
     * </pre>
     *
     * <code>repeated string PartPutUrls = 2;</code>
     * @param value The bytes of the partPutUrls to add.
     * @return This builder for chaining.
     */
    public Builder addPartPutUrlsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePartPutUrlsIsMutable();
      partPutUrls_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object completePartUrl_ = "";
    /**
     * <pre>
     * 合并分片URL 
     * </pre>
     *
     * <code>string CompletePartUrl = 3;</code>
     * @return The completePartUrl.
     */
    public java.lang.String getCompletePartUrl() {
      java.lang.Object ref = completePartUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        completePartUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 合并分片URL 
     * </pre>
     *
     * <code>string CompletePartUrl = 3;</code>
     * @return The bytes for completePartUrl.
     */
    public com.google.protobuf.ByteString
        getCompletePartUrlBytes() {
      java.lang.Object ref = completePartUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        completePartUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 合并分片URL 
     * </pre>
     *
     * <code>string CompletePartUrl = 3;</code>
     * @param value The completePartUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCompletePartUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      completePartUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 合并分片URL 
     * </pre>
     *
     * <code>string CompletePartUrl = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompletePartUrl() {
      
      completePartUrl_ = getDefaultInstance().getCompletePartUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 合并分片URL 
     * </pre>
     *
     * <code>string CompletePartUrl = 3;</code>
     * @param value The bytes for completePartUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCompletePartUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      completePartUrl_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> completeUrlHeaders_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetCompleteUrlHeaders() {
      if (completeUrlHeaders_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CompleteUrlHeadersDefaultEntryHolder.defaultEntry);
      }
      return completeUrlHeaders_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableCompleteUrlHeaders() {
      onChanged();;
      if (completeUrlHeaders_ == null) {
        completeUrlHeaders_ = com.google.protobuf.MapField.newMapField(
            CompleteUrlHeadersDefaultEntryHolder.defaultEntry);
      }
      if (!completeUrlHeaders_.isMutable()) {
        completeUrlHeaders_ = completeUrlHeaders_.copy();
      }
      return completeUrlHeaders_;
    }

    public int getCompleteUrlHeadersCount() {
      return internalGetCompleteUrlHeaders().getMap().size();
    }
    /**
     * <pre>
     * 合并分片阶段需携带的headers 
     * </pre>
     *
     * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
     */

    @java.lang.Override
    public boolean containsCompleteUrlHeaders(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetCompleteUrlHeaders().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCompleteUrlHeadersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getCompleteUrlHeaders() {
      return getCompleteUrlHeadersMap();
    }
    /**
     * <pre>
     * 合并分片阶段需携带的headers 
     * </pre>
     *
     * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getCompleteUrlHeadersMap() {
      return internalGetCompleteUrlHeaders().getMap();
    }
    /**
     * <pre>
     * 合并分片阶段需携带的headers 
     * </pre>
     *
     * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
     */
    @java.lang.Override

    public java.lang.String getCompleteUrlHeadersOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCompleteUrlHeaders().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * 合并分片阶段需携带的headers 
     * </pre>
     *
     * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
     */
    @java.lang.Override

    public java.lang.String getCompleteUrlHeadersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCompleteUrlHeaders().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCompleteUrlHeaders() {
      internalGetMutableCompleteUrlHeaders().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * 合并分片阶段需携带的headers 
     * </pre>
     *
     * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
     */

    public Builder removeCompleteUrlHeaders(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableCompleteUrlHeaders().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableCompleteUrlHeaders() {
      return internalGetMutableCompleteUrlHeaders().getMutableMap();
    }
    /**
     * <pre>
     * 合并分片阶段需携带的headers 
     * </pre>
     *
     * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
     */
    public Builder putCompleteUrlHeaders(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableCompleteUrlHeaders().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * 合并分片阶段需携带的headers 
     * </pre>
     *
     * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
     */

    public Builder putAllCompleteUrlHeaders(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableCompleteUrlHeaders().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.PartUploadInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.PartUploadInfo)
  private static final com.volcengine.service.vod.model.business.PartUploadInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.PartUploadInfo();
  }

  public static com.volcengine.service.vod.model.business.PartUploadInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartUploadInfo>
      PARSER = new com.google.protobuf.AbstractParser<PartUploadInfo>() {
    @java.lang.Override
    public PartUploadInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartUploadInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartUploadInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartUploadInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.PartUploadInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

