package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainIPAuthBody
 */
@lombok.Data
public final class UpdateImageDomainIPAuthBody  {

    /**
     * <p>待修改配置的域名，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>黑白名单配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ip_auth")
    private UpdateImageDomainIPAuthBodyIpAuth ipAuth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
