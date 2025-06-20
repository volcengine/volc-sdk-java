// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodOriginalControlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodOriginalControl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 源站配置
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodOriginalConfig Origins = 1;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodOriginalConfig> 
      getOriginsList();
  /**
   * <pre>
   * 源站配置
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodOriginalConfig Origins = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodOriginalConfig getOrigins(int index);
  /**
   * <pre>
   * 源站配置
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodOriginalConfig Origins = 1;</code>
   */
  int getOriginsCount();
  /**
   * <pre>
   * 源站配置
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodOriginalConfig Origins = 1;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodOriginalConfigOrBuilder> 
      getOriginsOrBuilderList();
  /**
   * <pre>
   * 源站配置
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodOriginalConfig Origins = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodOriginalConfigOrBuilder getOriginsOrBuilder(
      int index);

  /**
   * <pre>
   * 回源Host
   * </pre>
   *
   * <code>string Host = 2;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <pre>
   * 回源Host
   * </pre>
   *
   * <code>string Host = 2;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <pre>
   * 回源协议，支持http、https、followclient，http
   * </pre>
   *
   * <code>string OriginProtocol = 3;</code>
   * @return The originProtocol.
   */
  java.lang.String getOriginProtocol();
  /**
   * <pre>
   * 回源协议，支持http、https、followclient，http
   * </pre>
   *
   * <code>string OriginProtocol = 3;</code>
   * @return The bytes for originProtocol.
   */
  com.google.protobuf.ByteString
      getOriginProtocolBytes();
}
