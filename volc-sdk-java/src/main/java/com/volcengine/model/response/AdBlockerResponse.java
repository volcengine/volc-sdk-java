package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class AdBlockerResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RiskDetectionResult result;

    @Data
    public static class RiskDetectionResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private DecisionData data;

    }

    @Data
    public static class DecisionData {
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Tags")
        private List<Integer> tags;
        @JSONField(name = "Detail")
        private String detail;
    }
}
