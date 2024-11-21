package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMonitorRuleResResult
 */
@lombok.Data
public final class CreateImageMonitorRuleResResult  {

    /**
     * <p>告警规则 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
