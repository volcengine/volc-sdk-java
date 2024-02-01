package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchGetConversationsBody
 */
@lombok.Data
public final class BatchGetConversationsBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private List<Long> conversationShortId;

    /**
     * <p>是否忽略获取会话成员数。 true： 忽略。 false：不忽略。 默认值为 true。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipMemberCount")
    private Boolean skipMemberCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
