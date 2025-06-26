package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveCallbackDataResResult
 */
@lombok.Data
public final class DescribeLiveCallbackDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>回调事件类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackEventType")
    private List<String> callbackEventType;

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询结果的分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveCallbackDataResResultPagination pagination;

    /**
     * <p>回调事件详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackInfoList")
    private List<DescribeLiveCallbackDataResResultCallbackInfoListItem> callbackInfoList;

    /**
     * <p>回调状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackStatus")
    private List<String> callbackStatus;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
