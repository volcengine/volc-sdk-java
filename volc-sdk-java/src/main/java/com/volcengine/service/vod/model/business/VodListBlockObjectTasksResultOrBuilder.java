// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_object.proto

package com.volcengine.service.vod.model.business;

public interface VodListBlockObjectTasksResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodListBlockObjectTasksResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object封禁/解封任务信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ObjectBlockTaskInfo ObjectBlockTaskInfos = 1;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.ObjectBlockTaskInfo> 
      getObjectBlockTaskInfosList();
  /**
   * <pre>
   * object封禁/解封任务信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ObjectBlockTaskInfo ObjectBlockTaskInfos = 1;</code>
   */
  com.volcengine.service.vod.model.business.ObjectBlockTaskInfo getObjectBlockTaskInfos(int index);
  /**
   * <pre>
   * object封禁/解封任务信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ObjectBlockTaskInfo ObjectBlockTaskInfos = 1;</code>
   */
  int getObjectBlockTaskInfosCount();
  /**
   * <pre>
   * object封禁/解封任务信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ObjectBlockTaskInfo ObjectBlockTaskInfos = 1;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.ObjectBlockTaskInfoOrBuilder> 
      getObjectBlockTaskInfosOrBuilderList();
  /**
   * <pre>
   * object封禁/解封任务信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ObjectBlockTaskInfo ObjectBlockTaskInfos = 1;</code>
   */
  com.volcengine.service.vod.model.business.ObjectBlockTaskInfoOrBuilder getObjectBlockTaskInfosOrBuilder(
      int index);
}
