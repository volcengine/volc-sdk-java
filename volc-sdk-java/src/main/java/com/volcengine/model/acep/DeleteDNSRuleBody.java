package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DeleteDNSRuleBody
 */
@lombok.Data
public final class DeleteDNSRuleBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>DNS 规则 ID，可通过调用 ListDNSRule 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSId")
    private String dNSId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
