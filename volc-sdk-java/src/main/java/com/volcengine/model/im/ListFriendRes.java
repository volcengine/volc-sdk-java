package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * ListFriendRes
 */
@lombok.Data
public final class ListFriendRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListFriendResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
