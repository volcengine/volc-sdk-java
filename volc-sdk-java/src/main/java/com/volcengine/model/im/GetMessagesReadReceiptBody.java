package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetMessagesReadReceiptBody
 */
@lombok.Data
public final class GetMessagesReadReceiptBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>会话Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>消息Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageIds")
    private List<Long> messageIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
