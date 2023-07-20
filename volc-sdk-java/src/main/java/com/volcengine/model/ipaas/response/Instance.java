package com.volcengine.model.ipaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Instance {
    @JSONField(name = "product_id")
    String ProductID;
    @JSONField(name = "instance_id")
    String InstanceID;
    @JSONField(name = "host_id")
    String HostID;
    @JSONField(name = "sn")
    String SN;
    @JSONField(name = "region")
    String Region;
    @JSONField(name = "isp")
    long Isp;
    @JSONField(name = "dc")
    String DC;
    @JSONField(name = "dc_name")
    String DCName;

    @JSONField(name = "status")
    long Status;

    @JSONField(name = "configuration")
    Configuration Configuration;

    @JSONField(name = "security_group")
    SecurityGroup SecurityGroup;
    @JSONField(name = "sg_bound_st")
    long SGBoundSt;
    @JSONField(name = "sg_bound_st_str")
    String SGBoundStStr;

    @JSONField(name = "adb_key")
    AdbKey AdbKey;
    @JSONField(name = "image_id")
    String ImageID;

    @JSONField(name = "tag")
    TagInfo Tag;

    @JSONField(name = "charge_type")
    ChargeType ChargeType;

    @Data
    public static class Configuration {
        @JSONField(name = "configuration_code")
        String ConfigurationCode;
        @JSONField(name = "configuration_name")
        String ConfigurationName;
        @JSONField(name = "cpu_core")
        int CpuCore;
        @JSONField(name = "memory")
        float Memory;
    }
    @Data
    public static class SecurityGroup {
        @JSONField(name = "product_id")
        String ProductID;
        @JSONField(name = "security_group_id")
        long SecurityGroupID;
        @JSONField(name = "security_group_name")
        String SecurityGroupName;
        @JSONField(name = "security_group_desc")
        String SecurityGroupDesc;
        @JSONField(name = "bind_host_num")
        long BindHostNum;
        @JSONField(name = "bind_instance_num")
        long BindInstanceNum;
        @JSONField(name = "create_at")
        long CreateAt;
        @JSONField(name = "update_at")
        long UpdateAt;
        @JSONField(name = "security_rule_list")
        List<SecurityRule> SecurityRuleList;
    }

    @Data
    public static class SecurityRule {
        @JSONField(name = "rule_id")
        long RuleID;
        @JSONField(name = "source_port")
        long SourcePort;
        @JSONField(name = "protocol")
        long Protocol;
        @JSONField(name = "expose")
        long Expose;
    }

    @Data
    public static class AdbKey {
        @JSONField(name = "product_id")
        String ProductID;
        @JSONField(name = "key_id")
        long KeyID;
        @JSONField(name = "key_name")
        String KeyName;
        @JSONField(name = "auth_type")
        int AuthType;
        @JSONField(name = "public_key")
        String PublicKey;
        @JSONField(name = "fingerprint")
        String Fingerprint;
        @JSONField(name = "create_at")
        long CreateAt;
        @JSONField(name = "key_desc")
        String KeyDesc;
        @JSONField(name = "bind_host_num")
        long BindHostNum;
        @JSONField(name = "bind_instance_num")
        long BindInstanceNum;
    }

    @Data
    public static class TagInfo {
        @JSONField(name = "product_id")
        String ProductID;
        @JSONField(name = "tag_id")
        String TagID;
        @JSONField(name = "tag_name")
        String TagName;
        @JSONField(name = "tag_desc")
        String TagDesc;
        @JSONField(name = "related_instance_num")
        long RelatedInstanceNum;
    }

    @Data
    public static class ChargeType {
        @JSONField(name = "id")
        String ID;
        @JSONField(name = "created_at")
        String CreatedAt;
        @JSONField(name = "updated_at")
        String UpdatedAt;
        @JSONField(name = "pay_mode")
        String PayMode;
        @JSONField(name = "charge_name")
        String ChargeName;
        @JSONField(name = "charge_value")
        String ChargeValue;
        @JSONField(name = "description")
        String Description;
        @JSONField(name = "billing_methods")
        IspBillingMethod BillingMethods;
    }

    @Data
    public static class IspBillingMethod {
        @JSONField(name = "id")
        String ID;
        @JSONField(name = "created_at")
        String CreatedAt;
        @JSONField(name = "updated_at")
        String UpdatedAt;
        @JSONField(name = "serial_number")
        int SerialNumber;
        @JSONField(name = "value")
        String Value;
        @JSONField(name = "label")
        String Label;
        @JSONField(name = "brief_description")
        String BriefDescription;
        @JSONField(name = "detailed_description")
        String DetailedDescription;
    }
}
