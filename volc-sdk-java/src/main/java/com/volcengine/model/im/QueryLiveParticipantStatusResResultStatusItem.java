package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * QueryLiveParticipantStatusResResultStatusItem
 */
@lombok.Data
public final class QueryLiveParticipantStatusResResultStatusItem  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>该成员所属会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>该成员 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>是否在群中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsInConversation")
    private Boolean isInConversation;

    /**
     * <p>加群时间，单位为秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
