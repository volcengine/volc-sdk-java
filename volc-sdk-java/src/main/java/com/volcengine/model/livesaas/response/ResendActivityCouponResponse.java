package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ResendActivityCouponResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
    @JSONField(name = "Result")
    ResendActivityCouponResponse.ResendActivityCouponResponseBody Result;

    @Data
    public static class ResendActivityCouponResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
