package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListPropertyRuleResResult
 */
@lombok.Data
public final class ListPropertyRuleResResult  {

    /**
     * <p>查询到的参数规则信息。参看 [PropertyRule](#propertyrule) 定义。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultPropertyRule> row;

    /**
     * <p>查询结果总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
