package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * CreateConversationBody
 */
@lombok.Data
public final class CreateConversationBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>信箱，用做逻辑隔离 默认值为 0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationCoreInfo")
    private CreateConversationBodyConversationCoreInfo conversationCoreInfo;

    /**
     * <p>群主 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OwnerUserId")
    private Long ownerUserId;

    /**
     * <p>另一个成员的 UserId， 创建单聊必填</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OtherUserId")
    private Long otherUserId;

    /**
     * <p>幂等id，如果创建时指定了此字段，并且数据库中存在此 id 对应的会话，则不会重复创建，并且接口返回的Exist字段为true。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IdempotentId")
    private String idempotentId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
