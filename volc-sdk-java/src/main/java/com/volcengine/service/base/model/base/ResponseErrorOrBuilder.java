// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/base/base.proto

package com.volcengine.service.base.model.base;

public interface ResponseErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Base.Models.Base.ResponseError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 错误码
   * </pre>
   *
   * <code>string Code = 1;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <pre>
   * 错误码
   * </pre>
   *
   * <code>string Code = 1;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * 详细错误信息
   * </pre>
   *
   * <code>string Message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * 详细错误信息
   * </pre>
   *
   * <code>string Message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
