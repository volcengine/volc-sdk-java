package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * BatchGetWhitelistParticipantResResultParticipantsItem
 */
@lombok.Data
public final class BatchGetWhitelistParticipantResResultParticipantsItem  {

    /**
     * <p>白名单成员 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>用户加入白名单时间，单位为秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>执行加入白名单操作操作人 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Operator")
    private Long operator;

    /**
     * <p>白名单成员昵称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NickName")
    private String nickName;

    /**
     * <p>白名单成员扩展字段。`key` 的类型为 string，`value` 的类型为 string。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>白名单成员头像</p>
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
