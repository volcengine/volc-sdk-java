package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualFaceSwapResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    FaceSwapData data;

    @Data
    public static class FaceSwapData {
        
        @JSONField(name = "image")
        String image;
    }
}