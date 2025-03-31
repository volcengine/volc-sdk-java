package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AddDomainV1ResResult
 */
@lombok.Data
public final class AddDomainV1ResResult  {

    /**
     * <p>新增的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
