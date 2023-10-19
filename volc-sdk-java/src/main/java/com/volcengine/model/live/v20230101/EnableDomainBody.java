package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * EnableDomainBody
 */
@lombok.Data
public final class EnableDomainBody  {

    /**
     * <p>待启用域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
