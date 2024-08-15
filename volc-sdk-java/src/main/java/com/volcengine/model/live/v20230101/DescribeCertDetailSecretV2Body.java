package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailSecretV2Body
 */
@lombok.Data
public final class DescribeCertDetailSecretV2Body  {

    /**
     * <p>证书 ID，您可以通过[ListCertV2](https://www.volcengine.com/docs/6469/1126823)接口获取证书 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `ChainID` 与 `CertID` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertID")
    private String certID;

    /**
     * <p>证书链 ID，您可以通过[ListcCertV2](https://www.volcengine.com/docs/6469/1126823)接口获取 证书链 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `ChainID` 与 `CertID` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
