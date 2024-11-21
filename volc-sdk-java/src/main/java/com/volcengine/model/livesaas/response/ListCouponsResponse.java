package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Coupon;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListCouponsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListCouponsResponseBody result;

    @Data
    public static class ListCouponsResponseBody {
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "Coupons")
        List<Coupon> Coupons;
    }
}