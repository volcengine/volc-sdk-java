package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTranscodeDataRes
 */
@lombok.Data
public final class DescribeLiveTranscodeDataRes {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveTranscodeDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveTranscodeDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
