package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetConversationMarksRes
 */
@lombok.Data
public final class GetConversationMarksRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetConversationMarksResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
