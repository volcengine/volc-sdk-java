package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityLoginSecretResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GetActivityLoginSecretResponseBody result;

    @Data
    public static class GetActivityLoginSecretResponseBody {
        @JSONField(name = "LoginSecret")
        String LoginSecret;
    }
}