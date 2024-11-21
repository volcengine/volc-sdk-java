package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class StopActivityCouponResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    StopActivityCouponResponseBody result;

    @Data
    public static class StopActivityCouponResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}