package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCertDetailSecretV2ResResultSSL
 */
@lombok.Data
public final class DescribeCertDetailSecretV2ResResultSSL  {

    /**
     * <p>密钥类型，默认为 `rsa`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "KeyType")
    private String keyType;

    /**
     * <p>证书链，包括叶子证书（服务器证书）、中间证书（中间 CA 证书）以及根证书（根 CA 证书）。证书链中的证书使用 PEM 编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Chain")
    private List<String> chain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
