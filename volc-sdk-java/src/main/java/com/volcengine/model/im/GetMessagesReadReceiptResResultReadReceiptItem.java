package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetMessagesReadReceiptResResultReadReceiptItem
 */
@lombok.Data
public final class GetMessagesReadReceiptResResultReadReceiptItem  {

    /**
     * <p>消息Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageId")
    private Long messageId;

    /**
     * <p>会话Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>单聊中消息的接收方是否已读（只有单聊会话这个字段才有意义）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReceiverIsRead")
    private Boolean receiverIsRead;

    /**
     * <p>消息已读的UserId列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadUserIds")
    private List<Long> readUserIds;

    /**
     * <p>消息未读的UserId列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UnReadUserIds")
    private List<Long> unReadUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
