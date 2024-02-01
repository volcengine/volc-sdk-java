package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchRemoveManagerRes
 */
@lombok.Data
public final class BatchRemoveManagerRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchRemoveManagerResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
