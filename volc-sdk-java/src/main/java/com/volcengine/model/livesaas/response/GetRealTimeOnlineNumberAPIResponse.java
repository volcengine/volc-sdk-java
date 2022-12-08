package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetRealTimeOnlineNumberAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetRealTimeOnlineNumberAPIResponseBody result;

    @Data
    public static class GetRealTimeOnlineNumberAPIResponseBody {
        @JSONField(name = "RealPopularity")
        Long RealPopularity;
        @JSONField(name = "FakePopularity")
        Long FakePopularity;
    }
}