// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodCommitUploadInfoData}
 */
public final class VodCommitUploadInfoData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodCommitUploadInfoData)
    VodCommitUploadInfoDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodCommitUploadInfoData.newBuilder() to construct.
  private VodCommitUploadInfoData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodCommitUploadInfoData() {
    vid_ = "";
    posterUri_ = "";
    mid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodCommitUploadInfoData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodCommitUploadInfoData(
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

            vid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            posterUri_ = s;
            break;
          }
          case 26: {
            com.volcengine.service.vod.model.business.VodSourceInfo.Builder subBuilder = null;
            if (sourceInfo_ != null) {
              subBuilder = sourceInfo_.toBuilder();
            }
            sourceInfo_ = input.readMessage(com.volcengine.service.vod.model.business.VodSourceInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sourceInfo_);
              sourceInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            mid_ = s;
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
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodCommitUploadInfoData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodCommitUploadInfoData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodCommitUploadInfoData.class, com.volcengine.service.vod.model.business.VodCommitUploadInfoData.Builder.class);
  }

  public static final int VID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vid_;
  /**
   * <pre>
   * 视频 id 
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  @java.lang.Override
  public java.lang.String getVid() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 视频 id 
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVidBytes() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSTERURI_FIELD_NUMBER = 2;
  private volatile java.lang.Object posterUri_;
  /**
   * <pre>
   * 视频对应的封面图 URI id 
   * </pre>
   *
   * <code>string PosterUri = 2;</code>
   * @return The posterUri.
   */
  @java.lang.Override
  public java.lang.String getPosterUri() {
    java.lang.Object ref = posterUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      posterUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 视频对应的封面图 URI id 
   * </pre>
   *
   * <code>string PosterUri = 2;</code>
   * @return The bytes for posterUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPosterUriBytes() {
    java.lang.Object ref = posterUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      posterUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCEINFO_FIELD_NUMBER = 3;
  private com.volcengine.service.vod.model.business.VodSourceInfo sourceInfo_;
  /**
   * <pre>
   * 视频元信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
   * @return Whether the sourceInfo field is set.
   */
  @java.lang.Override
  public boolean hasSourceInfo() {
    return sourceInfo_ != null;
  }
  /**
   * <pre>
   * 视频元信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
   * @return The sourceInfo.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodSourceInfo getSourceInfo() {
    return sourceInfo_ == null ? com.volcengine.service.vod.model.business.VodSourceInfo.getDefaultInstance() : sourceInfo_;
  }
  /**
   * <pre>
   * 视频元信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodSourceInfoOrBuilder getSourceInfoOrBuilder() {
    return getSourceInfo();
  }

  public static final int MID_FIELD_NUMBER = 4;
  private volatile java.lang.Object mid_;
  /**
   * <pre>
   * 素材 id 
   * </pre>
   *
   * <code>string Mid = 4;</code>
   * @return The mid.
   */
  @java.lang.Override
  public java.lang.String getMid() {
    java.lang.Object ref = mid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 素材 id 
   * </pre>
   *
   * <code>string Mid = 4;</code>
   * @return The bytes for mid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMidBytes() {
    java.lang.Object ref = mid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mid_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(posterUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, posterUri_);
    }
    if (sourceInfo_ != null) {
      output.writeMessage(3, getSourceInfo());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, mid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(posterUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, posterUri_);
    }
    if (sourceInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSourceInfo());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, mid_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodCommitUploadInfoData)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodCommitUploadInfoData other = (com.volcengine.service.vod.model.business.VodCommitUploadInfoData) obj;

    if (!getVid()
        .equals(other.getVid())) return false;
    if (!getPosterUri()
        .equals(other.getPosterUri())) return false;
    if (hasSourceInfo() != other.hasSourceInfo()) return false;
    if (hasSourceInfo()) {
      if (!getSourceInfo()
          .equals(other.getSourceInfo())) return false;
    }
    if (!getMid()
        .equals(other.getMid())) return false;
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
    hash = (37 * hash) + VID_FIELD_NUMBER;
    hash = (53 * hash) + getVid().hashCode();
    hash = (37 * hash) + POSTERURI_FIELD_NUMBER;
    hash = (53 * hash) + getPosterUri().hashCode();
    if (hasSourceInfo()) {
      hash = (37 * hash) + SOURCEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getSourceInfo().hashCode();
    }
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + getMid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodCommitUploadInfoData prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodCommitUploadInfoData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodCommitUploadInfoData)
      com.volcengine.service.vod.model.business.VodCommitUploadInfoDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodCommitUploadInfoData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodCommitUploadInfoData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodCommitUploadInfoData.class, com.volcengine.service.vod.model.business.VodCommitUploadInfoData.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodCommitUploadInfoData.newBuilder()
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
      vid_ = "";

      posterUri_ = "";

      if (sourceInfoBuilder_ == null) {
        sourceInfo_ = null;
      } else {
        sourceInfo_ = null;
        sourceInfoBuilder_ = null;
      }
      mid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodCommitUploadInfoData_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCommitUploadInfoData getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodCommitUploadInfoData.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCommitUploadInfoData build() {
      com.volcengine.service.vod.model.business.VodCommitUploadInfoData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCommitUploadInfoData buildPartial() {
      com.volcengine.service.vod.model.business.VodCommitUploadInfoData result = new com.volcengine.service.vod.model.business.VodCommitUploadInfoData(this);
      result.vid_ = vid_;
      result.posterUri_ = posterUri_;
      if (sourceInfoBuilder_ == null) {
        result.sourceInfo_ = sourceInfo_;
      } else {
        result.sourceInfo_ = sourceInfoBuilder_.build();
      }
      result.mid_ = mid_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodCommitUploadInfoData) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodCommitUploadInfoData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodCommitUploadInfoData other) {
      if (other == com.volcengine.service.vod.model.business.VodCommitUploadInfoData.getDefaultInstance()) return this;
      if (!other.getVid().isEmpty()) {
        vid_ = other.vid_;
        onChanged();
      }
      if (!other.getPosterUri().isEmpty()) {
        posterUri_ = other.posterUri_;
        onChanged();
      }
      if (other.hasSourceInfo()) {
        mergeSourceInfo(other.getSourceInfo());
      }
      if (!other.getMid().isEmpty()) {
        mid_ = other.mid_;
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
      com.volcengine.service.vod.model.business.VodCommitUploadInfoData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodCommitUploadInfoData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vid_ = "";
    /**
     * <pre>
     * 视频 id 
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return The vid.
     */
    public java.lang.String getVid() {
      java.lang.Object ref = vid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 视频 id 
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return The bytes for vid.
     */
    public com.google.protobuf.ByteString
        getVidBytes() {
      java.lang.Object ref = vid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 视频 id 
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @param value The vid to set.
     * @return This builder for chaining.
     */
    public Builder setVid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 视频 id 
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVid() {
      
      vid_ = getDefaultInstance().getVid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 视频 id 
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @param value The bytes for vid to set.
     * @return This builder for chaining.
     */
    public Builder setVidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object posterUri_ = "";
    /**
     * <pre>
     * 视频对应的封面图 URI id 
     * </pre>
     *
     * <code>string PosterUri = 2;</code>
     * @return The posterUri.
     */
    public java.lang.String getPosterUri() {
      java.lang.Object ref = posterUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        posterUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 视频对应的封面图 URI id 
     * </pre>
     *
     * <code>string PosterUri = 2;</code>
     * @return The bytes for posterUri.
     */
    public com.google.protobuf.ByteString
        getPosterUriBytes() {
      java.lang.Object ref = posterUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        posterUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 视频对应的封面图 URI id 
     * </pre>
     *
     * <code>string PosterUri = 2;</code>
     * @param value The posterUri to set.
     * @return This builder for chaining.
     */
    public Builder setPosterUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      posterUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 视频对应的封面图 URI id 
     * </pre>
     *
     * <code>string PosterUri = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPosterUri() {
      
      posterUri_ = getDefaultInstance().getPosterUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 视频对应的封面图 URI id 
     * </pre>
     *
     * <code>string PosterUri = 2;</code>
     * @param value The bytes for posterUri to set.
     * @return This builder for chaining.
     */
    public Builder setPosterUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      posterUri_ = value;
      onChanged();
      return this;
    }

    private com.volcengine.service.vod.model.business.VodSourceInfo sourceInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodSourceInfo, com.volcengine.service.vod.model.business.VodSourceInfo.Builder, com.volcengine.service.vod.model.business.VodSourceInfoOrBuilder> sourceInfoBuilder_;
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     * @return Whether the sourceInfo field is set.
     */
    public boolean hasSourceInfo() {
      return sourceInfoBuilder_ != null || sourceInfo_ != null;
    }
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     * @return The sourceInfo.
     */
    public com.volcengine.service.vod.model.business.VodSourceInfo getSourceInfo() {
      if (sourceInfoBuilder_ == null) {
        return sourceInfo_ == null ? com.volcengine.service.vod.model.business.VodSourceInfo.getDefaultInstance() : sourceInfo_;
      } else {
        return sourceInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     */
    public Builder setSourceInfo(com.volcengine.service.vod.model.business.VodSourceInfo value) {
      if (sourceInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sourceInfo_ = value;
        onChanged();
      } else {
        sourceInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     */
    public Builder setSourceInfo(
        com.volcengine.service.vod.model.business.VodSourceInfo.Builder builderForValue) {
      if (sourceInfoBuilder_ == null) {
        sourceInfo_ = builderForValue.build();
        onChanged();
      } else {
        sourceInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     */
    public Builder mergeSourceInfo(com.volcengine.service.vod.model.business.VodSourceInfo value) {
      if (sourceInfoBuilder_ == null) {
        if (sourceInfo_ != null) {
          sourceInfo_ =
            com.volcengine.service.vod.model.business.VodSourceInfo.newBuilder(sourceInfo_).mergeFrom(value).buildPartial();
        } else {
          sourceInfo_ = value;
        }
        onChanged();
      } else {
        sourceInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     */
    public Builder clearSourceInfo() {
      if (sourceInfoBuilder_ == null) {
        sourceInfo_ = null;
        onChanged();
      } else {
        sourceInfo_ = null;
        sourceInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodSourceInfo.Builder getSourceInfoBuilder() {
      
      onChanged();
      return getSourceInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodSourceInfoOrBuilder getSourceInfoOrBuilder() {
      if (sourceInfoBuilder_ != null) {
        return sourceInfoBuilder_.getMessageOrBuilder();
      } else {
        return sourceInfo_ == null ?
            com.volcengine.service.vod.model.business.VodSourceInfo.getDefaultInstance() : sourceInfo_;
      }
    }
    /**
     * <pre>
     * 视频元信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodSourceInfo, com.volcengine.service.vod.model.business.VodSourceInfo.Builder, com.volcengine.service.vod.model.business.VodSourceInfoOrBuilder> 
        getSourceInfoFieldBuilder() {
      if (sourceInfoBuilder_ == null) {
        sourceInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodSourceInfo, com.volcengine.service.vod.model.business.VodSourceInfo.Builder, com.volcengine.service.vod.model.business.VodSourceInfoOrBuilder>(
                getSourceInfo(),
                getParentForChildren(),
                isClean());
        sourceInfo_ = null;
      }
      return sourceInfoBuilder_;
    }

    private java.lang.Object mid_ = "";
    /**
     * <pre>
     * 素材 id 
     * </pre>
     *
     * <code>string Mid = 4;</code>
     * @return The mid.
     */
    public java.lang.String getMid() {
      java.lang.Object ref = mid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 素材 id 
     * </pre>
     *
     * <code>string Mid = 4;</code>
     * @return The bytes for mid.
     */
    public com.google.protobuf.ByteString
        getMidBytes() {
      java.lang.Object ref = mid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 素材 id 
     * </pre>
     *
     * <code>string Mid = 4;</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 素材 id 
     * </pre>
     *
     * <code>string Mid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      
      mid_ = getDefaultInstance().getMid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 素材 id 
     * </pre>
     *
     * <code>string Mid = 4;</code>
     * @param value The bytes for mid to set.
     * @return This builder for chaining.
     */
    public Builder setMidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mid_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodCommitUploadInfoData)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodCommitUploadInfoData)
  private static final com.volcengine.service.vod.model.business.VodCommitUploadInfoData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodCommitUploadInfoData();
  }

  public static com.volcengine.service.vod.model.business.VodCommitUploadInfoData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodCommitUploadInfoData>
      PARSER = new com.google.protobuf.AbstractParser<VodCommitUploadInfoData>() {
    @java.lang.Override
    public VodCommitUploadInfoData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodCommitUploadInfoData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodCommitUploadInfoData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodCommitUploadInfoData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodCommitUploadInfoData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

