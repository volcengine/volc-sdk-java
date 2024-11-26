// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface OriginLineOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.OriginLine)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 源站地址
   * </pre>
   *
   * <code>string Address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * 源站地址
   * </pre>
   *
   * <code>string Address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * HTTP协议端口
   * </pre>
   *
   * <code>string HttpPort = 2;</code>
   * @return The httpPort.
   */
  java.lang.String getHttpPort();
  /**
   * <pre>
   * HTTP协议端口
   * </pre>
   *
   * <code>string HttpPort = 2;</code>
   * @return The bytes for httpPort.
   */
  com.google.protobuf.ByteString
      getHttpPortBytes();

  /**
   * <pre>
   * HTTPS协议端口
   * </pre>
   *
   * <code>string HttpsPort = 3;</code>
   * @return The httpsPort.
   */
  java.lang.String getHttpsPort();
  /**
   * <pre>
   * HTTPS协议端口
   * </pre>
   *
   * <code>string HttpsPort = 3;</code>
   * @return The bytes for httpsPort.
   */
  com.google.protobuf.ByteString
      getHttpsPortBytes();

  /**
   * <pre>
   * 源站的类型 ip/domain
   * </pre>
   *
   * <code>string InstanceType = 4;</code>
   * @return The instanceType.
   */
  java.lang.String getInstanceType();
  /**
   * <pre>
   * 源站的类型 ip/domain
   * </pre>
   *
   * <code>string InstanceType = 4;</code>
   * @return The bytes for instanceType.
   */
  com.google.protobuf.ByteString
      getInstanceTypeBytes();

  /**
   * <pre>
   * 回源请求访问的站点域名
   * </pre>
   *
   * <code>string OriginHost = 5;</code>
   * @return The originHost.
   */
  java.lang.String getOriginHost();
  /**
   * <pre>
   * 回源请求访问的站点域名
   * </pre>
   *
   * <code>string OriginHost = 5;</code>
   * @return The bytes for originHost.
   */
  com.google.protobuf.ByteString
      getOriginHostBytes();

  /**
   * <pre>
   * 源站的类别 primary/backup
   * </pre>
   *
   * <code>string OriginType = 6;</code>
   * @return The originType.
   */
  java.lang.String getOriginType();
  /**
   * <pre>
   * 源站的类别 primary/backup
   * </pre>
   *
   * <code>string OriginType = 6;</code>
   * @return The bytes for originType.
   */
  com.google.protobuf.ByteString
      getOriginTypeBytes();

  /**
   * <pre>
   * 源站的权重，取值范围是 1-100
   * </pre>
   *
   * <code>string Weight = 7;</code>
   * @return The weight.
   */
  java.lang.String getWeight();
  /**
   * <pre>
   * 源站的权重，取值范围是 1-100
   * </pre>
   *
   * <code>string Weight = 7;</code>
   * @return The bytes for weight.
   */
  com.google.protobuf.ByteString
      getWeightBytes();
}