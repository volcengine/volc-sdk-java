package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualH5TokenResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    H5TokenData data;
    @Data
    public static class H5TokenData {
        @JSONField(name = "algorithm_base_resp")
        AlgorithmBaseResp algorithmBaseResp;
        @Data
        public static class AlgorithmBaseResp {
            @JSONField(name = "status_code")
            Integer statusCode;
            @JSONField(name = "status_message")
            String statusMessage;
        }
        @JSONField(name = "byted_token")
        String bytedToken;
    }
}