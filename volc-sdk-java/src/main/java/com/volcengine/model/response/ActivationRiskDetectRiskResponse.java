package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ActivationRiskDetectRiskResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ActivationRiskAsyncDetectRiskResponse.RiskDetectionResult result;

    @Data
    public static class RiskDetectionResult {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Detail")
        private List<Detail> detail;
    }

    @Data
    public static class Detail {
        @JSONField(name = "Id")
        private String id;
        @JSONField(name = "RiskLevel")
        private Integer riskLevel;
    }
}
