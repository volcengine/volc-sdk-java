// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodCreateDomainV3RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodCreateDomainV3Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>string DomainType = 2;</code>
   * @return The domainType.
   */
  java.lang.String getDomainType();
  /**
   * <code>string DomainType = 2;</code>
   * @return The bytes for domainType.
   */
  com.google.protobuf.ByteString
      getDomainTypeBytes();

  /**
   * <pre>
   * 域名
   * </pre>
   *
   * <code>string Domain = 3;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * 域名
   * </pre>
   *
   * <code>string Domain = 3;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <code>int32 SourceStationType = 5;</code>
   * @return The sourceStationType.
   */
  int getSourceStationType();

  /**
   * <pre>
   *地区
   * </pre>
   *
   * <code>string Area = 8;</code>
   * @return The area.
   */
  java.lang.String getArea();
  /**
   * <pre>
   *地区
   * </pre>
   *
   * <code>string Area = 8;</code>
   * @return The bytes for area.
   */
  com.google.protobuf.ByteString
      getAreaBytes();

  /**
   * <pre>
   *挂载tos 桶名称
   * </pre>
   *
   * <code>string BucketName = 9;</code>
   * @return The bucketName.
   */
  java.lang.String getBucketName();
  /**
   * <pre>
   *挂载tos 桶名称
   * </pre>
   *
   * <code>string BucketName = 9;</code>
   * @return The bytes for bucketName.
   */
  com.google.protobuf.ByteString
      getBucketNameBytes();

  /**
   * <pre>
   * IPV6配置模块
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.IPv6 IPv6 = 10;</code>
   * @return Whether the iPv6 field is set.
   */
  boolean hasIPv6();
  /**
   * <pre>
   * IPV6配置模块
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.IPv6 IPv6 = 10;</code>
   * @return The iPv6.
   */
  com.volcengine.service.vod.model.business.IPv6 getIPv6();
  /**
   * <pre>
   * IPV6配置模块
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.IPv6 IPv6 = 10;</code>
   */
  com.volcengine.service.vod.model.business.IPv6OrBuilder getIPv6OrBuilder();

  /**
   * <pre>
   * 源站列表。在 SourceStationType 参数取值为
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.CdnOriginRule Origin = 11;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.CdnOriginRule> 
      getOriginList();
  /**
   * <pre>
   * 源站列表。在 SourceStationType 参数取值为
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.CdnOriginRule Origin = 11;</code>
   */
  com.volcengine.service.vod.model.business.CdnOriginRule getOrigin(int index);
  /**
   * <pre>
   * 源站列表。在 SourceStationType 参数取值为
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.CdnOriginRule Origin = 11;</code>
   */
  int getOriginCount();
  /**
   * <pre>
   * 源站列表。在 SourceStationType 参数取值为
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.CdnOriginRule Origin = 11;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.CdnOriginRuleOrBuilder> 
      getOriginOrBuilderList();
  /**
   * <pre>
   * 源站列表。在 SourceStationType 参数取值为
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.CdnOriginRule Origin = 11;</code>
   */
  com.volcengine.service.vod.model.business.CdnOriginRuleOrBuilder getOriginOrBuilder(
      int index);
}
