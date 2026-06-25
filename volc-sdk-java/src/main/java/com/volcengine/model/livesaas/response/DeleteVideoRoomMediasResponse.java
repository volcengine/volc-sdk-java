package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteVideoRoomMediasResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteVideoRoomMediasResponseBody result;

    @Data
    public static class DeleteVideoRoomMediasResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
