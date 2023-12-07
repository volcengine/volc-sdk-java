package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListStreamRecordsResponseV3 {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<DeviceRecords> deviceRecords;

    @Data
    public static class DeviceRecords {
        @JSONField(name = "Type")
        String type;
        @JSONField(name = "Path")
        String path;

        @JSONField(name = "Screenshot")
        Screenshot screenResult;
        @JSONField(name = "Record")
        Record recordResult;
        @JSONField(name = "RecordMeta")
        RecordMeta recordMeta;
    }

    @Data
    public static class Screenshot {
        @JSONField(name = "BornTs")
        long bornTs;
    }

    @Data
    public static class Record {
        @JSONField(name = "StartTime")
        long startTime;
        @JSONField(name = "EndTime")
        long endTs;
        @JSONField(name = "Duration")
        float duration;
        @JSONField(name = "Cover")
        String cover;
        @JSONField(name = "Format")
        String format;
        @JSONField(name = "VideoCodec")
        int videoCodec;
        @JSONField(name = "AudioCodec")
        int audioCodec;
    }

    @Data
    public static class RecordMeta {
        @JSONField(name = "StartTime")
        long startTime;
        @JSONField(name = "EndTime")
        long endTime;
        @JSONField(name = "Duration")
        float duration;
        @JSONField(name = "Format")
        String format;
        @JSONField(name = "Bucket")
        String bucket;
        @JSONField(name = "StorageType")
        String storageType;
        @JSONField(name = "VideoCodec")
        int videoCodec;
        @JSONField(name = "AudioCodec")
        int audioCodec;
    }
}
