package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListDcQuery
 */
@lombok.Data
public final class ListDcQuery  {

    /**
     * <p>业务 ID。您可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>机房所在的大区 ID。</p>
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
     * <p>网络运营商。取值如下：</p>
     *
     *
     *
     * <p>- `1`：移动</p>
     *
     * <p>- `2`：联通</p>
     *
     * <p>- `4`：电信</p>
     *
     * <p>- `7`：移动&联通&电信</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private Integer isp;

    /**
     * <p>分页偏移量。默认为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>分页大小。不指定会返回所有机房。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

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
     * <p>资源所在的物理区域，包含以下选项：</p>
     *
     *
     *
     * <p>- `inner`：中国大陆（默认值）</p>
     *
     * <p>- `cn-hongkong-pop`：中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcRegion")
    private String volcRegion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
