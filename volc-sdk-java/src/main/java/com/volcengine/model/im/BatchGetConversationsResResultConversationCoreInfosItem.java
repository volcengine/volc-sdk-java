package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * BatchGetConversationsResResultConversationCoreInfosItem
 */
@lombok.Data
public final class BatchGetConversationsResResultConversationCoreInfosItem  {

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>信箱,用于逻辑隔离</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>群名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>群头像 url</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvatarUrl")
    private String avatarUrl;

    /**
     * <p>群描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>群主 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OwnerUserId")
    private Long ownerUserId;

    /**
     * <p>创群人 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreatorUserId")
    private Long creatorUserId;

    /**
     * <p>群公告</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Notice")
    private String notice;

    /**
     * <p>会话状态。 0：正常 1：已解散</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>会话的扩展字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>群聊创建时间戳，单位为秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>修改时间戳，单位为秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModifyTime")
    private Long modifyTime;

    /**
     * <p>会话类型。 1：单聊 2:群聊 100:直播群</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationType")
    private Integer conversationType;

    /**
     * <p>会话成员数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MemberCount")
    private Long memberCount;

    /**
     * <p>直播群在线人数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlineCount")
    private Long onlineCount;

    /**
     * <p>单聊会话另一个 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OtherUserId")
    private Long otherUserId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
