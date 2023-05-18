package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualImageCutResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    ImageCutData data;
    @Data
    public static class ImageCutData {
        @JSONField(name = "boundingbox")
        BoundingBox boundingBox;
        @Data
        public static class BoundingBox {
            @JSONField(name = "x_min")
            float xMin;
            @JSONField(name = "x_max")
            float xMax;
            @JSONField(name = "y_min")
            float yMin;
            @JSONField(name = "y_max")
            float yMax;
        }

        @JSONField(name = "image")
        ImageInfo image;
        @Data
        public static class ImageInfo {
            @JSONField(name = "url")
            String url;
            @JSONField(name = "data")
            String data;
        }

    }
}