package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListDomainDetailResResultDomainListItem
 */
@lombok.Data
public final class ListDomainDetailResResultDomainListItem  {

    /**
     * <p>域名空间名称。</p>
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
     * <p>- 0：正常；</p>
     *
     * <p>- 1：审核中；</p>
     *
     * <p>- 2：禁用，禁止使用，此时 domain 不生效；</p>
     *
     * <p>- 3：删除；</p>
     *
     * <p>- 4：审核被驳回。审核不通过，需要重新创建并审核；</p>
     *
     * <p>- 5：欠费关停。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>域名类型，包含两种类型。</p>
     *
     * <p>- push：推流域名；</p>
     *
     * <p>- pull-flv：拉流域名，包含 RTMP、FLV、HLS 格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>区域，包含 4 种类型。</p>
     *
     * <p>- cn：中国大陆；</p>
     *
     * <p>- cn-global：全球；</p>
     *
     * <p>- cn-oversea：海外及港澳台。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>CNAME 信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CName")
    private String cName;

    /**
     * <p>CNAME 状态。</p>
     *
     * <p>- 0：未配置 CNAME；</p>
     *
     * <p>- 1：已配置 CNAME。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CnameCheck")
    private Integer cnameCheck;

    /**
     * <p>域名是否可用的状态。</p>
     *
     * <p>- 0：正常，域名为可用状态；</p>
     *
     * <p>- 1：配置中，域名为可用状态；</p>
     *
     * <p>- 2：不可用，域名为其他的不可用状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainCheck")
    private Integer domainCheck;

    /**
     * <p>IPC 备案校验是否通过，是否过期信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ICPCheck")
    private Integer iCPCheck;

    /**
     * <p>创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>所绑定证书支持的泛域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomain")
    private String certDomain;

    /**
     * <p>绑定的证书信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>绑定的推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushDomain")
    private String pushDomain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
