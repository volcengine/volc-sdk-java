package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * QueryLiveParticipantStatusBody
 */
@lombok.Data
public final class QueryLiveParticipantStatusBody  {

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
     * <p>查询群成员 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserIds")
    private List<Long> participantUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
