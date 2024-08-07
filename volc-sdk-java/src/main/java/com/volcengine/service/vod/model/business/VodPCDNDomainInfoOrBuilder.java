// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodPCDNDomainInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodPCDNDomainInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *域名
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   *域名
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   *运行状态，enable：运行中，disable：停用。
   * </pre>
   *
   * <code>string Status = 2;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *运行状态，enable：运行中，disable：停用。
   * </pre>
   *
   * <code>string Status = 2;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>string CreateTime = 3;</code>
   * @return The createTime.
   */
  java.lang.String getCreateTime();
  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>string CreateTime = 3;</code>
   * @return The bytes for createTime.
   */
  com.google.protobuf.ByteString
      getCreateTimeBytes();

  /**
   * <pre>
   *更新时间
   * </pre>
   *
   * <code>string UpdateTime = 4;</code>
   * @return The updateTime.
   */
  java.lang.String getUpdateTime();
  /**
   * <pre>
   *更新时间
   * </pre>
   *
   * <code>string UpdateTime = 4;</code>
   * @return The bytes for updateTime.
   */
  com.google.protobuf.ByteString
      getUpdateTimeBytes();
}
