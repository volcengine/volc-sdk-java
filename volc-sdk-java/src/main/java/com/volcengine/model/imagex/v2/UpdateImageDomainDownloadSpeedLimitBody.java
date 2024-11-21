package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainDownloadSpeedLimitBody
 */
@lombok.Data
public final class UpdateImageDomainDownloadSpeedLimitBody  {

    /**
     * <p>域名。您可以通过调用 [GetServiceDomains](https://www.volcengine.com/docs/508/9379)接口获取域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>下载限速配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "download_speed_limit")
    private UpdateImageDomainDownloadSpeedLimitBodyDownloadSpeedLimit downloadSpeedLimit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
