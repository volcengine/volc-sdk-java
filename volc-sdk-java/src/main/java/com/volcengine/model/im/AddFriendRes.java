package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * AddFriendRes
 */
@lombok.Data
public final class AddFriendRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private AddFriendResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
