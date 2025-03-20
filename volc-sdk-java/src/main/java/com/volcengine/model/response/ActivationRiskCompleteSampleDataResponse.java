package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskCompleteSampleDataResponse {
    @JSONField
    private ResponseMetadata responseMetadata;
    @JSONField
    private CompleteSampleDataResult result;
    @Data
    public static class CompleteSampleDataResult {
        @JSONField(name = "Status")
        private Integer status;
    }
}
