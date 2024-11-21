package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAddOnTagRes
 */
@lombok.Data
public final class GetImageAddOnTagRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageAddOnTagResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageAddOnTagResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
