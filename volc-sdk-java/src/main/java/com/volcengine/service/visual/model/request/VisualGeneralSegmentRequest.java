package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualGeneralSegmentRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;
    @JSONField(name = "return_foreground_image")
    Integer returnForegroundImage = 0;
}