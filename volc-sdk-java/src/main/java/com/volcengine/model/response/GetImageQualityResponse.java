package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageQualityResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageQualityResponseBean result;

    @Data
    static public class GetImageQualityResponseBean {
        @JSONField(name = "VqType")
        private String vqType;

        @JSONField(name = "NrScores")
        private NrScores nrScores;
    }

    @Data
    static public class NrScores {
        @JSONField(name = "vqscore")
        private Double vqscore;

        @JSONField(name = "noise")
        private Double noise;

        @JSONField(name = "advcolor")
        private Double advcolor;

        @JSONField(name = "contrast")
        private Double contrast;

        @JSONField(name = "brightness")
        private Double brightness;

        @JSONField(name = "colorfulness")
        private Double colorfulness;

        @JSONField(name = "texture")
        private Double texture;

        @JSONField(name = "overexposure")
        private Double overexposure;

        @JSONField(name = "saturation")
        private Double saturation;

        @JSONField(name = "hue")
        private Double hue;

        @JSONField(name = "aesthetic")
        private Double aesthetic;

        @JSONField(name = "blockiness")
        private Double blockiness;
    }
}
