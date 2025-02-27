// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodVerifyDomainOwnerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodVerifyDomainOwnerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 需要校验归属权的域名
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The domain.
   */
  String getDomain();
  /**
   * <pre>
   * 需要校验归属权的域名
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 验证方式: dns: DNS解析验证；file: 文件验证。
   * </pre>
   *
   * <code>string VerifyType = 2;</code>
   * @return The verifyType.
   */
  String getVerifyType();
  /**
   * <pre>
   * 验证方式: dns: DNS解析验证；file: 文件验证。
   * </pre>
   *
   * <code>string VerifyType = 2;</code>
   * @return The bytes for verifyType.
   */
  com.google.protobuf.ByteString
      getVerifyTypeBytes();
}
