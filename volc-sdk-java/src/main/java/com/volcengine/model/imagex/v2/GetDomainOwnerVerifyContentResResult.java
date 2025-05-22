package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainOwnerVerifyContentResResult
 */
@lombok.Data
public final class GetDomainOwnerVerifyContentResResult  {

    /**
     * <p>域名是否需要归属权校验：</p>
     *
     * <p>true: 需要校验</p>
     *
     * <p>false: 无需校验</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedVerify")
    private Boolean needVerify;

    /**
     * <p>DNS 解析校验信息，仅当 NeedVerify 为 true 时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSVerifyInfo")
    private GetDomainOwnerVerifyContentResResultDNSVerifyInfo dNSVerifyInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
