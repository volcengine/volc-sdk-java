package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceSubscriptionRes
 */
@lombok.Data
public final class GetImageServiceSubscriptionRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageServiceSubscriptionResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageServiceSubscriptionResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
