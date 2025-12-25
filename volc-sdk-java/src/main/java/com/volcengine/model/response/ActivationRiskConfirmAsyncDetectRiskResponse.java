package com.volcengine.model.response;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskConfirmAsyncDetectRiskResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ActivationRiskConfirmAsyncDetectRiskResponse.ConfirmAsyncDetectRiskResult result;

    @Data
    public static class ConfirmAsyncDetectRiskResult {
        @JSONField(name = "Status")
        private Integer status;
    }

}
