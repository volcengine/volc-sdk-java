package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainUaAccessBody
 */
@lombok.Data
public final class UpdateImageDomainUaAccessBody  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>ua访问限制配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ua_auth")
    private UpdateImageDomainUaAccessBodyUaAuth uaAuth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
