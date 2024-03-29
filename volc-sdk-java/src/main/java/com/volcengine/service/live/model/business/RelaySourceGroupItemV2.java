// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/relay_source.proto

package com.volcengine.service.live.model.business;

/**
 * Protobuf type {@code Volcengine.Live.Models.Business.RelaySourceGroupItemV2}
 */
public final class RelaySourceGroupItemV2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Business.RelaySourceGroupItemV2)
    RelaySourceGroupItemV2OrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelaySourceGroupItemV2.newBuilder() to construct.
  private RelaySourceGroupItemV2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelaySourceGroupItemV2() {
    relaySourceDomainList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    relaySourceProtocol_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelaySourceGroupItemV2();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RelaySourceGroupItemV2(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              relaySourceDomainList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            relaySourceDomainList_.add(s);
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              relaySourceParams_ = com.google.protobuf.MapField.newMapField(
                  RelaySourceParamsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<String, String>
            relaySourceParams__ = input.readMessage(
                RelaySourceParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            relaySourceParams_.getMutableMap().put(
                relaySourceParams__.getKey(), relaySourceParams__.getValue());
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            relaySourceProtocol_ = s;
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
        relaySourceDomainList_ = relaySourceDomainList_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RelaySource.internal_static_Volcengine_Live_Models_Business_RelaySourceGroupItemV2_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetRelaySourceParams();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RelaySource.internal_static_Volcengine_Live_Models_Business_RelaySourceGroupItemV2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RelaySourceGroupItemV2.class, Builder.class);
  }

  public static final int RELAYSOURCEDOMAINLIST_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList relaySourceDomainList_;
  /**
   * <pre>
   * 回源地址数组
   * </pre>
   *
   * <code>repeated string RelaySourceDomainList = 1;</code>
   * @return A list containing the relaySourceDomainList.
   */
  public com.google.protobuf.ProtocolStringList
      getRelaySourceDomainListList() {
    return relaySourceDomainList_;
  }
  /**
   * <pre>
   * 回源地址数组
   * </pre>
   *
   * <code>repeated string RelaySourceDomainList = 1;</code>
   * @return The count of relaySourceDomainList.
   */
  public int getRelaySourceDomainListCount() {
    return relaySourceDomainList_.size();
  }
  /**
   * <pre>
   * 回源地址数组
   * </pre>
   *
   * <code>repeated string RelaySourceDomainList = 1;</code>
   * @param index The index of the element to return.
   * @return The relaySourceDomainList at the given index.
   */
  public String getRelaySourceDomainList(int index) {
    return relaySourceDomainList_.get(index);
  }
  /**
   * <pre>
   * 回源地址数组
   * </pre>
   *
   * <code>repeated string RelaySourceDomainList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the relaySourceDomainList at the given index.
   */
  public com.google.protobuf.ByteString
      getRelaySourceDomainListBytes(int index) {
    return relaySourceDomainList_.getByteString(index);
  }

  public static final int RELAYSOURCEPARAMS_FIELD_NUMBER = 2;
  private static final class RelaySourceParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, String> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, String>newDefaultInstance(
                RelaySource.internal_static_Volcengine_Live_Models_Business_RelaySourceGroupItemV2_RelaySourceParamsEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      String, String> relaySourceParams_;
  private com.google.protobuf.MapField<String, String>
  internalGetRelaySourceParams() {
    if (relaySourceParams_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          RelaySourceParamsDefaultEntryHolder.defaultEntry);
    }
    return relaySourceParams_;
  }

  public int getRelaySourceParamsCount() {
    return internalGetRelaySourceParams().getMap().size();
  }
  /**
   * <pre>
   * 回源参数。
   * </pre>
   *
   * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
   */

  @Override
  public boolean containsRelaySourceParams(
      String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetRelaySourceParams().getMap().containsKey(key);
  }
  /**
   * Use {@link #getRelaySourceParamsMap()} instead.
   */
  @Override
  @Deprecated
  public java.util.Map<String, String> getRelaySourceParams() {
    return getRelaySourceParamsMap();
  }
  /**
   * <pre>
   * 回源参数。
   * </pre>
   *
   * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
   */
  @Override

  public java.util.Map<String, String> getRelaySourceParamsMap() {
    return internalGetRelaySourceParams().getMap();
  }
  /**
   * <pre>
   * 回源参数。
   * </pre>
   *
   * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
   */
  @Override

  public String getRelaySourceParamsOrDefault(
      String key,
      String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<String, String> map =
        internalGetRelaySourceParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * 回源参数。
   * </pre>
   *
   * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
   */
  @Override

  public String getRelaySourceParamsOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<String, String> map =
        internalGetRelaySourceParams().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int RELAYSOURCEPROTOCOL_FIELD_NUMBER = 3;
  private volatile Object relaySourceProtocol_;
  /**
   * <pre>
   * 回源协议，目前只支持以下两种：&lt;li&gt;rmtp &lt;li&gt;flv。
   * </pre>
   *
   * <code>string RelaySourceProtocol = 3;</code>
   * @return The relaySourceProtocol.
   */
  @Override
  public String getRelaySourceProtocol() {
    Object ref = relaySourceProtocol_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      relaySourceProtocol_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 回源协议，目前只支持以下两种：&lt;li&gt;rmtp &lt;li&gt;flv。
   * </pre>
   *
   * <code>string RelaySourceProtocol = 3;</code>
   * @return The bytes for relaySourceProtocol.
   */
  @Override
  public com.google.protobuf.ByteString
      getRelaySourceProtocolBytes() {
    Object ref = relaySourceProtocol_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      relaySourceProtocol_ = b;
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
    for (int i = 0; i < relaySourceDomainList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, relaySourceDomainList_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetRelaySourceParams(),
        RelaySourceParamsDefaultEntryHolder.defaultEntry,
        2);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relaySourceProtocol_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, relaySourceProtocol_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < relaySourceDomainList_.size(); i++) {
        dataSize += computeStringSizeNoTag(relaySourceDomainList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRelaySourceDomainListList().size();
    }
    for (java.util.Map.Entry<String, String> entry
         : internalGetRelaySourceParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, String>
      relaySourceParams__ = RelaySourceParamsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, relaySourceParams__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relaySourceProtocol_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, relaySourceProtocol_);
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
    if (!(obj instanceof RelaySourceGroupItemV2)) {
      return super.equals(obj);
    }
    RelaySourceGroupItemV2 other = (RelaySourceGroupItemV2) obj;

    if (!getRelaySourceDomainListList()
        .equals(other.getRelaySourceDomainListList())) return false;
    if (!internalGetRelaySourceParams().equals(
        other.internalGetRelaySourceParams())) return false;
    if (!getRelaySourceProtocol()
        .equals(other.getRelaySourceProtocol())) return false;
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
    if (getRelaySourceDomainListCount() > 0) {
      hash = (37 * hash) + RELAYSOURCEDOMAINLIST_FIELD_NUMBER;
      hash = (53 * hash) + getRelaySourceDomainListList().hashCode();
    }
    if (!internalGetRelaySourceParams().getMap().isEmpty()) {
      hash = (37 * hash) + RELAYSOURCEPARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetRelaySourceParams().hashCode();
    }
    hash = (37 * hash) + RELAYSOURCEPROTOCOL_FIELD_NUMBER;
    hash = (53 * hash) + getRelaySourceProtocol().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RelaySourceGroupItemV2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RelaySourceGroupItemV2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RelaySourceGroupItemV2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RelaySourceGroupItemV2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RelaySourceGroupItemV2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RelaySourceGroupItemV2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RelaySourceGroupItemV2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RelaySourceGroupItemV2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RelaySourceGroupItemV2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RelaySourceGroupItemV2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RelaySourceGroupItemV2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RelaySourceGroupItemV2 parseFrom(
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
  public static Builder newBuilder(RelaySourceGroupItemV2 prototype) {
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
   * Protobuf type {@code Volcengine.Live.Models.Business.RelaySourceGroupItemV2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Business.RelaySourceGroupItemV2)
      RelaySourceGroupItemV2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RelaySource.internal_static_Volcengine_Live_Models_Business_RelaySourceGroupItemV2_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetRelaySourceParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableRelaySourceParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RelaySource.internal_static_Volcengine_Live_Models_Business_RelaySourceGroupItemV2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RelaySourceGroupItemV2.class, Builder.class);
    }

    // Construct using com.volcengine.service.live.model.business.RelaySourceGroupItemV2.newBuilder()
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
      relaySourceDomainList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableRelaySourceParams().clear();
      relaySourceProtocol_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RelaySource.internal_static_Volcengine_Live_Models_Business_RelaySourceGroupItemV2_descriptor;
    }

    @Override
    public RelaySourceGroupItemV2 getDefaultInstanceForType() {
      return RelaySourceGroupItemV2.getDefaultInstance();
    }

    @Override
    public RelaySourceGroupItemV2 build() {
      RelaySourceGroupItemV2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public RelaySourceGroupItemV2 buildPartial() {
      RelaySourceGroupItemV2 result = new RelaySourceGroupItemV2(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        relaySourceDomainList_ = relaySourceDomainList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.relaySourceDomainList_ = relaySourceDomainList_;
      result.relaySourceParams_ = internalGetRelaySourceParams();
      result.relaySourceParams_.makeImmutable();
      result.relaySourceProtocol_ = relaySourceProtocol_;
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
      if (other instanceof RelaySourceGroupItemV2) {
        return mergeFrom((RelaySourceGroupItemV2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RelaySourceGroupItemV2 other) {
      if (other == RelaySourceGroupItemV2.getDefaultInstance()) return this;
      if (!other.relaySourceDomainList_.isEmpty()) {
        if (relaySourceDomainList_.isEmpty()) {
          relaySourceDomainList_ = other.relaySourceDomainList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRelaySourceDomainListIsMutable();
          relaySourceDomainList_.addAll(other.relaySourceDomainList_);
        }
        onChanged();
      }
      internalGetMutableRelaySourceParams().mergeFrom(
          other.internalGetRelaySourceParams());
      if (!other.getRelaySourceProtocol().isEmpty()) {
        relaySourceProtocol_ = other.relaySourceProtocol_;
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
      RelaySourceGroupItemV2 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RelaySourceGroupItemV2) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList relaySourceDomainList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureRelaySourceDomainListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        relaySourceDomainList_ = new com.google.protobuf.LazyStringArrayList(relaySourceDomainList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @return A list containing the relaySourceDomainList.
     */
    public com.google.protobuf.ProtocolStringList
        getRelaySourceDomainListList() {
      return relaySourceDomainList_.getUnmodifiableView();
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @return The count of relaySourceDomainList.
     */
    public int getRelaySourceDomainListCount() {
      return relaySourceDomainList_.size();
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @param index The index of the element to return.
     * @return The relaySourceDomainList at the given index.
     */
    public String getRelaySourceDomainList(int index) {
      return relaySourceDomainList_.get(index);
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the relaySourceDomainList at the given index.
     */
    public com.google.protobuf.ByteString
        getRelaySourceDomainListBytes(int index) {
      return relaySourceDomainList_.getByteString(index);
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @param index The index to set the value at.
     * @param value The relaySourceDomainList to set.
     * @return This builder for chaining.
     */
    public Builder setRelaySourceDomainList(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRelaySourceDomainListIsMutable();
      relaySourceDomainList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @param value The relaySourceDomainList to add.
     * @return This builder for chaining.
     */
    public Builder addRelaySourceDomainList(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRelaySourceDomainListIsMutable();
      relaySourceDomainList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @param values The relaySourceDomainList to add.
     * @return This builder for chaining.
     */
    public Builder addAllRelaySourceDomainList(
        Iterable<String> values) {
      ensureRelaySourceDomainListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, relaySourceDomainList_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRelaySourceDomainList() {
      relaySourceDomainList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 回源地址数组
     * </pre>
     *
     * <code>repeated string RelaySourceDomainList = 1;</code>
     * @param value The bytes of the relaySourceDomainList to add.
     * @return This builder for chaining.
     */
    public Builder addRelaySourceDomainListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureRelaySourceDomainListIsMutable();
      relaySourceDomainList_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        String, String> relaySourceParams_;
    private com.google.protobuf.MapField<String, String>
    internalGetRelaySourceParams() {
      if (relaySourceParams_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RelaySourceParamsDefaultEntryHolder.defaultEntry);
      }
      return relaySourceParams_;
    }
    private com.google.protobuf.MapField<String, String>
    internalGetMutableRelaySourceParams() {
      onChanged();;
      if (relaySourceParams_ == null) {
        relaySourceParams_ = com.google.protobuf.MapField.newMapField(
            RelaySourceParamsDefaultEntryHolder.defaultEntry);
      }
      if (!relaySourceParams_.isMutable()) {
        relaySourceParams_ = relaySourceParams_.copy();
      }
      return relaySourceParams_;
    }

    public int getRelaySourceParamsCount() {
      return internalGetRelaySourceParams().getMap().size();
    }
    /**
     * <pre>
     * 回源参数。
     * </pre>
     *
     * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
     */

    @Override
    public boolean containsRelaySourceParams(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetRelaySourceParams().getMap().containsKey(key);
    }
    /**
     * Use {@link #getRelaySourceParamsMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, String> getRelaySourceParams() {
      return getRelaySourceParamsMap();
    }
    /**
     * <pre>
     * 回源参数。
     * </pre>
     *
     * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
     */
    @Override

    public java.util.Map<String, String> getRelaySourceParamsMap() {
      return internalGetRelaySourceParams().getMap();
    }
    /**
     * <pre>
     * 回源参数。
     * </pre>
     *
     * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
     */
    @Override

    public String getRelaySourceParamsOrDefault(
        String key,
        String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<String, String> map =
          internalGetRelaySourceParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * 回源参数。
     * </pre>
     *
     * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
     */
    @Override

    public String getRelaySourceParamsOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<String, String> map =
          internalGetRelaySourceParams().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearRelaySourceParams() {
      internalGetMutableRelaySourceParams().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * 回源参数。
     * </pre>
     *
     * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
     */

    public Builder removeRelaySourceParams(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableRelaySourceParams().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, String>
    getMutableRelaySourceParams() {
      return internalGetMutableRelaySourceParams().getMutableMap();
    }
    /**
     * <pre>
     * 回源参数。
     * </pre>
     *
     * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
     */
    public Builder putRelaySourceParams(
        String key,
        String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableRelaySourceParams().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * 回源参数。
     * </pre>
     *
     * <code>map&lt;string, string&gt; RelaySourceParams = 2;</code>
     */

    public Builder putAllRelaySourceParams(
        java.util.Map<String, String> values) {
      internalGetMutableRelaySourceParams().getMutableMap()
          .putAll(values);
      return this;
    }

    private Object relaySourceProtocol_ = "";
    /**
     * <pre>
     * 回源协议，目前只支持以下两种：&lt;li&gt;rmtp &lt;li&gt;flv。
     * </pre>
     *
     * <code>string RelaySourceProtocol = 3;</code>
     * @return The relaySourceProtocol.
     */
    public String getRelaySourceProtocol() {
      Object ref = relaySourceProtocol_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        relaySourceProtocol_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 回源协议，目前只支持以下两种：&lt;li&gt;rmtp &lt;li&gt;flv。
     * </pre>
     *
     * <code>string RelaySourceProtocol = 3;</code>
     * @return The bytes for relaySourceProtocol.
     */
    public com.google.protobuf.ByteString
        getRelaySourceProtocolBytes() {
      Object ref = relaySourceProtocol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        relaySourceProtocol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 回源协议，目前只支持以下两种：&lt;li&gt;rmtp &lt;li&gt;flv。
     * </pre>
     *
     * <code>string RelaySourceProtocol = 3;</code>
     * @param value The relaySourceProtocol to set.
     * @return This builder for chaining.
     */
    public Builder setRelaySourceProtocol(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      relaySourceProtocol_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 回源协议，目前只支持以下两种：&lt;li&gt;rmtp &lt;li&gt;flv。
     * </pre>
     *
     * <code>string RelaySourceProtocol = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRelaySourceProtocol() {
      
      relaySourceProtocol_ = getDefaultInstance().getRelaySourceProtocol();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 回源协议，目前只支持以下两种：&lt;li&gt;rmtp &lt;li&gt;flv。
     * </pre>
     *
     * <code>string RelaySourceProtocol = 3;</code>
     * @param value The bytes for relaySourceProtocol to set.
     * @return This builder for chaining.
     */
    public Builder setRelaySourceProtocolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      relaySourceProtocol_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Business.RelaySourceGroupItemV2)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Business.RelaySourceGroupItemV2)
  private static final RelaySourceGroupItemV2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RelaySourceGroupItemV2();
  }

  public static RelaySourceGroupItemV2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelaySourceGroupItemV2>
      PARSER = new com.google.protobuf.AbstractParser<RelaySourceGroupItemV2>() {
    @Override
    public RelaySourceGroupItemV2 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RelaySourceGroupItemV2(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RelaySourceGroupItemV2> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<RelaySourceGroupItemV2> getParserForType() {
    return PARSER;
  }

  @Override
  public RelaySourceGroupItemV2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

