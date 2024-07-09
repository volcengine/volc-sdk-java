package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivateRiskBasePackageResponse {


    @JSONField(name = "Result")
    BusinessSecurityResponse<ActivateRiskBasePackageResult> result;

    @Data
    public static class ActivateRiskBasePackageResult {
        @JSONField(name = "ActivateCode")
        String activateCode;
        @JSONField(name = "Status")
        Integer status;
    }


}
