package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteSubAccountResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteSubAccountResponseBody result;

    @Data
    public static class DeleteSubAccountResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}