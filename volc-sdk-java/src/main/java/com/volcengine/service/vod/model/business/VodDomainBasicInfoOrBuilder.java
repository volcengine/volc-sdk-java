// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodDomainBasicInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodDomainBasicInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 表示该加速域名。
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * 表示该加速域名。
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 表示内容分发网络为该加速域名分配的 CNAME。
   * </pre>
   *
   * <code>string Cname = 2;</code>
   * @return The cname.
   */
  java.lang.String getCname();
  /**
   * <pre>
   * 表示内容分发网络为该加速域名分配的 CNAME。
   * </pre>
   *
   * <code>string Cname = 2;</code>
   * @return The bytes for cname.
   */
  com.google.protobuf.ByteString
      getCnameBytes();

  /**
   * <pre>
   * 表示该加速域名的配置状态
   * </pre>
   *
   * <code>string ConfigStatus = 3;</code>
   * @return The configStatus.
   */
  java.lang.String getConfigStatus();
  /**
   * <pre>
   * 表示该加速域名的配置状态
   * </pre>
   *
   * <code>string ConfigStatus = 3;</code>
   * @return The bytes for configStatus.
   */
  com.google.protobuf.ByteString
      getConfigStatusBytes();

  /**
   * <pre>
   * 创建时间。UTC + 8 时区。
   * </pre>
   *
   * <code>string CreateTime = 4;</code>
   * @return The createTime.
   */
  java.lang.String getCreateTime();
  /**
   * <pre>
   * 创建时间。UTC + 8 时区。
   * </pre>
   *
   * <code>string CreateTime = 4;</code>
   * @return The bytes for createTime.
   */
  com.google.protobuf.ByteString
      getCreateTimeBytes();

  /**
   * <pre>
   * 表示域名是否被锁定。
   * </pre>
   *
   * <code>string LockStatus = 5;</code>
   * @return The lockStatus.
   */
  java.lang.String getLockStatus();
  /**
   * <pre>
   * 表示域名是否被锁定。
   * </pre>
   *
   * <code>string LockStatus = 5;</code>
   * @return The bytes for lockStatus.
   */
  com.google.protobuf.ByteString
      getLockStatusBytes();
}
