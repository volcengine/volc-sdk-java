// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

/**
 * Protobuf type {@code Volcengine.Imp.Models.Business.Job}
 */
public final class Job extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Imp.Models.Business.Job)
    JobOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Job.newBuilder() to construct.
  private Job(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Job() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Job();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Job(
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
            com.volcengine.service.imp.model.business.TranscodeVideoJob.Builder subBuilder = null;
            if (transcodeVideo_ != null) {
              subBuilder = transcodeVideo_.toBuilder();
            }
            transcodeVideo_ = input.readMessage(com.volcengine.service.imp.model.business.TranscodeVideoJob.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transcodeVideo_);
              transcodeVideo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.volcengine.service.imp.model.business.ByteHDJob.Builder subBuilder = null;
            if (byteHD_ != null) {
              subBuilder = byteHD_.toBuilder();
            }
            byteHD_ = input.readMessage(com.volcengine.service.imp.model.business.ByteHDJob.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(byteHD_);
              byteHD_ = subBuilder.buildPartial();
            }

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
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Job_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Job_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.imp.model.business.Job.class, com.volcengine.service.imp.model.business.Job.Builder.class);
  }

  public static final int TRANSCODEVIDEO_FIELD_NUMBER = 1;
  private com.volcengine.service.imp.model.business.TranscodeVideoJob transcodeVideo_;
  /**
   * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
   * @return Whether the transcodeVideo field is set.
   */
  @java.lang.Override
  public boolean hasTranscodeVideo() {
    return transcodeVideo_ != null;
  }
  /**
   * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
   * @return The transcodeVideo.
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.TranscodeVideoJob getTranscodeVideo() {
    return transcodeVideo_ == null ? com.volcengine.service.imp.model.business.TranscodeVideoJob.getDefaultInstance() : transcodeVideo_;
  }
  /**
   * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.TranscodeVideoJobOrBuilder getTranscodeVideoOrBuilder() {
    return getTranscodeVideo();
  }

  public static final int BYTEHD_FIELD_NUMBER = 2;
  private com.volcengine.service.imp.model.business.ByteHDJob byteHD_;
  /**
   * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
   * @return Whether the byteHD field is set.
   */
  @java.lang.Override
  public boolean hasByteHD() {
    return byteHD_ != null;
  }
  /**
   * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
   * @return The byteHD.
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.ByteHDJob getByteHD() {
    return byteHD_ == null ? com.volcengine.service.imp.model.business.ByteHDJob.getDefaultInstance() : byteHD_;
  }
  /**
   * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.imp.model.business.ByteHDJobOrBuilder getByteHDOrBuilder() {
    return getByteHD();
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
    if (transcodeVideo_ != null) {
      output.writeMessage(1, getTranscodeVideo());
    }
    if (byteHD_ != null) {
      output.writeMessage(2, getByteHD());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transcodeVideo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTranscodeVideo());
    }
    if (byteHD_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getByteHD());
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
    if (!(obj instanceof com.volcengine.service.imp.model.business.Job)) {
      return super.equals(obj);
    }
    com.volcengine.service.imp.model.business.Job other = (com.volcengine.service.imp.model.business.Job) obj;

    if (hasTranscodeVideo() != other.hasTranscodeVideo()) return false;
    if (hasTranscodeVideo()) {
      if (!getTranscodeVideo()
          .equals(other.getTranscodeVideo())) return false;
    }
    if (hasByteHD() != other.hasByteHD()) return false;
    if (hasByteHD()) {
      if (!getByteHD()
          .equals(other.getByteHD())) return false;
    }
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
    if (hasTranscodeVideo()) {
      hash = (37 * hash) + TRANSCODEVIDEO_FIELD_NUMBER;
      hash = (53 * hash) + getTranscodeVideo().hashCode();
    }
    if (hasByteHD()) {
      hash = (37 * hash) + BYTEHD_FIELD_NUMBER;
      hash = (53 * hash) + getByteHD().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.imp.model.business.Job parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Job parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Job parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Job parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.imp.model.business.Job prototype) {
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
   * Protobuf type {@code Volcengine.Imp.Models.Business.Job}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Imp.Models.Business.Job)
      com.volcengine.service.imp.model.business.JobOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Job_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Job_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.imp.model.business.Job.class, com.volcengine.service.imp.model.business.Job.Builder.class);
    }

    // Construct using com.volcengine.service.imp.model.business.Job.newBuilder()
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
      if (transcodeVideoBuilder_ == null) {
        transcodeVideo_ = null;
      } else {
        transcodeVideo_ = null;
        transcodeVideoBuilder_ = null;
      }
      if (byteHDBuilder_ == null) {
        byteHD_ = null;
      } else {
        byteHD_ = null;
        byteHDBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Job_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Job getDefaultInstanceForType() {
      return com.volcengine.service.imp.model.business.Job.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Job build() {
      com.volcengine.service.imp.model.business.Job result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Job buildPartial() {
      com.volcengine.service.imp.model.business.Job result = new com.volcengine.service.imp.model.business.Job(this);
      if (transcodeVideoBuilder_ == null) {
        result.transcodeVideo_ = transcodeVideo_;
      } else {
        result.transcodeVideo_ = transcodeVideoBuilder_.build();
      }
      if (byteHDBuilder_ == null) {
        result.byteHD_ = byteHD_;
      } else {
        result.byteHD_ = byteHDBuilder_.build();
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
      if (other instanceof com.volcengine.service.imp.model.business.Job) {
        return mergeFrom((com.volcengine.service.imp.model.business.Job)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.imp.model.business.Job other) {
      if (other == com.volcengine.service.imp.model.business.Job.getDefaultInstance()) return this;
      if (other.hasTranscodeVideo()) {
        mergeTranscodeVideo(other.getTranscodeVideo());
      }
      if (other.hasByteHD()) {
        mergeByteHD(other.getByteHD());
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
      com.volcengine.service.imp.model.business.Job parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.imp.model.business.Job) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.volcengine.service.imp.model.business.TranscodeVideoJob transcodeVideo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.imp.model.business.TranscodeVideoJob, com.volcengine.service.imp.model.business.TranscodeVideoJob.Builder, com.volcengine.service.imp.model.business.TranscodeVideoJobOrBuilder> transcodeVideoBuilder_;
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     * @return Whether the transcodeVideo field is set.
     */
    public boolean hasTranscodeVideo() {
      return transcodeVideoBuilder_ != null || transcodeVideo_ != null;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     * @return The transcodeVideo.
     */
    public com.volcengine.service.imp.model.business.TranscodeVideoJob getTranscodeVideo() {
      if (transcodeVideoBuilder_ == null) {
        return transcodeVideo_ == null ? com.volcengine.service.imp.model.business.TranscodeVideoJob.getDefaultInstance() : transcodeVideo_;
      } else {
        return transcodeVideoBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     */
    public Builder setTranscodeVideo(com.volcengine.service.imp.model.business.TranscodeVideoJob value) {
      if (transcodeVideoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transcodeVideo_ = value;
        onChanged();
      } else {
        transcodeVideoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     */
    public Builder setTranscodeVideo(
        com.volcengine.service.imp.model.business.TranscodeVideoJob.Builder builderForValue) {
      if (transcodeVideoBuilder_ == null) {
        transcodeVideo_ = builderForValue.build();
        onChanged();
      } else {
        transcodeVideoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     */
    public Builder mergeTranscodeVideo(com.volcengine.service.imp.model.business.TranscodeVideoJob value) {
      if (transcodeVideoBuilder_ == null) {
        if (transcodeVideo_ != null) {
          transcodeVideo_ =
            com.volcengine.service.imp.model.business.TranscodeVideoJob.newBuilder(transcodeVideo_).mergeFrom(value).buildPartial();
        } else {
          transcodeVideo_ = value;
        }
        onChanged();
      } else {
        transcodeVideoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     */
    public Builder clearTranscodeVideo() {
      if (transcodeVideoBuilder_ == null) {
        transcodeVideo_ = null;
        onChanged();
      } else {
        transcodeVideo_ = null;
        transcodeVideoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     */
    public com.volcengine.service.imp.model.business.TranscodeVideoJob.Builder getTranscodeVideoBuilder() {
      
      onChanged();
      return getTranscodeVideoFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     */
    public com.volcengine.service.imp.model.business.TranscodeVideoJobOrBuilder getTranscodeVideoOrBuilder() {
      if (transcodeVideoBuilder_ != null) {
        return transcodeVideoBuilder_.getMessageOrBuilder();
      } else {
        return transcodeVideo_ == null ?
            com.volcengine.service.imp.model.business.TranscodeVideoJob.getDefaultInstance() : transcodeVideo_;
      }
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.TranscodeVideoJob TranscodeVideo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.imp.model.business.TranscodeVideoJob, com.volcengine.service.imp.model.business.TranscodeVideoJob.Builder, com.volcengine.service.imp.model.business.TranscodeVideoJobOrBuilder> 
        getTranscodeVideoFieldBuilder() {
      if (transcodeVideoBuilder_ == null) {
        transcodeVideoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.imp.model.business.TranscodeVideoJob, com.volcengine.service.imp.model.business.TranscodeVideoJob.Builder, com.volcengine.service.imp.model.business.TranscodeVideoJobOrBuilder>(
                getTranscodeVideo(),
                getParentForChildren(),
                isClean());
        transcodeVideo_ = null;
      }
      return transcodeVideoBuilder_;
    }

    private com.volcengine.service.imp.model.business.ByteHDJob byteHD_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.imp.model.business.ByteHDJob, com.volcengine.service.imp.model.business.ByteHDJob.Builder, com.volcengine.service.imp.model.business.ByteHDJobOrBuilder> byteHDBuilder_;
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     * @return Whether the byteHD field is set.
     */
    public boolean hasByteHD() {
      return byteHDBuilder_ != null || byteHD_ != null;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     * @return The byteHD.
     */
    public com.volcengine.service.imp.model.business.ByteHDJob getByteHD() {
      if (byteHDBuilder_ == null) {
        return byteHD_ == null ? com.volcengine.service.imp.model.business.ByteHDJob.getDefaultInstance() : byteHD_;
      } else {
        return byteHDBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     */
    public Builder setByteHD(com.volcengine.service.imp.model.business.ByteHDJob value) {
      if (byteHDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        byteHD_ = value;
        onChanged();
      } else {
        byteHDBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     */
    public Builder setByteHD(
        com.volcengine.service.imp.model.business.ByteHDJob.Builder builderForValue) {
      if (byteHDBuilder_ == null) {
        byteHD_ = builderForValue.build();
        onChanged();
      } else {
        byteHDBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     */
    public Builder mergeByteHD(com.volcengine.service.imp.model.business.ByteHDJob value) {
      if (byteHDBuilder_ == null) {
        if (byteHD_ != null) {
          byteHD_ =
            com.volcengine.service.imp.model.business.ByteHDJob.newBuilder(byteHD_).mergeFrom(value).buildPartial();
        } else {
          byteHD_ = value;
        }
        onChanged();
      } else {
        byteHDBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     */
    public Builder clearByteHD() {
      if (byteHDBuilder_ == null) {
        byteHD_ = null;
        onChanged();
      } else {
        byteHD_ = null;
        byteHDBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     */
    public com.volcengine.service.imp.model.business.ByteHDJob.Builder getByteHDBuilder() {
      
      onChanged();
      return getByteHDFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     */
    public com.volcengine.service.imp.model.business.ByteHDJobOrBuilder getByteHDOrBuilder() {
      if (byteHDBuilder_ != null) {
        return byteHDBuilder_.getMessageOrBuilder();
      } else {
        return byteHD_ == null ?
            com.volcengine.service.imp.model.business.ByteHDJob.getDefaultInstance() : byteHD_;
      }
    }
    /**
     * <code>.Volcengine.Imp.Models.Business.ByteHDJob ByteHD = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.imp.model.business.ByteHDJob, com.volcengine.service.imp.model.business.ByteHDJob.Builder, com.volcengine.service.imp.model.business.ByteHDJobOrBuilder> 
        getByteHDFieldBuilder() {
      if (byteHDBuilder_ == null) {
        byteHDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.imp.model.business.ByteHDJob, com.volcengine.service.imp.model.business.ByteHDJob.Builder, com.volcengine.service.imp.model.business.ByteHDJobOrBuilder>(
                getByteHD(),
                getParentForChildren(),
                isClean());
        byteHD_ = null;
      }
      return byteHDBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Imp.Models.Business.Job)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Imp.Models.Business.Job)
  private static final com.volcengine.service.imp.model.business.Job DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.imp.model.business.Job();
  }

  public static com.volcengine.service.imp.model.business.Job getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Job>
      PARSER = new com.google.protobuf.AbstractParser<Job>() {
    @java.lang.Override
    public Job parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Job(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Job> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Job> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.imp.model.business.Job getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

