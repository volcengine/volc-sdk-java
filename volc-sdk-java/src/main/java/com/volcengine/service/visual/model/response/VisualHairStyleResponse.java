package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualHairStyleResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    HairStyleData data;
    @Data
    public static class HairStyleData {

        @JSONField(name = "image")
        String image;

    }
}