package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SendActivityCouponResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SendActivityCouponResponseBody result;

    @Data
    public static class SendActivityCouponResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}