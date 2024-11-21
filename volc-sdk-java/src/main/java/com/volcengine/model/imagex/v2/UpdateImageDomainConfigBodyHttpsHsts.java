package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyHttpsHsts
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyHttpsHsts  {

    /**
     * <p>是否开启 HSTS 配置，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>HSTS 配置是否也应用于加速域名的子域名。取值如下所示： </p>
     *
     * <p>- `include`：应用于子域名站点。 </p>
     *
     * <p>- `exclude`：（默认）不应用于子域名站点。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "subdomain")
    private String subdomain;

    /**
     * <p>如果 enable_https 是 true，该参数为必填。</p>
     *
     * <p>Strict-Transport-Security 响应头在浏览器中的缓存过期时间，单位是秒。取值范围是 [0,31,536,000]。31,536,000 秒表示 365 天。如果该参数值指定为 0，其效果等同于禁用 HSTS 设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ttl")
    private Integer ttl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
