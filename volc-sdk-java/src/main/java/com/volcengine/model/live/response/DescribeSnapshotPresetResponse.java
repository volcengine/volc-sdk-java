package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeSnapshotPresetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeSnapshotPresetOutput result;

    @Data
    private static class DescribeSnapshotPresetOutput {
        @JSONField(name = "PresetList")
        String[] PresetList;
    }
}
