package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCoupon;
import com.volcengine.model.beans.livesaas.Coupon;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityCouponsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityCouponsResponseBody result;

    @Data
    public static class ListActivityCouponsResponseBody {
        @JSONField(name = "ActivityCoupons")
        List<ActivityCoupon> ActivityCoupons;
    }
}