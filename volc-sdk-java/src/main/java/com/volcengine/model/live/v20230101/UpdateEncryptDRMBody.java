package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateEncryptDRMBody
 */
@lombok.Data
public final class UpdateEncryptDRMBody  {

    /**
     * <p>DRM 证书管理平台 API 访问密钥，获取方法请参见[最佳实践-直播 DRM 加密](https://www.volcengine.com/docs/6469/1219836#在-intertrust-平台创建访问密钥)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "APIKey")
    private String aPIKey;

    /**
     * <p>自定义 FairPlay 证书名称，支持由小写字母（a - z）、数字（0 - 9）和短横线（-）组成，最小长度为 2个字符，最大长度为 128 个字符。FairPlay 证书相关参数的获取方法请参见[最佳实践-直播 DRM 加密](https://www.volcengine.com/docs/6469/1219836#在-apple-官网获取-fairplay-证书)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateName")
    private String certificateName;

    /**
     * <p>申请 FairPlay 证书时创建的私钥文件内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKeyFile")
    private String privateKeyFile;

    /**
     * <p>申请 FairPlay 证书时创建的私钥文件名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKeyFileName")
    private String privateKeyFileName;

    /**
     * <p>FairPlay 证书文件内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateFile")
    private String certificateFile;

    /**
     * <p>FairPlay 证书文件名称。</p>
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
