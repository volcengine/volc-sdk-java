package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainVolcOriginBody
 */
@lombok.Data
public final class UpdateImageDomainVolcOriginBody  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "doamin")
    private String doamin;

    /**
     * <p>是否使用ImageX源站</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "use_imagex")
    private Boolean useImagex;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "origin_config")
    private UpdateImageDomainVolcOriginBodyOriginConfig originConfig;

    /**
     * <p>回源协议, 回源协议配置存在以下三种情况： http：用户侧发起 HTTP 及 HTTPS 请求均会使用 HTTP 回源； https：用户侧发起的 HTTP 及 HTTPS 请求均会使用 HTTPS 回源； followclient：用户侧发起的 HTTP 请求使用 HTTP 回源，发起的 HTTPS 请求使用 HTTPS 回源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "origin_protocol")
    private String originProtocol;

    /**
     * <p>回源host</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "origin_host")
    private String originHost;

    /**
     * <p>分片回源</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "origin_range")
    private Boolean originRange;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
