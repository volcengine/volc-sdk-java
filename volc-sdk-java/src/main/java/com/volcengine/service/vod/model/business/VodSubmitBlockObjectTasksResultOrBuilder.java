// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_object.proto

package com.volcengine.service.vod.model.business;

public interface VodSubmitBlockObjectTasksResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodSubmitBlockObjectTasksResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *封禁或解封 forbid/recover
   * </pre>
   *
   * <code>string Operation = 1;</code>
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   * <pre>
   *封禁或解封 forbid/recover
   * </pre>
   *
   * <code>string Operation = 1;</code>
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString
      getOperationBytes();

  /**
   * <code>.Volcengine.Vod.Models.Business.OperateFileNames OperateFileNames = 2;</code>
   * @return Whether the operateFileNames field is set.
   */
  boolean hasOperateFileNames();
  /**
   * <code>.Volcengine.Vod.Models.Business.OperateFileNames OperateFileNames = 2;</code>
   * @return The operateFileNames.
   */
  com.volcengine.service.vod.model.business.OperateFileNames getOperateFileNames();
  /**
   * <code>.Volcengine.Vod.Models.Business.OperateFileNames OperateFileNames = 2;</code>
   */
  com.volcengine.service.vod.model.business.OperateFileNamesOrBuilder getOperateFileNamesOrBuilder();
}
