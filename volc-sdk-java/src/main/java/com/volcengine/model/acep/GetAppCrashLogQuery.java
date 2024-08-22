package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetAppCrashLogQuery
 */
@lombok.Data
public final class GetAppCrashLogQuery  {

    /**
     * <p>可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID 列表，支持的最大实例数量为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>查询起始时间，秒级时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>查询结束时间，秒级时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
