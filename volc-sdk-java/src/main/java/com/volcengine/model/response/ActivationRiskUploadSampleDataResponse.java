package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskUploadSampleDataResponse {

    @JSONField
    private ResponseMetadata responseMetadata;
    @JSONField
    private UploadSampleDataResult result;
    @Data
    public static class UploadSampleDataResult {
        @JSONField(name = "Status")
        private Integer status;
    }
}
