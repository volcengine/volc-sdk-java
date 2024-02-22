package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * DeleteFriendBody
 */
@lombok.Data
public final class DeleteFriendBody  {

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
     * <p>要删除的好友 UserId，一次最多删除 10 个好友</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeleteUserIds")
    private List<Long> deleteUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
