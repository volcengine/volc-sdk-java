package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualT2ILDMRequest {

    @JSONField(name = "req_key")
    String reqKey;
    @JSONField(name = "text")
    String text;
    @JSONField(name = "style_term")
    String styleTerm;
}