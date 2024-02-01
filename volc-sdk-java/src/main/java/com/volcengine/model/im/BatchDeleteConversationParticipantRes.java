package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchDeleteConversationParticipantRes
 */
@lombok.Data
public final class BatchDeleteConversationParticipantRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchDeleteConversationParticipantResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
