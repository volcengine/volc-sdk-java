package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualEyeClose2OpenResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    EyeClose2OpenData data;

    @Data
    public static class EyeClose2OpenData {
        
        @JSONField(name = "image")
        String image;
    }
}