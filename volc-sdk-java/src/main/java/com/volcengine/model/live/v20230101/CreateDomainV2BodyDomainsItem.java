package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateDomainV2BodyDomainsItem
 */
@lombok.Data
public final class CreateDomainV2BodyDomainsItem  {

    /**
     * <p>域名名称，域名由字母（A - Z、a -z）、数字（0 - 9）和连字符（-） 组成，长度为 1 到 60 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainName")
    private String domainName;

    /**
     * <p>证书链 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>域名类型，取值及含义如下所示。</p>
     *
     * <p>- `push`：推流域名；</p>
     *
     * <p>- `pull-flv`：拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
