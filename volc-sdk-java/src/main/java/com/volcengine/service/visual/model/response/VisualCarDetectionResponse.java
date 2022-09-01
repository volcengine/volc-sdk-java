package com.volcengine.service.visual.model.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualCarDetectionResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CarDetectionData data;

    @Data
    public static class CarDetectionData {
        
        @JSONField(name = "car_box")
        List<CarBoxItem> carBox;
    }

    @Data
    public static class CarBoxItem {

        @JSONField(name = "min_x")
        Integer minX;

        @JSONField(name = "min_y")
        Integer minY;

        @JSONField(name = "max_x")
        Integer maxX;

        @JSONField(name = "max_y")
        Integer maxY;

        @JSONField(name = "score")
        Float score;
    }
}