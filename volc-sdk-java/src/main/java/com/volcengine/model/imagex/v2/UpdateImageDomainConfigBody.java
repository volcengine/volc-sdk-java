package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBody
 */
@lombok.Data
public final class UpdateImageDomainConfigBody  {

    /**
     * <p>域名列表，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domains")
    private List<String> domains;

    /**
     * <p>HTTPS 配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "https")
    private UpdateImageDomainConfigBodyHttps https;

    /**
     * <p>Referer 防盗链配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "referer_link")
    private UpdateImageDomainConfigBodyRefererLink refererLink;

    /**
     * <p>URL 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "url_auth")
    private UpdateImageDomainConfigBodyUrlAuth urlAuth;

    /**
     * <p>IP 黑白名单配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ip_auth")
    private UpdateImageDomainConfigBodyIpAuth ipAuth;

    /**
     * <p>UA 访问限制配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "user_agent_acl")
    private UpdateImageDomainConfigBodyUserAgentAcl userAgentAcl;

    /**
     * <p>区域访问限制，不传不更新</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "area_acl")
    private UpdateImageDomainConfigBodyAreaAcl areaAcl;

    /**
     * <p>高级配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "advanced")
    private UpdateImageDomainConfigBodyAdvanced advanced;

    /**
     * <p>HTTP 响应头配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "resp_hdrs")
    private List<UpdateImageDomainConfigBodyRespHdrsItem> respHdrs;

    /**
     * <p>自适应格式配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "adaptfmt")
    private UpdateImageDomainConfigBodyAdaptfmt adaptfmt;

    /**
     * <p>集智瘦身配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "do_slim")
    private UpdateImageDomainConfigBodyDoSlim doSlim;

    /**
     * <p>全球加速配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "global_acceleration")
    private UpdateImageDomainConfigBodyGlobalAcceleration globalAcceleration;

    /**
     * <p>远程鉴权设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "remote_auth")
    private UpdateImageDomainConfigBodyRemoteAuth remoteAuth;

    /**
     * <p>页面优化设置，仅素材托管服务下域名支持配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "page_optimization")
    private UpdateImageDomainConfigBodyPageOptimization pageOptimization;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "share_cache")
    private UpdateImageDomainConfigBodyShareCache shareCache;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}