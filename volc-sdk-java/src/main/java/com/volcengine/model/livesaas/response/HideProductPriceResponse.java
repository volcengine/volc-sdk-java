package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class HideProductPriceResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    
    @JSONField(name = "Result")
    private HideProductPriceResult result;

    @Data
    public static class HideProductPriceResult {
        @JSONField(name = "Status")
        private Boolean status;
    }
}