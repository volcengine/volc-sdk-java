package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateCallbackConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    UpdateCallbackConfigResponseBody result;

    @Data
    public static class UpdateCallbackConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
