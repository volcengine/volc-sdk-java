package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualCertConfigGetResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CertConfigGetData data;

    @Data
    public static class CertConfigGetData {
        @JSONField(name = "algorithm_base_resp")
        AlgorithmBaseResp algorithmBaseResp;
        @Data
        public static class AlgorithmBaseResp {
            @JSONField(name = "status_code")
            Integer statusCode;
            @JSONField(name = "status_message")
            String statusMessage;
        }
        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
        @JSONField(name = "client_config")
        String clientConfig;
        @JSONField(name = "req_measure_info")
        ReqMeasureInfo reqMeasureInfo;
        @Data
        public static class ReqMeasureInfo {
            @JSONField(name = "measure_type")
            String measureType;
            @JSONField(name = "value")
            Integer value;
        }
        @JSONField(name = "token_api_config")
        TokenApiConfig tokenApiConfig;

        @Data
        public static class TokenApiConfig {
            @JSONField(name = "ref_source")
            String refSource;
            @JSONField(name = "liveness_type")
            String livenessType;
            @JSONField(name = "motion_list")
            ArrayList<String> motionList = new ArrayList<>();
            @JSONField(name = "fixed_motion_list")
            ArrayList<String> fixedMotionList = new ArrayList<>();
            @JSONField(name = "motion_count")
            Integer motionCount = 10;
            @JSONField(name = "max_liveness_trial")
            Integer maxLivenessTrial = 10;
            @JSONField(name = "tos_info")
            TosInfo tosInfo;
            @Data
            public static class TosInfo {
                @JSONField(name = "bucket")
                String bucket;
                @JSONField(name = "endpoint")
                String endpoint;
                @JSONField(name = "region")
                String region;
            }
            @JSONField(name = "callback_info")
            CallBackInfo callBackInfo;
            @Data
            public static class CallBackInfo {
                @JSONField(name = "switch")
                Boolean isCallBack;
                @JSONField(name = "block")
                Boolean block;
                @JSONField(name = "url")
                String url;
                @JSONField(name = "client_name")
                String clientName;
            }
        }

        @JSONField(name = "h5_config")
        H5Config h5Config;
        @Data
        public static class H5Config {
            @JSONField(name = "redirectUrl")
            String redirectUrl;
            @JSONField(name = "source")
            Integer source;
            @JSONField(name = "bucket")
            String bucket;
            @JSONField(name = "endpoint")
            String endpoint;
            @JSONField(name = "region")
            String region;
            @JSONField(name = "type")
            Integer type;
            @JSONField(name = "showResult")
            Integer showResult;
            @JSONField(name = "protocolName")
            String protocolName;
            @JSONField(name = "protocolLink")
            String protocolLink;
            @JSONField(name = "demoteType")
            Integer demoteType;
            @JSONField(name = "styleConf")
            String styleConf;
            @JSONField(name = "protocolNav")
            Integer protocolNav;
            @JSONField(name = "protocolNavTitle")
            String protocolNavTitle;
        }
    }
}