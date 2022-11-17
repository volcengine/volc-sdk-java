package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualEnhancePhotoResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    EnhancePhotoData data;

    @Data
    public static class EnhancePhotoData {
        
        @JSONField(name = "image")
        String image;
    }
}