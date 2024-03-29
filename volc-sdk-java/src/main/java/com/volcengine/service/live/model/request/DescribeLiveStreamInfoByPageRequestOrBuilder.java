// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

public interface DescribeLiveStreamInfoByPageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Request.DescribeLiveStreamInfoByPageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *当前页码，取值范围为 。
   * </pre>
   *
   * <code>int64 PageNum = 1;</code>
   * @return The pageNum.
   */
  long getPageNum();

  /**
   * <pre>
   *分页大小，取值范围为 。
   * </pre>
   *
   * <code>int64 PageSize = 2;</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <pre>
   *域名空间名称。
   *参数 `Domain` 和 `Vhost`传且仅传一个。
   * </pre>
   *
   * <code>string Vhost = 3;</code>
   * @return The vhost.
   */
  java.lang.String getVhost();
  /**
   * <pre>
   *域名空间名称。
   *参数 `Domain` 和 `Vhost`传且仅传一个。
   * </pre>
   *
   * <code>string Vhost = 3;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <pre>
   *推流域名。
   *参数 `Domain` 和 `Vhost`传且仅传一个。
   * </pre>
   *
   * <code>string Domain = 4;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   *推流域名。
   *参数 `Domain` 和 `Vhost`传且仅传一个。
   * </pre>
   *
   * <code>string Domain = 4;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 应用名称，默认查询所有应用名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。
   * </pre>
   *
   * <code>string App = 5;</code>
   * @return The app.
   */
  java.lang.String getApp();
  /**
   * <pre>
   * 应用名称，默认查询所有应用名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。
   * </pre>
   *
   * <code>string App = 5;</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();

  /**
   * <pre>
   * 流名称，缺省情况下，查询所有流名称，由 1 到 100
   * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
   * </pre>
   *
   * <code>string Stream = 6;</code>
   * @return The stream.
   */
  java.lang.String getStream();
  /**
   * <pre>
   * 流名称，缺省情况下，查询所有流名称，由 1 到 100
   * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
   * </pre>
   *
   * <code>string Stream = 6;</code>
   * @return The bytes for stream.
   */
  com.google.protobuf.ByteString
      getStreamBytes();

  /**
   * <pre>
   * 流类型，缺省情况下表示全选。支持如下取值。
   *&lt;li&gt;Origin：原始流；
   *&lt;li&gt;trans：转码流。
   * </pre>
   *
   * <code>string StreamType = 7;</code>
   * @return The streamType.
   */
  java.lang.String getStreamType();
  /**
   * <pre>
   * 流类型，缺省情况下表示全选。支持如下取值。
   *&lt;li&gt;Origin：原始流；
   *&lt;li&gt;trans：转码流。
   * </pre>
   *
   * <code>string StreamType = 7;</code>
   * @return The bytes for streamType.
   */
  com.google.protobuf.ByteString
      getStreamTypeBytes();

  /**
   * <pre>
   * 想要查询的目标信息，使用英文逗号作为分隔符“,”，例如，bitrate,framerate。缺省情况下表示
   *bitrate,framerate。支持如下取值。 &lt;li&gt;all：所有信息；
   *&lt;li&gt;onlineuser：在线人数；
   *&lt;li&gt;bandwidth：带宽信息;
   *&lt;li&gt;bitrate：码率信息；
   *&lt;li&gt;framerate：帧率信息；
   * </pre>
   *
   * <code>string InfoType = 8;</code>
   * @return The infoType.
   */
  java.lang.String getInfoType();
  /**
   * <pre>
   * 想要查询的目标信息，使用英文逗号作为分隔符“,”，例如，bitrate,framerate。缺省情况下表示
   *bitrate,framerate。支持如下取值。 &lt;li&gt;all：所有信息；
   *&lt;li&gt;onlineuser：在线人数；
   *&lt;li&gt;bandwidth：带宽信息;
   *&lt;li&gt;bitrate：码率信息；
   *&lt;li&gt;framerate：帧率信息；
   * </pre>
   *
   * <code>string InfoType = 8;</code>
   * @return The bytes for infoType.
   */
  com.google.protobuf.ByteString
      getInfoTypeBytes();
}
