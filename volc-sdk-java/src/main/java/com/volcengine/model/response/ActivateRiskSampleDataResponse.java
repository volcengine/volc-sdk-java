package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivateRiskSampleDataResponse {


    @JSONField(name = "Result")
    BusinessSecurityResponse<ActivateRiskSampleDataResult> result;

    @Data
    public static class ActivateRiskSampleDataResult {
        @JSONField(name = "Status")
        Integer status;
    }


}
