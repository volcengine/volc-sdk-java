package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeSnapshotPresetDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeSnapshotPresetDetailOutput result;

    @Data
    private static class DescribeSnapshotPresetDetailOutput {
        @JSONField(name = "PresetDetailList")
        SnapshotPreset[] PresetDetailList;
    }

    @Data
    private static class SnapshotPreset {
        @JSONField(name = "Preset")
        String preset;
        @JSONField(name = "Status")
        Long status;
        @JSONField(name = "Bucket")
        String bucket;
        @JSONField(name = "Interval")
        Long interval;
        @JSONField(name = "AccessKey")
        String accessKey;
        @JSONField(name = "CallbackDetail")
        CallbackDetail callbackDetail;
    }
}
