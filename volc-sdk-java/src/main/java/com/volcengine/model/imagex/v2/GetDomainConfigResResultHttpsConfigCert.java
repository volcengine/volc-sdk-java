package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultHttpsConfigCert
 */
@lombok.Data
public final class GetDomainConfigResResultHttpsConfigCert  {

    /**
     * <p>证书id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "id")
    private String id;

    /**
     * <p>证书通用名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "common_name")
    private String commonName;

    /**
     * <p>证书过期时间，unix时间戳，单位秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "not_after")
    private Integer notAfter;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
