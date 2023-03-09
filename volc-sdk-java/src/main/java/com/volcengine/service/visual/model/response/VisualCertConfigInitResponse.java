package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualCertConfigInitResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CertConfigInitData data;

    @Data
    public static class CertConfigInitData {
        
        @JSONField(name = "config_id")
        String configId;
    }
}