package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskUploadBasePackageResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UploadBasePackageResult result;

    @Data
    public static class UploadBasePackageResult {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "ActivateCode")
        private String activateCode;
    }
}
