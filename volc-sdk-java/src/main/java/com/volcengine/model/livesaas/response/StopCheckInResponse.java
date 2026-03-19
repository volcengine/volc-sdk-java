package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class StopCheckInResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    StopCheckInResponseBody result;

    @Data
    public static class StopCheckInResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
