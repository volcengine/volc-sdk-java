package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualImageFlowResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    ImageFlowData data;

    @Data
    public static class ImageFlowData {
        
        @JSONField(name = "video")
        String video;
    }
}