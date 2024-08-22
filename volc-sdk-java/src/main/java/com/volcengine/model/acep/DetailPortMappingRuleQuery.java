package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailPortMappingRuleQuery
 */
@lombok.Data
public final class DetailPortMappingRuleQuery  {

    /**
     * <p>云手机业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>端口映射规则 ID，可通过调用 `ListPortMappingRule` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleId")
    private String portMappingRuleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
