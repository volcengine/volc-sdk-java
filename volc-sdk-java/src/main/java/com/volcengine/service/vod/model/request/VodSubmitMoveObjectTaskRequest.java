// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * <pre>
 * **********************************************************************
 * 通用文件
 * **********************************************************************
 * </pre>
 *
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodSubmitMoveObjectTaskRequest}
 */
public final class VodSubmitMoveObjectTaskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodSubmitMoveObjectTaskRequest)
    VodSubmitMoveObjectTaskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodSubmitMoveObjectTaskRequest.newBuilder() to construct.
  private VodSubmitMoveObjectTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodSubmitMoveObjectTaskRequest() {
    sourceSpace_ = "";
    sourceFileName_ = "";
    targetSpace_ = "";
    targetFileName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodSubmitMoveObjectTaskRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodSubmitMoveObjectTaskRequest(
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

            sourceSpace_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sourceFileName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            targetSpace_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            targetFileName_ = s;
            break;
          }
          case 40: {

            saveSourceObject_ = input.readBool();
            break;
          }
          case 48: {

            forceOverwrite_ = input.readBool();
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitMoveObjectTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitMoveObjectTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest.class, com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest.Builder.class);
  }

  public static final int SOURCESPACE_FIELD_NUMBER = 1;
  private volatile java.lang.Object sourceSpace_;
  /**
   * <code>string SourceSpace = 1;</code>
   * @return The sourceSpace.
   */
  @java.lang.Override
  public java.lang.String getSourceSpace() {
    java.lang.Object ref = sourceSpace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceSpace_ = s;
      return s;
    }
  }
  /**
   * <code>string SourceSpace = 1;</code>
   * @return The bytes for sourceSpace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceSpaceBytes() {
    java.lang.Object ref = sourceSpace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceSpace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCEFILENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object sourceFileName_;
  /**
   * <code>string SourceFileName = 2;</code>
   * @return The sourceFileName.
   */
  @java.lang.Override
  public java.lang.String getSourceFileName() {
    java.lang.Object ref = sourceFileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceFileName_ = s;
      return s;
    }
  }
  /**
   * <code>string SourceFileName = 2;</code>
   * @return The bytes for sourceFileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceFileNameBytes() {
    java.lang.Object ref = sourceFileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceFileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGETSPACE_FIELD_NUMBER = 3;
  private volatile java.lang.Object targetSpace_;
  /**
   * <code>string TargetSpace = 3;</code>
   * @return The targetSpace.
   */
  @java.lang.Override
  public java.lang.String getTargetSpace() {
    java.lang.Object ref = targetSpace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetSpace_ = s;
      return s;
    }
  }
  /**
   * <code>string TargetSpace = 3;</code>
   * @return The bytes for targetSpace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetSpaceBytes() {
    java.lang.Object ref = targetSpace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetSpace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGETFILENAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object targetFileName_;
  /**
   * <code>string TargetFileName = 4;</code>
   * @return The targetFileName.
   */
  @java.lang.Override
  public java.lang.String getTargetFileName() {
    java.lang.Object ref = targetFileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetFileName_ = s;
      return s;
    }
  }
  /**
   * <code>string TargetFileName = 4;</code>
   * @return The bytes for targetFileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetFileNameBytes() {
    java.lang.Object ref = targetFileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetFileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAVESOURCEOBJECT_FIELD_NUMBER = 5;
  private boolean saveSourceObject_;
  /**
   * <code>bool SaveSourceObject = 5;</code>
   * @return The saveSourceObject.
   */
  @java.lang.Override
  public boolean getSaveSourceObject() {
    return saveSourceObject_;
  }

  public static final int FORCEOVERWRITE_FIELD_NUMBER = 6;
  private boolean forceOverwrite_;
  /**
   * <code>bool ForceOverwrite = 6;</code>
   * @return The forceOverwrite.
   */
  @java.lang.Override
  public boolean getForceOverwrite() {
    return forceOverwrite_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceSpace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceSpace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceFileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sourceFileName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetSpace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, targetSpace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetFileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, targetFileName_);
    }
    if (saveSourceObject_ != false) {
      output.writeBool(5, saveSourceObject_);
    }
    if (forceOverwrite_ != false) {
      output.writeBool(6, forceOverwrite_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceSpace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceSpace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceFileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sourceFileName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetSpace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, targetSpace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetFileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, targetFileName_);
    }
    if (saveSourceObject_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, saveSourceObject_);
    }
    if (forceOverwrite_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, forceOverwrite_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest other = (com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest) obj;

    if (!getSourceSpace()
        .equals(other.getSourceSpace())) return false;
    if (!getSourceFileName()
        .equals(other.getSourceFileName())) return false;
    if (!getTargetSpace()
        .equals(other.getTargetSpace())) return false;
    if (!getTargetFileName()
        .equals(other.getTargetFileName())) return false;
    if (getSaveSourceObject()
        != other.getSaveSourceObject()) return false;
    if (getForceOverwrite()
        != other.getForceOverwrite()) return false;
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
    hash = (37 * hash) + SOURCESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getSourceSpace().hashCode();
    hash = (37 * hash) + SOURCEFILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSourceFileName().hashCode();
    hash = (37 * hash) + TARGETSPACE_FIELD_NUMBER;
    hash = (53 * hash) + getTargetSpace().hashCode();
    hash = (37 * hash) + TARGETFILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getTargetFileName().hashCode();
    hash = (37 * hash) + SAVESOURCEOBJECT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSaveSourceObject());
    hash = (37 * hash) + FORCEOVERWRITE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForceOverwrite());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest prototype) {
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
   * <pre>
   * **********************************************************************
   * 通用文件
   * **********************************************************************
   * </pre>
   *
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodSubmitMoveObjectTaskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodSubmitMoveObjectTaskRequest)
      com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitMoveObjectTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitMoveObjectTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest.class, com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest.newBuilder()
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
      sourceSpace_ = "";

      sourceFileName_ = "";

      targetSpace_ = "";

      targetFileName_ = "";

      saveSourceObject_ = false;

      forceOverwrite_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodSubmitMoveObjectTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest build() {
      com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest result = new com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest(this);
      result.sourceSpace_ = sourceSpace_;
      result.sourceFileName_ = sourceFileName_;
      result.targetSpace_ = targetSpace_;
      result.targetFileName_ = targetFileName_;
      result.saveSourceObject_ = saveSourceObject_;
      result.forceOverwrite_ = forceOverwrite_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest.getDefaultInstance()) return this;
      if (!other.getSourceSpace().isEmpty()) {
        sourceSpace_ = other.sourceSpace_;
        onChanged();
      }
      if (!other.getSourceFileName().isEmpty()) {
        sourceFileName_ = other.sourceFileName_;
        onChanged();
      }
      if (!other.getTargetSpace().isEmpty()) {
        targetSpace_ = other.targetSpace_;
        onChanged();
      }
      if (!other.getTargetFileName().isEmpty()) {
        targetFileName_ = other.targetFileName_;
        onChanged();
      }
      if (other.getSaveSourceObject() != false) {
        setSaveSourceObject(other.getSaveSourceObject());
      }
      if (other.getForceOverwrite() != false) {
        setForceOverwrite(other.getForceOverwrite());
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
      com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sourceSpace_ = "";
    /**
     * <code>string SourceSpace = 1;</code>
     * @return The sourceSpace.
     */
    public java.lang.String getSourceSpace() {
      java.lang.Object ref = sourceSpace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceSpace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SourceSpace = 1;</code>
     * @return The bytes for sourceSpace.
     */
    public com.google.protobuf.ByteString
        getSourceSpaceBytes() {
      java.lang.Object ref = sourceSpace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceSpace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SourceSpace = 1;</code>
     * @param value The sourceSpace to set.
     * @return This builder for chaining.
     */
    public Builder setSourceSpace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceSpace_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string SourceSpace = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceSpace() {
      
      sourceSpace_ = getDefaultInstance().getSourceSpace();
      onChanged();
      return this;
    }
    /**
     * <code>string SourceSpace = 1;</code>
     * @param value The bytes for sourceSpace to set.
     * @return This builder for chaining.
     */
    public Builder setSourceSpaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceSpace_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sourceFileName_ = "";
    /**
     * <code>string SourceFileName = 2;</code>
     * @return The sourceFileName.
     */
    public java.lang.String getSourceFileName() {
      java.lang.Object ref = sourceFileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceFileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SourceFileName = 2;</code>
     * @return The bytes for sourceFileName.
     */
    public com.google.protobuf.ByteString
        getSourceFileNameBytes() {
      java.lang.Object ref = sourceFileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceFileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SourceFileName = 2;</code>
     * @param value The sourceFileName to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceFileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string SourceFileName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceFileName() {
      
      sourceFileName_ = getDefaultInstance().getSourceFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string SourceFileName = 2;</code>
     * @param value The bytes for sourceFileName to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceFileName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object targetSpace_ = "";
    /**
     * <code>string TargetSpace = 3;</code>
     * @return The targetSpace.
     */
    public java.lang.String getTargetSpace() {
      java.lang.Object ref = targetSpace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetSpace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TargetSpace = 3;</code>
     * @return The bytes for targetSpace.
     */
    public com.google.protobuf.ByteString
        getTargetSpaceBytes() {
      java.lang.Object ref = targetSpace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetSpace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TargetSpace = 3;</code>
     * @param value The targetSpace to set.
     * @return This builder for chaining.
     */
    public Builder setTargetSpace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      targetSpace_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TargetSpace = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetSpace() {
      
      targetSpace_ = getDefaultInstance().getTargetSpace();
      onChanged();
      return this;
    }
    /**
     * <code>string TargetSpace = 3;</code>
     * @param value The bytes for targetSpace to set.
     * @return This builder for chaining.
     */
    public Builder setTargetSpaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      targetSpace_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object targetFileName_ = "";
    /**
     * <code>string TargetFileName = 4;</code>
     * @return The targetFileName.
     */
    public java.lang.String getTargetFileName() {
      java.lang.Object ref = targetFileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetFileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TargetFileName = 4;</code>
     * @return The bytes for targetFileName.
     */
    public com.google.protobuf.ByteString
        getTargetFileNameBytes() {
      java.lang.Object ref = targetFileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetFileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TargetFileName = 4;</code>
     * @param value The targetFileName to set.
     * @return This builder for chaining.
     */
    public Builder setTargetFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      targetFileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TargetFileName = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetFileName() {
      
      targetFileName_ = getDefaultInstance().getTargetFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string TargetFileName = 4;</code>
     * @param value The bytes for targetFileName to set.
     * @return This builder for chaining.
     */
    public Builder setTargetFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      targetFileName_ = value;
      onChanged();
      return this;
    }

    private boolean saveSourceObject_ ;
    /**
     * <code>bool SaveSourceObject = 5;</code>
     * @return The saveSourceObject.
     */
    @java.lang.Override
    public boolean getSaveSourceObject() {
      return saveSourceObject_;
    }
    /**
     * <code>bool SaveSourceObject = 5;</code>
     * @param value The saveSourceObject to set.
     * @return This builder for chaining.
     */
    public Builder setSaveSourceObject(boolean value) {
      
      saveSourceObject_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool SaveSourceObject = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSaveSourceObject() {
      
      saveSourceObject_ = false;
      onChanged();
      return this;
    }

    private boolean forceOverwrite_ ;
    /**
     * <code>bool ForceOverwrite = 6;</code>
     * @return The forceOverwrite.
     */
    @java.lang.Override
    public boolean getForceOverwrite() {
      return forceOverwrite_;
    }
    /**
     * <code>bool ForceOverwrite = 6;</code>
     * @param value The forceOverwrite to set.
     * @return This builder for chaining.
     */
    public Builder setForceOverwrite(boolean value) {
      
      forceOverwrite_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ForceOverwrite = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearForceOverwrite() {
      
      forceOverwrite_ = false;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodSubmitMoveObjectTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodSubmitMoveObjectTaskRequest)
  private static final com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest();
  }

  public static com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodSubmitMoveObjectTaskRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodSubmitMoveObjectTaskRequest>() {
    @java.lang.Override
    public VodSubmitMoveObjectTaskRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodSubmitMoveObjectTaskRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodSubmitMoveObjectTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodSubmitMoveObjectTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodSubmitMoveObjectTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

