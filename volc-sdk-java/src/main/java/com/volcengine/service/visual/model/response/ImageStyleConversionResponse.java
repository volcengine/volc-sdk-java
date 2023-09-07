package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ImageStyleConversionResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    ImageStyleConversionData data;

    @Data
    public static class ImageStyleConversionData {
        @JSONField(name = "image")
        String image;
    }
}
