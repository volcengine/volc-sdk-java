package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualPoemMaterialResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    PoemMaterialData data;

    @Data
    public static class PoemMaterialData {
        
        @JSONField(name = "poems")
        String[] poems;
    }
}