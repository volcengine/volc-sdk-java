// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface SnapshotParamsSpriteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.SnapshotParamsSprite)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Format = 1;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <code>string Format = 1;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <code>repeated string StoreUris = 2;</code>
   * @return A list containing the storeUris.
   */
  java.util.List<java.lang.String>
      getStoreUrisList();
  /**
   * <code>repeated string StoreUris = 2;</code>
   * @return The count of storeUris.
   */
  int getStoreUrisCount();
  /**
   * <code>repeated string StoreUris = 2;</code>
   * @param index The index of the element to return.
   * @return The storeUris at the given index.
   */
  java.lang.String getStoreUris(int index);
  /**
   * <code>repeated string StoreUris = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the storeUris at the given index.
   */
  com.google.protobuf.ByteString
      getStoreUrisBytes(int index);

  /**
   * <code>int32 CellWidth = 3;</code>
   * @return The cellWidth.
   */
  int getCellWidth();

  /**
   * <code>int32 CellHeight = 4;</code>
   * @return The cellHeight.
   */
  int getCellHeight();

  /**
   * <code>int32 ImgXLen = 5;</code>
   * @return The imgXLen.
   */
  int getImgXLen();

  /**
   * <code>int32 ImgYLen = 6;</code>
   * @return The imgYLen.
   */
  int getImgYLen();

  /**
   * <code>float Interval = 7;</code>
   * @return The interval.
   */
  float getInterval();

  /**
   * <code>int32 CaptureNum = 8;</code>
   * @return The captureNum.
   */
  int getCaptureNum();
}
