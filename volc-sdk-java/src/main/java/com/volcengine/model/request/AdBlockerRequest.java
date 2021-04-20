package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ApplyImageUploadResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.response.RiskDetectionResponse;
import lombok.Data;

import java.util.List;

@Data
public class AdBlockerRequest {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RiskResultRequest result;

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
        private Integer decision;
        @JSONField(name = "Tags")
        private List<Integer> tags;
        @JSONField(name = "Detail")
        private String detail;
    }
}
