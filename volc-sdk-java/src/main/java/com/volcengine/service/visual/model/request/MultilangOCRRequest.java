package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MultilangOCRRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "mode")
    String mode = "default";
}