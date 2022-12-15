// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * <pre>
 * 源站类型
 * </pre>
 *
 * Protobuf enum {@code Volcengine.Vod.Models.Business.VodDomainSourceStationType}
 */
public enum VodDomainSourceStationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未定义的源站类型
   * </pre>
   *
   * <code>UndefinedVodDomainSourceStationType = 0;</code>
   */
  UndefinedVodDomainSourceStationType(0),
  /**
   * <pre>
   * 点播源站
   * </pre>
   *
   * <code>VodVodDomainSourceStationType = 1;</code>
   */
  VodVodDomainSourceStationType(1),
  /**
   * <pre>
   * 第三方源站
   * </pre>
   *
   * <code>ThirdPartyVodDomainSourceStationType = 2;</code>
   */
  ThirdPartyVodDomainSourceStationType(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未定义的源站类型
   * </pre>
   *
   * <code>UndefinedVodDomainSourceStationType = 0;</code>
   */
  public static final int UndefinedVodDomainSourceStationType_VALUE = 0;
  /**
   * <pre>
   * 点播源站
   * </pre>
   *
   * <code>VodVodDomainSourceStationType = 1;</code>
   */
  public static final int VodVodDomainSourceStationType_VALUE = 1;
  /**
   * <pre>
   * 第三方源站
   * </pre>
   *
   * <code>ThirdPartyVodDomainSourceStationType = 2;</code>
   */
  public static final int ThirdPartyVodDomainSourceStationType_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VodDomainSourceStationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VodDomainSourceStationType forNumber(int value) {
    switch (value) {
      case 0: return UndefinedVodDomainSourceStationType;
      case 1: return VodVodDomainSourceStationType;
      case 2: return ThirdPartyVodDomainSourceStationType;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VodDomainSourceStationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VodDomainSourceStationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VodDomainSourceStationType>() {
          public VodDomainSourceStationType findValueByNumber(int number) {
            return VodDomainSourceStationType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodCdn.getDescriptor().getEnumTypes().get(0);
  }

  private static final VodDomainSourceStationType[] VALUES = values();

  public static VodDomainSourceStationType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VodDomainSourceStationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Volcengine.Vod.Models.Business.VodDomainSourceStationType)
}

