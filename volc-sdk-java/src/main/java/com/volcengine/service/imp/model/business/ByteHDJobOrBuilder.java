// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

public interface ByteHDJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Imp.Models.Business.ByteHDJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Container = 1;</code>
   * @return The container.
   */
  java.lang.String getContainer();
  /**
   * <code>string Container = 1;</code>
   * @return The bytes for container.
   */
  com.google.protobuf.ByteString
      getContainerBytes();

  /**
   * <code>.Volcengine.Imp.Models.Business.Video Video = 2;</code>
   * @return Whether the video field is set.
   */
  boolean hasVideo();
  /**
   * <code>.Volcengine.Imp.Models.Business.Video Video = 2;</code>
   * @return The video.
   */
  com.volcengine.service.imp.model.business.Video getVideo();
  /**
   * <code>.Volcengine.Imp.Models.Business.Video Video = 2;</code>
   */
  com.volcengine.service.imp.model.business.VideoOrBuilder getVideoOrBuilder();

  /**
   * <code>.Volcengine.Imp.Models.Business.Audio Audio = 3;</code>
   * @return Whether the audio field is set.
   */
  boolean hasAudio();
  /**
   * <code>.Volcengine.Imp.Models.Business.Audio Audio = 3;</code>
   * @return The audio.
   */
  com.volcengine.service.imp.model.business.Audio getAudio();
  /**
   * <code>.Volcengine.Imp.Models.Business.Audio Audio = 3;</code>
   */
  com.volcengine.service.imp.model.business.AudioOrBuilder getAudioOrBuilder();

  /**
   * <code>.Volcengine.Imp.Models.Business.Segment Segment = 4;</code>
   * @return Whether the segment field is set.
   */
  boolean hasSegment();
  /**
   * <code>.Volcengine.Imp.Models.Business.Segment Segment = 4;</code>
   * @return The segment.
   */
  com.volcengine.service.imp.model.business.Segment getSegment();
  /**
   * <code>.Volcengine.Imp.Models.Business.Segment Segment = 4;</code>
   */
  com.volcengine.service.imp.model.business.SegmentOrBuilder getSegmentOrBuilder();

  /**
   * <code>repeated .Volcengine.Imp.Models.Business.LogoDefinition Logos = 5;</code>
   */
  java.util.List<com.volcengine.service.imp.model.business.LogoDefinition> 
      getLogosList();
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.LogoDefinition Logos = 5;</code>
   */
  com.volcengine.service.imp.model.business.LogoDefinition getLogos(int index);
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.LogoDefinition Logos = 5;</code>
   */
  int getLogosCount();
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.LogoDefinition Logos = 5;</code>
   */
  java.util.List<? extends com.volcengine.service.imp.model.business.LogoDefinitionOrBuilder> 
      getLogosOrBuilderList();
  /**
   * <code>repeated .Volcengine.Imp.Models.Business.LogoDefinition Logos = 5;</code>
   */
  com.volcengine.service.imp.model.business.LogoDefinitionOrBuilder getLogosOrBuilder(
      int index);
}
