package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTranscodeInfoDataRes
 */
@lombok.Data
public final class DescribeLiveTranscodeInfoDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveTranscodeInfoDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveTranscodeInfoDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
