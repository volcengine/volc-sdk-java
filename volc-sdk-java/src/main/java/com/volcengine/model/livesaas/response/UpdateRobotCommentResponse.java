package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateRobotCommentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateRobotCommentResponseBody result;

    @Data
    public static class UpdateRobotCommentResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
