package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualStretchRecoveryResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    StretchRecoveryData data;

    @Data
    public static class StretchRecoveryData {
        
        @JSONField(name = "image")
        String image;
    }
}