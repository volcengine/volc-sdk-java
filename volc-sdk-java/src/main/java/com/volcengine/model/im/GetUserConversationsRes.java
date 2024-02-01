package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetUserConversationsRes
 */
@lombok.Data
public final class GetUserConversationsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetUserConversationsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
