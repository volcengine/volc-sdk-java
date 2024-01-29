package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXEdgeRequestBandwidthResResultBpsDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXEdgeRequestBandwidthResResultBpsDataItemDataItem  {

    /**
     * <p>统计时间点，时间片开始时刻，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>带宽，单位为 bps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
