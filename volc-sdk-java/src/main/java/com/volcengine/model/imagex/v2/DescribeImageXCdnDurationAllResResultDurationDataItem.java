package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnDurationAllResResultDurationDataItem
 */
@lombok.Data
public final class DescribeImageXCdnDurationAllResResultDurationDataItem  {

    /**
     * <p>网络耗时，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    /**
     * <p>上报数据量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>当`GroupBy`取值`Region`时出现，表示地区信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>当`GroupBy`取值`Region`时出现，表示地区类型。</p>
     *
     * <p>* `Country`表示国家。</p>
     *
     * <p>* `Province`表示省份。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionType")
    private String regionType;

    /**
     * <p>当`GroupBy`取值`Domain`时出现，则表示域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>当`GroupBy`取值`Isp`时出现，则表示运营商信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private String isp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
