package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * VerifyDomainOwnerResResult
 */
@lombok.Data
public final class VerifyDomainOwnerResResult  {

    /**
     * <p>校验是否成功：</p>
     *
     * <p>true: 校验成功</p>
     *
     * <p>false: 校验失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VerifyResult")
    private Boolean verifyResult;

    /**
     * <p>校验失败的原因，当 VerifyResult 为 false 时返回。</p>
     *
     * <p>verify domain owner by dns error: 域名归属权 DNS 验证错误，DNS 解析失败。</p>
     *
     * <p>verify domain owner by dns failed, record value not match: 域名归属权 DNS 验证错误，TXT 记录值不匹配。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorMessage")
    private String errorMessage;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
