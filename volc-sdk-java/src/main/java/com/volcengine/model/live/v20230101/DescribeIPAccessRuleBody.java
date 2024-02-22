package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeIPAccessRuleBody
 */
@lombok.Data
public final class DescribeIPAccessRuleBody  {

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
