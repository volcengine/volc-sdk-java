package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualGeneralSegmentResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    GeneralSegmentData data;

    @Data
    public static class GeneralSegmentData {
        
        @JSONField(name = "mask")
        String image;

        @JSONField(name = "foreground_image")
        String foregroundImage;
    }
}