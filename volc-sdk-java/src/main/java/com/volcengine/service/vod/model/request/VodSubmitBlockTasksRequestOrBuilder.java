// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodSubmitBlockTasksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodSubmitBlockTasksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *媒体Url列表：
   *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
   *用&#92;n分隔。 每次最多可提交 100 条。
   * </pre>
   *
   * <code>string FileUrls = 1;</code>
   * @return The fileUrls.
   */
  java.lang.String getFileUrls();
  /**
   * <pre>
   *媒体Url列表：
   *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
   *用&#92;n分隔。 每次最多可提交 100 条。
   * </pre>
   *
   * <code>string FileUrls = 1;</code>
   * @return The bytes for fileUrls.
   */
  com.google.protobuf.ByteString
      getFileUrlsBytes();

  /**
   * <pre>
   * forbid：禁播，recover：解禁。
   * </pre>
   *
   * <code>string Operation = 2;</code>
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   * <pre>
   * forbid：禁播，recover：解禁。
   * </pre>
   *
   * <code>string Operation = 2;</code>
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString
      getOperationBytes();

  /**
   * <pre>
   * 点播空间名，非必填
   * </pre>
   *
   * <code>string SpaceName = 3;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 点播空间名，非必填
   * </pre>
   *
   * <code>string SpaceName = 3;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();
}
