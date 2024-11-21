package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Coupon;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetCouponResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetCouponResponseBody result;

    @Data
    public static class GetCouponResponseBody {
        @JSONField(name = "Coupons")
        List<Coupon> Coupons;
    }
}