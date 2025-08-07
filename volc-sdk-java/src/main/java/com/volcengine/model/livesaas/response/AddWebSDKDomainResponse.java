package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddWebSDKDomainResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddWebSDKDomainResult result;

    @Data
    public static class AddWebSDKDomainResult {
        @JSONField(name = "Status")
        Boolean Status;
    }
}