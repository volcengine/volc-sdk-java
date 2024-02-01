package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * ModifyConversationBodyConversationCoreInfo
 */
@lombok.Data
public final class ModifyConversationBodyConversationCoreInfo  {

    /**
     * <p>需要修改的会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>会话的扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>会话名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>会话头像 url</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvatarUrl")
    private String avatarUrl;

    /**
     * <p>会话描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>会话公告</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Notice")
    private String notice;

    /**
     * <p>群主的UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OwnerUserId")
    private Long ownerUserId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
