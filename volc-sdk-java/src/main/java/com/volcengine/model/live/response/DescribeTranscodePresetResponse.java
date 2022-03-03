package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeTranscodePresetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DescribeTranscodePresetOutput Result;

    @Data
    private static class DescribeTranscodePresetOutput {
        @JSONField(name = "PresetList")
        String[] PresetList;
    }
}
