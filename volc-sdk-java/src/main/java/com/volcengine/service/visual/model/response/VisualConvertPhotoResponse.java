package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualConvertPhotoResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    ConvertPhotoData data;

    @Data
    public static class ConvertPhotoData {
        
        @JSONField(name = "image")
        String image;
    }
}