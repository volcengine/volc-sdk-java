package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityEmbeddedUrlAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityEmbeddedUrlAPIResponseBody result;

    @Data
    public static class UpdateActivityEmbeddedUrlAPIResponseBody {
        @JSONField(name = "Success")
        Boolean success;
    }
}