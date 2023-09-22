package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveMetricBandwidthDataRes
 */
@lombok.Data
public final class DescribeLiveMetricBandwidthDataRes {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveMetricBandwidthDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveMetricBandwidthDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
