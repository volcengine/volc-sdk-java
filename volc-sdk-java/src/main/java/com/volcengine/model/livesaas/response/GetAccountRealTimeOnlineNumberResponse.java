package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetAccountRealTimeOnlineNumberResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAccountRealTimeOnlineNumberResponseBody result;

    @Data
    public static class GetAccountRealTimeOnlineNumberResponseBody {
        @JSONField(name = "UV")
        Long UV;
    }
}