package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualCertVerifyQueryResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CertVerifyQueryData data;

    @Data
    public static class CertVerifyQueryData {
        
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
        @JSONField(name = "video")
        String video;

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