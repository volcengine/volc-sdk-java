package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyRemoteAuthAuthResponse
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthAuthResponse  {

    /**
     * <p>鉴权服务器状态码设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "auth_server_status_code")
    private UpdateImageDomainConfigBodyRemoteAuthAuthResponseAuthServerStatusCode authServerStatusCode;

    /**
     * <p>鉴权结果缓存设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "auth_result_cache")
    private UpdateImageDomainConfigBodyRemoteAuthAuthResponseAuthResultCache authResultCache;

    /**
     * <p>鉴权服务超时时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "auth_server_timeout")
    private UpdateImageDomainConfigBodyRemoteAuthAuthResponseAuthServerTimeout authServerTimeout;

    /**
     * <p>响应设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "response")
    private UpdateImageDomainConfigBodyRemoteAuthAuthResponseResponse response;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
