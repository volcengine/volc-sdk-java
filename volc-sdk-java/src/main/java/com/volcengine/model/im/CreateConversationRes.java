package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * CreateConversationRes
 */
@lombok.Data
public final class CreateConversationRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateConversationResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
