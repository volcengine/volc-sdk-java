package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualImg2Video3DResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    Img2Video3DData data;

    @Data
    public static class Img2Video3DData {
        
        @JSONField(name = "video")
        String video;
    }
}