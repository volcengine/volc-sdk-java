// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

public interface SubmitMoveObjectTaskParamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.SubmitMoveObjectTaskParam)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string SourceSpace = 1;</code>
   * @return The sourceSpace.
   */
  java.lang.String getSourceSpace();
  /**
   * <code>string SourceSpace = 1;</code>
   * @return The bytes for sourceSpace.
   */
  com.google.protobuf.ByteString
      getSourceSpaceBytes();

  /**
   * <code>string SourceFileName = 2;</code>
   * @return The sourceFileName.
   */
  java.lang.String getSourceFileName();
  /**
   * <code>string SourceFileName = 2;</code>
   * @return The bytes for sourceFileName.
   */
  com.google.protobuf.ByteString
      getSourceFileNameBytes();

  /**
   * <code>string TargetSpace = 3;</code>
   * @return The targetSpace.
   */
  java.lang.String getTargetSpace();
  /**
   * <code>string TargetSpace = 3;</code>
   * @return The bytes for targetSpace.
   */
  com.google.protobuf.ByteString
      getTargetSpaceBytes();

  /**
   * <code>string TargetFileName = 4;</code>
   * @return The targetFileName.
   */
  java.lang.String getTargetFileName();
  /**
   * <code>string TargetFileName = 4;</code>
   * @return The bytes for targetFileName.
   */
  com.google.protobuf.ByteString
      getTargetFileNameBytes();

  /**
   * <code>bool SaveSourceObject = 5;</code>
   * @return The saveSourceObject.
   */
  boolean getSaveSourceObject();

  /**
   * <code>bool ForceOverwrite = 6;</code>
   * @return The forceOverwrite.
   */
  boolean getForceOverwrite();
}
