package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UnbindCertBody
 */
@lombok.Data
public final class UnbindCertBody  {

    /**
     * <p>填写需要解绑 HTTPS 证书的域名。 您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要解绑证书的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
