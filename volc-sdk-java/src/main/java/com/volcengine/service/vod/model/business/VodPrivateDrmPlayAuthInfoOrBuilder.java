// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_play.proto

package com.volcengine.service.vod.model.business;

public interface VodPrivateDrmPlayAuthInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodPrivateDrmPlayAuthInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 播放许可id
   * </pre>
   *
   * <code>string PlayAuthId = 1;</code>
   * @return The playAuthId.
   */
  java.lang.String getPlayAuthId();
  /**
   * <pre>
   * 播放许可id
   * </pre>
   *
   * <code>string PlayAuthId = 1;</code>
   * @return The bytes for playAuthId.
   */
  com.google.protobuf.ByteString
      getPlayAuthIdBytes();

  /**
   * <pre>
   * 播放许可内容
   * </pre>
   *
   * <code>string PlayAuthContent = 2;</code>
   * @return The playAuthContent.
   */
  java.lang.String getPlayAuthContent();
  /**
   * <pre>
   * 播放许可内容
   * </pre>
   *
   * <code>string PlayAuthContent = 2;</code>
   * @return The bytes for playAuthContent.
   */
  com.google.protobuf.ByteString
      getPlayAuthContentBytes();
}
