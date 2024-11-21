package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetActivityAllCouponsPickDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityAllCouponsPickDataResponseBody result;

    @Data
    public static class AllActivityCouponPickData {
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "CouponId")
        Long CouponId;
        @JSONField(name = "ThirdPartyId")
        String ThirdPartyId;
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "SendTime")
        Long SendTime;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "ExternalUserId")
        String ExternalUserId;
        @JSONField(name = "PickupTime")
        Long PickupTime;
        @JSONField(name = "UserNickName")
        String UserNickName;
    }

    @Data
    public static class GetActivityAllCouponsPickDataResponseBody {
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "Data")
        List<AllActivityCouponPickData> Data;
    }
}