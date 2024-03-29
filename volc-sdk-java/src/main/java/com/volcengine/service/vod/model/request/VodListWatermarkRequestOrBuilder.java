// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListWatermarkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListWatermarkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间名称 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 空间名称 
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
   * 模板类型 
   * </pre>
   *
   * <code>string Type = 5;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * 模板类型 
   * </pre>
   *
   * <code>string Type = 5;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * 返回个数 
   * </pre>
   *
   * <code>int32 Limit = 6;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <pre>
   * 偏移量 
   * </pre>
   *
   * <code>int32 Offset = 7;</code>
   * @return The offset.
   */
  int getOffset();

  /**
   * <pre>
   * 排序维度 
   * </pre>
   *
   * <code>string OrderByKey = 8;</code>
   * @return The orderByKey.
   */
  java.lang.String getOrderByKey();
  /**
   * <pre>
   * 排序维度 
   * </pre>
   *
   * <code>string OrderByKey = 8;</code>
   * @return The bytes for orderByKey.
   */
  com.google.protobuf.ByteString
      getOrderByKeyBytes();

  /**
   * <pre>
   * 排序方式 
   * </pre>
   *
   * <code>string Order = 9;</code>
   * @return The order.
   */
  java.lang.String getOrder();
  /**
   * <pre>
   * 排序方式 
   * </pre>
   *
   * <code>string Order = 9;</code>
   * @return The bytes for order.
   */
  com.google.protobuf.ByteString
      getOrderBytes();
}
