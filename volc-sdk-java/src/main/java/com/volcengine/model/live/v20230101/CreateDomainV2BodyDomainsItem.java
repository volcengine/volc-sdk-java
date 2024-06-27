package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateDomainV2BodyDomainsItem
 */
@lombok.Data
public final class CreateDomainV2BodyDomainsItem  {

    /**
     * <p>域名名称，域名由字母（A - Z、a -z）、数字（0 - 9）和连字符（-） 组成，长度为 1 到 60 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainName")
    private String domainName;

    /**
     * <p>HTTPS 证书链 ID，默认为空表示不为域名绑定 HTTPS 证书。您可以调用 [ListCertV2](https://www.volcengine.com/docs/6469/1126823) 接口或在视频直播控制台的[证书管理](https://console.volcengine.com/live/main/certificate)页面，获取待绑定的证书链 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>域名类型，取值及含义如下所示。</p>
     *
     * <p>- `push`：推流域名；</p>
     *
     * <p>- `pull-flv`：拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>域名加速区域，取值及含义如下所示。</p>
     *
     * <p>- `cn`：中国内地加速；</p>
     *
     * <p>- `cn-global`：全球加速；</p>
     *
     * <p>- `cn-oversea`：海外及港澳台加速。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
