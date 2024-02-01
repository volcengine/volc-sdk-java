package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * QueryOnlineStatusBody
 */
@lombok.Data
public final class QueryOnlineStatusBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>查询用户的 UserId。一次最多查询 100 个成员。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserIds")
    private List<Long> userIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
