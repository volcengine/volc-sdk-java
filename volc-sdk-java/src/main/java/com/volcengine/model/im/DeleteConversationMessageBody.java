package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * DeleteConversationMessageBody
 */
@lombok.Data
public final class DeleteConversationMessageBody  {

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
     * <p>删除方式。</p>
     *
     *
     *
     * <p>- `0`：全部用户不可见。</p>
     *
     * <p>- `1`：仅发送人自己可见。</p>
     *
     *
     *
     * <p>默认值为`0`。</p>
     *
     * <p>直播群只允许传 `0`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeleteType")
    private Integer deleteType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
