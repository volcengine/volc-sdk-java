package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetRealTimeOnlineNumberAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetRealTimeOnlineNumberAPIResultBean result;

    @Data
    public static class GetRealTimeOnlineNumberAPIResultBean {
        @JSONField(name = "RealPopularity")
        Long realPopularity;
        @JSONField(name = "FakePopularity")
        Long fakePopularity;
    }
}
