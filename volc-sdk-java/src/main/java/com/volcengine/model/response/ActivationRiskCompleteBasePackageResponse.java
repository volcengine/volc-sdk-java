package com.volcengine.model.response;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskCompleteBasePackageResponse {
    @JSONField
    private ResponseMetadata responseMetadata;
    @JSONField
    private CompleteBasePackageResult result;
    @Data
    public static class CompleteBasePackageResult {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "ActivateCode")
        private String activateCode;
    }
}
