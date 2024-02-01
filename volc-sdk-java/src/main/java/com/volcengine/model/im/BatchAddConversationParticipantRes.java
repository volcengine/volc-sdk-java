package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchAddConversationParticipantRes
 */
@lombok.Data
public final class BatchAddConversationParticipantRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchAddConversationParticipantResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
