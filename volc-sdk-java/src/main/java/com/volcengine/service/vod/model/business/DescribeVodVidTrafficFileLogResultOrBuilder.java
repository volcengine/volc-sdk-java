// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_measure.proto

package com.volcengine.service.vod.model.business;

public interface DescribeVodVidTrafficFileLogResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.DescribeVodVidTrafficFileLogResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @return A list containing the spaceList.
   */
  java.util.List<java.lang.String>
      getSpaceListList();
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @return The count of spaceList.
   */
  int getSpaceListCount();
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @param index The index of the element to return.
   * @return The spaceList at the given index.
   */
  java.lang.String getSpaceList(int index);
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the spaceList at the given index.
   */
  com.google.protobuf.ByteString
      getSpaceListBytes(int index);

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
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodVidTrafficFileLogItem FileList = 4;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.DescribeVodVidTrafficFileLogItem> 
      getFileListList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodVidTrafficFileLogItem FileList = 4;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodVidTrafficFileLogItem getFileList(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodVidTrafficFileLogItem FileList = 4;</code>
   */
  int getFileListCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodVidTrafficFileLogItem FileList = 4;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.DescribeVodVidTrafficFileLogItemOrBuilder> 
      getFileListOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodVidTrafficFileLogItem FileList = 4;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodVidTrafficFileLogItemOrBuilder getFileListOrBuilder(
      int index);
}
