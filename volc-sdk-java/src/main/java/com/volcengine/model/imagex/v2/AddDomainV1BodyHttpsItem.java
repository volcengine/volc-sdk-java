package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AddDomainV1BodyHttpsItem
 */
@lombok.Data
public final class AddDomainV1BodyHttpsItem  {

    /**
     * <p>是否开启 Https，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_https")
    private Boolean enableHttps;

    /**
     * <p>是否强制使用 Https，取值如下所示：</p>
     *
     * <p>- `true`：强制</p>
     *
     * <p>- `false`：不强制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "force_https")
    private Boolean forceHttps;

    /**
     * <p>证书 ID，若`enable_https`为`true`，则为必选。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "cert_id")
    private String certId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
