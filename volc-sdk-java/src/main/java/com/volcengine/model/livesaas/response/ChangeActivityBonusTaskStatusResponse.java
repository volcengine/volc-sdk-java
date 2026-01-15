package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ChangeActivityBonusTaskStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ChangeActivityBonusTaskStatusResponseBody result;

    @Data
    public static class ChangeActivityBonusTaskStatusResponseBody {
        @JSONField(name = "Status")
        Integer Status;
    }
}

