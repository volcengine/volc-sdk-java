// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListFileMetaInfosByFileNamesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListFileMetaInfosByFileNamesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 必传 filename所属空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 必传 filename所属空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
   * 用,连接进行传入  一次最多传30个
   * </pre>
   *
   * <code>string FileNameEncodeds = 2;</code>
   * @return The fileNameEncodeds.
   */
  java.lang.String getFileNameEncodeds();
  /**
   * <pre>
   * 需要查询的FileName 为了防止,出现在filename中,需要将filename进行urlencode后
   * 用,连接进行传入  一次最多传30个
   * </pre>
   *
   * <code>string FileNameEncodeds = 2;</code>
   * @return The bytes for fileNameEncodeds.
   */
  com.google.protobuf.ByteString
      getFileNameEncodedsBytes();

  /**
   * <pre>
   *非必选 挂载Bucket专用
   * </pre>
   *
   * <code>string BucketName = 3;</code>
   * @return The bucketName.
   */
  java.lang.String getBucketName();
  /**
   * <pre>
   *非必选 挂载Bucket专用
   * </pre>
   *
   * <code>string BucketName = 3;</code>
   * @return The bytes for bucketName.
   */
  com.google.protobuf.ByteString
      getBucketNameBytes();
}
