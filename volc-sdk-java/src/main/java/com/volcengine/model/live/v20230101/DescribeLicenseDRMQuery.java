package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLicenseDRMQuery
 */
@lombok.Data
public final class DescribeLicenseDRMQuery  {

    /**
     * <p>拉取加密流时使用的拉流域名所在的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的拉流域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名，您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址的 AppName 字段相同，由大写小字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamName")
    private String streamName;

    /**
     * <p>DRM 加密的类型，取值及含义如下所示。</p>
     *
     * <p>- `fp`：FairPlay 加密；</p>
     *
     * <p>- `wv`：Widevine 加密；</p>
     *
     * <p>- `pr`：PlayReady 加密。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DRMType")
    private String dRMType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
