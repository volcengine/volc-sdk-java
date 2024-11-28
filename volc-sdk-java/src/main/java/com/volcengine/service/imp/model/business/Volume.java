// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

/**
 * Protobuf type {@code Volcengine.Imp.Models.Business.Volume}
 */
public final class Volume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Imp.Models.Business.Volume)
    VolumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Volume.newBuilder() to construct.
  private Volume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Volume() {
    method_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Volume();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Volume(
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
            java.lang.String s = input.readStringRequireUtf8();

            method_ = s;
            break;
          }
          case 17: {
            bitField0_ |= 0x00000001;
            integratedLoudness_ = input.readDouble();
            break;
          }
          case 25: {
            bitField0_ |= 0x00000002;
            truePeak_ = input.readDouble();
            break;
          }
          case 33: {
            bitField0_ |= 0x00000004;
            volumeTime_ = input.readDouble();
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
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Volume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Volume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.imp.model.business.Volume.class, com.volcengine.service.imp.model.business.Volume.Builder.class);
  }

  private int bitField0_;
  public static final int METHOD_FIELD_NUMBER = 1;
  private volatile java.lang.Object method_;
  /**
   * <code>string Method = 1;</code>
   * @return The method.
   */
  @java.lang.Override
  public java.lang.String getMethod() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      method_ = s;
      return s;
    }
  }
  /**
   * <code>string Method = 1;</code>
   * @return The bytes for method.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMethodBytes() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      method_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTEGRATEDLOUDNESS_FIELD_NUMBER = 2;
  private double integratedLoudness_;
  /**
   * <code>double IntegratedLoudness = 2;</code>
   * @return Whether the integratedLoudness field is set.
   */
  @java.lang.Override
  public boolean hasIntegratedLoudness() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>double IntegratedLoudness = 2;</code>
   * @return The integratedLoudness.
   */
  @java.lang.Override
  public double getIntegratedLoudness() {
    return integratedLoudness_;
  }

  public static final int TRUEPEAK_FIELD_NUMBER = 3;
  private double truePeak_;
  /**
   * <code>double TruePeak = 3;</code>
   * @return Whether the truePeak field is set.
   */
  @java.lang.Override
  public boolean hasTruePeak() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>double TruePeak = 3;</code>
   * @return The truePeak.
   */
  @java.lang.Override
  public double getTruePeak() {
    return truePeak_;
  }

  public static final int VOLUMETIME_FIELD_NUMBER = 4;
  private double volumeTime_;
  /**
   * <code>double VolumeTime = 4;</code>
   * @return Whether the volumeTime field is set.
   */
  @java.lang.Override
  public boolean hasVolumeTime() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>double VolumeTime = 4;</code>
   * @return The volumeTime.
   */
  @java.lang.Override
  public double getVolumeTime() {
    return volumeTime_;
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
    if (!getMethodBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, method_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(2, integratedLoudness_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(3, truePeak_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeDouble(4, volumeTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMethodBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, method_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, integratedLoudness_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, truePeak_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, volumeTime_);
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
    if (!(obj instanceof com.volcengine.service.imp.model.business.Volume)) {
      return super.equals(obj);
    }
    com.volcengine.service.imp.model.business.Volume other = (com.volcengine.service.imp.model.business.Volume) obj;

    if (!getMethod()
        .equals(other.getMethod())) return false;
    if (hasIntegratedLoudness() != other.hasIntegratedLoudness()) return false;
    if (hasIntegratedLoudness()) {
      if (java.lang.Double.doubleToLongBits(getIntegratedLoudness())
          != java.lang.Double.doubleToLongBits(
              other.getIntegratedLoudness())) return false;
    }
    if (hasTruePeak() != other.hasTruePeak()) return false;
    if (hasTruePeak()) {
      if (java.lang.Double.doubleToLongBits(getTruePeak())
          != java.lang.Double.doubleToLongBits(
              other.getTruePeak())) return false;
    }
    if (hasVolumeTime() != other.hasVolumeTime()) return false;
    if (hasVolumeTime()) {
      if (java.lang.Double.doubleToLongBits(getVolumeTime())
          != java.lang.Double.doubleToLongBits(
              other.getVolumeTime())) return false;
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
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getMethod().hashCode();
    if (hasIntegratedLoudness()) {
      hash = (37 * hash) + INTEGRATEDLOUDNESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getIntegratedLoudness()));
    }
    if (hasTruePeak()) {
      hash = (37 * hash) + TRUEPEAK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getTruePeak()));
    }
    if (hasVolumeTime()) {
      hash = (37 * hash) + VOLUMETIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getVolumeTime()));
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.imp.model.business.Volume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Volume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Volume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.Volume parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.imp.model.business.Volume prototype) {
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
   * Protobuf type {@code Volcengine.Imp.Models.Business.Volume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Imp.Models.Business.Volume)
      com.volcengine.service.imp.model.business.VolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Volume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Volume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.imp.model.business.Volume.class, com.volcengine.service.imp.model.business.Volume.Builder.class);
    }

    // Construct using com.volcengine.service.imp.model.business.Volume.newBuilder()
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
      method_ = "";

      integratedLoudness_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000001);
      truePeak_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000002);
      volumeTime_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_Volume_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Volume getDefaultInstanceForType() {
      return com.volcengine.service.imp.model.business.Volume.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Volume build() {
      com.volcengine.service.imp.model.business.Volume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.Volume buildPartial() {
      com.volcengine.service.imp.model.business.Volume result = new com.volcengine.service.imp.model.business.Volume(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.method_ = method_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.integratedLoudness_ = integratedLoudness_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.truePeak_ = truePeak_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.volumeTime_ = volumeTime_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.volcengine.service.imp.model.business.Volume) {
        return mergeFrom((com.volcengine.service.imp.model.business.Volume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.imp.model.business.Volume other) {
      if (other == com.volcengine.service.imp.model.business.Volume.getDefaultInstance()) return this;
      if (!other.getMethod().isEmpty()) {
        method_ = other.method_;
        onChanged();
      }
      if (other.hasIntegratedLoudness()) {
        setIntegratedLoudness(other.getIntegratedLoudness());
      }
      if (other.hasTruePeak()) {
        setTruePeak(other.getTruePeak());
      }
      if (other.hasVolumeTime()) {
        setVolumeTime(other.getVolumeTime());
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
      com.volcengine.service.imp.model.business.Volume parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.imp.model.business.Volume) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object method_ = "";
    /**
     * <code>string Method = 1;</code>
     * @return The method.
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Method = 1;</code>
     * @return The bytes for method.
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Method = 1;</code>
     * @param value The method to set.
     * @return This builder for chaining.
     */
    public Builder setMethod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Method = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMethod() {
      
      method_ = getDefaultInstance().getMethod();
      onChanged();
      return this;
    }
    /**
     * <code>string Method = 1;</code>
     * @param value The bytes for method to set.
     * @return This builder for chaining.
     */
    public Builder setMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      method_ = value;
      onChanged();
      return this;
    }

    private double integratedLoudness_ ;
    /**
     * <code>double IntegratedLoudness = 2;</code>
     * @return Whether the integratedLoudness field is set.
     */
    @java.lang.Override
    public boolean hasIntegratedLoudness() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>double IntegratedLoudness = 2;</code>
     * @return The integratedLoudness.
     */
    @java.lang.Override
    public double getIntegratedLoudness() {
      return integratedLoudness_;
    }
    /**
     * <code>double IntegratedLoudness = 2;</code>
     * @param value The integratedLoudness to set.
     * @return This builder for chaining.
     */
    public Builder setIntegratedLoudness(double value) {
      bitField0_ |= 0x00000001;
      integratedLoudness_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double IntegratedLoudness = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntegratedLoudness() {
      bitField0_ = (bitField0_ & ~0x00000001);
      integratedLoudness_ = 0D;
      onChanged();
      return this;
    }

    private double truePeak_ ;
    /**
     * <code>double TruePeak = 3;</code>
     * @return Whether the truePeak field is set.
     */
    @java.lang.Override
    public boolean hasTruePeak() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>double TruePeak = 3;</code>
     * @return The truePeak.
     */
    @java.lang.Override
    public double getTruePeak() {
      return truePeak_;
    }
    /**
     * <code>double TruePeak = 3;</code>
     * @param value The truePeak to set.
     * @return This builder for chaining.
     */
    public Builder setTruePeak(double value) {
      bitField0_ |= 0x00000002;
      truePeak_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double TruePeak = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTruePeak() {
      bitField0_ = (bitField0_ & ~0x00000002);
      truePeak_ = 0D;
      onChanged();
      return this;
    }

    private double volumeTime_ ;
    /**
     * <code>double VolumeTime = 4;</code>
     * @return Whether the volumeTime field is set.
     */
    @java.lang.Override
    public boolean hasVolumeTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>double VolumeTime = 4;</code>
     * @return The volumeTime.
     */
    @java.lang.Override
    public double getVolumeTime() {
      return volumeTime_;
    }
    /**
     * <code>double VolumeTime = 4;</code>
     * @param value The volumeTime to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeTime(double value) {
      bitField0_ |= 0x00000004;
      volumeTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double VolumeTime = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVolumeTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      volumeTime_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Imp.Models.Business.Volume)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Imp.Models.Business.Volume)
  private static final com.volcengine.service.imp.model.business.Volume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.imp.model.business.Volume();
  }

  public static com.volcengine.service.imp.model.business.Volume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Volume>
      PARSER = new com.google.protobuf.AbstractParser<Volume>() {
    @java.lang.Override
    public Volume parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Volume(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Volume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Volume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.imp.model.business.Volume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

