package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateRobotNickNameResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateRobotNickNameResponseBody result;

    @Data
    public static class UpdateRobotNickNameResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
