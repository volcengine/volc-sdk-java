// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/stream_manage.proto

package com.volcengine.service.live.model.business;

/**
 * Protobuf type {@code Volcengine.Live.Models.Business.StreamStateInfo}
 */
public final class StreamStateInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Business.StreamStateInfo)
    StreamStateInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamStateInfo.newBuilder() to construct.
  private StreamStateInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamStateInfo() {
    streamState_ = "";
    type_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamStateInfo();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamStateInfo(
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

            streamState_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            type_ = s;
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
    return StreamManage.internal_static_Volcengine_Live_Models_Business_StreamStateInfo_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return StreamManage.internal_static_Volcengine_Live_Models_Business_StreamStateInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            StreamStateInfo.class, Builder.class);
  }

  public static final int STREAM_STATE_FIELD_NUMBER = 1;
  private volatile Object streamState_;
  /**
   * <pre>
   * 直播流状态。
   *&lt;li&gt;online：在线流；
   *&lt;li&gt;offline：历史流；
   *&lt;li&gt;forbidden：禁推流。
   * </pre>
   *
   * <code>string stream_state = 1;</code>
   * @return The streamState.
   */
  @Override
  public String getStreamState() {
    Object ref = streamState_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      streamState_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 直播流状态。
   *&lt;li&gt;online：在线流；
   *&lt;li&gt;offline：历史流；
   *&lt;li&gt;forbidden：禁推流。
   * </pre>
   *
   * <code>string stream_state = 1;</code>
   * @return The bytes for streamState.
   */
  @Override
  public com.google.protobuf.ByteString
      getStreamStateBytes() {
    Object ref = streamState_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      streamState_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile Object type_;
  /**
   * <pre>
   * 直播流类型。
   *&lt;li&gt;push：直推直拉；
   *&lt;li&gt;pull：回源拉流。
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  @Override
  public String getType() {
    Object ref = type_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 直播流类型。
   *&lt;li&gt;push：直推直拉；
   *&lt;li&gt;pull：回源拉流。
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  @Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    Object ref = type_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      type_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(streamState_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, streamState_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(streamState_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, streamState_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
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
    if (!(obj instanceof StreamStateInfo)) {
      return super.equals(obj);
    }
    StreamStateInfo other = (StreamStateInfo) obj;

    if (!getStreamState()
        .equals(other.getStreamState())) return false;
    if (!getType()
        .equals(other.getType())) return false;
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
    hash = (37 * hash) + STREAM_STATE_FIELD_NUMBER;
    hash = (53 * hash) + getStreamState().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static StreamStateInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamStateInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamStateInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamStateInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamStateInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamStateInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamStateInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StreamStateInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static StreamStateInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static StreamStateInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static StreamStateInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StreamStateInfo parseFrom(
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
  public static Builder newBuilder(StreamStateInfo prototype) {
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
   * Protobuf type {@code Volcengine.Live.Models.Business.StreamStateInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Business.StreamStateInfo)
      StreamStateInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StreamManage.internal_static_Volcengine_Live_Models_Business_StreamStateInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StreamManage.internal_static_Volcengine_Live_Models_Business_StreamStateInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StreamStateInfo.class, Builder.class);
    }

    // Construct using com.volcengine.service.live.model.business.StreamStateInfo.newBuilder()
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
      streamState_ = "";

      type_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return StreamManage.internal_static_Volcengine_Live_Models_Business_StreamStateInfo_descriptor;
    }

    @Override
    public StreamStateInfo getDefaultInstanceForType() {
      return StreamStateInfo.getDefaultInstance();
    }

    @Override
    public StreamStateInfo build() {
      StreamStateInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public StreamStateInfo buildPartial() {
      StreamStateInfo result = new StreamStateInfo(this);
      result.streamState_ = streamState_;
      result.type_ = type_;
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
      if (other instanceof StreamStateInfo) {
        return mergeFrom((StreamStateInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(StreamStateInfo other) {
      if (other == StreamStateInfo.getDefaultInstance()) return this;
      if (!other.getStreamState().isEmpty()) {
        streamState_ = other.streamState_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
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
      StreamStateInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (StreamStateInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object streamState_ = "";
    /**
     * <pre>
     * 直播流状态。
     *&lt;li&gt;online：在线流；
     *&lt;li&gt;offline：历史流；
     *&lt;li&gt;forbidden：禁推流。
     * </pre>
     *
     * <code>string stream_state = 1;</code>
     * @return The streamState.
     */
    public String getStreamState() {
      Object ref = streamState_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        streamState_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 直播流状态。
     *&lt;li&gt;online：在线流；
     *&lt;li&gt;offline：历史流；
     *&lt;li&gt;forbidden：禁推流。
     * </pre>
     *
     * <code>string stream_state = 1;</code>
     * @return The bytes for streamState.
     */
    public com.google.protobuf.ByteString
        getStreamStateBytes() {
      Object ref = streamState_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        streamState_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 直播流状态。
     *&lt;li&gt;online：在线流；
     *&lt;li&gt;offline：历史流；
     *&lt;li&gt;forbidden：禁推流。
     * </pre>
     *
     * <code>string stream_state = 1;</code>
     * @param value The streamState to set.
     * @return This builder for chaining.
     */
    public Builder setStreamState(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      streamState_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 直播流状态。
     *&lt;li&gt;online：在线流；
     *&lt;li&gt;offline：历史流；
     *&lt;li&gt;forbidden：禁推流。
     * </pre>
     *
     * <code>string stream_state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreamState() {
      
      streamState_ = getDefaultInstance().getStreamState();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 直播流状态。
     *&lt;li&gt;online：在线流；
     *&lt;li&gt;offline：历史流；
     *&lt;li&gt;forbidden：禁推流。
     * </pre>
     *
     * <code>string stream_state = 1;</code>
     * @param value The bytes for streamState to set.
     * @return This builder for chaining.
     */
    public Builder setStreamStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      streamState_ = value;
      onChanged();
      return this;
    }

    private Object type_ = "";
    /**
     * <pre>
     * 直播流类型。
     *&lt;li&gt;push：直推直拉；
     *&lt;li&gt;pull：回源拉流。
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return The type.
     */
    public String getType() {
      Object ref = type_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 直播流类型。
     *&lt;li&gt;push：直推直拉；
     *&lt;li&gt;pull：回源拉流。
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 直播流类型。
     *&lt;li&gt;push：直推直拉；
     *&lt;li&gt;pull：回源拉流。
     * </pre>
     *
     * <code>string type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 直播流类型。
     *&lt;li&gt;push：直推直拉；
     *&lt;li&gt;pull：回源拉流。
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 直播流类型。
     *&lt;li&gt;push：直推直拉；
     *&lt;li&gt;pull：回源拉流。
     * </pre>
     *
     * <code>string type = 2;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Business.StreamStateInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Business.StreamStateInfo)
  private static final StreamStateInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StreamStateInfo();
  }

  public static StreamStateInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamStateInfo>
      PARSER = new com.google.protobuf.AbstractParser<StreamStateInfo>() {
    @Override
    public StreamStateInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamStateInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamStateInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<StreamStateInfo> getParserForType() {
    return PARSER;
  }

  @Override
  public StreamStateInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

