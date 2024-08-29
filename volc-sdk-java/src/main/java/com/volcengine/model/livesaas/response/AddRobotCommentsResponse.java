package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddRobotCommentsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddRobotCommentsResponse.AddRobotCommentsResponseBody result;

    @Data
    public static class AddRobotCommentsResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
