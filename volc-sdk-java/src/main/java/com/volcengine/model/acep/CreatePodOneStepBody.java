package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * CreatePodOneStepBody
 */
@lombok.Data
public final class CreatePodOneStepBody  {

    /**
     * <p>实例所归属的业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>自定义实例名称，如不指定，则默认为实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodName")
    private String podName;

    /**
     * <p>自定义镜像 ID，如不指定，则默认使用平台提供的官方标准镜像。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>云手机实例规格 ID，可选项为：</p>
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

    /**
     * <p>创建实例的用户存储分区大小，即 data 分区容量大小，可选的容量如下：</p>
     *
     *
     *
     * <p>- 4Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 8Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 16Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 32Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 64Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 128Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 256Gi</p>
     *
     * <p>	</p>
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
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataSize")
    private String dataSize;

    /**
     * <p>机房 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>屏幕布局，全局屏幕配置；可通过调用 [ListDisplayLayoutMini](https://www.volcengine.com/docs/6394/1221495) 接口获取；可选的系统屏幕布局 ID 包括：</p>
     *
     *
     *
     * <p>- `single-display-landscape`</p>
     *
     * <p>	</p>
     *
     * <p>- `single-display-portrait`</p>
     *
     * <p>	</p>
     *
     * <p>- `single-display-portrait-720p`</p>
     *
     * <p>	</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>如未指定屏幕布局 ID，当运行资源套餐 `ConfigurationCode` 为 </p>
     *
     * <p>入门型 `sample` ，云手机实例将会使用 720P 和 30fps 的默认配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>实例初始化 Settings 属性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlaySettings")
    private List<com.volcengine.model.acep.v20231030.RequestSettings> overlaySettings;

    /**
     * <p>实例初始化系统属性，非持久化，立即生效，重启实例后失效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlayProperty")
    private List<com.volcengine.model.acep.v20231030.RequestSystemProperty> overlayProperty;

    /**
     * <p>实例初始化系统属性，持久化，重启实例后生效。</p>
     *
     *
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>适用于只读系统属性，或 AOSP 原生非持久化的系统属性的修改，如 ro.product.model</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlayPersistProperty")
    private List<com.volcengine.model.acep.v20231030.RequestSystemProperty> overlayPersistProperty;

    /**
     * <p>自定义标签。支持中英文、数字、点号、下划线或中划线，以大小写字母或者中文开头。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagId")
    private String tagId;

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

    /**
     * <p>创建实例后，需要安装的应用列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppList")
    private List<com.volcengine.model.acep.v20231030.RequestAppInfo> appList;

    /**
     * <p>端口映射规则 ID 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleIdList")
    private List<String> portMappingRuleIdList;

    /**
     * <p>云机 ID。可通过 [ListHost](https://www.volcengine.com/docs/6394/1221480) 接口获取。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>当 `ResourceType` 参数取值为 `200` 本地存储时，该参数才有效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>实例资源类型，取值如下：</p>
     *
     *
     *
     * <p>- `100`：云盘存储</p>
     *
     * <p>- `200`：本地存储</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceType")
    private Integer resourceType;

    /**
     * <p>是否为预安装应用, 默认false: 非安装应用, 应用保存在/data/app目录; true: 预安装应用, 应用保存在/data/overlay_app目录</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsPreinstall")
    private Boolean isPreinstall;

    /**
     * <p>机型参数名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PropertyRuleName")
    private String propertyRuleName;

    /**
     * <p>是否使用机型参数组，1：使用，2：不使用，默认为不使用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UsePropertyRule")
    private Integer usePropertyRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
