package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualSkySegmentResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    SkySegmentData data;

    @Data
    public static class SkySegmentData {
        
        @JSONField(name = "mask")
        String image;
    }
}