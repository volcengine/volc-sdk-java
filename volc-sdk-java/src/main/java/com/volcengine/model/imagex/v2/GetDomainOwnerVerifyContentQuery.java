package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainOwnerVerifyContentQuery
 */
@lombok.Data
public final class GetDomainOwnerVerifyContentQuery  {

    /**
     * <p>待校验的域名。仅支持单域名校验。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
