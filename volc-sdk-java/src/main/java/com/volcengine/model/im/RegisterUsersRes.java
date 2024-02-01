package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * RegisterUsersRes
 */
@lombok.Data
public final class RegisterUsersRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>空。此接口无需关注。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private RegisterUsersResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
