package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UnbindCertBody
 */
@lombok.Data
public final class UnbindCertBody  {

    /**
     * <p>需要解绑证书的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
