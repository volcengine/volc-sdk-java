package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualCertTokenProResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CertTokenProData data;

    @Data
    public static class CertTokenProData {
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