package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivateRiskResultResponse {

    @JSONField(name = "Result")
    BusinessSecurityResponse<ActivateRiskResultResult> result;

    @Data
    public static class ActivateRiskResultResult {
        @JSONField(name = "Success")
        Boolean success;
    }

}
