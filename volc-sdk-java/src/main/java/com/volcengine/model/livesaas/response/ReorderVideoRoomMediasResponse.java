package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ReorderVideoRoomMediasResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ReorderVideoRoomMediasResponseBody result;

    @Data
    public static class ReorderVideoRoomMediasResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
