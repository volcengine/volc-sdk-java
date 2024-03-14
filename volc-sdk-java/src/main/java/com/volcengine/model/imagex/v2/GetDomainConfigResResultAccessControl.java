package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControl
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControl  {

    /**
     * <p>IP 访问控制配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ip_auth")
    private GetDomainConfigResResultAccessControlIpAuth ipAuth;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "refer_link")
    private Object referLink;

    /**
     * <p>UA 访问控制配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ua_list")
    private GetDomainConfigResResultAccessControlUaList uaList;

    /**
     * <p>URL 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "url_auth")
    private GetDomainConfigResResultAccessControlUrlAuth urlAuth;

    /**
     * <p>远程鉴权设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "remote_auth")
    private GetDomainConfigResResultAccessControlRemoteAuth remoteAuth;

    /**
     * <p>Referer 防盗链配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "referer_link")
    private GetDomainConfigResResultAccessControlRefererLink refererLink;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
