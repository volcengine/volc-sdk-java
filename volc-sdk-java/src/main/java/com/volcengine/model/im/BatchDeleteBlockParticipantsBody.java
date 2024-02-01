package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchDeleteBlockParticipantsBody
 */
@lombok.Data
public final class BatchDeleteBlockParticipantsBody  {

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
     * <p>操作行为。</p>
     *
     *
     *
     * <p>- `0`：取消禁言。</p>
     *
     * <p>- `1`：取消拉黑。</p>
     *
     *
     *
     * <p>默认值为 `0`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockAction")
    private Integer blockAction;

    /**
     * <p>取消禁言或者取消拉黑的会员成员 UserId 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserIds")
    private List<Long> participantUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
