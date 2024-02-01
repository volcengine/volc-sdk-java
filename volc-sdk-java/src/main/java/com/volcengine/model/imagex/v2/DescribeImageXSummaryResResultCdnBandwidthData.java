package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSummaryResResultCdnBandwidthData
 */
@lombok.Data
public final class DescribeImageXSummaryResResultCdnBandwidthData  {

    /**
     * <p>当月带宽用量，单位为：bps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
