package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceStreamMetricsRes
 */
@lombok.Data
public final class DescribeLiveSourceStreamMetricsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveSourceStreamMetricsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveSourceStreamMetricsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
