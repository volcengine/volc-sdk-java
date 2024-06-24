package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateIPAccessRuleBody
 */
@lombok.Data
public final class UpdateIPAccessRuleBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取需要配置 IP 访问限制的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名或拉流域名，您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取需要配置 IP 访问限制的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>IP 访问限制规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPAccessRule")
    private UpdateIPAccessRuleBodyIPAccessRule iPAccessRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
