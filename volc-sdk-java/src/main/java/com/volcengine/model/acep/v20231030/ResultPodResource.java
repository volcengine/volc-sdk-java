package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultPodResource
 */
@lombok.Data
public final class ResultPodResource  {

    /**
     * <p>机房 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>大区英文 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>已订购实例总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyNum")
    private Integer applyNum;

    /**
     * <p>实例资源到期时间。</p>
     *
     *
     *
     * <p>- 预付费模式：该资源组最早到期时间，unix 时间戳</p>
     *
     * <p>- 后付费模式：0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireAt")
    private Long expireAt;

    /**
     * <p>已预热完成实例总数。需在请求参数中指定 ImageId。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadyNum")
    private Integer readyNum;

    /**
     * <p>已创建实例总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalNum")
    private Integer totalNum;

    /**
     * <p>已开机实例总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlineNum")
    private Integer onlineNum;

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

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
     * <p>已创建实例数据分区总容量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDataSize")
    private Integer totalDataSize;

    /**
     * <p>实例资源套餐 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
