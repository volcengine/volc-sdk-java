// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_measure.proto

package com.volcengine.service.vod.model.business;

public interface DescribeVodSpaceWorkflowVideoAIInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.DescribeVodSpaceWorkflowVideoAIInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string TemplateType = 1;</code>
   * @return The templateType.
   */
  java.lang.String getTemplateType();
  /**
   * <code>string TemplateType = 1;</code>
   * @return The bytes for templateType.
   */
  com.google.protobuf.ByteString
      getTemplateTypeBytes();

  /**
   * <code>int64 Duration = 2;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <code>int64 Number = 3;</code>
   * @return The number.
   */
  long getNumber();

  /**
   * <code>bool IsLowPriority = 4;</code>
   * @return The isLowPriority.
   */
  boolean getIsLowPriority();
}
