// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

public interface VolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Imp.Models.Business.Volume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Method = 1;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <code>string Method = 1;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <code>optional double IntegratedLoudness = 2;</code>
   * @return Whether the integratedLoudness field is set.
   */
  boolean hasIntegratedLoudness();
  /**
   * <code>optional double IntegratedLoudness = 2;</code>
   * @return The integratedLoudness.
   */
  double getIntegratedLoudness();

  /**
   * <code>optional double TruePeak = 3;</code>
   * @return Whether the truePeak field is set.
   */
  boolean hasTruePeak();
  /**
   * <code>optional double TruePeak = 3;</code>
   * @return The truePeak.
   */
  double getTruePeak();

  /**
   * <code>optional double VolumeTime = 4;</code>
   * @return Whether the volumeTime field is set.
   */
  boolean hasVolumeTime();
  /**
   * <code>optional double VolumeTime = 4;</code>
   * @return The volumeTime.
   */
  double getVolumeTime();
}
