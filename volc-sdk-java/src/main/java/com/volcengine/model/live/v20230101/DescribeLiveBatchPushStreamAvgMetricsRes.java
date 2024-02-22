package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchPushStreamAvgMetricsRes
 */
@lombok.Data
public final class DescribeLiveBatchPushStreamAvgMetricsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveBatchPushStreamAvgMetricsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveBatchPushStreamAvgMetricsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
