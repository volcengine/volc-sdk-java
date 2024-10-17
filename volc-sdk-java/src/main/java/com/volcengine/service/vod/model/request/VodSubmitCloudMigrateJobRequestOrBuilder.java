// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodSubmitCloudMigrateJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodSubmitCloudMigrateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 JobId = 1;</code>
   * @return The jobId.
   */
  long getJobId();

  /**
   * <code>string SubAppId = 2;</code>
   * @return The subAppId.
   */
  java.lang.String getSubAppId();
  /**
   * <code>string SubAppId = 2;</code>
   * @return The bytes for subAppId.
   */
  com.google.protobuf.ByteString
      getSubAppIdBytes();

  /**
   * <code>string SourceVid = 3;</code>
   * @return The sourceVid.
   */
  java.lang.String getSourceVid();
  /**
   * <code>string SourceVid = 3;</code>
   * @return The bytes for sourceVid.
   */
  com.google.protobuf.ByteString
      getSourceVidBytes();

  /**
   * <code>string TargetVid = 4;</code>
   * @return The targetVid.
   */
  java.lang.String getTargetVid();
  /**
   * <code>string TargetVid = 4;</code>
   * @return The bytes for targetVid.
   */
  com.google.protobuf.ByteString
      getTargetVidBytes();

  /**
   * <code>string CallbackArgs = 5;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <code>string CallbackArgs = 5;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();

  /**
   * <code>string SpaceName = 6;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 6;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();
}
