// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.volcengine.service.vod.model.response;

public interface VodGetAudioEventDetectionForAuditResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Response.VodGetAudioEventDetectionForAuditResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodGetAudioEventDetectionForAuditResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodGetAudioEventDetectionForAuditResult Result = 2;</code>
   * @return The result.
   */
  com.volcengine.service.vod.model.business.VodGetAudioEventDetectionForAuditResult getResult();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodGetAudioEventDetectionForAuditResult Result = 2;</code>
   */
  com.volcengine.service.vod.model.business.VodGetAudioEventDetectionForAuditResultOrBuilder getResultOrBuilder();
}
