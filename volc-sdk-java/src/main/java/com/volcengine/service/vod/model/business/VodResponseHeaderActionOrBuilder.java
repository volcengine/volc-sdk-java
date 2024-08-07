// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodResponseHeaderActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodResponseHeaderAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 表示一个响应头的配置规则列表。每个规则都包含一个头部的相关操作设置。您最多可以添加
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodResponseHeaderInstance ResponseHeaderInstances = 1;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodResponseHeaderInstance> 
      getResponseHeaderInstancesList();
  /**
   * <pre>
   * 表示一个响应头的配置规则列表。每个规则都包含一个头部的相关操作设置。您最多可以添加
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodResponseHeaderInstance ResponseHeaderInstances = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodResponseHeaderInstance getResponseHeaderInstances(int index);
  /**
   * <pre>
   * 表示一个响应头的配置规则列表。每个规则都包含一个头部的相关操作设置。您最多可以添加
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodResponseHeaderInstance ResponseHeaderInstances = 1;</code>
   */
  int getResponseHeaderInstancesCount();
  /**
   * <pre>
   * 表示一个响应头的配置规则列表。每个规则都包含一个头部的相关操作设置。您最多可以添加
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodResponseHeaderInstance ResponseHeaderInstances = 1;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodResponseHeaderInstanceOrBuilder> 
      getResponseHeaderInstancesOrBuilderList();
  /**
   * <pre>
   * 表示一个响应头的配置规则列表。每个规则都包含一个头部的相关操作设置。您最多可以添加
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodResponseHeaderInstance ResponseHeaderInstances = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodResponseHeaderInstanceOrBuilder getResponseHeaderInstancesOrBuilder(
      int index);
}
