package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetUserConversationsBody
 */
@lombok.Data
public final class GetUserConversationsBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>查询用户 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>数据来源。 0：从缓存中拉取，按会话最近活跃排序。 1:从数据库中拉取，按照创建时间正序排序。 2：拉取用户创建的直播群会话，按照创建时间逆序排序</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataType")
    private Integer dataType;

    /**
     * <p>查询起始位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cursor")
    private Long cursor;

    /**
     * <p>查询数量。最大值为 20。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    /**
     * <p>是否忽略会话成员数。 true：忽略。 false：不忽略。 默认值为 false。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipMemberCount")
    private Boolean skipMemberCount;

    /**
     * <p>信箱，用于逻辑隔离。 默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
