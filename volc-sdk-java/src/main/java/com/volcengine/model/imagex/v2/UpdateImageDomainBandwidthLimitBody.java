package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainBandwidthLimitBody
 */
@lombok.Data
public final class UpdateImageDomainBandwidthLimitBody  {

    /**
     * <p>域名。您可以通过调用 [GetServiceDomains](https://www.volcengine.com/docs/508/9379) 接口获取域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>带宽限制设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "bandwidth_limit")
    private UpdateImageDomainBandwidthLimitBodyBandwidthLimit bandwidthLimit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
