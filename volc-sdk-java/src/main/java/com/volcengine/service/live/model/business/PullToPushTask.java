// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/pull_to_push.proto

package com.volcengine.service.live.model.business;

public final class PullToPushTask {
  private PullToPushTask() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_CreatePullToPushTaskResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_CreatePullToPushTaskResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_ListPullToPushTaskResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_ListPullToPushTaskResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_TaskInfoItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_TaskInfoItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n live/business/pull_to_push.proto\022\037Volc" +
      "engine.Live.Models.Business\032#live/busine" +
      "ss/snapshot_manage.proto\",\n\032CreatePullTo" +
      "PushTaskResult\022\016\n\006TaskId\030\001 \001(\t\"\230\001\n\030ListP" +
      "ullToPushTaskResult\022;\n\004List\030\001 \003(\0132-.Volc" +
      "engine.Live.Models.Business.TaskInfoItem" +
      "\022?\n\nPagination\030\002 \001(\0132+.Volcengine.Live.M" +
      "odels.Business.Pagination\"\337\001\n\014TaskInfoIt" +
      "em\022\r\n\005Title\030\001 \001(\t\022\016\n\006TaskId\030\002 \001(\t\022\021\n\tSta" +
      "rtTime\030\003 \001(\t\022\017\n\007EndTime\030\004 \001(\t\022\023\n\013Callbac" +
      "kURL\030\005 \001(\t\022\014\n\004Type\030\006 \001(\005\022\021\n\tCycleMode\030\007 " +
      "\001(\005\022\017\n\007DstAddr\030\010 \001(\t\022\017\n\007SrcAddr\030\t \001(\t\022\020\n" +
      "\010SrcAddrS\030\n \003(\t\022\016\n\006Status\030\013 \001(\t\022\022\n\nTaskS" +
      "tatus\030\014 \001(\005B\326\001\n*com.volcengine.service.l" +
      "ive.model.businessB\016PullToPushTaskP\001ZBgi" +
      "thub.com/volcengine/volc-sdk-golang/serv" +
      "ice/live/models/business\240\001\001\330\001\001\302\002\000\312\002!Volc" +
      "\\Service\\Live\\Models\\Business\342\002$Volc\\Ser" +
      "vice\\Live\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          SnapshotManage.getDescriptor(),
        });
    internal_static_Volcengine_Live_Models_Business_CreatePullToPushTaskResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Live_Models_Business_CreatePullToPushTaskResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_CreatePullToPushTaskResult_descriptor,
        new String[] { "TaskId", });
    internal_static_Volcengine_Live_Models_Business_ListPullToPushTaskResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Live_Models_Business_ListPullToPushTaskResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_ListPullToPushTaskResult_descriptor,
        new String[] { "List", "Pagination", });
    internal_static_Volcengine_Live_Models_Business_TaskInfoItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Live_Models_Business_TaskInfoItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_TaskInfoItem_descriptor,
        new String[] { "Title", "TaskId", "StartTime", "EndTime", "CallbackURL", "Type", "CycleMode", "DstAddr", "SrcAddr", "SrcAddrS", "Status", "TaskStatus", });
    SnapshotManage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
