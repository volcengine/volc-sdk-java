package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class RewardsPointsConfig {
    @JSONField(name = "AmountCalculationType")
    Integer AmountCalculationType;

    @JSONField(name = "FixedRewardPointConfigs")
    List<FixedRewardPointConfig> FixedRewardPointConfigs;

    @JSONField(name = "RewardsPointsBatch")
    String RewardsPointsBatch;

    @JSONField(name = "RewardsPointsUnit")
    String RewardsPointsUnit;
}
