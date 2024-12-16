package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTopPlayDataRes
 */
@lombok.Data
public final class DescribeLiveTopPlayDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveTopPlayDataResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveTopPlayDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
