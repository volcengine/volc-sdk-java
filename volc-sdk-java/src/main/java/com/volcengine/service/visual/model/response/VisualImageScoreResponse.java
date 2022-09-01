package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualImageScoreResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    ImageScoreData data;

    @Data
    public static class ImageScoreData {
        
        @JSONField(name = "score")
        Float score;

        @JSONField(name = "sharpness_score")
        Float sharpnessScore;

        @JSONField(name = "quality_score")
        Float qualityScore;

        @JSONField(name = "meaningless_score")
        Float meaninglessScore;

        @JSONField(name = "face_score")
        Float faceScore;
    }
}