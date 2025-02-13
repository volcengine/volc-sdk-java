package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveEdgeStatDataRes
 */
@lombok.Data
public final class DescribeLiveEdgeStatDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveEdgeStatDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveEdgeStatDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
