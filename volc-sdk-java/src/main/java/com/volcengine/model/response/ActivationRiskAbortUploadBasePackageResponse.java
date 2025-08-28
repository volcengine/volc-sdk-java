package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskAbortUploadBasePackageResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private AbortUploadBasePackageData result;
    @Data
    public static class AbortUploadBasePackageData {
        @JSONField(name = "Status")
        private Integer status;
    }
}
