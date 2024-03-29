// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

public interface GeneratePlayURLRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Request.GeneratePlayURLRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *域名空间名称
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The vhost.
   */
  java.lang.String getVhost();
  /**
   * <pre>
   *域名空间名称
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <pre>
   *拉流域名名称，需要生成拉流地址的域名
   * </pre>
   *
   * <code>string Domain = 2;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   *拉流域名名称，需要生成拉流地址的域名
   * </pre>
   *
   * <code>string Domain = 2;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * App名称
   * </pre>
   *
   * <code>string App = 3;</code>
   * @return The app.
   */
  java.lang.String getApp();
  /**
   * <pre>
   * App名称
   * </pre>
   *
   * <code>string App = 3;</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();

  /**
   * <pre>
   * Stream名称
   * </pre>
   *
   * <code>string Stream = 4;</code>
   * @return The stream.
   */
  java.lang.String getStream();
  /**
   * <pre>
   * Stream名称
   * </pre>
   *
   * <code>string Stream = 4;</code>
   * @return The bytes for stream.
   */
  com.google.protobuf.ByteString
      getStreamBytes();

  /**
   * <pre>
   *转码流后缀，不填源流
   * </pre>
   *
   * <code>string Suffix = 5;</code>
   * @return The suffix.
   */
  java.lang.String getSuffix();
  /**
   * <pre>
   *转码流后缀，不填源流
   * </pre>
   *
   * <code>string Suffix = 5;</code>
   * @return The bytes for suffix.
   */
  com.google.protobuf.ByteString
      getSuffixBytes();

  /**
   * <pre>
   * cdn类型，fcdn/3rd（第二方cdn）二选一填，不填默认fcdn
   * </pre>
   *
   * <code>string Type = 6;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * cdn类型，fcdn/3rd（第二方cdn）二选一填，不填默认fcdn
   * </pre>
   *
   * <code>string Type = 6;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   *生成的地址鉴权的有效时间，单位s，不填默认使用鉴权配置的过期时间，没有鉴权时间则默认7天过期
   * </pre>
   *
   * <code>int64 ValidDuration = 7;</code>
   * @return The validDuration.
   */
  long getValidDuration();

  /**
   * <pre>
   *绝对有效时间，UTC格式，优先级比ValidDuration低
   * </pre>
   *
   * <code>string ExpiredTime = 8;</code>
   * @return The expiredTime.
   */
  java.lang.String getExpiredTime();
  /**
   * <pre>
   *绝对有效时间，UTC格式，优先级比ValidDuration低
   * </pre>
   *
   * <code>string ExpiredTime = 8;</code>
   * @return The bytes for expiredTime.
   */
  com.google.protobuf.ByteString
      getExpiredTimeBytes();
}
