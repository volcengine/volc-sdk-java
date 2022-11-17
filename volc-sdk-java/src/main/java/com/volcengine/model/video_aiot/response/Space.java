package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.HashMap;

/**
 * type Space struct {
 * 	SpaceName     string                 `bson:"SpaceName"`
 * 	Description   string                 `bson:"Description"`
 * 	SpaceID       string                 `bson:"SpaceID"`
 * 	Region        string                 `bson:"Region"`
 * 	AccessType    string                 `bson:"AccessType"` //GB/RTMP
 * 	Status        string                 `bson:"Status"`
 * 	GB            SpaceGB                `bson:"GB"`
 * 	HLSLowLatency bool                   `bson:"HLSLowLatency"`
 * 	CreatedAt     string                 `bson:"CreatedAt"`
 * 	UpdatedAt     string                 `bson:"UpdatedAt"`
 * 	Domains       map[string]SpaceDomain `bson:"Domains"`
 * 	SipServer     *SipServer             `bson:"sip_server"`
 * 	CallbackURL   *string                `bson:"CallbackURL"`
 * 	Template      struct {
 * 		Screenshot SimpleTemplate `bson:"Screenshot"`
 * 		Record     SimpleTemplate `bson:"Record"`
 * 		AI         SimpleTemplate `bson:"AI"`
 *        } `bson:"Template"`
 * }
 */

@Data
public class Space {
    @JSONField(name = "SpaceName")
    String spaceName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "Region")
    String region;
    @JSONField(name = "AccessType")
    String accessType;
    @JSONField(name = "Status")
    String status;
    @JSONField(name = "GB")
    SpaceGB gb;
    @JSONField(name = "HLSLowLatency")
    boolean hLSLowLatency;
    @JSONField(name = "CreatedAt")
    String createAt;
    @JSONField(name = "UpdatedAt")
    String updateAt;
    @JSONField(name = "Domains")
    HashMap<String,SpaceDomain> domains;
    @JSONField(name = "SipServer")
    SipServer sipServer;
    @JSONField(name = "CallbackURL")
    String callbackUrl;
    @JSONField(name = "Template")
    SpaceTmplInfo template;

    @Data
    public static class SpaceGB  {
        @JSONField(name = "Domain")
        String domain;
        @JSONField(name = "PullOnDemand")
        boolean pullOnDemand;
    }

    @Data
    public static class SpaceDomain {
        @JSONField(name = "Domain")
        String domain;
        @JSONField(name = "Type")
        String type;
        @JSONField(name = "Status")
        String status;
        @JSONField(name = "CNAME")
        String cname;
        @JSONField(name = "CNameStatus")
        String cnameStatus;
        @JSONField(name = "Default")
        boolean isDefault;
        @JSONField(name = "Https")
        SpaceDomainHttps https;
        @JSONField(name = "CreateAt")
        String createAt;
        @JSONField(name = "UpdateAt")
        String updateAt;
        @JSONField(name = "TimeFlag")
        boolean timeFlag;
        @JSONField(name = "MainKey")
        String mainKey;
        @JSONField(name = "SpareKey")
        String spareKey;
        @JSONField(name = "ValidDuration")
        int validDuration;
    }

    @Data
    public static class SpaceDomainHttps  {
        @JSONField(name = "Enable")
        boolean enable;
        @JSONField(name = "CertificateID")
        String certificateID;
    }

    @Data
    public static class SipServer  {
        @JSONField(name = "SipId")
        String sipId;
        @JSONField(name = "SipDomain")
        String sipDomain;
        @JSONField(name = "SipIp")
        String sipIP;
        @JSONField(name = "SipPort")
        HashMap<String,Integer> sipPort;
    }

    @Data
    public static class SpaceTmplInfo {
        @JSONField(name = "Screenshot")
        Tmpl screenshot;
        @JSONField(name = "Record")
        Tmpl record;
        @JSONField(name = "AI")
        Tmpl ai;
    }

    @Data
    public static class Tmpl {
        @JSONField(name = "TemplateID")
        String templateID;
        @JSONField(name = "TemplateName")
        String templateName;
        @JSONField(name = "BindTime")
        String bindTime;
    }
}
