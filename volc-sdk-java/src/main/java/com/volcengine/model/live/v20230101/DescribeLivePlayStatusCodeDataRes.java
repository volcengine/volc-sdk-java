package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePlayStatusCodeDataRes
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLivePlayStatusCodeDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLivePlayStatusCodeDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
