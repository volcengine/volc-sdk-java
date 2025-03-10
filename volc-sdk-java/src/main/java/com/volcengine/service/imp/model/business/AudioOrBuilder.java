// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

public interface AudioOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Imp.Models.Business.Audio)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Codec = 1;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <code>string Codec = 1;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <code>string Profile = 2;</code>
   * @return The profile.
   */
  java.lang.String getProfile();
  /**
   * <code>string Profile = 2;</code>
   * @return The bytes for profile.
   */
  com.google.protobuf.ByteString
      getProfileBytes();

  /**
   * <code>int32 SampleRate = 3;</code>
   * @return The sampleRate.
   */
  int getSampleRate();

  /**
   * <code>int32 Bitrate = 4;</code>
   * @return The bitrate.
   */
  int getBitrate();

  /**
   * <code>int32 Channels = 5;</code>
   * @return The channels.
   */
  int getChannels();

  /**
   * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
   * @return Whether the volume field is set.
   */
  boolean hasVolume();
  /**
   * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
   * @return The volume.
   */
  com.volcengine.service.imp.model.business.Volume getVolume();
  /**
   * <code>.Volcengine.Imp.Models.Business.Volume Volume = 6;</code>
   */
  com.volcengine.service.imp.model.business.VolumeOrBuilder getVolumeOrBuilder();
}
