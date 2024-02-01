package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultDomainInfosItem
 */
@lombok.Data
public final class GetImageServiceResResultDomainInfosItem  {

    /**
     * <p>绑定的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainName")
    private String domainName;

    /**
     * <p>域名解析到的 cname。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CNAME")
    private String cNAME;

    /**
     * <p>域名状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>是否是默认域名，取值如下所示：</p>
     *
     * <p>- `true`：默认域名</p>
     *
     * <p>- `false`：非默认域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsDefault")
    private Boolean isDefault;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
