package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * DetailHostResResult
 */
@lombok.Data
public final class DetailHostResResult  {

    /**
     * <p>云机所属账号 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    /**
     * <p>云机所属业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>云机 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>云机状态。取值如下：</p>
     *
     *
     *
     * <p>- `0`：初始化</p>
     *
     * <p>- `1`：正常</p>
     *
     * <p>- `2`：退订中</p>
     *
     * <p>- `3`：异常</p>
     *
     * <p>- `4`：重置中</p>
     *
     * <p>- `5`：重启中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>云机所在大区 ID。包含以下取值：</p>
     *
     *
     *
     * <p>- `cn-north`：中国大陆华北</p>
     *
     * <p>- `cn-south`：中国大陆华南</p>
     *
     * <p>- `cn-east`：中国大陆华东</p>
     *
     * <p>- `cn-middle`：中国大陆华中</p>
     *
     * <p>- `cn-southwest`：中国大陆西南</p>
     *
     * <p>- `cn-hongkong-pop`中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>云机所在机房。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>云机上的实例规格 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

    /**
     * <p>云机上的实例规格名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationName")
    private String configurationName;

    /**
     * <p>云机规格。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerTypeCode")
    private String serverTypeCode;

    /**
     * <p>云机上的实例 ID 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>云机绑定的资源组 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceSetId")
    private String resourceSetId;

    /**
     * <p>云机的计费类型。取值如下：</p>
     *
     *
     *
     * <p>- `pod_pre_monthly`：实例预付费月结</p>
     *
     * <p>- `pod_post_daily`：实例后付费日结</p>
     *
     * <p>- `host_pre_monthly`：云机预付费月结</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChargeType")
    private String chargeType;

    /**
     * <p>云机的创建时间，Unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    /**
     * <p>云机的到期时间，Unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireAt")
    private Long expireAt;

    /**
     * <p>云机上已创建的实例数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodNumOnHost")
    private Integer podNumOnHost;

    /**
     * <p>云机上总共可以创建的实例数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodNumAvailable")
    private Integer podNumAvailable;

    /**
     * <p>资源所在物理区域，包含以下取值：</p>
     *
     * <p>- `inner`：中国大陆</p>
     *
     * <p>- `cn-hongkong-pop`：中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcRegion")
    private String volcRegion;

    /**
     * <p>云机运维授权过期时间，unix 时间戳，若为 0 则代表未授权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthorityExpireTime")
    private Long authorityExpireTime;

    /**
     * <p>云机运维授权状态：</p>
     *
     * <p>- `1`：未授权；</p>
     *
     * <p>- `2`：已授权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthorityStatus")
    private Integer authorityStatus;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
