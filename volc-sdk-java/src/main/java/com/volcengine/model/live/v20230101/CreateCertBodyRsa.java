package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCertBodyRsa
 */
@lombok.Data
public final class CreateCertBodyRsa  {

    /**
     * <p>证书私钥。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prikey")
    private String prikey;

    /**
     * <p>证书公钥。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pubkey")
    private String pubkey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
