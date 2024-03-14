package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateSecurityControlConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateSecurityControlConfigResponseBody result;

    @Data
    public static class UpdateSecurityControlConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
