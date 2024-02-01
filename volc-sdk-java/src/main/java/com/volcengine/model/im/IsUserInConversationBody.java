package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * IsUserInConversationBody
 */
@lombok.Data
public final class IsUserInConversationBody  {

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
     * <p>查询用户 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
