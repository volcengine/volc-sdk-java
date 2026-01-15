package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BonusObject {
    @JSONField(name = "SubTaskType")
    Integer SubTaskType;

    @JSONField(name = "SubTaskCondition")
    Long SubTaskCondition;

    @JSONField(name = "SubBonusType")
    Integer SubBonusType;

    @JSONField(name = "SubBonus")
    SubBonus SubBonus;
}

