package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetConversationUserCountRes
 */
@lombok.Data
public final class GetConversationUserCountRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetConversationUserCountResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
