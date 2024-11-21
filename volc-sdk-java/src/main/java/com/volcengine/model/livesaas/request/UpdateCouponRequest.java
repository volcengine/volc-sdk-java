package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Coupon;
import lombok.Data;

import java.util.List;

@Data
public class UpdateCouponRequest {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "Description")
    String Description;
    @JSONField(name = "ThirdPartyId")
    String ThirdPartyId;
    @JSONField(name = "Pic")
    String Pic;
}