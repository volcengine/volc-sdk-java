package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * IsFriendRes
 */
@lombok.Data
public final class IsFriendRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private IsFriendResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
