package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * ModifyConversationSettingBodyConversationSettingInfo
 */
@lombok.Data
public final class ModifyConversationSettingBodyConversationSettingInfo  {

    /**
     * <p>需要修改的会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>需要修改的会话成员UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>是否开启免打扰。 true：开启。 false：不开启 默认值为 false。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsMute")
    private Boolean isMute;

    /**
     * <p>是否需要修改置顶时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsStickTop")
    private Boolean isStickTop;

    /**
     * <p>置顶时间戳，单位为毫秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StickTopTime")
    private Long stickTopTime;

    /**
     * <p>是否需要修改收藏时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsSetFavorite")
    private Boolean isSetFavorite;

    /**
     * <p>收藏时间戳，单位为毫秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SetFavoriteTime")
    private Long setFavoriteTime;

    /**
     * <p>扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
