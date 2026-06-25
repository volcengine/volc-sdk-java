package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteVideoRoomResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteVideoRoomResponseBody result;

    @Data
    public static class DeleteVideoRoomResponseBody {
        @JSONField(name = "Success")
        Boolean Success;
    }
}
