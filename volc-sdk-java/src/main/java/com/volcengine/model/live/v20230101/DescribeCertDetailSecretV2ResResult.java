package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCertDetailSecretV2ResResult
 */
@lombok.Data
public final class DescribeCertDetailSecretV2ResResult  {

    /**
     * <p>与证书绑定的域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomainList")
    private List<String> certDomainList;

    /**
     * <p>证书链 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>证书详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SSL")
    private DescribeCertDetailSecretV2ResResultSSL sSL;

    /**
     * <p>证书名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>证书的生效日期，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotBefore")
    private String notBefore;

    /**
     * <p>证书的过期时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotAfter")
    private String notAfter;

    /**
     * <p>证书状态，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `OK`：正常；</p>
     *
     * <p>- `Expire`：过期；</p>
     *
     * <p>- `30days`：有效期剩余 30 天；</p>
     *
     * <p>- `15days`：有效期剩余 15 天；</p>
     *
     * <p>- `7days`：有效期剩余 7 天；</p>
     *
     * <p>- `1days`：有效期剩余 1 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
