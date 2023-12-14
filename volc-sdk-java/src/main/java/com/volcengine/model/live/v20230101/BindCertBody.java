package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * BindCertBody
 */
@lombok.Data
public final class BindCertBody  {

    /**
     * <p>证书域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomain")
    private String certDomain;

    /**
     * <p>需要绑定的证书链 ID，可以通过[查询证书列表](https://www.volcengine.com/docs/6469/1126822)接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>需要绑定证书的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>是否开启 HTTPS，默认值为 false。</p>
     *
     * <p>- false：关闭；</p>
     *
     * <p>- true：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HTTPS")
    private Boolean hTTPS;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
