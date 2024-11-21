package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAllDomainCertResResultItem
 */
@lombok.Data
public final class GetImageAllDomainCertResResultItem  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>域名状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainStatus")
    private String domainStatus;

    /**
     * <p>证书id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertID")
    private String certID;

    /**
     * <p>证书备注</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>证书通用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertCommonName")
    private String certCommonName;

    /**
     * <p>证书过期时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertNotAfter")
    private Double certNotAfter;

    /**
     * <p>可通过san与cert_common_name来匹配证书可用的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "San")
    private List<String> san;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
