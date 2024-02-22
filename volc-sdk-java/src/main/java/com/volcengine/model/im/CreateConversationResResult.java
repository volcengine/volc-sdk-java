package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * CreateConversationResResult
 */
@lombok.Data
public final class CreateConversationResResult  {

    /**
     * <p>会话id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>会话是否存在</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Exist")
    private Boolean exist;

    /**
     * <p>会话详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationInfo")
    private CreateConversationResResultConversationInfo conversationInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
