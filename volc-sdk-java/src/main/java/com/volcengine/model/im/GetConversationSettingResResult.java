package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetConversationSettingResResult
 */
@lombok.Data
public final class GetConversationSettingResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationSettingInfo")
    private GetConversationSettingResResultConversationSettingInfo conversationSettingInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
