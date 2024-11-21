package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CreateCouponModel;
import lombok.Data;

import java.util.List;

@Data
public class CreateCouponsRequest {
    @JSONField(name = "Coupons")
    List<CreateCouponModel> Coupons;
}