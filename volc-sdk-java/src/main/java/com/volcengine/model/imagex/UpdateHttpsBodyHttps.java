package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateHttpsBodyHttps
 */
@lombok.Data
public final class UpdateHttpsBodyHttps  {

    /**
     * <p>是否开启 http2，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_http2")
    private Boolean enableHttp2;

    /**
     * <p>是否开启 https，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_https")
    private Boolean enableHttps;

    /**
     * <p>是否开启 ocsp 装订，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_ocsp")
    private Boolean enableOcsp;

    /**
     * <p>是否开启 quic 协议支持，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_quic")
    private Boolean enableQuic;

    /**
     * <p>支持的 tls 版本，取值如下所示：</p>
     *
     * <p>- `tlsv1.0`</p>
     *
     * <p>- `tlsv1.1`</p>
     *
     * <p>- `tlsv1.2`</p>
     *
     * <p>- `tlsv1.3 `</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "tls_versions")
    private List<String> tlsVersions;

    /**
     * <p>需要关联的证书 ID，若`enable_https`为`true`，则为必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "cert_id")
    private String certId;

    /**
     * <p>是否开启强制跳转，支持取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_force_redirect")
    private Boolean enableForceRedirect;

    /**
     * <p>强制跳转类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `http2https`：HTTP 到 HTTPS</p>
     *
     * <p>- `https2http`：HTTPS 到 HTTP</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当`enable_force_redirect`取值为`true`时需要配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "force_redirect_type")
    private String forceRedirectType;

    /**
     * <p>强制跳转状态码，取值如下所示：</p>
     *
     *
     *
     * <p>- `301`：返回给用户 301 状态码进行重定向。</p>
     *
     * <p>- `302`：返回给用户 302 状态码进行重定向。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当`enable_force_redirect`取值为`true`时需要配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "force_redirect_code")
    private String forceRedirectCode;

    /**
     * <p>配置hsts</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "hsts")
    private UpdateHttpsBodyHttpsHsts hsts;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
