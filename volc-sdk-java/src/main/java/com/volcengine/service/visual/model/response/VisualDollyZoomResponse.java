package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualDollyZoomResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    DollyZoomData data;

    @Data
    public static class DollyZoomData {
        
        @JSONField(name = "video")
        String video;

    }
}