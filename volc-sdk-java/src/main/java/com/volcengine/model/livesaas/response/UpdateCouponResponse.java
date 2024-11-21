package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateCouponResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateCouponResponseBody result;

    @Data
    public static class UpdateCouponResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}