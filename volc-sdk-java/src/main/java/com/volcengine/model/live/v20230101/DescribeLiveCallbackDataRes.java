package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveCallbackDataRes
 */
@lombok.Data
public final class DescribeLiveCallbackDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveCallbackDataResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveCallbackDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
