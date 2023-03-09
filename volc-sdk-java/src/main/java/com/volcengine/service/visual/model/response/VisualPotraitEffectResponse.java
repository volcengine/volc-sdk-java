package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualPotraitEffectResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    ConvertPhotoData data;

    @Data
    public static class ConvertPhotoData {
        
        @JSONField(name = "image")
        String image;

        @JSONField(name = "image_url")
        String imageUrl;
    }
}