package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * UnRegisterUsersRes
 */
@lombok.Data
public final class UnRegisterUsersRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>空。此接口无需关注</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UnRegisterUsersResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
