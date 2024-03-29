// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/relay_source.proto

package com.volcengine.service.live.model.business;

public interface RelaySourceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Business.RelaySourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 对应的 Vhost。
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The vhost.
   */
  String getVhost();
  /**
   * <pre>
   * 对应的 Vhost。
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <pre>
   * 应用名称。
   * </pre>
   *
   * <code>string App = 2;</code>
   * @return The app.
   */
  String getApp();
  /**
   * <pre>
   * 应用名称。
   * </pre>
   *
   * <code>string App = 2;</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();

  /**
   * <pre>
   * 分组列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.RelaySourceGroupItemV2 GroupList = 3;</code>
   */
  java.util.List<RelaySourceGroupItemV2>
      getGroupListList();
  /**
   * <pre>
   * 分组列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.RelaySourceGroupItemV2 GroupList = 3;</code>
   */
  RelaySourceGroupItemV2 getGroupList(int index);
  /**
   * <pre>
   * 分组列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.RelaySourceGroupItemV2 GroupList = 3;</code>
   */
  int getGroupListCount();
  /**
   * <pre>
   * 分组列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.RelaySourceGroupItemV2 GroupList = 3;</code>
   */
  java.util.List<? extends RelaySourceGroupItemV2OrBuilder>
      getGroupListOrBuilderList();
  /**
   * <pre>
   * 分组列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.RelaySourceGroupItemV2 GroupList = 3;</code>
   */
  RelaySourceGroupItemV2OrBuilder getGroupListOrBuilder(
      int index);
}
