// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.volcengine.service.vod.model.response;

public interface VodListVideoClassificationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Response.VodListVideoClassificationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Volcengine.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <code>.Volcengine.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.service.vod.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <code>.Volcengine.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.service.vod.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.VodVideoClassificationsData Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.Volcengine.Vod.Models.Business.VodVideoClassificationsData Result = 2;</code>
   * @return The result.
   */
  com.volcengine.service.vod.model.business.VodVideoClassificationsData getResult();
  /**
   * <code>.Volcengine.Vod.Models.Business.VodVideoClassificationsData Result = 2;</code>
   */
  com.volcengine.service.vod.model.business.VodVideoClassificationsDataOrBuilder getResultOrBuilder();
}
