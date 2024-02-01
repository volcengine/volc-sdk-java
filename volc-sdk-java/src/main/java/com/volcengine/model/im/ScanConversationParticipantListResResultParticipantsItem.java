package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * ScanConversationParticipantListResResultParticipantsItem
 */
@lombok.Data
public final class ScanConversationParticipantListResResultParticipantsItem  {

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>群成员 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>成员等级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Level")
    private Integer level;

    /**
     * <p>成员昵称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NickName")
    private String nickName;

    /**
     * <p>操作人对应的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Operator")
    private Long operator;

    /**
     * <p>成员状态。</p>
     *
     *
     *
     * <p>- `0`：正常</p>
     *
     * <p>- `1`：退出</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>成员进群时间对应时间戳，单位为秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>成员的扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>成员身份。</p>
     *
     *
     *
     * <p>- `0`：普通成员。</p>
     *
     * <p>- `1`：群主。</p>
     *
     * <p>- `2`：群管理员。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Role")
    private Long role;

    /**
     * <p>禁言时间戳，单位为秒。`0`表示不禁言</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockTime")
    private Long blockTime;

    /**
     * <p>群成员头像</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvatarUrl")
    private String avatarUrl;

    /**
     * <p>成员标记</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marks")
    private List<String> marks;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
