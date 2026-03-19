package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteCheckInResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteCheckInResponseBody result;

    @Data
    public static class DeleteCheckInResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
