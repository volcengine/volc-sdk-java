package com.volcengine.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskAsyncDetectRiskRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "PlanId")
    Integer planId;
    @JSONField(name = "Service")
    String service;
    @JSONField(name = "ActivateCode")
    String activateCode;
    @JSONField(name = "Date")
    String date;
}
