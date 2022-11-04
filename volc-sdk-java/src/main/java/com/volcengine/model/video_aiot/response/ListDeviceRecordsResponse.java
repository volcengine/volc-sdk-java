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

        @JSONField(name = "ScreenResult")
        ScreenResult screenResult;
        @JSONField(name = "RecordResult")
        RecordResult recordResult;
    }

    @Data
    public static class ScreenResult {
    }

    @Data
    public static class RecordResult {
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
}
