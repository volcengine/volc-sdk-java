package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.common;
import lombok.Data;

import java.util.List;

@Data
public class Template {
    @JSONField(name = "TemplateID")
    String templateID;
    @JSONField(name = "TemplateName")
    String templateName;
    @JSONField(name = "TemplateType")
    String templateType;
    @JSONField(name = "Screenshot")
    ScreenshotTemplate screenshotTemplate;
    @JSONField(name = "Record")
    RecordTemplate recordTemplate;
    @Data
    public static class ScreenshotTemplate {
        @JSONField(name = "ScreenshotPeriod")
        int screenshotPeriod;
        @JSONField(name = "Type")
        List<String> type;
    }

    /**
     * RecordDuration int                       `json:"RecordDuration"` // ms
     * 	SliceDuration  int                       `json:"SliceDuration"`
     * 	TTL            TemplateTTLConfig         `json:"TTL"`
     * 	Type           string                    `json:"Type"`
     * 	Format         string                    `json:"Format"`
     * 	Path           string                    `json:"-"`
     * 	Bucket         *TemplateBucketConfigView `json:"Bucket"`
     * 	EnableTimes    *EnableTimes              `json:"EnableTimes"`
     */
    @Data
    public static class RecordTemplate {
        @JSONField(name = "RecordDuration")
        int recordDuration;
        @JSONField(name = "SliceDuration")
        int sliceDuration;
        @JSONField(name = "Type")
        String type;
        @JSONField(name = "Format")
        String format;
        @JSONField(name = "EnableTimes")
        List<common.EnableTime> enableTimes;
        @JSONField(name = "Bucket")
        common.TemplateBucket templateBucket;
        @JSONField(name = "TTL")
        common.TemplateTTLConfig templateTTLConfig;
    }
}
