package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePushStreamInfoDataResResult
 */
@lombok.Data
public final class DescribeLivePushStreamInfoDataResResult  {

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
     * <p>查询推流的开始时间，RFC3339 格式的时间字符串，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询推流的结束时间，RFC3339 格式的时间字符串，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>在查询时间范围内进行推流并已断开的流信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushStreamInfoDataList")
    private List<DescribeLivePushStreamInfoDataResResultPushStreamInfoDataListItem> pushStreamInfoDataList;

    /**
     * <p>查询结果的分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLivePushStreamInfoDataResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
