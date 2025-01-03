// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

public interface PartUploadInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.PartUploadInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 分片大小 
   * </pre>
   *
   * <code>int64 PartSize = 1;</code>
   * @return The partSize.
   */
  long getPartSize();

  /**
   * <pre>
   * 分片上传URLs 
   * </pre>
   *
   * <code>repeated string PartPutUrls = 2;</code>
   * @return A list containing the partPutUrls.
   */
  java.util.List<java.lang.String>
      getPartPutUrlsList();
  /**
   * <pre>
   * 分片上传URLs 
   * </pre>
   *
   * <code>repeated string PartPutUrls = 2;</code>
   * @return The count of partPutUrls.
   */
  int getPartPutUrlsCount();
  /**
   * <pre>
   * 分片上传URLs 
   * </pre>
   *
   * <code>repeated string PartPutUrls = 2;</code>
   * @param index The index of the element to return.
   * @return The partPutUrls at the given index.
   */
  java.lang.String getPartPutUrls(int index);
  /**
   * <pre>
   * 分片上传URLs 
   * </pre>
   *
   * <code>repeated string PartPutUrls = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the partPutUrls at the given index.
   */
  com.google.protobuf.ByteString
      getPartPutUrlsBytes(int index);

  /**
   * <pre>
   * 合并分片URL 
   * </pre>
   *
   * <code>string CompletePartUrl = 3;</code>
   * @return The completePartUrl.
   */
  java.lang.String getCompletePartUrl();
  /**
   * <pre>
   * 合并分片URL 
   * </pre>
   *
   * <code>string CompletePartUrl = 3;</code>
   * @return The bytes for completePartUrl.
   */
  com.google.protobuf.ByteString
      getCompletePartUrlBytes();

  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */
  int getCompleteUrlHeadersCount();
  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */
  boolean containsCompleteUrlHeaders(
      java.lang.String key);
  /**
   * Use {@link #getCompleteUrlHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getCompleteUrlHeaders();
  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCompleteUrlHeadersMap();
  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */

  java.lang.String getCompleteUrlHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * 合并分片阶段需携带的headers 
   * </pre>
   *
   * <code>map&lt;string, string&gt; CompleteUrlHeaders = 4;</code>
   */

  java.lang.String getCompleteUrlHeadersOrThrow(
      java.lang.String key);
}
