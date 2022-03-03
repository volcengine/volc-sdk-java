package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeRecordPresetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeRecordPresetOutput result;

    @Data
    private static class DescribeRecordPresetOutput {
        @JSONField(name = "PresetList")
        String[] PresetList;
    }
}
