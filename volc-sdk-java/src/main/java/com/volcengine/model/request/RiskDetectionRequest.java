package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RiskDetectionRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "Service")
    String service;
    @JSONField(name = "EncryptedType")
    String EncryptedType;
    @JSONField(name = "Parameters")
    String parameters;
}