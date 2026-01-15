package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CashSubBonus {
    @JSONField(name = "AmountTenthsUnit")
    Long AmountTenthsUnit;

    @JSONField(name = "LimitCount")
    Long LimitCount;
}

