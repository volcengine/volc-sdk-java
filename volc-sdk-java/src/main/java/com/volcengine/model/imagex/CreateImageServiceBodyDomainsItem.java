package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageServiceBodyDomainsItem
 */
@lombok.Data
public final class CreateImageServiceBodyDomainsItem  {

    /**
     * <p>待绑定的已备案域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>待绑定的证书 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertID")
    private String certID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
