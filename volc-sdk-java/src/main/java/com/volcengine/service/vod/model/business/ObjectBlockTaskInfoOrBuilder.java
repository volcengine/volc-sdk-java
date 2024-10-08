// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_object.proto

package com.volcengine.service.vod.model.business;

public interface ObjectBlockTaskInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.ObjectBlockTaskInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *封禁状态 代表原站是否完成封禁
   *- forbid 封禁完成
   *- recover 已解封
   *- configuring 配置中
   * </pre>
   *
   * <code>string Status = 1;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *封禁状态 代表原站是否完成封禁
   *- forbid 封禁完成
   *- recover 已解封
   *- configuring 配置中
   * </pre>
   *
   * <code>string Status = 1;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   *任务Id
   * </pre>
   *
   * <code>string TaskId = 2;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   *任务Id
   * </pre>
   *
   * <code>string TaskId = 2;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <code>string FileName = 3;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string FileName = 3;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <pre>
   *刷新Cdn状态
   *- complete 可能部分成功
   *- running 刷新中
   *- waiting 原站封禁中 还未刷新
   *- notRequired 不需要刷新
   * </pre>
   *
   * <code>string RefreshStatus = 4;</code>
   * @return The refreshStatus.
   */
  java.lang.String getRefreshStatus();
  /**
   * <pre>
   *刷新Cdn状态
   *- complete 可能部分成功
   *- running 刷新中
   *- waiting 原站封禁中 还未刷新
   *- notRequired 不需要刷新
   * </pre>
   *
   * <code>string RefreshStatus = 4;</code>
   * @return The bytes for refreshStatus.
   */
  com.google.protobuf.ByteString
      getRefreshStatusBytes();

  /**
   * <pre>
   *封禁状态 代表任务的类型
   *- forbid 封禁完成
   *- recover 已解封
   * </pre>
   *
   * <code>string Operation = 5;</code>
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   * <pre>
   *封禁状态 代表任务的类型
   *- forbid 封禁完成
   *- recover 已解封
   * </pre>
   *
   * <code>string Operation = 5;</code>
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString
      getOperationBytes();

  /**
   * <pre>
   *刷新任务Id
   * </pre>
   *
   * <code>string RefreshTaskId = 6;</code>
   * @return The refreshTaskId.
   */
  java.lang.String getRefreshTaskId();
  /**
   * <pre>
   *刷新任务Id
   * </pre>
   *
   * <code>string RefreshTaskId = 6;</code>
   * @return The bytes for refreshTaskId.
   */
  com.google.protobuf.ByteString
      getRefreshTaskIdBytes();

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.RefreshInfo RefreshInfos = 7;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.RefreshInfo> 
      getRefreshInfosList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.RefreshInfo RefreshInfos = 7;</code>
   */
  com.volcengine.service.vod.model.business.RefreshInfo getRefreshInfos(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.RefreshInfo RefreshInfos = 7;</code>
   */
  int getRefreshInfosCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.RefreshInfo RefreshInfos = 7;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.RefreshInfoOrBuilder> 
      getRefreshInfosOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.RefreshInfo RefreshInfos = 7;</code>
   */
  com.volcengine.service.vod.model.business.RefreshInfoOrBuilder getRefreshInfosOrBuilder(
      int index);
}
