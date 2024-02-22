package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * AddBlackListBody
 */
@lombok.Data
public final class AddBlackListBody  {

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
     * <p>需要加入黑名单的 UserId 及每个用户对应的扩展信息，一次最多添加 10 个用户至黑名单</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListInfos")
    private List<AddBlackListBodyBlackListInfosItem> blackListInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
