// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_object.proto

package com.volcengine.service.vod.model.business;

public interface FileNameTaskInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.FileNameTaskInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *对应的FileName
   * </pre>
   *
   * <code>string FileName = 1;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <pre>
   *对应的FileName
   * </pre>
   *
   * <code>string FileName = 1;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <pre>
   *失败信息 成功时为""
   * </pre>
   *
   * <code>string Message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   *失败信息 成功时为""
   * </pre>
   *
   * <code>string Message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   *成功的任务Id 失败时为""
   * </pre>
   *
   * <code>string TaskId = 3;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   *成功的任务Id 失败时为""
   * </pre>
   *
   * <code>string TaskId = 3;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();
}
