package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteCallbackConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DeleteCallbackConfigResponseBody result;

    @Data
    public static class DeleteCallbackConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
