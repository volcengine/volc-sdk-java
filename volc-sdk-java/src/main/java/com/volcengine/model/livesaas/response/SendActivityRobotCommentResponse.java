package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SendActivityRobotCommentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SendActivityRobotCommentResponseBody result;

    @Data
    public static class SendActivityRobotCommentResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}