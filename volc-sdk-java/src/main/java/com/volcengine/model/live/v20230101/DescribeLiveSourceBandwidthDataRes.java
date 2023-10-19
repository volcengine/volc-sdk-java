package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceBandwidthDataRes
 */
@lombok.Data
public final class DescribeLiveSourceBandwidthDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveSourceBandwidthDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveSourceBandwidthDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
