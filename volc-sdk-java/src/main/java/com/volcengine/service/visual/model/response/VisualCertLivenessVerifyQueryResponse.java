package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualCertLivenessVerifyQueryResponse extends VisualBaseResponse {

    @JSONField(name = "data")
   VisualCertLivenessVerifyQueryData data;

    @Data
    public static class VisualCertLivenessVerifyQueryData {

        @JSONField(name = "is_attack")
        Boolean isAttack;

        @JSONField(name = "has_finish_motion_liveness")
        Boolean hasFinishMotionLiveness;

        @JSONField(name = "risk_result")
        String riskResult;

        @JSONField(name = "images")
        Images images;
        @Data
        public static class Images {
            @JSONField(name = "image_best")
            String imageBest;
            @JSONField(name = "image_env")
            String imageEnv;
        }
        @JSONField(name = "video")
        String video;
        @JSONField(name = "images_quality_info")
        ImagesQualityInfo imagesQualityInfo;
        @Data
        public static class ImagesQualityInfo {
            @JSONField(name = "image_best")
            String imageBest;
            @JSONField(name = "image_env")
            String imageEnv;
        }
        @JSONField(name = "tos_data")
        TosData tosData;
        @Data
        public static class TosData {
            @JSONField(name = "bucket")
            String bucket;
            @JSONField(name = "image_env_key")
            String imageEnvKey;
            @JSONField(name = "image_best_key")
            String imageBestKey;
            @JSONField(name = "video_key")
            String videoKey;
            @JSONField(name = "cert_data_key")
            String certDataKey;
        }

        @JSONField(name = "verify_algorithm_base_resp")
        VerifyAlgorithmBaseResp verifyAlgorithmBaseResp;
        @Data
        public static class VerifyAlgorithmBaseResp {
            @JSONField(name = "status_code")
            Integer statusCode;
            @JSONField(name = "status_message")
            String statusMessage;
        }
        @JSONField(name = "verify_req_measure_info")
        VerifyReqMeasureInfo verifyReqMeasureInfo;
        @Data
        public static class VerifyReqMeasureInfo {
            @JSONField(name = "measure_type")
            String measureType;
            @JSONField(name = "value")
            Integer value;
        }
    }




}