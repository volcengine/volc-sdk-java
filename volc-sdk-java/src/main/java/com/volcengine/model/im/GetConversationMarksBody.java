package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetConversationMarksBody
 */
@lombok.Data
public final class GetConversationMarksBody  {

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
