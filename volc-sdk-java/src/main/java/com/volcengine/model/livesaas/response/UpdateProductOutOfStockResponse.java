package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateProductOutOfStockResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    
    @JSONField(name = "Result")
    private UpdateProductOutOfStockResponseBody result;

    @Data
    public static class UpdateProductOutOfStockResponseBody {
        @JSONField(name = "Status")
        private Boolean status;
    }
}