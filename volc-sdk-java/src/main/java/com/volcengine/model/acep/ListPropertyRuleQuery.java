package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListPropertyRuleQuery
 */
@lombok.Data
public final class ListPropertyRuleQuery  {

    /**
     * <p>机型参数规则名称，账户下规则名称唯一</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleName")
    private String ruleName;

    /**
     * <p>分页偏移量。默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>分页大小，默认值为 10，最大值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
