package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

@Data
public class DeleteActivityRedPacketResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DeleteActivityRedPacketResponseBody result;

    @Data
    public static class DeleteActivityRedPacketResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
