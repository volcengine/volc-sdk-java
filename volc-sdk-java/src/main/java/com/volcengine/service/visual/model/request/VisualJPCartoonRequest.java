package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualJPCartoonRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "cartoon_type")
    String cartoonType;

    @JSONField(name = "rotation")
    Integer rotation = 0;
}