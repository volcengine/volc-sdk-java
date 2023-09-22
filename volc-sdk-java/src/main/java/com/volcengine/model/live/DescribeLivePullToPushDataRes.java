package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePullToPushDataRes
 */
@lombok.Data
public final class DescribeLivePullToPushDataRes {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLivePullToPushDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLivePullToPushDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
