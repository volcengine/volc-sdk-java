package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDomainResResultDomainListItem
 */
@lombok.Data
public final class DescribeDomainResResultDomainListItem  {

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推/拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>域名状态。状态说明如下所示。</p>
     *
     * <p>- `0`：正常；</p>
     *
     * <p>- `1`：审核中；</p>
     *
     * <p>- `2`：禁用，禁止使用，此时域名加速不生效；</p>
     *
     * <p>- `3`：删除；</p>
     *
     * <p>- `4`：审核被驳回，审核不通过，需要重新创建并审核；</p>
     *
     * <p>- `5`：欠费关停。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>域名类型，包含两种类型。</p>
     *
     * <p>- `push`：推流域名；</p>
     *
     * <p>- `pull-flv`：拉流域名，包含 RTMP、FLV、HLS 格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>域名加速区域，包含以下类型。</p>
     *
     * <p>- `cn`：中国大陆；</p>
     *
     * <p>- `cn-global`：全球；</p>
     *
     * <p>- `cn-oversea`：海外及港澳台。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>CNAME 状态。</p>
     *
     * <p>- `0`：未配置 CNAME；</p>
     *
     * <p>- `1`：已配置 CNAME。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CnameCheck")
    private Integer cnameCheck;

    /**
     * <p>域名是否可用的状态。</p>
     *
     * <p>- `0`：正常，域名为可用状态；</p>
     *
     * <p>- `1`：配置中，域名为可用状态；</p>
     *
     * <p>- `2`：不可用，域名为其他的不可用状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainCheck")
    private Integer domainCheck;

    /**
     * <p>ICP 备案校验是否通过，是否过期信息。</p>
     *
     * <p>- 1：备案正常，未过期；</p>
     *
     * <p>- 2：查存不到备案信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ICPCheck")
    private Integer iCPCheck;

    /**
     * <p>域名添加时间，RFC3339 格式的 UTC 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>绑定的 HTTPS 证书支持的泛域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomain")
    private String certDomain;

    /**
     * <p>绑定的 HTTPS 证书的证书链 ID 信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>当前域名所属的域名空间下的推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushDomain")
    private String pushDomain;

    /**
     * <p>CNAME 信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CNAME")
    private String cNAME;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
