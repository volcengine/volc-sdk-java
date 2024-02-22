package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * IsFriendBody
 */
@lombok.Data
public final class IsFriendBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>用户 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>信箱，用做逻辑隔离。默认值为 `0`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>需要校验用户的 UserId，一次最多检验 10 个用户</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FriendUserIds")
    private List<Long> friendUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
