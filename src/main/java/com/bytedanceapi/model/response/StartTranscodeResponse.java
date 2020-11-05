package com.bytedanceapi.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StartTranscodeResponse {

    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private TranscodeResult result;

    @Data
    public static class TranscodeResult {
        @JSONField(name = "RunId")
        private String runId;
    }
}
