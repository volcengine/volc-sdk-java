// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

public interface ApplyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.ApplyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Volcengine.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
   * @return Whether the uploadAddress field is set.
   */
  boolean hasUploadAddress();
  /**
   * <code>.Volcengine.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
   * @return The uploadAddress.
   */
  com.volcengine.service.vod.model.business.UploadAddress getUploadAddress();
  /**
   * <code>.Volcengine.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
   */
  com.volcengine.service.vod.model.business.UploadAddressOrBuilder getUploadAddressOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
   * @return Whether the flushUploadResult field is set.
   */
  boolean hasFlushUploadResult();
  /**
   * <code>.Volcengine.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
   * @return The flushUploadResult.
   */
  com.volcengine.service.vod.model.business.FlushUploadResult getFlushUploadResult();
  /**
   * <code>.Volcengine.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
   */
  com.volcengine.service.vod.model.business.FlushUploadResultOrBuilder getFlushUploadResultOrBuilder();

  /**
   * <code>string SDKParam = 3;</code>
   * @return The sDKParam.
   */
  java.lang.String getSDKParam();
  /**
   * <code>string SDKParam = 3;</code>
   * @return The bytes for sDKParam.
   */
  com.google.protobuf.ByteString
      getSDKParamBytes();

  /**
   * <code>.Volcengine.Vod.Models.Business.VpcTosUploadAddress VpcTosUploadAddress = 5;</code>
   * @return Whether the vpcTosUploadAddress field is set.
   */
  boolean hasVpcTosUploadAddress();
  /**
   * <code>.Volcengine.Vod.Models.Business.VpcTosUploadAddress VpcTosUploadAddress = 5;</code>
   * @return The vpcTosUploadAddress.
   */
  com.volcengine.service.vod.model.business.VpcTosUploadAddress getVpcTosUploadAddress();
  /**
   * <code>.Volcengine.Vod.Models.Business.VpcTosUploadAddress VpcTosUploadAddress = 5;</code>
   */
  com.volcengine.service.vod.model.business.VpcTosUploadAddressOrBuilder getVpcTosUploadAddressOrBuilder();
}
