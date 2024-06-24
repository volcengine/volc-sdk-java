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
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒。</p>
     *
     * <p>- `60`：1 分钟；</p>
     *
     * <p>- `300`：5 分钟；</p>
     *
     * <p>- `3600`：1 小时；</p>
     *
     * <p>- `86400`：1 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，当前接口仅支持按 `Domain` 即域名维度进行数据拆分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>流类型，流类型说明如下。</p>
     *
     * <p>- `push`：拉流；</p>
     *
     * <p>- `relay-source`：回源流；</p>
     *
     * <p>- `transcode`：转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private List<String> streamType;

    /**
     * <p>当前查询条件下流数最大值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakCount")
    private Integer peakCount;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalStreamDataList")
    private List<DescribeLiveStreamCountDataResResultTotalStreamDataListItem> totalStreamDataList;

    /**
     * <p>按维度拆分后的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamDetailDataList")
    private List<DescribeLiveStreamCountDataResResultStreamDetailDataListItem> streamDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
