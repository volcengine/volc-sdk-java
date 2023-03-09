package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualCertConfigGetRequest {

    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "config_id")
    String configId;
}