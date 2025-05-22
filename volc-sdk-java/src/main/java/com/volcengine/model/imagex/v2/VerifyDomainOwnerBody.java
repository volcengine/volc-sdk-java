package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * VerifyDomainOwnerBody
 */
@lombok.Data
public final class VerifyDomainOwnerBody  {

    /**
     * <p>待校验的域名。仅支持单域名校验。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>校验方式，取值如下：</p>
     *
     * <p>dns: DNS 解析验证。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VerifyType")
    private String verifyType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
