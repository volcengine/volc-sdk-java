package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeEncryptDRMResResultDRMItem
 */
@lombok.Data
public final class DescribeEncryptDRMResResultDRMItem  {

    /**
     * <p>DRM 证书管理平台 API 访问密钥。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "APIKey")
    private String aPIKey;

    /**
     * <p>自定义的 FairPlay 证书名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateName")
    private String certificateName;

    /**
     * <p>申请 FairPlay 证书时创建的私钥文件名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKeyFileName")
    private String privateKeyFileName;

    /**
     * <p>FairPlay 证书文件的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateFileName")
    private String certificateFileName;

    /**
     * <p>申请 FairPlay 证书过程中 Apple 返回的 ASk（Application Secret Key）字符串。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplicationSecretKey")
    private String applicationSecretKey;

    /**
     * <p>申请 FairPlay 证书时创建的私钥文件密钥。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKey")
    private String privateKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
