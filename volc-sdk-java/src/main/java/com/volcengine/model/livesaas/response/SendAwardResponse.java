package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SendAwardResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SendAwardResult result;

    @Data
    public class SendAwardResult {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
