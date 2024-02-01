package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchGetUserRes
 */
@lombok.Data
public final class BatchGetUserRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchGetUserResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
