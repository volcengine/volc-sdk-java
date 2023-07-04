// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodDescribeVodDomainTrafficDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodDescribeVodDomainTrafficDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of domains to query
   * </pre>
   *
   * <code>string DomainList = 1;</code>
   * @return The domainList.
   */
  java.lang.String getDomainList();
  /**
   * <pre>
   * list of domains to query
   * </pre>
   *
   * <code>string DomainList = 1;</code>
   * @return The bytes for domainList.
   */
  com.google.protobuf.ByteString
      getDomainListBytes();

  /**
   * <pre>
   * rfc339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * rfc339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * rfc339
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * rfc339
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   * default 300, supports 1800, 3600 and 86400
   * </pre>
   *
   * <code>int32 Aggregation = 4;</code>
   * @return The aggregation.
   */
  int getAggregation();

  /**
   * <pre>
   * PCDN, CDN, or ALL
   * </pre>
   *
   * <code>string TrafficType = 5;</code>
   * @return The trafficType.
   */
  java.lang.String getTrafficType();
  /**
   * <pre>
   * PCDN, CDN, or ALL
   * </pre>
   *
   * <code>string TrafficType = 5;</code>
   * @return The bytes for trafficType.
   */
  com.google.protobuf.ByteString
      getTrafficTypeBytes();
}
