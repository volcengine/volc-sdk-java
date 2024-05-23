package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * GetConversationSettingResResultConversationSettingInfo
 */
@lombok.Data
public final class GetConversationSettingResResultConversationSettingInfo  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>群成员UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>会话Id，字符串类型，含义跟`ConversationShortId`一样，用来定位唯一的一个会话，历史原因，目前大部分接口都在使用`ConversationShortId`，但是仍然有比较比较老的接口会使用到`ConversationId`，如果目前您接入的功能没有使用到`ConversationId`直接忽略即可</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationId")
    private String conversationId;

    /**
     * <p>会话类型。</p>
     *
     *
     *
     * <p>- `1`：单聊</p>
     *
     * <p>- `2`：群聊</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationType")
    private Integer conversationType;

    /**
     * <p>信箱，用于逻辑隔离</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>置顶时间，单位为毫秒。`0`表示未置顶</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StickTopTime")
    private Long stickTopTime;

    /**
     * <p>是否置顶。</p>
     *
     *
     *
     * <p>- `true`：置顶。</p>
     *
     * <p>- `false`：不置顶</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsStickTop")
    private Boolean isStickTop;

    /**
     * <p>收藏时间，单位为毫秒。 `0`表示未收藏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SetFavoriteTime")
    private Long setFavoriteTime;

    /**
     * <p>是否收藏。</p>
     *
     *
     *
     * <p>- `true`：收藏。</p>
     *
     * <p>- `false`：不收藏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsSetFavorite")
    private Boolean isSetFavorite;

    /**
     * <p>是否开启免打扰。</p>
     *
     *
     *
     * <p>- `true`：开启。</p>
     *
     * <p>- `false`：不开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsMute")
    private Boolean isMute;

    /**
     * <p>扩展字段。 `key` 的数据类型为 `String`，`value` 的数据类型为 `String`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>用户已读位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadIndex")
    private Long readIndex;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
