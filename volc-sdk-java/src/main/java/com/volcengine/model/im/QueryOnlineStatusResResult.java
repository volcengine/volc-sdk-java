package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * QueryOnlineStatusResResult
 */
@lombok.Data
public final class QueryOnlineStatusResResult  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>用户在线状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryOnlineResults")
    private Map<String, List<QueryOnlineResultItem>> queryOnlineResults;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
