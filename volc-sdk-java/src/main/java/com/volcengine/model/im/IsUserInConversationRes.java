package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * IsUserInConversationRes
 */
@lombok.Data
public final class IsUserInConversationRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private IsUserInConversationResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
