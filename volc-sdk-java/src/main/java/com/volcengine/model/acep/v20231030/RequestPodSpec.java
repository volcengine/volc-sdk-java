package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * RequestPodSpec
 */
@lombok.Data
public final class RequestPodSpec  {

    /**
     * <p>机房 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>自定义dns id，custom_route_id不为空时，该参数必填，其余情况为选填</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSId")
    private String dNSId;

    /**
     * <p>创建完成后是否立即启动。取值如下：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：（默认）否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Start")
    private Boolean start;

    /**
     * <p>自定义标签。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagId")
    private String tagId;

    /**
     * <p>云机 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>镜像 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>实例名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodName")
    private String podName;

    /**
     * <p>创建实例数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyNum")
    private Long applyNum;

    /**
     * <p>创建实例的用户存储分区大小。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataSize")
    private String dataSize;

    /**
     * <p>- 支持配置白名单IP，对白名单IP不限速。同时对pod访问的其他IP进行整体限速,','分割</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPWhiteList")
    private String iPWhiteList;

    /**
     * <p>自定义路由id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CustomRouteId")
    private String customRouteId;

    /**
     * <p>屏幕布局。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>实例初始化系统属性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlayProperty")
    private List<RequestSystemProperty> overlayProperty;

    /**
     * <p>实例初始化 Settings 属性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlaySettings")
    private List<RequestSettings> overlaySettings;

    /**
     * <p>实例上行带宽上限，单位为 Mbps；如设置为0，则不限速。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpBandwidthLimit")
    private Integer upBandwidthLimit;

    /**
     * <p>运行资源的套餐规格 ID，取值如下：</p>
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
     * <p>本地存储方案除上述 12 种规格外，还包含以下 6 个取值：</p>
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
     * <p>实例下行带宽上限，单位为 Mbps；如设置为 0，则不限速。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownBandwidthLimit")
    private Integer downBandwidthLimit;

    /**
     * <p>端口映射规则 ID 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleIdList")
    private List<String> portMappingRuleIdList;

    /**
     * <p>实例初始化系统属性，持久化。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlayPersistProperty")
    private List<RequestSystemProperty> overlayPersistProperty;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
