// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodGetCloudMigrateJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodGetCloudMigrateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 JobId = 1;</code>
   * @return The jobId.
   */
  long getJobId();

  /**
   * <code>string SpaceName = 2;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 2;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();
}