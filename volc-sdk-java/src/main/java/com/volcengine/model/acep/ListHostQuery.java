package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListHostQuery
 */
@lombok.Data
public final class ListHostQuery  {

    /**
     * <p>业务 ID。可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>云机 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>云机 ID 列表。多个云机 ID 使用英文 `,` 分隔。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostIdList")
    private String hostIdList;

    /**
     * <p>实例 ID。可通过调用 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>云机状态列表。多个云机状态使用英文 `,` 分隔。取值如下：</p>
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
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusList")
    private String statusList;

    /**
     * <p>机房 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>云机所在的大区 ID。</p>
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
     * <p>云手机实例规格 ID。取值如下：</p>
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
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

    /**
     * <p>资源所在的物理区域，包含以下选项：</p>
     *
     *
     *
     * <p>`inner`：中国大陆（默认值）</p>
     *
     * <p>`cn-hongkong-pop`：中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcRegion")
    private String volcRegion;

    /**
     * <p>资源 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceSetId")
    private String resourceSetId;

    /**
     * <p>云机运维授权状态：</p>
     *
     * <p>- `1`：未授权；</p>
     *
     * <p>- `2`：已授权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthorityStatus")
    private Integer authorityStatus;

    /**
     * <p>分页偏移量，默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>分页大小，默认值为 10，最大值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
