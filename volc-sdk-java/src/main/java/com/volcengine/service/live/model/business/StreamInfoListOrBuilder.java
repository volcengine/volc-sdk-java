// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/stream_manage.proto

package com.volcengine.service.live.model.business;

public interface StreamInfoListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Business.StreamInfoList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *流ID
   * </pre>
   *
   * <code>int64 ID = 1;</code>
   * @return The iD.
   */
  long getID();

  /**
   * <pre>
   * 域名空间名称
   * </pre>
   *
   * <code>string Vhost = 2;</code>
   * @return The vhost.
   */
  String getVhost();
  /**
   * <pre>
   * 域名空间名称
   * </pre>
   *
   * <code>string Vhost = 2;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <pre>
   * 域名
   * </pre>
   *
   * <code>string Domain = 3;</code>
   * @return The domain.
   */
  String getDomain();
  /**
   * <pre>
   * 域名
   * </pre>
   *
   * <code>string Domain = 3;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 应用名称
   * </pre>
   *
   * <code>string App = 4;</code>
   * @return The app.
   */
  String getApp();
  /**
   * <pre>
   * 应用名称
   * </pre>
   *
   * <code>string App = 4;</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();

  /**
   * <pre>
   * 流名称
   * </pre>
   *
   * <code>string Stream = 5;</code>
   * @return The stream.
   */
  String getStream();
  /**
   * <pre>
   * 流名称
   * </pre>
   *
   * <code>string Stream = 5;</code>
   * @return The bytes for stream.
   */
  com.google.protobuf.ByteString
      getStreamBytes();

  /**
   * <pre>
   * 开始推流时间
   * </pre>
   *
   * <code>string SessionStartTime = 6;</code>
   * @return The sessionStartTime.
   */
  String getSessionStartTime();
  /**
   * <pre>
   * 开始推流时间
   * </pre>
   *
   * <code>string SessionStartTime = 6;</code>
   * @return The bytes for sessionStartTime.
   */
  com.google.protobuf.ByteString
      getSessionStartTimeBytes();

  /**
   * <pre>
   * 在线人数
   * </pre>
   *
   * <code>int64 OnlineUser = 7;</code>
   * @return The onlineUser.
   */
  long getOnlineUser();

  /**
   * <pre>
   * 带宽
   * </pre>
   *
   * <code>int64 BandWidth = 8;</code>
   * @return The bandWidth.
   */
  long getBandWidth();

  /**
   * <pre>
   * 码率
   * </pre>
   *
   * <code>int64 Bitrate = 9;</code>
   * @return The bitrate.
   */
  long getBitrate();

  /**
   * <pre>
   * 帧率
   * </pre>
   *
   * <code>int64 Framerate = 10;</code>
   * @return The framerate.
   */
  long getFramerate();

  /**
   * <pre>
   * 预览地址
   * </pre>
   *
   * <code>string PreviewURL = 11;</code>
   * @return The previewURL.
   */
  String getPreviewURL();
  /**
   * <pre>
   * 预览地址
   * </pre>
   *
   * <code>string PreviewURL = 11;</code>
   * @return The bytes for previewURL.
   */
  com.google.protobuf.ByteString
      getPreviewURLBytes();
}
