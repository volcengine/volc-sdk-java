package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchAddConversationParticipantBody
 */
@lombok.Data
public final class BatchAddConversationParticipantBody  {

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
     * <p>执行加群操作人的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Operator")
    private Long operator;

    /**
     * <p>是否开启屏障。如设置屏障，新加入用户无法看到历史会话消息。</p>
     *
     *
     *
     * <p>- `false`：不开启。</p>
     *
     * <p>- `true`：开启。</p>
     *
     *
     *
     * <p>默认值为`false`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Barrier")
    private Boolean barrier;

    /**
     * <p>群成员信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantInfos")
    private List<BatchAddConversationParticipantBodyParticipantInfosItem> participantInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
