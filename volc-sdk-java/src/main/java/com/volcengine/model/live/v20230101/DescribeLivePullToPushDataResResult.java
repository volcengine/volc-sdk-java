package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePullToPushDataResResult
 */
@lombok.Data
public final class DescribeLivePullToPushDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>查询范围内拉流转推总时长，单位分钟，保留小数点后 2 位。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDuration")
    private Float totalDuration;

    /**
     * <p>各时间片详细数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullToPushDataList")
    private List<DescribeLivePullToPushDataResResultPullToPushDataListItem> pullToPushDataList;

    /**
     * <p>聚合数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullToPushDetailDataList")
    private List<DescribeLivePullToPushDataResResultPullToPushDetailDataListItem> pullToPushDetailDataList;

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
