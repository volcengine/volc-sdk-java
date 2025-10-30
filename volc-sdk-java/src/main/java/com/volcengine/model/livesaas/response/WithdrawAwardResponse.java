package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class WithdrawAwardResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    WithdrawAwardResult result;

    @Data
    public class WithdrawAwardResult {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
