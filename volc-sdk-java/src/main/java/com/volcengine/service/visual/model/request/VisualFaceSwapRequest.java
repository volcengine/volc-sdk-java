package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualFaceSwapRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "template_base64")
    String templateBase64;

    @JSONField(name = "action_id")
    String actionId;
}