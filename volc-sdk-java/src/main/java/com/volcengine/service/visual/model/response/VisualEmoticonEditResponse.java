package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualEmoticonEditResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    EmoticonEditData data;

    @Data
    public static class EmoticonEditData {
        
        @JSONField(name = "image")
        String image;
    }
}