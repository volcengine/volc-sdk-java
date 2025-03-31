package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainUaAccessBody
 */
@lombok.Data
public final class UpdateImageDomainUaAccessBody  {

    /**
     * <p>域名，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>UA 访问限制配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ua_auth")
    private UpdateImageDomainUaAccessBodyUaAuth uaAuth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
