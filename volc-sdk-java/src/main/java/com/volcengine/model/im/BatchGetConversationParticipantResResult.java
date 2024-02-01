package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchGetConversationParticipantResResult
 */
@lombok.Data
public final class BatchGetConversationParticipantResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Participants")
    private List<BatchGetConversationParticipantResResultParticipantsItem> participants;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
