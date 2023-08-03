package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.common;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class CreateTemplateRequest {
    @JSONField(name = "TemplateName")
    String templateName;
    @JSONField(name = "Record")
    Record record;
    @JSONField(name = "Screenshot")
    Screenshot screenshot;
    @JSONField(name = "AI")
    AI ai;

    @Data
    public static class Screenshot {
        @JSONField(name = "ScreenshotPeriod")
        int screenshotPeriod;
        @JSONField(name = "Type")
        String[] type;
        @JSONField(name = "TemplateTTLConfig")
        common.TemplateTTLConfig templateTTLConfig;
    }

    @Data
    public static class Record {
        @JSONField(name = "RecordDuration")
        int recordDuration;
        @JSONField(name = "Format")
        String format;  //mp4/hls
        @JSONField(name = "TemplateTTLConfig")
        common.TemplateTTLConfig templateTTLConfig;
        @JSONField(name = "Bucket")
        TemplateBucketConfig templateBucketConfig;
        @JSONField(name = "EnableTimes")
        List<common.EnableTime> enableTimeList;
    }

    @Data
    public static class AI {
        @JSONField(name = "CapabilitySet")
        String[] capabilitySet;
        @JSONField(name = "TemplateItems")
        AITemplateItem aiTemplateItem;
        @JSONField(name = "ImageTTL")
        int imageTTL;
    }

    @Data
    public static class AITemplateItem {
        @JSONField(name = "CapabilityType")
        String capabilityType;
        @JSONField(name = "ConfidenceThreshold")
        float confidenceThreshold;
        @JSONField(name = "FrameInterval")
        int frameInterval;
        @JSONField(name = "Extra")
        HashMap<String, Object> extra;
        @JSONField(name = "Status")
        boolean Status;
        @JSONField(name = "GrabStrategy")
        String grabStrategy;
        @JSONField(name = "EnableTimes")
        common.EnableTime[] enableTimes;
    }

    @Data
    public static class TemplateBucketConfig {
        @JSONField(name = "Endpoint")
        String endpoint;
        @JSONField(name = "Region")
        String region;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "UploadType")
        String uploadType;
    }
}
