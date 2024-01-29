package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultHttpsConfig
 */
@lombok.Data
public final class GetDomainConfigResResultHttpsConfig  {

    /**
     * <p>是否开启  HTTPS，取值如下所示：</p>
     *
     * <p>* `true`：开启 HTTPS</p>
     *
     * <p>* `false`：关闭 HTTPS</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_https")
    private Boolean enableHttps;

    /**
     * <p>是否强制使用 HTTPS，取值如下所示：</p>
     *
     * <p>* `true`：强制 HTTPS</p>
     *
     * <p>* `false`：不强制 HTTPS</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "force_https")
    private Boolean forceHttps;

    /**
     * <p>证书 ID，若`enable_https`为`true`，则为必选。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "cert_id")
    private String certId;

    /**
     * <p>是否开启 HTTP2，取值如下所示：</p>
     *
     * <p>* `true`：开启 HTTP2</p>
     *
     * <p>* `false`：关闭 HTTP2</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_http2")
    private Boolean enableHttp2;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
