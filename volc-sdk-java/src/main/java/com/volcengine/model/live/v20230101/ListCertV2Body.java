package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCertV2Body
 */
@lombok.Data
public final class ListCertV2Body  {

    /**
     * <p>是否启用证书，默认值为 true，支持的取值包括：</p>
     *
     * <p>- true：启用证书；</p>
     *
     * <p>- false：禁用证书。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Available")
    private Boolean available;

    /**
     * <p>域名，查询该域名对应的证书，支持精确查询</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>证书是否过期，默认值为 false，支持的取值包括：</p>
     *
     * <p>- false：表示证书未过期；</p>
     *
     * <p>- true：表示证书已过期。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查看证书是否过期时，必须同时传入 Available 参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Expiring")
    private Boolean expiring;

    /**
     * <p>证书名称，支持输入证书名称中的关键字，进行模糊查询</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
