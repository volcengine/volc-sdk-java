package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * CreateDNSRuleResResult
 */
@lombok.Data
public final class CreateDNSRuleResResult  {

    /**
     * <p>业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>DNS 规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSId")
    private String dNSId;

    /**
     * <p>DNS 规则名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSName")
    private String dNSName;

    /**
     * <p>机房 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>是否为默认 DNS 规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>IP 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPList")
    private List<com.volcengine.model.acep.v20231030.ResultIpInfo> iPList;

    /**
     * <p>DNS 解析规则创建时间，Unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
