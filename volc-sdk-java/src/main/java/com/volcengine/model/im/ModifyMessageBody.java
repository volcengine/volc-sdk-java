package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * ModifyMessageBody
 */
@lombok.Data
public final class ModifyMessageBody  {

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
     * <p>消息 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageId")
    private Long messageId;

    /**
     * <p>消息的扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>消息内容。修改时`Content`内容需符合客户端格式，详细信息请参看[消息格式](https://www.volcengine.com/docs/6348/372181#server)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
