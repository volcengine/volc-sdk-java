package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ApplyImageUploadResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.response.RiskDetectionResponse;
import lombok.Data;

import java.util.List;

@Data
public class AdBlockerRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "Service")
    String service;
    @JSONField(name = "Parameters")
    String patameters;
}
