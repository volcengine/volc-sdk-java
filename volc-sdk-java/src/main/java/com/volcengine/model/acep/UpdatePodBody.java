package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdatePodBody
 */
@lombok.Data
public final class UpdatePodBody  {

    /**
     * <p>实例所归属的业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，指定该参数时，仅更新单个实例的属性信息。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>与 `PodIdList`、`TagId` 、`Dc` 参数，必须填一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>自定义实例名称，如不指定，则默认为实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodName")
    private String podName;

    /**
     * <p>自定义镜像 ID。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>- 更新会引起实例重启。</p>
     *
     * <p>- 仅支持从低版本镜像升级为高版本镜像。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>创建实例的用户存储分区大小，即 data 分区容量大小。可选的容量如下：</p>
     *
     *
     *
     * <p>- 4Gi</p>
     *
     * <p>- 8Gi</p>
     *
     * <p>- 16Gi</p>
     *
     * <p>- 32Gi</p>
     *
     * <p>- 64Gi</p>
     *
     * <p>- 128Gi</p>
     *
     * <p>- 256Gi</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `ResourceType` 参数取值为 `100` 时，该 `DataSize` 参数用户可根据支持的可选容量设置。</p>
     *
     * <p>- 当 `ResourceType` 参数取值为 `200` 时，`DataSize` 为默认固定值，无需指定。与套餐的对应关系为: </p>
     *
     * <p>  - `ultimate`: 74Gi</p>
     *
     * <p>  - `enhanced`：37Gi</p>
     *
     * <p>  - `common`：24Gi</p>
     *
     * <p>  - `sample`：18Gi</p>
     *
     * <p>  - `basic`：14Gi</p>
     *
     * <p>  - `elementary`：12Gi</p>
     *
     * <p>- 容量大小和单位不可自定义。</p>
     *
     * <p>- 建议您在调用时，结合实际业务情况，按需填写存储大小。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataSize")
    private String dataSize;

    /**
     * <p>云手机实例规格 ID，取值如下：</p>
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
     * <p>本地存储方案除上述 12 种规格外，还包含以下 6 个取值：</p>
     *
     *
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
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>需要在关机状态下执行，实例重启后更新生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

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
     *
     *
     * <p>:::warning</p>
     *
     * <p>- 需要在关机状态下执行，实例重启后更新生效。</p>
     *
     * <p>- 如未指定屏幕布局 ID，当运行资源套餐 `ConfigurationCode` 为</p>
     *
     * <p>入门型 `sample` ，云手机实例将会使用 720P 和 30fps 的默认配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>实例 ID 列表，指定该参数时，批量更新多个实例的属性信息。批量操作的最大实例数量为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>实例标签 ID，指定该参数时，批量更新已添加该分组标签的所有实例的属性信息，批量操作的最大实例数量为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagId")
    private String tagId;

    /**
     * <p>实例机房，指定该参数时，批量更新属于该机房的所有实例的属性信息，批量操作的最大实例数量为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>是否可在开机状态下强制更新实例镜像，取值如下：</p>
     *
     *
     *
     * <p>- `true`：可强制执行更新（会触发实例重启）</p>
     *
     * <p>	</p>
     *
     * <p>- `false`：（默认）不可强制执行更新</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Force")
    private Boolean force;

    /**
     * <p>实例上行带宽上限，单位为 Mbps；如设置为 0，则不限速。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpBandwidthLimit")
    private Integer upBandwidthLimit;

    /**
     * <p>实例下行带宽上限，单位为 Mbps；如设置为 0，则不限速。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownBandwidthLimit")
    private Integer downBandwidthLimit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
