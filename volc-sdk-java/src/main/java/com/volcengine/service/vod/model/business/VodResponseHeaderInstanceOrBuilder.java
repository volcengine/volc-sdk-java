// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodResponseHeaderInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodResponseHeaderInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 指定对响应头的操作
   * </pre>
   *
   * <code>string Action = 1;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * 指定对响应头的操作
   * </pre>
   *
   * <code>string Action = 1;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * 指定一个头部的名称
   * </pre>
   *
   * <code>string Key = 2;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * 指定一个头部的名称
   * </pre>
   *
   * <code>string Key = 2;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * 指定 Key 的取值类型
   * </pre>
   *
   * <code>string ValueType = 3;</code>
   * @return The valueType.
   */
  java.lang.String getValueType();
  /**
   * <pre>
   * 指定 Key 的取值类型
   * </pre>
   *
   * <code>string ValueType = 3;</code>
   * @return The bytes for valueType.
   */
  com.google.protobuf.ByteString
      getValueTypeBytes();

  /**
   * <pre>
   * 表示在内容分发网络响应用户请求时，是否校验请求头中的 Origin 字段
   * </pre>
   *
   * <code>bool AccessOriginControl = 4;</code>
   * @return The accessOriginControl.
   */
  boolean getAccessOriginControl();

  /**
   * <pre>
   * 表示 Key 的值
   * </pre>
   *
   * <code>string Value = 5;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * 表示 Key 的值
   * </pre>
   *
   * <code>string Value = 5;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}