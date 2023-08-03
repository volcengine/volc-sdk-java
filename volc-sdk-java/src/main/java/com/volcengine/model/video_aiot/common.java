package com.volcengine.model.video_aiot;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

public class common {
    @Data
    public static class EnableTime {
        @JSONField(name = "WeekDay")
        Integer weekDay;
        @JSONField(name = "EnableFrom")
        String enableFrom;
        @JSONField(name = "EnableTo")
        String enableTo;
        @JSONField(name = "Enable")
        boolean enable;
    }

    @Data
    public static class TemplateBucket {
        @JSONField(name = "Endpoint")
        String endpoint;
        @JSONField(name = "Region")
        String region;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "UploadType")
        String uploadType;
        @JSONField(name = "BucketPrefix")
        String bucketPrefix;
    }

    @Data
    public static class TemplateTTLConfig {
        @JSONField(name = "Days")
        int days;
        @JSONField(name = "TransConfig")
        List<TransConfig> transConfig;
    }

    @Data
    public static class TransConfig {
        @JSONField(name = "Days")
        int days;
        @JSONField(name = "StorageClass")
        String storageClass;
    }

    @Data
    public static class Channel {
        @JSONField(name = "ChannelID")
        String ChannelID;
    }
}
