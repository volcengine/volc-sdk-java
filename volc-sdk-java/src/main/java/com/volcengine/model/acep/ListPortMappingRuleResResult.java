package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListPortMappingRuleResResult
 */
@lombok.Data
public final class ListPortMappingRuleResResult  {

    /**
     * <p>查询结果总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    /**
     * <p>查询到的端口映射列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultPortMappingRuleDetail> row;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
