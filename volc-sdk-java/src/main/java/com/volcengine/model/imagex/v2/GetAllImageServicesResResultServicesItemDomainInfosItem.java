package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetAllImageServicesResResultServicesItemDomainInfosItem
 */
@lombok.Data
public final class GetAllImageServicesResResultServicesItemDomainInfosItem  {

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
     * <p>是否为默认域名，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsDefault")
    private Boolean isDefault;

    /**
     * <p>是否开启鉴权，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UrlAuth")
    private Boolean urlAuth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
