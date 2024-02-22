package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetConversationSettingBody
 */
@lombok.Data
public final class GetConversationSettingBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>会话成员 UserId，UserId 必须大于 `0`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>是否需要该成员在会话中的已读位置。</p>
     *
     * <p>- `true`：不需要。</p>
     *
     * <p>- `false`：需要。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NoReadIndex")
    private Boolean noReadIndex;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
