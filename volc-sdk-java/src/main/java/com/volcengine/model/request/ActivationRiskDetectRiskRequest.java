package com.volcengine.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskDetectRiskRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "PlanId")
    Integer planId;
    @JSONField(name = "Service")
    String service;
    @JSONField(name = "Data")
    String[] data;
}
