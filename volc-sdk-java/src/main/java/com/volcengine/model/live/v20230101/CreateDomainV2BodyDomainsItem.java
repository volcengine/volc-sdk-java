package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateDomainV2BodyDomainsItem
 */
@lombok.Data
public final class CreateDomainV2BodyDomainsItem  {

    /**
     * <p>域名名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainName")
    private String domainName;

    /**
     * <p>证书 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>域名类型，支持以下取值。</p>
     *
     * <p>- push：推流域名</p>
     *
     * <p>- pull-flv：拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
