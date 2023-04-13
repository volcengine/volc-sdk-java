package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualVideoOverResolutionSubmitTaskV2Request {
    @JSONField(name = "req_key")
    String reqKey;
    @JSONField(name = "vid")
    String vid;
    @JSONField(name = "url")
    String url;
}