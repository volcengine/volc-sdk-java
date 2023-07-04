// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface DescribeVodSpaceWorkflowDetailDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.DescribeVodSpaceWorkflowDetailDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *地区，如：cn-north-1
   * </pre>
   *
   * <code>string Region = 1;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   *地区，如：cn-north-1
   * </pre>
   *
   * <code>string Region = 1;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * 空间
   * </pre>
   *
   * <code>string Space = 2;</code>
   * @return The space.
   */
  java.lang.String getSpace();
  /**
   * <pre>
   * 空间
   * </pre>
   *
   * <code>string Space = 2;</code>
   * @return The bytes for space.
   */
  com.google.protobuf.ByteString
      getSpaceBytes();

  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 3;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 3;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * 查询的结束时间, rfc3339；起止时间间隔不超过1天
   * </pre>
   *
   * <code>string EndTime = 4;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * 查询的结束时间, rfc3339；起止时间间隔不超过1天
   * </pre>
   *
   * <code>string EndTime = 4;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   * 分页查询的页大小，默认100
   * </pre>
   *
   * <code>int64 PageSize = 5;</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <pre>
   * 分页查询的页号，默认1
   * </pre>
   *
   * <code>int64 PageNum = 6;</code>
   * @return The pageNum.
   */
  long getPageNum();
}
