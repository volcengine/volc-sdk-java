package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveMetricTrafficDataRes
 */
@lombok.Data
public final class DescribeLiveMetricTrafficDataRes {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveMetricTrafficDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveMetricTrafficDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
