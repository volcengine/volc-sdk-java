package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * SendMessageBody
 */
@lombok.Data
public final class SendMessageBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>消息发送人 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sender")
    private Long sender;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>消息类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MsgType")
    private Integer msgType;

    /**
     * <p>消息内容。当你给客户端发消息时，Content 内容需符合客户端格式，详细信息请参看消息格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>会话中@的人</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MentionedUsers")
    private List<Long> mentionedUsers;

    /**
     * <p>消息可见会话成员列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VisibleUsers")
    private List<Long> visibleUsers;

    /**
     * <p>消息不可见会话成员列表。VisibleUsers 和 InvisibleUsers均为空时，代表对所有人可见。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InvisibleUsers")
    private List<Long> invisibleUsers;

    /**
     * <p>消息的扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>幂等id，如果创建时指定了此字段，并且数据库中存在此 id 对应的消息，不会重复发送。如果不指定，会随机生成一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClientMsgId")
    private String clientMsgId;

    /**
     * <p>消息对应时间戳，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>消息优先级。 0：低优先级。 1:普通优先级。 2:高优先级。 该字段仅对直播群有效。为避免直播群中消息频率太多导致服务端压力过大，你可以设置消息的优先级。当前直播群下，普通优先级和低优先级消息共用频控阈值为 30 条/秒，超过部分会被服务端直接丢弃。高优消息频控阈值为 10 条/秒，超过部分服务端无法保证不丢失。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private Integer priority;

    /**
     * <p>引用消息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RefMsgInfo")
    private SendMessageBodyRefMsgInfo refMsgInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
