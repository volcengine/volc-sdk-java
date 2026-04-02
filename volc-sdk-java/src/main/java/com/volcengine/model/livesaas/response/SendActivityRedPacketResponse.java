package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SendActivityRedPacketResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SendActivityRedPacketResponseBody result;

    @Data
    public static class SendActivityRedPacketResponseBody {
        @JSONField(name = "Status")
        Boolean status;
        @JSONField(name = "ActivityID")
        Long activityID;
        @JSONField(name = "RedPacketID")
        Long redPacketID;
    }
}
