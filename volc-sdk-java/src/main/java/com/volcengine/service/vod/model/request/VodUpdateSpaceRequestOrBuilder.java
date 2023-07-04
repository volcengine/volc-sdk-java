// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodUpdateSpaceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodUpdateSpaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 原项目 
   * </pre>
   *
   * <code>string SourceProjectName = 2;</code>
   * @return The sourceProjectName.
   */
  java.lang.String getSourceProjectName();
  /**
   * <pre>
   * 原项目 
   * </pre>
   *
   * <code>string SourceProjectName = 2;</code>
   * @return The bytes for sourceProjectName.
   */
  com.google.protobuf.ByteString
      getSourceProjectNameBytes();

  /**
   * <pre>
   * 变更目标项目 
   * </pre>
   *
   * <code>string TargetProjectName = 3;</code>
   * @return The targetProjectName.
   */
  java.lang.String getTargetProjectName();
  /**
   * <pre>
   * 变更目标项目 
   * </pre>
   *
   * <code>string TargetProjectName = 3;</code>
   * @return The bytes for targetProjectName.
   */
  com.google.protobuf.ByteString
      getTargetProjectNameBytes();

  /**
   * <pre>
   * 描述 
   * </pre>
   *
   * <code>string Description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * 描述 
   * </pre>
   *
   * <code>string Description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
