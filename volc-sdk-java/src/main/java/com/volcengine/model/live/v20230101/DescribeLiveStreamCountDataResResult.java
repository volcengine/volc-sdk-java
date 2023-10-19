package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamCountDataResResult
 */
@lombok.Data
public final class DescribeLiveStreamCountDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>流类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private List<String> streamType;

    /**
     * <p>峰值流数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakCount")
    private Integer peakCount;

    /**
     * <p>按指定时间粒度聚合的峰值流数数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalStreamDataList")
    private List<DescribeLiveStreamCountDataResResultTotalStreamDataListItem> totalStreamDataList;

    /**
     * <p>按指定维度拆分后的峰值流数数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamDetailDataList")
    private List<DescribeLiveStreamCountDataResResultStreamDetailDataListItem> streamDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
