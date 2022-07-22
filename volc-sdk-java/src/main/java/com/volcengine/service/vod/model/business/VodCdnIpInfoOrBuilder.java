// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodCdnIpInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodCdnIpInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ip地址
   * </pre>
   *
   * <code>string Ip = 1;</code>
   * @return The ip.
   */
  java.lang.String getIp();
  /**
   * <pre>
   * ip地址
   * </pre>
   *
   * <code>string Ip = 1;</code>
   * @return The bytes for ip.
   */
  com.google.protobuf.ByteString
      getIpBytes();

  /**
   * <pre>
   *是否是火山cdn的ip
   * </pre>
   *
   * <code>bool CdnIp = 2;</code>
   * @return The cdnIp.
   */
  boolean getCdnIp();

  /**
   * <pre>
   * IP所属地区,非火山cdn返回"-"
   * </pre>
   *
   * <code>string Location = 3;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * IP所属地区,非火山cdn返回"-"
   * </pre>
   *
   * <code>string Location = 3;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * IP所属运营商,非火山cdn返回"-"
   * </pre>
   *
   * <code>string Isp = 4;</code>
   * @return The isp.
   */
  java.lang.String getIsp();
  /**
   * <pre>
   * IP所属运营商,非火山cdn返回"-"
   * </pre>
   *
   * <code>string Isp = 4;</code>
   * @return The bytes for isp.
   */
  com.google.protobuf.ByteString
      getIspBytes();
}
