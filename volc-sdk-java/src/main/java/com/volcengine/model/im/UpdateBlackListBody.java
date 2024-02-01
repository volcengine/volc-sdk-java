package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UpdateBlackListBody
 */
@lombok.Data
public final class UpdateBlackListBody  {

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
     * <p>黑名单用户 ID 及需要更新的扩展字段。一次最多更新 10 个黑名单用户的扩展字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListInfos")
    private List<UpdateBlackListBodyBlackListInfosItem> blackListInfos;

    /**
     * <p>信箱，用做逻辑隔离。默认值为 0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
