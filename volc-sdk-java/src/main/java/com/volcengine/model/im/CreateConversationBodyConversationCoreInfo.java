package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * CreateConversationBodyConversationCoreInfo
 */
@lombok.Data
public final class CreateConversationBodyConversationCoreInfo  {

    /**
     * <p>会话名称</p>
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
     * <p>map<string,string> 扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>会话类型 1：单聊 2:群聊 100：直播群</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationType")
    private Integer conversationType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
