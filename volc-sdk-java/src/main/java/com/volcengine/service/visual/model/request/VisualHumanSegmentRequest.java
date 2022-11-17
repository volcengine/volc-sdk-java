package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualHumanSegmentRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "refine")
    Integer refine = 0;

    @JSONField(name = "return_foreground_image")
    Integer returnForegroundImage = 0;
}