package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageSettingRulePriorityBodyPrioritiesItem
 */
@lombok.Data
public final class UpdateImageSettingRulePriorityBodyPrioritiesItem  {

    /**
     * <p>待更新优先级的规则 ID，您可以通过调用[获取规则列表](https://www.volcengine.com/docs/508/1324618)的方式获取所需的规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    /**
     * <p>规则优先级。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果配置项下创建了多个规则，需要填写全部规则更新后的优先级。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private Integer priority;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
