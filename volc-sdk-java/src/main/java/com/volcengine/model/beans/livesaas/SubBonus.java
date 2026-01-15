package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SubBonus {
    @JSONField(name = "PointSubBonus")
    PointSubBonus PointSubBonus;

    @JSONField(name = "CashSubBonus")
    CashSubBonus CashSubBonus;

    @JSONField(name = "CouponSubBonus")
    CouponSubBonus CouponSubBonus;

    @JSONField(name = "AwardSubBonus")
    AwardSubBonus AwardSubBonus;
}

