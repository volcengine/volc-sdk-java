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
            String imageFaceDetail;

            @JSONField(name = "image_env_detail")
            String imageEnvDetail;

            @JSONField(name = "alive")
            Boolean alive;
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
        ReqMeasureInfo reqMeasureInfo;
        @Data
        public static class ReqMeasureInfo {
            @JSONField(name = "measure_type")
            String measureType;
            @JSONField(name = "value")
            Integer value;
        }
    }
}