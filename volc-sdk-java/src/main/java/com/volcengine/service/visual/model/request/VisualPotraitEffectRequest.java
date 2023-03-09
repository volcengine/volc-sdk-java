package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualPotraitEffectRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "image_url")
    String imageUrl;

    @JSONField(name = "type")
    String type;

    @JSONField(name = "return_type")
    Integer returnType;
}