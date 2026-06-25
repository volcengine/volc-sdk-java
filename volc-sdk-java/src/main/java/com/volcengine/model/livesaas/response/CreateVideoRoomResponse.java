package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateVideoRoomResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateVideoRoomResponseBody result;

    @Data
    public static class CreateVideoRoomResponseBody {
        @JSONField(name = "VideoRoomId")
        Long VideoRoomId;
    }
}
