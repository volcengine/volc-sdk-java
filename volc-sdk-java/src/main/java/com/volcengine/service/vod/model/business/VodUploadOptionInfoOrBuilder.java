// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

public interface VodUploadOptionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodUploadOptionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string TemplateId = 1;</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <code>string TemplateId = 1;</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();

  /**
   * <code>repeated string TemplateIds = 2;</code>
   * @return A list containing the templateIds.
   */
  java.util.List<java.lang.String>
      getTemplateIdsList();
  /**
   * <code>repeated string TemplateIds = 2;</code>
   * @return The count of templateIds.
   */
  int getTemplateIdsCount();
  /**
   * <code>repeated string TemplateIds = 2;</code>
   * @param index The index of the element to return.
   * @return The templateIds at the given index.
   */
  java.lang.String getTemplateIds(int index);
  /**
   * <code>repeated string TemplateIds = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the templateIds at the given index.
   */
  com.google.protobuf.ByteString
      getTemplateIdsBytes(int index);

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodUploadTemplate> 
      getTemplatesList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  com.volcengine.service.vod.model.business.VodUploadTemplate getTemplates(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  int getTemplatesCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder> 
      getTemplatesOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadTemplate Templates = 3;</code>
   */
  com.volcengine.service.vod.model.business.VodUploadTemplateOrBuilder getTemplatesOrBuilder(
      int index);
}
