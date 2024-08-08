// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodUpdateDomainConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodUpdateDomainConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 点播空间名称
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 点播空间名称
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 域名类型（play、image）
   * </pre>
   *
   * <code>string DomainType = 2;</code>
   * @return The domainType.
   */
  java.lang.String getDomainType();
  /**
   * <pre>
   * 域名类型（play、image）
   * </pre>
   *
   * <code>string DomainType = 2;</code>
   * @return The bytes for domainType.
   */
  com.google.protobuf.ByteString
      getDomainTypeBytes();

  /**
   * <pre>
   * 指定一个加速域名修改其配置
   * </pre>
   *
   * <code>string Domain = 3;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * 指定一个加速域名修改其配置
   * </pre>
   *
   * <code>string Domain = 3;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 表示本次修改的配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainConfig Config = 4;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * 表示本次修改的配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainConfig Config = 4;</code>
   * @return The config.
   */
  com.volcengine.service.vod.model.business.VodDomainConfig getConfig();
  /**
   * <pre>
   * 表示本次修改的配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainConfig Config = 4;</code>
   */
  com.volcengine.service.vod.model.business.VodDomainConfigOrBuilder getConfigOrBuilder();
}
