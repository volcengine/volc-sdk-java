package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * RemoveBlackListBody
 */
@lombok.Data
public final class RemoveBlackListBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>用户 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>信箱，用做逻辑隔离。默认值为 0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>需要移出黑名单的用户的 ID，一次最多移出 10 个用户</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListUserIds")
    private List<Long> blackListUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
