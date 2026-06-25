package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddVideoRoomMediasResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddVideoRoomMediasResponseBody result;

    @Data
    public static class AddVideoRoomMediasResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
