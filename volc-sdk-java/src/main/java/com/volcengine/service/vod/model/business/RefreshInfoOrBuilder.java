// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_object.proto

package com.volcengine.service.vod.model.business;

public interface RefreshInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.RefreshInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *刷新的url
   * </pre>
   *
   * <code>string Url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   *刷新的url
   * </pre>
   *
   * <code>string Url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   *表示任务的状态。该参数有以下取值：
   *complete：表示任务已完成。
   *running：表示任务正在执行中。
   *failed：表示任务执行失败。
   * </pre>
   *
   * <code>string Status = 2;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *表示任务的状态。该参数有以下取值：
   *complete：表示任务已完成。
   *running：表示任务正在执行中。
   *failed：表示任务执行失败。
   * </pre>
   *
   * <code>string Status = 2;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   *表示任务的进度。比如70%
   * </pre>
   *
   * <code>string Process = 3;</code>
   * @return The process.
   */
  java.lang.String getProcess();
  /**
   * <pre>
   *表示任务的进度。比如70%
   * </pre>
   *
   * <code>string Process = 3;</code>
   * @return The bytes for process.
   */
  com.google.protobuf.ByteString
      getProcessBytes();
}
