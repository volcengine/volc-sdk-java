package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * RecallMessageBody
 */
@lombok.Data
public final class RecallMessageBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>撤回消息的会话成员 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>消息 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageId")
    private Long messageId;

    /**
     * <p>撤回消息的会话成员角色。 0：普通会话成员。 1：群主。 2：管理员。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecallRole")
    private Integer recallRole;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
