package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * ModifyConversationSettingBody
 */
@lombok.Data
public final class ModifyConversationSettingBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationSettingInfo")
    private ModifyConversationSettingBodyConversationSettingInfo conversationSettingInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
