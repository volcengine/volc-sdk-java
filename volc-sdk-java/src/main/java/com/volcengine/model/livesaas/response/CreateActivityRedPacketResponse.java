package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

@Data
public class CreateActivityRedPacketResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateActivityRedPacketResponseBody result;

    @Data
    public static class CreateActivityRedPacketResponseBody {
        @JSONField(name = "ID")
        Long ID;
    }
}
