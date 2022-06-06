// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_smart_strategy.proto

package com.volcengine.service.vod.model.business;

public interface VodGetSmartStrategyLitePlayInfoResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodGetSmartStrategyLitePlayInfoResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 当前返回的播放流类型
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
   * @return The enum numeric value on the wire for streamType.
   */
  int getStreamTypeValue();
  /**
   * <pre>
   * 当前返回的播放流类型
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
   * @return The streamType.
   */
  com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType getStreamType();

  /**
   * <pre>
   * 该视频在点播中的元信息状态
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
   * @return The enum numeric value on the wire for dataStoreStatus.
   */
  int getDataStoreStatusValue();
  /**
   * <pre>
   * 该视频在点播中的元信息状态
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
   * @return The dataStoreStatus.
   */
  com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus getDataStoreStatus();

  /**
   * <pre>
   * 匹配的VideoModel
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
   * @return Whether the playInfoModel field is set.
   */
  boolean hasPlayInfoModel();
  /**
   * <pre>
   * 匹配的VideoModel
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
   * @return The playInfoModel.
   */
  com.volcengine.service.vod.model.business.VodPlayInfoModel getPlayInfoModel();
  /**
   * <pre>
   * 匹配的VideoModel
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
   */
  com.volcengine.service.vod.model.business.VodPlayInfoModelOrBuilder getPlayInfoModelOrBuilder();

  /**
   * <pre>
   * 原始URL
   * </pre>
   *
   * <code>string OriginalPlayUrl = 4;</code>
   * @return The originalPlayUrl.
   */
  java.lang.String getOriginalPlayUrl();
  /**
   * <pre>
   * 原始URL
   * </pre>
   *
   * <code>string OriginalPlayUrl = 4;</code>
   * @return The bytes for originalPlayUrl.
   */
  com.google.protobuf.ByteString
      getOriginalPlayUrlBytes();
}
