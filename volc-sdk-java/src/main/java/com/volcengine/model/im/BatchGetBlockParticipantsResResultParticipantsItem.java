package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * BatchGetBlockParticipantsResResultParticipantsItem
 */
@lombok.Data
public final class BatchGetBlockParticipantsResResultParticipantsItem  {

    /**
     * <p>群成员 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>禁言/拉黑设置对应的时间戳，单位为秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>禁言/拉黑到何时对应时间戳，单位为秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockTime")
    private Long blockTime;

    /**
     * <p>禁言/拉黑成员昵称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NickName")
    private String nickName;

    /**
     * <p>禁言/拉黑成员扩展字段。`key` 的类型为 string，`value` 的类型为 string。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>禁言/拉黑成员头像</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvatarUrl")
    private String avatarUrl;

    /**
     * <p>直播群群成员标记</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marks")
    private List<String> marks;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
