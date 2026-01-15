package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CouponSubBonus {
    @JSONField(name = "CouponId")
    Long CouponId;

    @JSONField(name = "CouponName")
    String CouponName;

    @JSONField(name = "CouponDescription")
    String CouponDescription;

    @JSONField(name = "CouponThirdPartyId")
    String CouponThirdPartyId;

    @JSONField(name = "CouponPic")
    String CouponPic;

    @JSONField(name = "LimitCount")
    Long LimitCount;
}

