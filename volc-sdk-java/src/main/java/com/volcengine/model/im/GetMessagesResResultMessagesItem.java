package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * GetMessagesResResultMessagesItem
 */
@lombok.Data
public final class GetMessagesResResultMessagesItem  {

    /**
     * <p>会话类型</p>
     *
     *
     *
     * <p>- `1`：单聊。</p>
     *
     * <p>- `2`：群聊。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationType")
    private Integer conversationType;

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
     * <p>消息类型。</p>
     *
     *
     *
     * <p>- `10001`：文本。</p>
     *
     * <p>- `10003`：图片。</p>
     *
     * <p>- `10004`：视频</p>
     *
     * <p>- `10005`：文件</p>
     *
     * <p>- `10006`：音频</p>
     *
     * <p>- `10012`：自定义消息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MsgType")
    private Integer msgType;

    /**
     * <p>消息内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>消息的扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>消息状态，取值为`0`，表示消息可见。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>消息创建时间戳，单位为毫秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>消息发送人 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sender")
    private Long sender;

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>引用消息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RefMsgInfo")
    private GetMessagesResResultMessagesItemRefMsgInfo refMsgInfo;

    /**
     * <p>消息在会话中的位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IndexInConversation")
    private Long indexInConversation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
