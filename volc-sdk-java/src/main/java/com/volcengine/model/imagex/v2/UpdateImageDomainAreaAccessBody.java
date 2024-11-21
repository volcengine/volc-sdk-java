package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainAreaAccessBody
 */
@lombok.Data
public final class UpdateImageDomainAreaAccessBody  {

    /**
     * <p>域名，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>区域访问限制配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "area_access")
    private UpdateImageDomainAreaAccessBodyAreaAccess areaAccess;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
