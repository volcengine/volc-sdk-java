// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface DescribeVodVidTrafficFileLogRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.DescribeVodVidTrafficFileLogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间
   * </pre>
   *
   * <code>string SpaceList = 1;</code>
   * @return The spaceList.
   */
  java.lang.String getSpaceList();
  /**
   * <pre>
   * 空间
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
   * 查询的结束时间, rfc3339；起止时间间隔不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * 查询的结束时间, rfc3339；起止时间间隔不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();
}
