package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

@Data
public class UpdateActivityRedPacketResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    UpdateActivityRedPacketResponseBody result;

    @Data
    public static class UpdateActivityRedPacketResponseBody {
        @JSONField(name = "ID")
        Long ID;
    }
}
