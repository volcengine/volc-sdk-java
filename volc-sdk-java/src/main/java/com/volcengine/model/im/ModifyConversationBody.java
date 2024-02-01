package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * ModifyConversationBody
 */
@lombok.Data
public final class ModifyConversationBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>会话信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationCoreInfo")
    private ModifyConversationBodyConversationCoreInfo conversationCoreInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
