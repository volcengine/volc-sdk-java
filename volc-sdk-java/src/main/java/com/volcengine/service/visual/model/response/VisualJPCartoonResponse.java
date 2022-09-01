package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualJPCartoonResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    JPCartoonData data;

    @Data
    public static class JPCartoonData {
        
        @JSONField(name = "image")
        String image;

        @JSONField(name = "clip")
        String clip;
    }
}