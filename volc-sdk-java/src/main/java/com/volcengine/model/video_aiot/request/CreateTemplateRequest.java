package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.HashMap;

@Data
public class CreateTemplateRequest {
    @JSONField(name = "TemplateName")
    String templateName;
    @JSONField(name = "Record")
    Record record;
    @JSONField(name = "Screenshot")
    Screenshot screenshot;


    @Data
    public static class Screenshot {
        @JSONField(name = "ScreenshotPeriod")
        int screenshotPeriod;
        @JSONField(name = "Type")
        String[] type;
        @JSONField(name = "TemplateTTLConfig")
        TemplateTTLConfig templateTTLConfig;
    }

    @Data
    public static class Record {
        @JSONField(name = "RecordDuration")
        int recordDuration;
        @JSONField(name = "Format")
        String format;  //mp4/hls
        @JSONField(name = "TemplateTTLConfig")
        TemplateTTLConfig templateTTLConfig;
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
        EnableTime[] enableTimes;
    }

    public static class EnableTime {
        @JSONField(name = "EnableFrom")
        String enableFrom;
        @JSONField(name = "EnableTo")
        String enableTo;
    }


    @Data
    public static class TemplateTTLConfig {
        @JSONField(name = "Days")
        int days;
    }
}
