package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UpdateDNSRuleBody
 */
@lombok.Data
public final class UpdateDNSRuleBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>DNS 规则 ID，可通过调用 ListDNSRule 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSId")
    private String dNSId;

    /**
     * <p>DNS 规则名称，支持中英文、数字、下划线、中划线，长度限制为0~64个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSName")
    private String dNSName;

    /**
     * <p>DNS 规则类型：</p>
     *
     * <p>- 0：非默认 DNS；</p>
     *
     * <p>- 1：默认 DNS。</p>
     *
     * <p>> 同一个业务的单个 Dc 维度只支持一个默认的 DNS 策略。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>DNS 地址列表，参看 IPInfo 数据结构说明。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPList")
    private List<com.volcengine.model.acep.v20231030.ResultIpInfo> iPList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
