package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientLoadDurationAllResResultDurationDataItem
 */
@lombok.Data
public final class DescribeImageXClientLoadDurationAllResResultDurationDataItem  {

    /**
     * <p>当`GroupBy`取值`Region`时出现，表示地区信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>当`GroupBy`取值`Region`时出现，表示地区类型。</p>
     *
     * <p>* `Country`：国家。</p>
     *
     * <p>* `Province`：省份。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionType")
    private String regionType;

    /**
     * <p>当`GroupBy`取值`Isp`时出现，则表示运营商信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private String isp;

    /**
     * <p>当`GroupBy`取值`Domain`时出现，则表示域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>加载耗时，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    /**
     * <p>上报数据量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
