// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/addr.proto

package com.volcengine.service.live.model.business;

public interface GeneratePlayURLResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Business.GeneratePlayURLResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *播放地址详情列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.PlayURL URLList = 1;</code>
   */
  java.util.List<PlayURL>
      getURLListList();
  /**
   * <pre>
   *播放地址详情列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.PlayURL URLList = 1;</code>
   */
  PlayURL getURLList(int index);
  /**
   * <pre>
   *播放地址详情列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.PlayURL URLList = 1;</code>
   */
  int getURLListCount();
  /**
   * <pre>
   *播放地址详情列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.PlayURL URLList = 1;</code>
   */
  java.util.List<? extends PlayURLOrBuilder>
      getURLListOrBuilderList();
  /**
   * <pre>
   *播放地址详情列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.PlayURL URLList = 1;</code>
   */
  PlayURLOrBuilder getURLListOrBuilder(
      int index);
}
