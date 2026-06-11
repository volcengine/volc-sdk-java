package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class EndVideoTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    EndVideoTaskResponseBody result;

    @Data
    public static class EndVideoTaskResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
