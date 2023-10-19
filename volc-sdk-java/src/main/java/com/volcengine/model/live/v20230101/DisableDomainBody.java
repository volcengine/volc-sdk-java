package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DisableDomainBody
 */
@lombok.Data
public final class DisableDomainBody  {

    /**
     * <p>待禁用域名。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
