package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageSettingRuleResResult
 */
@lombok.Data
public final class CreateImageSettingRuleResResult  {

    /**
     * <p>规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
