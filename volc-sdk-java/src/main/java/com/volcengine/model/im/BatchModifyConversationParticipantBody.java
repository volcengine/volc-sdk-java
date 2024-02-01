package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchModifyConversationParticipantBody
 */
@lombok.Data
public final class BatchModifyConversationParticipantBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>执行修改群成员信息操作人的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Operator")
    private Long operator;

    /**
     * <p>群成员信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantInfos")
    private List<BatchModifyConversationParticipantBodyParticipantInfosItem> participantInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
