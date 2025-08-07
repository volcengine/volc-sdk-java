package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddCallbackConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    AddCallbackConfigResponseBody result;

    @Data
    public static class AddCallbackConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}