// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodUpdateDomainPlayRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodUpdateDomainPlayRuleRequest)
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
   * <pre>
   *默认域名
   * </pre>
   *
   * <code>string DefaultDomain = 2;</code>
   * @return The defaultDomain.
   */
  java.lang.String getDefaultDomain();
  /**
   * <pre>
   *默认域名
   * </pre>
   *
   * <code>string DefaultDomain = 2;</code>
   * @return The bytes for defaultDomain.
   */
  com.google.protobuf.ByteString
      getDefaultDomainBytes();

  /**
   * <pre>
   * 0 随机模式 1 默认域名模式
   * </pre>
   *
   * <code>int32 PlayRule = 3;</code>
   * @return The playRule.
   */
  int getPlayRule();
}
