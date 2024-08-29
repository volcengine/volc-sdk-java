package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddRobotNickNamesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddRobotNickNamesResponse.AddRobotNickNamesResponseBody result;

    @Data
    public static class AddRobotNickNamesResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
