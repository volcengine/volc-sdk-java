package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteRobotNickNamesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteRobotNickNamesResponse.DeleteRobotNickNamesResponseBody result;

    @Data
    public static class DeleteRobotNickNamesResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
