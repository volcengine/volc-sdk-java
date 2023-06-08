package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualImageAnimationResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    ImageAnimationData data;
    @Data
    public static class ImageAnimationData {
        @JSONField(name = "video")
        String video;
    }
}