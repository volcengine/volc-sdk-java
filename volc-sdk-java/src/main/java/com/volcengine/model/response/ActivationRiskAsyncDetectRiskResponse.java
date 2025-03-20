package com.volcengine.model.response;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ActivationRiskAsyncDetectRiskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RiskDetectionResult result;

    @Data
    public static class RiskDetectionResult {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "ResultId")
        private String resultId;
    }


}
