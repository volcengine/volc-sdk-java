// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_migrate.proto

package com.volcengine.service.vod.model.business;

public interface VodGetCloudMigrateJobResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodGetCloudMigrateJobResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 JobId = 1;</code>
   * @return The jobId.
   */
  long getJobId();

  /**
   * <code>.Volcengine.Vod.Models.Business.VodCloudMigrateJobSourceInfo JobSourceInfo = 2;</code>
   * @return Whether the jobSourceInfo field is set.
   */
  boolean hasJobSourceInfo();
  /**
   * <code>.Volcengine.Vod.Models.Business.VodCloudMigrateJobSourceInfo JobSourceInfo = 2;</code>
   * @return The jobSourceInfo.
   */
  com.volcengine.service.vod.model.business.VodCloudMigrateJobSourceInfo getJobSourceInfo();
  /**
   * <code>.Volcengine.Vod.Models.Business.VodCloudMigrateJobSourceInfo JobSourceInfo = 2;</code>
   */
  com.volcengine.service.vod.model.business.VodCloudMigrateJobSourceInfoOrBuilder getJobSourceInfoOrBuilder();

  /**
   * <code>string CallbackAddress = 3;</code>
   * @return The callbackAddress.
   */
  java.lang.String getCallbackAddress();
  /**
   * <code>string CallbackAddress = 3;</code>
   * @return The bytes for callbackAddress.
   */
  com.google.protobuf.ByteString
      getCallbackAddressBytes();
}
