package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePushStreamCountDataRes
 */
@lombok.Data
public final class DescribeLivePushStreamCountDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLivePushStreamCountDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLivePushStreamCountDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
