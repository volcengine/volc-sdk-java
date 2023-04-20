package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualCertVerifyProResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CertVerifyProData data;

    @Data
    public static class CertVerifyProData {
        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;

        @JSONField(name = "result")
        Boolean result;

        @JSONField(name = "images")
        Images images;
        @Data
        public static class Images {
            @JSONField(name = "image_best")
            String imageBest;
            @JSONField(name = "image_env")
            String imageEnv;
        }

        @JSONField(name = "source_comp_details")
        SourceCompDetails sourceCompDetails;
        @Data
        public static class SourceCompDetails {
            @JSONField(name = "score")
            Float score;

            @JSONField(name = "thresholds")
            Thresholds thresholds;
            @Data
            public static class Thresholds {
                @JSONField(name = "1e-3")
                Float e3;
                @JSONField(name = "1e-4")
                Float e4;
                @JSONField(name = "1e-5")
                Float e5;
                @JSONField(name = "1e-6")
                Float e6;
            }

            @JSONField(name = "image_face_detail")
            ImageFaceDetail imageFaceDetail;
            @Data
            public static class ImageFaceDetail {
                @JSONField(name = "comprehensive_score")
                Float comprehensiveScore;
                @JSONField(name = "face_clarity")
                Float faceClarity;
                @JSONField(name = "brightness")
                Float brightness;
                @JSONField(name = "exposure")
                Float exposure;
                @JSONField(name = "pose_pitch")
                Float posePitch;
                @JSONField(name = "pose_yaw")
                Float poseYaw;
                @JSONField(name = "pose_roll")
                Float poseRoll;
                @JSONField(name = "mouth_occlude")
                Float mouthOcclude;
                @JSONField(name = "left_eye_occlude")
                Float leftEyeOcclude;
                @JSONField(name = "right_eye_occlude")
                Float rightEyeOcclude;
                @JSONField(name = "have_cap")
                Float haveCap;
            }

            @JSONField(name = "image_env_detail")
            ImageEnvDetail imageEnvDetail;
            @Data
            public static class ImageEnvDetail {
                @JSONField(name = "comprehensive_score")
                Float comprehensiveScore;
                @JSONField(name = "face_clarity")
                Float faceClarity;
                @JSONField(name = "brightness")
                Float brightness;
                @JSONField(name = "exposure")
                Float exposure;
                @JSONField(name = "pose_pitch")
                Float posePitch;
                @JSONField(name = "pose_yaw")
                Float poseYaw;
                @JSONField(name = "pose_roll")
                Float poseRoll;
                @JSONField(name = "mouth_occlude")
                Float mouthOcclude;
                @JSONField(name = "left_eye_occlude")
                Float leftEyeOcclude;
                @JSONField(name = "right_eye_occlude")
                Float rightEyeOcclude;
                @JSONField(name = "have_cap")
                Float haveCap;
            }

            @JSONField(name = "alive")
            Boolean alive;

            @JSONField(name = "risk_result")
            CertVerifyProData.RiskResult riskResult;
            @Data
            public static class RiskResult {
                @JSONField(name = "score")
                String score;
                @JSONField(name = "tags")
                ArrayList<String> tags;
            }
        }

        @JSONField(name = "risk_result")
        RiskResult riskResult;
        @Data
        public static class RiskResult {
            @JSONField(name = "score")
            String score;
            @JSONField(name = "tags")
            ArrayList<String> tags;
        }

        @JSONField(name = "algorithm_base_resp")
        AlgorithmBaseResp algorithmBaseResp;
        @Data
        public static class AlgorithmBaseResp {
            @JSONField(name = "status_code")
            Integer statusCode;
            @JSONField(name = "status_message")
            String statusMessage;
        }

        @JSONField(name = "req_measure_info")
        Boolean reqMeasureInfo;
    }
}