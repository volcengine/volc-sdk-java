package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.RobotCommentConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityRobotCommentRepositoryResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityRobotCommentRepositoryResponseBody result;

    @Data
    public static class ListActivityRobotCommentRepositoryResponseBody {
        @JSONField(name = "RobotCommentConfigs")
        List<RobotCommentConfig> RobotCommentConfigs;
    }
}
