// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_trade.proto

package com.volcengine.service.vod.model.business;

public final class VodTrade {
  private VodTrade() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_TradeConfigurationInfoResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_TradeConfigurationInfoResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_TradeProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_TradeProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_ChargeItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_ChargeItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'volcengine/vod/business/vod_trade.prot" +
      "o\022\036Volcengine.Vod.Models.Business\"\233\001\n\034Tr" +
      "adeConfigurationInfoResult\022;\n\005Basic\030\001 \003(" +
      "\0132,.Volcengine.Vod.Models.Business.Trade" +
      "Product\022>\n\010Addition\030\002 \003(\0132,.Volcengine.V" +
      "od.Models.Business.TradeProduct\"\276\002\n\014Trad" +
      "eProduct\022\025\n\rConfiguration\030\001 \001(\t\022\031\n\021Confi" +
      "gurationName\030\002 \001(\t\022\017\n\007Product\030\003 \001(\t\022\030\n\020S" +
      "ettlementPeriod\030\004 \001(\005\022\021\n\tCanPrePay\030\005 \001(\005" +
      "\022?\n\013ChargeItems\030\006 \003(\0132*.Volcengine.Vod.M" +
      "odels.Business.ChargeItem\022\022\n\nInstanceID\030" +
      "\007 \001(\t\022\026\n\016InstanceStatus\030\010 \001(\005\022\032\n\022Instanc" +
      "eCreateTime\030\t \001(\t\022\036\n\026NextEventEffectiveT" +
      "ime\030\n \001(\t\022\025\n\rNextEventType\030\013 \001(\t\"3\n\nChar" +
      "geItem\022\026\n\016ChargeItemCode\030\001 \001(\t\022\r\n\005Price\030" +
      "\002 \001(\001B\314\001\n)com.volcengine.service.vod.mod" +
      "el.businessB\010VodTradeP\001ZAgithub.com/volc" +
      "engine/volc-sdk-golang/service/vod/model" +
      "s/business\240\001\001\330\001\001\302\002\000\312\002 Volc\\Service\\Vod\\M" +
      "odels\\Business\342\002#Volc\\Service\\Vod\\Models" +
      "\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Vod_Models_Business_TradeConfigurationInfoResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Vod_Models_Business_TradeConfigurationInfoResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_TradeConfigurationInfoResult_descriptor,
        new java.lang.String[] { "Basic", "Addition", });
    internal_static_Volcengine_Vod_Models_Business_TradeProduct_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Vod_Models_Business_TradeProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_TradeProduct_descriptor,
        new java.lang.String[] { "Configuration", "ConfigurationName", "Product", "SettlementPeriod", "CanPrePay", "ChargeItems", "InstanceID", "InstanceStatus", "InstanceCreateTime", "NextEventEffectiveTime", "NextEventType", });
    internal_static_Volcengine_Vod_Models_Business_ChargeItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Vod_Models_Business_ChargeItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_ChargeItem_descriptor,
        new java.lang.String[] { "ChargeItemCode", "Price", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
