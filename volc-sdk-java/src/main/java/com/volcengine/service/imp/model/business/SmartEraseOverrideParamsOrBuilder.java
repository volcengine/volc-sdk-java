// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

public interface SmartEraseOverrideParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Imp.Models.Business.SmartEraseOverrideParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string ActivityId = 1;</code>
   * @return A list containing the activityId.
   */
  java.util.List<java.lang.String>
      getActivityIdList();
  /**
   * <code>repeated string ActivityId = 1;</code>
   * @return The count of activityId.
   */
  int getActivityIdCount();
  /**
   * <code>repeated string ActivityId = 1;</code>
   * @param index The index of the element to return.
   * @return The activityId at the given index.
   */
  java.lang.String getActivityId(int index);
  /**
   * <code>repeated string ActivityId = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the activityId at the given index.
   */
  com.google.protobuf.ByteString
      getActivityIdBytes(int index);

  /**
   * <code>.Volcengine.Imp.Models.Business.Watermark Watermark = 2;</code>
   * @return Whether the watermark field is set.
   */
  boolean hasWatermark();
  /**
   * <code>.Volcengine.Imp.Models.Business.Watermark Watermark = 2;</code>
   * @return The watermark.
   */
  com.volcengine.service.imp.model.business.Watermark getWatermark();
  /**
   * <code>.Volcengine.Imp.Models.Business.Watermark Watermark = 2;</code>
   */
  com.volcengine.service.imp.model.business.WatermarkOrBuilder getWatermarkOrBuilder();

  /**
   * <code>.Volcengine.Imp.Models.Business.OCR OCR = 3;</code>
   * @return Whether the oCR field is set.
   */
  boolean hasOCR();
  /**
   * <code>.Volcengine.Imp.Models.Business.OCR OCR = 3;</code>
   * @return The oCR.
   */
  com.volcengine.service.imp.model.business.OCR getOCR();
  /**
   * <code>.Volcengine.Imp.Models.Business.OCR OCR = 3;</code>
   */
  com.volcengine.service.imp.model.business.OCROrBuilder getOCROrBuilder();
}