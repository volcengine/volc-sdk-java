package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListPodQuery
 */
@lombok.Data
public final class ListPodQuery  {

    /**
     * <p>实例所属业务 ID。可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>筛选条件，实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>云手机实例规格 ID 列表。可选项为：</p>
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
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCodeList")
    private String configurationCodeList;

    /**
     * <p>筛选条件，区域 ID 列表。多个 ID 以英文逗号分隔。可选项为：</p>
     *
     *
     *
     * <p>- `cn-north`：华北</p>
     *
     * <p>- `cn-south`：华南</p>
     *
     * <p>- `cn-east`：华东</p>
     *
     * <p>- `cn-middle`：华中</p>
     *
     * <p>- `cn-southwest`：西南</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private String regionList;

    /**
     * <p>筛选条件，集群 ID 列表，多个机房 ID 列表以英文逗号 `,` 分隔。可通过调用 [ListDc](https://www.volcengine.com/docs/6394/1221465) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DcList")
    private String dcList;

    /**
     * <p>筛选条件，标签 ID 列表，多个 ID 以英文逗号分隔。可通过调用 [ListTag](https://www.volcengine.com/docs/6394/1221497) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagIdList")
    private String tagIdList;

    /**
     * <p>筛选条件，实例运行状态列表。多个状态值以英文逗号 `,` 分隔。可选项为：</p>
     *
     *
     *
     * <p>- `0`：开机中</p>
     *
     * <p>- `1`：开机完成</p>
     *
     * <p>- `2`：关机完成</p>
     *
     * <p>- `3`：关机中</p>
     *
     * <p>- `4`：重启中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlineList")
    private String onlineList;

    /**
     * <p>筛选条件，实例推流状态列表。多个状态值以英文逗号 `,` 分隔。可选项为：</p>
     *
     *
     *
     * <p>- `0`：空闲</p>
     *
     * <p>- `1`：推流中</p>
     *
     * <p>- `2`：就绪</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamStatusList")
    private String streamStatusList;

    /**
     * <p>筛选条件，实例 ID 列表。多个 ID 以英文逗号 `,` 分隔。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private String podIdList;

    /**
     * <p>筛选条件，运维授权状态：</p>
     *
     *
     *
     * <p>- `1`：未授权</p>
     *
     * <p>- `2`：已授权</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthorityStatus")
    private Integer authorityStatus;

    /**
     * <p>区域 ID 列表。可通过调用 [ListDc](https://www.volcengine.com/docs/6394/1221465) 接口获取，也就是返回的 `Zone` 参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ZoneId")
    private String zoneId;

    /**
     * <p>云机规格。包含以下取值：</p>
     *
     *
     *
     * <p>- `g2.8c12g`：8vCPU｜12G内存｜128G存储</p>
     *
     * <p>- `g2.8c16g.basic`：8vCPU｜16G内存｜128G存储</p>
     *
     * <p>- `g2.8c16g.plus`：8vCPU｜16G内存｜256G存储</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerTypeCode")
    private String serverTypeCode;

    /**
     * <p>云机 ID。可通过 [ListHost](https://www.volcengine.com/docs/6394/1221480) 接口获取。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>当 `ResourceType` 参数取值为 `200` 本地存储时，该参数才有效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>筛选条件, 自定义dns id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSId")
    private String dNSId;

    /**
     * <p>分页偏移量。默认值为 0。</p>
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
