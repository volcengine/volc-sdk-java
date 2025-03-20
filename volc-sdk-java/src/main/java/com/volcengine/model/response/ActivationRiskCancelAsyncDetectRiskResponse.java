package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskCancelAsyncDetectRiskResponse {
    @JSONField
    private ResponseMetadata responseMetadata;
    @JSONField
    private CancelAsyncDetectRiskResult result;
    @Data
    public static class CancelAsyncDetectRiskResult {
        @JSONField(name = "Status")
        private Integer status;
    }
}
