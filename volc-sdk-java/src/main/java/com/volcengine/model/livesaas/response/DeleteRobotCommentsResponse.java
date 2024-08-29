package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteRobotCommentsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteRobotCommentsResponse.DeleteRobotCommentsResponseBody result;

    @Data
    public static class DeleteRobotCommentsResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
