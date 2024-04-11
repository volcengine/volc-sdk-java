package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePushStreamInfoDataRes
 */
@lombok.Data
public final class DescribeLivePushStreamInfoDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLivePushStreamInfoDataResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLivePushStreamInfoDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
