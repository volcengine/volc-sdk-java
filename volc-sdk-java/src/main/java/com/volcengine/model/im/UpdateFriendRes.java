package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * UpdateFriendRes
 */
@lombok.Data
public final class UpdateFriendRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateFriendResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
