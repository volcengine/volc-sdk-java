package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * BindCertBody
 */
@lombok.Data
public final class BindCertBody  {

    /**
     * <p>需要绑定的 HTTPS 证书的证书链 ID，可以通过[查询证书列表](https://www.volcengine.com/docs/6469/1126822)接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>填写需要配置 HTTPS 证书的域名。 您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要绑定证书的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>是否启用 HTTPS 协议，默认值为 `false`，取值及含义如下所示。</p>
     *
     * <p>- `false`：关闭；</p>
     *
     * <p>- `true`：启用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HTTPS")
    private Boolean hTTPS;

    /**
     * <p>HTTPS 证书支持的最大 TLS 协议版本，默认为空，可选值如下所示。</p>
     *
     * <p>- TLSv1.0</p>
     *
     * <p>- TLSv1.1</p>
     *
     * <p>- TLSv1.2</p>
     *
     * <p>- TLSv1.3</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxTLSVersion")
    private String maxTLSVersion;

    /**
     * <p>HTTPS 证书支持的最小 TLS 版本，默认值为 `TLSv1.2`，可选值如下所示。</p>
     *
     * <p>- TLSv1.0</p>
     *
     * <p>- TLSv1.1</p>
     *
     * <p>- TLSv1.2</p>
     *
     * <p>- TLSv1.3</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MinTLSVersion")
    private String minTLSVersion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
