package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetServiceDomainsResResultItemHttpsConfig
 */
@lombok.Data
public final class GetServiceDomainsResResultItemHttpsConfig  {

    /**
     * <p>证书 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "cert_id")
    private String certId;

    /**
     * <p>是否开启 HTTP2</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_http2")
    private Boolean enableHttp2;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
