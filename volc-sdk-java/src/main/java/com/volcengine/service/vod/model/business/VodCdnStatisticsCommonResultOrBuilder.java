// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodCdnStatisticsCommonResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodCdnStatisticsCommonResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnStatisticsData Datas = 1;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodCdnStatisticsData> 
      getDatasList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnStatisticsData Datas = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodCdnStatisticsData getDatas(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnStatisticsData Datas = 1;</code>
   */
  int getDatasCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnStatisticsData Datas = 1;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodCdnStatisticsDataOrBuilder> 
      getDatasOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnStatisticsData Datas = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodCdnStatisticsDataOrBuilder getDatasOrBuilder(
      int index);

  /**
   * <code>repeated string NoPermissionDomains = 2;</code>
   * @return A list containing the noPermissionDomains.
   */
  java.util.List<java.lang.String>
      getNoPermissionDomainsList();
  /**
   * <code>repeated string NoPermissionDomains = 2;</code>
   * @return The count of noPermissionDomains.
   */
  int getNoPermissionDomainsCount();
  /**
   * <code>repeated string NoPermissionDomains = 2;</code>
   * @param index The index of the element to return.
   * @return The noPermissionDomains at the given index.
   */
  java.lang.String getNoPermissionDomains(int index);
  /**
   * <code>repeated string NoPermissionDomains = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the noPermissionDomains at the given index.
   */
  com.google.protobuf.ByteString
      getNoPermissionDomainsBytes(int index);
}
