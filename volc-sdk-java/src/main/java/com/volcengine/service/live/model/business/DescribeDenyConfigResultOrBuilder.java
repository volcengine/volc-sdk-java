// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/deny_config.proto

package com.volcengine.service.live.model.business;

public interface DescribeDenyConfigResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Business.DescribeDenyConfigResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *配置列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.VhostWithDenyConfig DenyList = 1;</code>
   */
  java.util.List<VhostWithDenyConfig>
      getDenyListList();
  /**
   * <pre>
   *配置列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.VhostWithDenyConfig DenyList = 1;</code>
   */
  VhostWithDenyConfig getDenyList(int index);
  /**
   * <pre>
   *配置列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.VhostWithDenyConfig DenyList = 1;</code>
   */
  int getDenyListCount();
  /**
   * <pre>
   *配置列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.VhostWithDenyConfig DenyList = 1;</code>
   */
  java.util.List<? extends VhostWithDenyConfigOrBuilder>
      getDenyListOrBuilderList();
  /**
   * <pre>
   *配置列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.VhostWithDenyConfig DenyList = 1;</code>
   */
  VhostWithDenyConfigOrBuilder getDenyListOrBuilder(
      int index);
}
