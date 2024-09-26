package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

public class CancelActivateRiskResultResponse {
    @JSONField(name = "Result")
    BusinessSecurityResponse<CancelActivateRiskResultResponse.CancelActivateRiskResultResult> result;

    @Data
    public static class CancelActivateRiskResultResult {
        @JSONField(name = "Success")
        Boolean success;
    }

}
