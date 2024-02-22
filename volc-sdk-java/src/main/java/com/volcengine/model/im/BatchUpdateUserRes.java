package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchUpdateUserRes
 */
@lombok.Data
public final class BatchUpdateUserRes {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchUpdateUserResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
