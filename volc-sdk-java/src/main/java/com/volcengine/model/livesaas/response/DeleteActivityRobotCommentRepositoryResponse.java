package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteActivityRobotCommentRepositoryResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteActivityRobotCommentRepositoryResponseBody result;

    @Data
    public static class DeleteActivityRobotCommentRepositoryResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
