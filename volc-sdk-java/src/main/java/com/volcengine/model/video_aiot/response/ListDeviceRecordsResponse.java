package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListDeviceRecordsResponse {
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
    }

    @Data
    public static class Screenshot {
    }

    @Data
    public static class Record {
        @JSONField(name = "StartTs")
        String startTs;
        @JSONField(name = "EndTs")
        String endTs;
        @JSONField(name = "Duration")
        float duration;
        @JSONField(name = "Cover")
        String cover;
        @JSONField(name = "Format")
        String format;
    }
    @Data
    public static class RecordMeta {
        @JSONField(name = "StartTs")
        String startTs;
        @JSONField(name = "EndTs")
        String endTs;
        @JSONField(name = "Duration")
        float duration;
        @JSONField(name = "Cover")
        String cover;
        @JSONField(name = "Format")
        String format;
        @JSONField(name = "Bucket")
        String bucket;
    }
}
