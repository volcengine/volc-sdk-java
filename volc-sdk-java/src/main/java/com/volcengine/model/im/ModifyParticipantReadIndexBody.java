package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * ModifyParticipantReadIndexBody
 */
@lombok.Data
public final class ModifyParticipantReadIndexBody  {

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
     * <p>修改成员所属 UserId，UserId 必须大于 `0`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>成员已读位置。传入的`ReadIndex`必须要大于该会话成员目前的`ReadIndex`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadIndex")
    private Long readIndex;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
