// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodListCdnAccessLogResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodListCdnAccessLogResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodCdnAccessLogInfo> 
      getLogsList();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodCdnAccessLogInfo getLogs(int index);
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  int getLogsCount();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodCdnAccessLogInfoOrBuilder> 
      getLogsOrBuilderList();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodCdnAccessLogInfoOrBuilder getLogsOrBuilder(
      int index);
}
