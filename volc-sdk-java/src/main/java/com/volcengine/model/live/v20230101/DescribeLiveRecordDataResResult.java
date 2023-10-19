package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRecordDataResResult
 */
@lombok.Data
public final class DescribeLiveRecordDataResResult  {

    /**
     * <p>域名列表，缺省情况表示该用户的所有域名。</p>
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
     * <p>查询时间范围内录制峰值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPeak")
    private Integer recordPeak;

    /**
     * <p>录制峰值数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordDataList")
    private List<DescribeLiveRecordDataResResultRecordDataListItem> recordDataList;

    /**
     * <p>数据拆分后的详细数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordDetailDataList")
    private List<DescribeLiveRecordDataResResultRecordDetailDataListItem> recordDetailDataList;

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
