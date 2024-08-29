package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
import com.volcengine.model.beans.livesaas.RobotCommentConfig;

@Data
public class GetActivityRobotCommentConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityRobotCommentConfigResponse.GetActivityRobotCommentConfigResponseBody result;

    @Data
    public static class GetActivityRobotCommentConfigResponseBody {
        @JSONField(name = "RobotCommentConfig")
        RobotCommentConfig RobotCommentConfig;
    }
}
