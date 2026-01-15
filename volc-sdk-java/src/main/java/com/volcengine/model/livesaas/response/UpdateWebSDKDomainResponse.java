package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateWebSDKDomainResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateWebSDKDomainResponseBody result;

    @Data
    public static class UpdateWebSDKDomainResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}

