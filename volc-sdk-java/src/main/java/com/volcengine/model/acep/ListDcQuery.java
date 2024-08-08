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
     * <p>资源所在大区。取值如下：</p>
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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
