// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface DescribeVodSpaceEditStatisDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.DescribeVodSpaceEditStatisDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间列表，多个空间用逗号分割
   * </pre>
   *
   * <code>string SpaceList = 1;</code>
   * @return The spaceList.
   */
  java.lang.String getSpaceList();
  /**
   * <pre>
   * 空间列表，多个空间用逗号分割
   * </pre>
   *
   * <code>string SpaceList = 1;</code>
   * @return The bytes for spaceList.
   */
  com.google.protobuf.ByteString
      getSpaceListBytes();

  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   * 封装格式
   * </pre>
   *
   * <code>string Specification = 4;</code>
   * @return The specification.
   */
  java.lang.String getSpecification();
  /**
   * <pre>
   * 封装格式
   * </pre>
   *
   * <code>string Specification = 4;</code>
   * @return The bytes for specification.
   */
  com.google.protobuf.ByteString
      getSpecificationBytes();

  /**
   * <pre>
   *聚合的时间粒度，单位秒，默认3600，支持3600和86400
   * </pre>
   *
   * <code>int64 Aggregation = 5;</code>
   * @return The aggregation.
   */
  long getAggregation();

  /**
   * <pre>
   * 展示详细信息的维度，取值：Space
   * </pre>
   *
   * <code>string DetailFieldList = 6;</code>
   * @return The detailFieldList.
   */
  java.lang.String getDetailFieldList();
  /**
   * <pre>
   * 展示详细信息的维度，取值：Space
   * </pre>
   *
   * <code>string DetailFieldList = 6;</code>
   * @return The bytes for detailFieldList.
   */
  com.google.protobuf.ByteString
      getDetailFieldListBytes();

  /**
   * <pre>
   * 区域，多个区域用逗号分割
   * </pre>
   *
   * <code>string RegionList = 7;</code>
   * @return The regionList.
   */
  java.lang.String getRegionList();
  /**
   * <pre>
   * 区域，多个区域用逗号分割
   * </pre>
   *
   * <code>string RegionList = 7;</code>
   * @return The bytes for regionList.
   */
  com.google.protobuf.ByteString
      getRegionListBytes();
}
