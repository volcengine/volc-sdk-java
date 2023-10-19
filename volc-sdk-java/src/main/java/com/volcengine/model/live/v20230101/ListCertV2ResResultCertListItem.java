package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCertV2ResResultCertListItem
 */
@lombok.Data
public final class ListCertV2ResResultCertListItem  {

    /**
     * <p>与证书绑定的域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomainList")
    private List<String> certDomainList;

    /**
     * <p>证书名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>证书链 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>证书实例ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertID")
    private String certID;

    /**
     * <p>火山证书中心证书链 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainIDVolc")
    private String chainIDVolc;

    /**
     * <p>证书的过期时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotAfter")
    private String notAfter;

    /**
     * <p>证书的生效日期，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotBefore")
    private String notBefore;

    /**
     * <p>证书状态，由证书管理平台返回，支持的取值如下所示。</p>
     *
     * <p>- OK：正常；</p>
     *
     * <p>- Expire：过期；</p>
     *
     * <p>- 30days：有效期剩余 30 天；</p>
     *
     * <p>- 15days：有效期剩余 15 天；</p>
     *
     * <p>- 7days：有效期剩余 7 天；</p>
     *
     * <p>- 1days：有效期剩余 1 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
