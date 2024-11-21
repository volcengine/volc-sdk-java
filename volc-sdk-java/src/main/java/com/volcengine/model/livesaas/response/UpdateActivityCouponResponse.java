package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityCouponResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityCouponResponseBody result;

    @Data
    public static class UpdateActivityCouponResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}