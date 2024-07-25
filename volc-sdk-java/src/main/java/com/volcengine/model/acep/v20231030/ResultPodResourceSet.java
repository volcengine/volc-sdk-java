package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultPodResourceSet
 */
@lombok.Data
public final class ResultPodResourceSet  {

    /**
     * <p>机房，资源不分机房时为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>订购实例的租期：</p>
     *
     *
     *
     * <p>- 预付费模式：租期数，单位：月</p>
     *
     * <p>- 后付费模式：0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Term")
    private Integer term;

    /**
     * <p>资源所在大区，资源不分大区时为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>已订购实例总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyNum")
    private Long applyNum;

    /**
     * <p>到期时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireAt")
    private Long expireAt;

    /**
     * <p>业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>资源计费模式，取值如下：</p>
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
     * <p>资源所在的物理区域，包含以下值：</p>
     *
     *
     *
     * <p>- inner：中国大陆（默认值）</p>
     *
     * <p>- cn-hongkong-pop：中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcRegion")
    private String volcRegion;

    /**
     * <p>资源组 ID，对应交易子订单号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceSetId")
    private String resourceSetId;

    /**
     * <p>实例规格 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
