package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualCarSegmentResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CarSegmentData data;

    @Data
    public static class CarSegmentData {
        
        @JSONField(name = "mask")
        String image;
    }
}