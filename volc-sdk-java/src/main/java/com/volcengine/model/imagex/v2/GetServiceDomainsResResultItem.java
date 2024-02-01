package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetServiceDomainsResResultItem
 */
@lombok.Data
public final class GetServiceDomainsResResultItem  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>指向的 cname 值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "cname")
    private String cname;

    /**
     * <p>域名状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "status")
    private String status;

    /**
     * <p>地域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "region")
    private String region;

    /**
     * <p>HTTPS 配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "https_config")
    private GetServiceDomainsResResultItemHttpsConfig httpsConfig;

    /**
     * <p>是否是默认域名，取值如下所示：</p>
     *
     * <p>- `true`：默认域名</p>
     *
     * <p>- `false`：非默认域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "is_default")
    private Boolean isDefault;

    /**
     * <p>域名锁定原因</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "reason")
    private String reason;

    /**
     * <p>域名申请人</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "user")
    private String user;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "create_time")
    private Double createTime;

    /**
     * <p>域名锁定状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "lock_status")
    private GetServiceDomainsResResultItemLockStatus lockStatus;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
