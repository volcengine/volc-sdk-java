package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCertBody
 */
@lombok.Data
public final class CreateCertBody  {

    /**
     * <p>火山引擎账号 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>证书名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>证书链 ID，用于标识整个证书链，包括叶子证书（服务器证书）、中间证书（中间 CA 证书）以及根证书（根 CA 证书）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>密钥信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rsa")
    private CreateCertBodyRsa rsa;

    /**
     * <p>证书用途，默认为 `https`，支持的取值包括：</p>
     *
     * <p>- https：https 认证；</p>
     *
     * <p>- sign：签名校验。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseWay")
    private String useWay;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
