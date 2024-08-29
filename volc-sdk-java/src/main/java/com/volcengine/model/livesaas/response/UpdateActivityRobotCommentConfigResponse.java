package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityRobotCommentConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityRobotCommentConfigResponse.UpdateActivityRobotCommentConfigResponseBody result;

    @Data
    public static class UpdateActivityRobotCommentConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
