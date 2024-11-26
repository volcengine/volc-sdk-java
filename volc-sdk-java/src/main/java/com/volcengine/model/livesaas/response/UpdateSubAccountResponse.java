package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateSubAccountResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateSubAccountResponseBody result;

    @Data
    public static class UpdateSubAccountResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}