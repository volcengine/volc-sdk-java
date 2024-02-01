package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * AddFriendBody
 */
@lombok.Data
public final class AddFriendBody  {

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
     * <p>信箱，用做逻辑隔离 默认值为 0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>好友 UserId，一次最多添加 10 个好友</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FriendUserIds")
    private List<Long> friendUserIds;

    /**
     * <p>好友扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
