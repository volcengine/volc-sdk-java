package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateIPAccessRuleBody
 */
@lombok.Data
public final class UpdateIPAccessRuleBody  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推/拉流域名。</p>
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
