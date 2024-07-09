package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivateRiskResultRequest {
    @JSONField(name = "ActivateCode")
    String activateCode;
    @JSONField(name = "PlanId")
    Integer planId;
}
