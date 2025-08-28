package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskAbortUploadSampleDataResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private AbortUploadSampleDataData result;

    @Data
    public static class AbortUploadSampleDataData {
        @JSONField(name = "Status")
        private Integer status;
    }
}
