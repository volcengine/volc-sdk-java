package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListDNSRuleResResult
 */
@lombok.Data
public final class ListDNSRuleResResult  {

    /**
     * <p>查询到的 DNS 规则信息列表，参看 DetailDNSRuleResult 数据结构说明。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultDetailDnsRuleResult> row;

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
