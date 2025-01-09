package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SendProductOrderMessageResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SendProductOrderMessageResponseBody result;

    @Data
    public static class SendProductOrderMessageResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}