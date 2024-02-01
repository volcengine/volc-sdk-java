package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateHttpsBodyHttpsHsts
 */
@lombok.Data
public final class UpdateHttpsBodyHttpsHsts  {

    /**
     * <p>是否开启hsts</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable")
    private Boolean enable;

    /**
     * <p>表示 HSTS 配置是否也应用于加速域名的子域名。该参数有以下取值： include：表示 HSTS 配置应用于子域名站点。 exclude：表示 HSTS 配置不应用于子域名站点。 该参数的默认值是 exclude。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "subdomain")
    private String subdomain;

    /**
     * <p>表示 Strict-Transport-Security 响应头在浏览器中的缓存过期时间，单位是秒。该参数的取值范围是 0 - 31,536,000。31,536,000 秒表示 365 天。如果该参数值为 0，其效果等同于禁用 HSTS 设置。该参数的默认值是 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ttl")
    private Integer ttl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
