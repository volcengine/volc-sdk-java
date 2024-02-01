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
   * list of space:domain to query
   * </pre>
   *
   * <code>string DomainInSpaceList = 2;</code>
   * @return The domainInSpaceList.
   */
  java.lang.String getDomainInSpaceList();
  /**
   * <pre>
   * list of space:domain to query
   * </pre>
   *
   * <code>string DomainInSpaceList = 2;</code>
   * @return The bytes for domainInSpaceList.
   */
  com.google.protobuf.ByteString
      getDomainInSpaceListBytes();

  /**
   * <pre>
   * rfc339
   * </pre>
   *
   * <code>string StartTime = 3;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * rfc339
   * </pre>
   *
   * <code>string StartTime = 3;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * rfc339
   * </pre>
   *
   * <code>string EndTime = 4;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * rfc339
   * </pre>
   *
   * <code>string EndTime = 4;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   * default 300, supports 1800, 3600 and 86400
   * </pre>
   *
   * <code>int32 Aggregation = 5;</code>
   * @return The aggregation.
   */
  int getAggregation();

  /**
   * <pre>
   * ECDN, CDN, or ALL
   * </pre>
   *
   * <code>string TrafficType = 6;</code>
   * @return The trafficType.
   */
  java.lang.String getTrafficType();
  /**
   * <pre>
   * ECDN, CDN, or ALL
   * </pre>
   *
   * <code>string TrafficType = 6;</code>
   * @return The bytes for trafficType.
   */
  com.google.protobuf.ByteString
      getTrafficTypeBytes();

  /**
   * <code>string Area = 7;</code>
   * @return The area.
   */
  java.lang.String getArea();
  /**
   * <code>string Area = 7;</code>
   * @return The bytes for area.
   */
  com.google.protobuf.ByteString
      getAreaBytes();

  /**
   * <code>string RegionList = 8;</code>
   * @return The regionList.
   */
  java.lang.String getRegionList();
  /**
   * <code>string RegionList = 8;</code>
   * @return The bytes for regionList.
   */
  com.google.protobuf.ByteString
      getRegionListBytes();
}
