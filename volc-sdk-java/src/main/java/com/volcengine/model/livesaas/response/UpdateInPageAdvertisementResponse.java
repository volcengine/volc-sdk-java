package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateInPageAdvertisementResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private UpdateInPageAdvertisementResponseBody result;

    @Data
    public static class UpdateInPageAdvertisementResponseBody {
        @JSONField(name = "Status")
        private Boolean Status;
    }
}