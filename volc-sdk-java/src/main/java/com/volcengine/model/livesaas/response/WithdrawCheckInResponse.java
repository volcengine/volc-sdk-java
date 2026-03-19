package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class WithdrawCheckInResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    WithdrawCheckInResponseBody result;

    @Data
    public static class WithdrawCheckInResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
