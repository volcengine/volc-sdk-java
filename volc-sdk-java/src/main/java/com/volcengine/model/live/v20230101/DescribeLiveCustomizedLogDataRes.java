package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveCustomizedLogDataRes
 */
@lombok.Data
public final class DescribeLiveCustomizedLogDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveCustomizedLogDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveCustomizedLogDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
