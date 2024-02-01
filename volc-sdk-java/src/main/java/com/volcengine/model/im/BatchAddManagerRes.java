package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchAddManagerRes
 */
@lombok.Data
public final class BatchAddManagerRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchAddManagerResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
