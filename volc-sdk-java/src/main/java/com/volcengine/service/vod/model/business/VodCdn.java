// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public final class VodCdn {
  private VodCdn() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfos_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfos_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodDomainoInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodDomainoInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodDomainCertificateInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodDomainCertificateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodCreateCdnTaskResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodCreateCdnTaskResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodContentInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodContentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodListCdnAccessLogResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodListCdnAccessLogResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032vod/business/vod_cdn.proto\022\036Volcengine" +
      ".Vod.Models.Business\"\315\001\n\023VodDomainConfig" +
      "Info\022\021\n\tSpaceName\030\001 \001(\t\022P\n\020PlayInstanceI" +
      "nfo\030\002 \001(\01326.Volcengine.Vod.Models.Busine" +
      "ss.VodDomainInstanceInfos\022Q\n\021ImageInstan" +
      "ceInfo\030\003 \001(\01326.Volcengine.Vod.Models.Bus" +
      "iness.VodDomainInstanceInfos\"\265\001\n\026VodDoma" +
      "inInstanceInfos\022L\n\rByteInstances\030\001 \003(\01325" +
      ".Volcengine.Vod.Models.Business.VodDomai" +
      "nInstanceInfo\022M\n\016OtherInstances\030\002 \003(\01325." +
      "Volcengine.Vod.Models.Business.VodDomain" +
      "InstanceInfo\"\232\001\n\025VodDomainInstanceInfo\022\022" +
      "\n\nInstanceId\030\001 \001(\t\022?\n\007Domains\030\002 \003(\0132..Vo" +
      "lcengine.Vod.Models.Business.VodDomainoI" +
      "nfo\022\026\n\016CanSelfEditing\030\003 \001(\010\022\024\n\014ConfigSta" +
      "tus\030\004 \001(\t\"\341\001\n\016VodDomainoInfo\022\016\n\006Domain\030\001" +
      " \001(\t\022\r\n\005Cname\030\002 \001(\t\022\024\n\014ConfigStatus\030\003 \001(" +
      "\t\022\023\n\013CnameStatus\030\004 \001(\t\022\016\n\006Status\030\005 \001(\t\022M" +
      "\n\013Certificate\030\006 \001(\01328.Volcengine.Vod.Mod" +
      "els.Business.VodDomainCertificateInfo\022\022\n" +
      "\nCreateTime\030\007 \001(\t\022\022\n\nUpdateTime\030\010 \001(\t\"\217\001" +
      "\n\030VodDomainCertificateInfo\022\025\n\rCertificat" +
      "eId\030\001 \001(\t\022\027\n\017CertificateName\030\002 \001(\t\022\026\n\016Ce" +
      "rtificatePub\030\003 \001(\t\022\026\n\016CertificatePri\030\004 \001" +
      "(\t\022\023\n\013HttpsStatus\030\005 \001(\t\"(\n\026VodCreateCdnT" +
      "askResult\022\016\n\006TaskId\030\001 \001(\t\"s\n\016VodContentI" +
      "nfo\022\016\n\006ItemId\030\001 \001(\t\022\013\n\003Url\030\002 \001(\t\022\016\n\006Stat" +
      "us\030\003 \001(\t\022\020\n\010TaskType\030\004 \001(\t\022\022\n\nCreateTime" +
      "\030\005 \001(\001\022\016\n\006TaskId\030\006 \001(\t\"\217\001\n\020VodCdnTaskRes" +
      "ult\022\022\n\nTotalCount\030\001 \001(\005\022\017\n\007PageNum\030\002 \001(\005" +
      "\022\020\n\010PageSize\030\003 \001(\005\022D\n\014ContentInfos\030\004 \003(\013" +
      "2..Volcengine.Vod.Models.Business.VodCon" +
      "tentInfo\"\177\n\026VodCdnAccessLogElement\022\023\n\013Do" +
      "wnloadUrl\030\001 \001(\t\022\020\n\010FileSize\030\002 \001(\003\022\020\n\010Fil" +
      "eName\030\003 \001(\t\022\026\n\016StartTimestamp\030\004 \001(\005\022\024\n\014E" +
      "ndTimestamp\030\005 \001(\005\"n\n\023VodCdnAccessLogInfo" +
      "\022\016\n\006Domain\030\001 \001(\t\022G\n\007LogList\030\002 \003(\01326.Volc" +
      "engine.Vod.Models.Business.VodCdnAccessL" +
      "ogElement\"^\n\031VodListCdnAccessLogResult\022A" +
      "\n\004Logs\030\001 \003(\01323.Volcengine.Vod.Models.Bus" +
      "iness.VodCdnAccessLogInfoB\312\001\n)com.volcen" +
      "gine.service.vod.model.businessB\006VodCdnP" +
      "\001ZAgithub.com/volcengine/volc-sdk-golang" +
      "/service/vod/models/business\240\001\001\330\001\001\302\002\000\312\002 " +
      "Volc\\Service\\Vod\\Models\\Business\342\002#Volc\\" +
      "Service\\Vod\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_descriptor,
        new java.lang.String[] { "SpaceName", "PlayInstanceInfo", "ImageInstanceInfo", });
    internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfos_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfos_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfos_descriptor,
        new java.lang.String[] { "ByteInstances", "OtherInstances", });
    internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodDomainInstanceInfo_descriptor,
        new java.lang.String[] { "InstanceId", "Domains", "CanSelfEditing", "ConfigStatus", });
    internal_static_Volcengine_Vod_Models_Business_VodDomainoInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Volcengine_Vod_Models_Business_VodDomainoInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodDomainoInfo_descriptor,
        new java.lang.String[] { "Domain", "Cname", "ConfigStatus", "CnameStatus", "Status", "Certificate", "CreateTime", "UpdateTime", });
    internal_static_Volcengine_Vod_Models_Business_VodDomainCertificateInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Volcengine_Vod_Models_Business_VodDomainCertificateInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodDomainCertificateInfo_descriptor,
        new java.lang.String[] { "CertificateId", "CertificateName", "CertificatePub", "CertificatePri", "HttpsStatus", });
    internal_static_Volcengine_Vod_Models_Business_VodCreateCdnTaskResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Volcengine_Vod_Models_Business_VodCreateCdnTaskResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodCreateCdnTaskResult_descriptor,
        new java.lang.String[] { "TaskId", });
    internal_static_Volcengine_Vod_Models_Business_VodContentInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Volcengine_Vod_Models_Business_VodContentInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodContentInfo_descriptor,
        new java.lang.String[] { "ItemId", "Url", "Status", "TaskType", "CreateTime", "TaskId", });
    internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_descriptor,
        new java.lang.String[] { "TotalCount", "PageNum", "PageSize", "ContentInfos", });
    internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_descriptor,
        new java.lang.String[] { "DownloadUrl", "FileSize", "FileName", "StartTimestamp", "EndTimestamp", });
    internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogInfo_descriptor,
        new java.lang.String[] { "Domain", "LogList", });
    internal_static_Volcengine_Vod_Models_Business_VodListCdnAccessLogResult_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Volcengine_Vod_Models_Business_VodListCdnAccessLogResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodListCdnAccessLogResult_descriptor,
        new java.lang.String[] { "Logs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
