package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchDeleteConversationParticipantBody
 */
@lombok.Data
public final class BatchDeleteConversationParticipantBody  {

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
     * <p>执行删除群成员操作人的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Operator")
    private Long operator;

    /**
     * <p>需要删除群成员的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserIds")
    private List<Long> participantUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
