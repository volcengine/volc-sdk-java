package com.volcengine.service.visual.model.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualCarPlateDetectionResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CarPlateDetectionData data;

    @Data
    public static class CarPlateDetectionData {
        
        @JSONField(name = "car_plate_box")
        List<CarPlateBoxItem> carPlateBox;
    }

    @Data
    public static class CarPlateBoxItem {

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