package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetTemporaryLoginTokenResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetTemporaryLoginTokenResponseBody result;

    @Data
    public static class GetTemporaryLoginTokenResponseBody {
        @JSONField(name = "SecretKey")
        String SecretKey;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name="TmpSecretKey")
        String TmpSecretKey;
        @JSONField(name="ExpireTime")
        Long ExpireTime;
    }
}