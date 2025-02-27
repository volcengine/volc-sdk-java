package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddActivityRobotCommentRepositoryResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddActivityRobotCommentRepositoryResponseBody result;

    @Data
    public static class AddActivityRobotCommentRepositoryResponseBody {
        @JSONField(name = "RobotCommentRepositoryId")
        Long RobotCommentRepositoryId;
    }
}
