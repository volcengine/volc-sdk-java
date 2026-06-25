package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateVideoRoomBasicInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateVideoRoomBasicInfoResponseBody result;

    @Data
    public static class UpdateVideoRoomBasicInfoResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
