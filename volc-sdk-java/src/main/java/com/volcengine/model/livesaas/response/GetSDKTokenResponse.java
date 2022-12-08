package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetSDKTokenResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetSDKTokenResponseBody result;

    @Data
    public static class GetSDKTokenResponseBody {
        @JSONField(name = "Token")
        String Token;
    }
}