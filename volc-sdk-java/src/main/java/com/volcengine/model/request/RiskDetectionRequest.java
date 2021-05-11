package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RiskDetectionRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "Service")
    String service;
    @JSONField(name = "Parameters")
    String patameters;
}
