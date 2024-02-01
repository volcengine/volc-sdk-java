package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchModifyConversationParticipantRes
 */
@lombok.Data
public final class BatchModifyConversationParticipantRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchModifyConversationParticipantResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
