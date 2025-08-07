package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteWebSDKDomainResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteWebSDKDomainResponseBody result;

    @Data
    public static class DeleteWebSDKDomainResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}