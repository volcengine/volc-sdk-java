// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListTaskTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListTaskTemplateRequest)
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
   * 模板ID 
   * </pre>
   *
   * <code>string TemplateId = 2;</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <pre>
   * 模板ID 
   * </pre>
   *
   * <code>string TemplateId = 2;</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();

  /**
   * <pre>
   * 模板名称 
   * </pre>
   *
   * <code>string Name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 模板名称 
   * </pre>
   *
   * <code>string Name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 任务类型 多个值通过 ',' 连接 
   * </pre>
   *
   * <code>string TaskType = 4;</code>
   * @return The taskType.
   */
  java.lang.String getTaskType();
  /**
   * <pre>
   * 任务类型 多个值通过 ',' 连接 
   * </pre>
   *
   * <code>string TaskType = 4;</code>
   * @return The bytes for taskType.
   */
  com.google.protobuf.ByteString
      getTaskTypeBytes();

  /**
   * <pre>
   * 模板类型 
   * </pre>
   *
   * <code>string Type = 6;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * 模板类型 
   * </pre>
   *
   * <code>string Type = 6;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * 返回个数 
   * </pre>
   *
   * <code>int32 Limit = 7;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <pre>
   * 偏移量 
   * </pre>
   *
   * <code>int32 Offset = 8;</code>
   * @return The offset.
   */
  int getOffset();

  /**
   * <pre>
   * 排序纬度 
   * </pre>
   *
   * <code>string OrderByKey = 9;</code>
   * @return The orderByKey.
   */
  java.lang.String getOrderByKey();
  /**
   * <pre>
   * 排序纬度 
   * </pre>
   *
   * <code>string OrderByKey = 9;</code>
   * @return The bytes for orderByKey.
   */
  com.google.protobuf.ByteString
      getOrderByKeyBytes();

  /**
   * <pre>
   * 排序方式 
   * </pre>
   *
   * <code>string Order = 10;</code>
   * @return The order.
   */
  java.lang.String getOrder();
  /**
   * <pre>
   * 排序方式 
   * </pre>
   *
   * <code>string Order = 10;</code>
   * @return The bytes for order.
   */
  com.google.protobuf.ByteString
      getOrderBytes();
}
