// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodQueryMoveObjectTaskInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodQueryMoveObjectTaskInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string TaskId = 1;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <code>string TaskId = 1;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <code>string SourceSpace = 2;</code>
   * @return The sourceSpace.
   */
  java.lang.String getSourceSpace();
  /**
   * <code>string SourceSpace = 2;</code>
   * @return The bytes for sourceSpace.
   */
  com.google.protobuf.ByteString
      getSourceSpaceBytes();

  /**
   * <code>string TargetSpace = 3;</code>
   * @return The targetSpace.
   */
  java.lang.String getTargetSpace();
  /**
   * <code>string TargetSpace = 3;</code>
   * @return The bytes for targetSpace.
   */
  com.google.protobuf.ByteString
      getTargetSpaceBytes();
}