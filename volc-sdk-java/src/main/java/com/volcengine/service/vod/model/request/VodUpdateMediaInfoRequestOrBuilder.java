// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodUpdateMediaInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodUpdateMediaInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *视频封面Uri
   * </pre>
   *
   * <code>.google.protobuf.StringValue PosterUri = 2;</code>
   * @return Whether the posterUri field is set.
   */
  boolean hasPosterUri();
  /**
   * <pre>
   *视频封面Uri
   * </pre>
   *
   * <code>.google.protobuf.StringValue PosterUri = 2;</code>
   * @return The posterUri.
   */
  com.google.protobuf.StringValue getPosterUri();
  /**
   * <pre>
   *视频封面Uri
   * </pre>
   *
   * <code>.google.protobuf.StringValue PosterUri = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPosterUriOrBuilder();

  /**
   * <pre>
   *视频名称
   * </pre>
   *
   * <code>.google.protobuf.StringValue Title = 3;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   *视频名称
   * </pre>
   *
   * <code>.google.protobuf.StringValue Title = 3;</code>
   * @return The title.
   */
  com.google.protobuf.StringValue getTitle();
  /**
   * <pre>
   *视频名称
   * </pre>
   *
   * <code>.google.protobuf.StringValue Title = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTitleOrBuilder();

  /**
   * <pre>
   *视频描述
   * </pre>
   *
   * <code>.google.protobuf.StringValue Description = 4;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   *视频描述
   * </pre>
   *
   * <code>.google.protobuf.StringValue Description = 4;</code>
   * @return The description.
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   *视频描述
   * </pre>
   *
   * <code>.google.protobuf.StringValue Description = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   *视频标签
   * </pre>
   *
   * <code>.google.protobuf.StringValue Tags = 5;</code>
   * @return Whether the tags field is set.
   */
  boolean hasTags();
  /**
   * <pre>
   *视频标签
   * </pre>
   *
   * <code>.google.protobuf.StringValue Tags = 5;</code>
   * @return The tags.
   */
  com.google.protobuf.StringValue getTags();
  /**
   * <pre>
   *视频标签
   * </pre>
   *
   * <code>.google.protobuf.StringValue Tags = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTagsOrBuilder();

  /**
   * <pre>
   *视频分类Id
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ClassificationId = 6;</code>
   * @return Whether the classificationId field is set.
   */
  boolean hasClassificationId();
  /**
   * <pre>
   *视频分类Id
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ClassificationId = 6;</code>
   * @return The classificationId.
   */
  com.google.protobuf.Int64Value getClassificationId();
  /**
   * <pre>
   *视频分类Id
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ClassificationId = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getClassificationIdOrBuilder();

  /**
   * <pre>
   * 媒资文件过期时间,采用ISO日期格式. 不传或传空,不修改.
   * 填"9999-12-31T23:59:59Z"表示永不过期.
   * 过期后该媒资文件及其相关资源（转码结果、封面图等）将被永久删除.
   * 示例值:2024-08-30T20:10:11+08:00 
   * </pre>
   *
   * <code>.google.protobuf.StringValue ExpireTime = 7;</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <pre>
   * 媒资文件过期时间,采用ISO日期格式. 不传或传空,不修改.
   * 填"9999-12-31T23:59:59Z"表示永不过期.
   * 过期后该媒资文件及其相关资源（转码结果、封面图等）将被永久删除.
   * 示例值:2024-08-30T20:10:11+08:00 
   * </pre>
   *
   * <code>.google.protobuf.StringValue ExpireTime = 7;</code>
   * @return The expireTime.
   */
  com.google.protobuf.StringValue getExpireTime();
  /**
   * <pre>
   * 媒资文件过期时间,采用ISO日期格式. 不传或传空,不修改.
   * 填"9999-12-31T23:59:59Z"表示永不过期.
   * 过期后该媒资文件及其相关资源（转码结果、封面图等）将被永久删除.
   * 示例值:2024-08-30T20:10:11+08:00 
   * </pre>
   *
   * <code>.google.protobuf.StringValue ExpireTime = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getExpireTimeOrBuilder();
}
