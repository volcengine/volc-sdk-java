package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class RecordPlanResponse {
    //
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    RecordPlan recordPlan;

    @Data
    public static class RecordPlan {
        @JSONField(name = "PlanID")
        String planID;
        @JSONField(name = "PlanName")
        String planName;
        @JSONField(name = "BindTemplate")
        String bindTemplate;
        @JSONField(name = "TemplateInfo")
        TemplateInfo templateInfo;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "Status")
        String status;
        @JSONField(name = "CreatedAt")
        int createAt;
        @JSONField(name = "UpdatedAt")
        int updatedAt;
        @JSONField(name = "BindStreamNum")
        int bindStreamNum;
    }

    @Data
    public static class TemplateInfo {
        @JSONField(name = "Format")
        String format;
        @JSONField(name = "TTL")
        TTL ttl;
    }

    @Data
    public static class TTL {
        @JSONField(name = "Days")
        int days;
        @JSONField(name = "TransConfig")
        List<TransConfig> transConfig;
    }

    @Data
    public static class TransConfig {
        @JSONField(name = "StorageClass")
        String storageClass;
        @JSONField(name = "Days")
        int days;
    }
}
