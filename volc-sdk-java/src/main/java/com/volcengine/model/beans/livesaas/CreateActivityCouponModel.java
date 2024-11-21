package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateActivityCouponModel {
    @JSONField(name = "CouponId")
    Long CouponId;
    @JSONField(name = "AllowCloseIcon")
    Boolean AllowCloseIcon;
    @JSONField(name = "Count")
    Long Count;
    @JSONField(name = "Rule")
    Integer Rule;
    @JSONField(name = "Duration")
    Integer Duration;
    @JSONField(name = "CutOffTime")
    Long CutOffTime;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "PickupCount")
    Long PickupCount;
    @JSONField(name = "PickupPeopleCount")
    Long PickupPeopleCount;
    @JSONField(name = "SendTime")
    Long SendTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "Coupon")
    Coupon Coupon;
}
