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
     * <p>实例所属机房所在的大区 ID。如果指定，则在指定大区内随机分配机房进行实例订购。</p>
     *
     *
     *
     * <p>- 当资源所在区域选择中国大陆，即 `VolcRegion` 设置为 `inner` 时，该参数可选值包含：</p>
     *
     * <p>	- `cn-north`：华北</p>
     *
     * <p>	- `cn-south`：华南</p>
     *
     * <p>	- `cn-east`：华东</p>
     *
     * <p>	- `cn-middle`：华中</p>
     *
     * <p>	- `cn-southwest`：西南</p>
     *
     * <p>- 当资源所在区域选择中国香港，即 `VolcRegion` 设置为 `cn-hongkong-pop` 时，该参数可选值为 `cn-hongkong-pop`。</p>
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
     *
     * <p>:::warning</p>
     *
     * <p>- 查询结果存在延迟，最长约为 7min 左右。</p>
     *
     * <p>- 返回结果为调用接口前最后一次数据库刷新的数据，而非实时数据。如果在最后一次数据库刷新之后至本次接口调用期间有新的实例被创建，这些新实例将不会被包含在返回的结果中。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalNum")
    private Integer totalNum;

    /**
     * <p>- 云盘存储：已开机的实例总数。</p>
     *
     * <p>- 本地存储：已创建的实例总数。</p>
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
     * <p>- `inner`：中国大陆（默认值）</p>
     *
     * <p>- `cn-hongkong-pop`：中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcRegion")
    private String volcRegion;

    /**
     * <p>已创建实例数据分区总容量，单位 GB。</p>
     *
     * <p>:::warning</p>
     *
     * <p>- 查询结果存在延迟，最长约为 7min 左右。</p>
     *
     * <p>- 返回结果为调用接口前最后一次数据库刷新的数据，而非实时数据。如果在最后一次数据库刷新之后至本次接口调用期间有新的实例被创建，这些新实例的数据将不会被包含在返回的结果中。</p>
     *
     * <p>:::</p>
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
