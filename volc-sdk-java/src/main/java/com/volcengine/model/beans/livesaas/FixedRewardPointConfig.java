package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FixedRewardPointConfig {
    /**
     * 积分金额
     */
    @JSONField(name = "RewardPointAmount")
    Integer RewardPointAmount;

    /**
     * 红包个数
     */
    @JSONField(name = "RewardPointNumber")
    Integer RewardPointNumber;
}
