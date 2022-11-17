package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualDistortionFreeResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    DistortionFreeData data;

    @Data
    public static class DistortionFreeData {
        
        @JSONField(name = "image")
        String image;
    }
}