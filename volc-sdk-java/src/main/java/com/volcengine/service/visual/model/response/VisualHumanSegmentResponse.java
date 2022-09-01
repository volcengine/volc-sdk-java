package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualHumanSegmentResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    HumanSegmentData data;

    @Data
    public static class HumanSegmentData {
        
        @JSONField(name = "mask")
        String image;

        @JSONField(name = "foreground_image")
        String foreGroundImage;
    }
}