package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListDNSRuleBody
 */
@lombok.Data
public final class ListDNSRuleBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>DNS 规则 名称，支持中英文、数字、下划线、中划线，长度限制为 0~64 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSName")
    private String dNSName;

    /**
     * <p>是否为默认 DNS：</p>
     *
     * <p>- 0：非默认 DNS；</p>
     *
     * <p>- 1：默认 DNS。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

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
