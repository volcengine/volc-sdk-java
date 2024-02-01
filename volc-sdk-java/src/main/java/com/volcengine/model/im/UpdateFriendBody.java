package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UpdateFriendBody
 */
@lombok.Data
public final class UpdateFriendBody  {

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
     * <p>好友信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FriendInfos")
    private List<UpdateFriendBodyFriendInfosItem> friendInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
