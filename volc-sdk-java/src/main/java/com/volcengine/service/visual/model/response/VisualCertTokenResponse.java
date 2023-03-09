package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualCertTokenResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CertTokenData data;

    @Data
    public static class CertTokenData {
        
        @JSONField(name = "byted_token")
        String bytedToken;

        @JSONField(name = "client_config")
        String clientConfig;
    }
}