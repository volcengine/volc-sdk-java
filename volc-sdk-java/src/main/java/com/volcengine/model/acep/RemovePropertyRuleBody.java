package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * RemovePropertyRuleBody
 */
@lombok.Data
public final class RemovePropertyRuleBody  {

    /**
     * <p>需要移除的机型参数规则名称，可通过 `ListPropertyRule` 获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleName")
    private String ruleName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
