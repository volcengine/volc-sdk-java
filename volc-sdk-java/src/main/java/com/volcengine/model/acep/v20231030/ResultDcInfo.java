package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultDcInfo
 */
@lombok.Data
public final class ResultDcInfo  {

    /**
     * <p>机房 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

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
     * <p>机房所属的区域 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>相同区域内的机房共享存储资源池。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Zone")
    private String zone;

    /**
     * <p>机房名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DcName")
    private String dcName;

    /**
     * <p>机房类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DcType")
    private String dcType;

    /**
     * <p>中国大陆内资源所在区域。包含以下值：</p>
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
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>机房所在城市纬度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Latitude")
    private Double latitude;

    /**
     * <p>机房所在城市经度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Longitude")
    private Double longitude;

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
     * <p>云机规格。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerTypeCode")
    private String serverTypeCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
