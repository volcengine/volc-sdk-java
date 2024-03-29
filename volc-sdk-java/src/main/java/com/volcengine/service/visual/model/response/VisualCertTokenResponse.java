package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualCertTokenResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CertTokenData data;

    @Data
    public static class CertTokenData {
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
        
        @JSONField(name = "byted_token")
        String bytedToken;

        @JSONField(name = "client_config")
        String clientConfig;
    }
}