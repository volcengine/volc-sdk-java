package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchStreamTranscodeDataRes
 */
@lombok.Data
public final class DescribeLiveBatchStreamTranscodeDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveBatchStreamTranscodeDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveBatchStreamTranscodeDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
