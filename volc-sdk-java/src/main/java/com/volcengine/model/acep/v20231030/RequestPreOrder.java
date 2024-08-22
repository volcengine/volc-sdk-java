package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * RequestPreOrder
 */
@lombok.Data
public final class RequestPreOrder  {

    /**
     * <p>实例所属机房。如果指定，则在订购指定机房中的实例。</p>
     *
     * <p>:::warning</p>
     *
     * <p>`Dc` 和 `Region` 至少需要指定一个值，`Dc` 优先级高于 `Region`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>订购实例的租期，单位为月，默认值为 1。例如：“1.10 - 2.10” 为 1 个月租期。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Term")
    private Integer term;

    /**
     * <p>实例所属机房所在的大区 ID。如果指定，则在指定大区内随机分配机房进行实例订购。</p>
     *
     * <p>- 当资源所在区域选择中国大陆，即 `VolcRegion` 设置为 `inner` 时，该参数可选值包含：</p>
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
     * <p>- 当资源所在区域选择中国香港，即 `VolcRegion` 设置为 `cn-hongkong-pop` 时，该参数可选值为 `cn-hongkong-pop`。</p>
     *
     * <p>:::warning</p>
     *
     * <p>`Dc` 和 `Region` 至少需要指定一个值，`Dc` 优先级高于 `Region`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>自定义镜像 ID，如不指定，则默认使用平台提供的官方标准镜像。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>本次订购期望增加的数量。对于云盘存储方案，本参数指实例资源；对于本地存储方案，本参数指云机资源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyNum")
    private Long applyNum;

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
     * <p>资源所在的物理区域，包含以下选项：</p>
     *
     * <p>- `inner`：中国大陆（默认值）</p>
     *
     * <p>- `cn-hongkong-pop`：中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcRegion")
    private String volcRegion;

    /**
     * <p>是否自动创建实例，取值如下：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：（默认）否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoCreatePod")
    private Boolean autoCreatePod;

    /**
     * <p>云机规格。包含以下取值：</p>
     *
     * <p>- `g2.8c12g`：8vCPU｜12G内存｜128G存储</p>
     *
     * <p>- `g2.8c16g.basic`：8vCPU｜16G内存｜128G存储</p>
     *
     * <p>- `g2.8c16g.plus`：8vCPU｜16G内存｜256G存储</p>
     *
     *
     *
     * <p>可调用 [ListConfiguration](https://www.volcengine.com/docs/6394/1262346) 接口查询。</p>
     *
     * <p>> 该参数适用于本地存储方案，云盘存储无需关注。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerTypeCode")
    private String serverTypeCode;

    /**
     * <p>屏幕布局，全局屏幕配置；可通过调用 [ListDisplayLayoutMini](https://www.volcengine.com/docs/6394/1221495) 接口获取；可选的系统屏幕布局 ID 包括：</p>
     *
     *
     *
     * <p>- `single-display-landscape`</p>
     *
     * <p>- `single-display-portrait`</p>
     *
     * <p>- `single-display-portrait-720p`</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如未指定屏幕布局 ID，当运行资源套餐 `ConfigurationCode` 为入门型 `sample` ，云手机实例将会使用 720P 和 30fps 的默认配置。</p>
     *
     * <p>- 该参数适用于本地存储方案，云盘存储无需关注。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>云机上运行的实例资源规格 ID，取值如下：</p>
     *
     *
     *
     * <p>- `ultimate`：旗舰型</p>
     *
     * <p>- `enhanced`：加强型</p>
     *
     * <p>- `common`：通用型</p>
     *
     * <p>- `sample`：入门型</p>
     *
     * <p>- `basic`：基础型</p>
     *
     * <p>- `elementary`：低配型</p>
     *
     * <p>- `ultimatePlus`：旗舰型Plus</p>
     *
     * <p>- `enhancedPlus`：加强型Plus</p>
     *
     * <p>- `commonPlus`：通用型Plus</p>
     *
     * <p>- `samplePlus`：入门型Plus</p>
     *
     * <p>- `basicPlus`：基础型Plus</p>
     *
     * <p>- `elementaryPlus`：低配型Plus</p>
     *
     *
     *
     * <p>对于本地存储方案，除上述 12 种规格外，还包含以下 6 种规格：</p>
     *
     * <p>- `ultimatePro`：旗舰型Pro</p>
     *
     * <p>- `enhancedPro`：加强型Pro</p>
     *
     * <p>- `commonPro`：通用型Pro</p>
     *
     * <p>- `samplePro`：入门型Pro</p>
     *
     * <p>- `basicPro`：基础型Pro</p>
     *
     * <p>- `elementaryPro`：低配型Pro</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
