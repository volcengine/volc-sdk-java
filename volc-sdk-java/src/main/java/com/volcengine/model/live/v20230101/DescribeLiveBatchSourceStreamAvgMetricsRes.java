package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchSourceStreamAvgMetricsRes
 */
@lombok.Data
public final class DescribeLiveBatchSourceStreamAvgMetricsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveBatchSourceStreamAvgMetricsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveBatchSourceStreamAvgMetricsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
