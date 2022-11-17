package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualImageFlowRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "motion_ratio")
    Float motionRatio = 2f;
}