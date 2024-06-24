package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCertResResult
 */
@lombok.Data
public final class CreateCertResResult  {

    /**
     * <p>证书链 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>使用该证书的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>证书用途，取值及含义如下所示。</p>
     *
     * <p>- `https`：用于 HTTPS 加密；</p>
     *
     * <p>- `sign`：用于签名加密。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseWay")
    private String useWay;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
