package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class BatchSendActivityRobotCommentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    BatchSendActivityRobotCommentResponseBody result;

    @Data
    public static class BatchSendActivityRobotCommentResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}