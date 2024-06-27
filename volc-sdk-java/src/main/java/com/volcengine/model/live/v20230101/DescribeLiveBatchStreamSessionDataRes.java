package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchStreamSessionDataRes
 */
@lombok.Data
public final class DescribeLiveBatchStreamSessionDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveBatchStreamSessionDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveBatchStreamSessionDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
