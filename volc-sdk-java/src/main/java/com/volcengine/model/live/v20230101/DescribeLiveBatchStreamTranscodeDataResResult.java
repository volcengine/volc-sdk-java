package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchStreamTranscodeDataResResult
 */
@lombok.Data
public final class DescribeLiveBatchStreamTranscodeDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的起始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询结果中，所有流的转码总时长，单位为分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDuration")
    private Float totalDuration;

    /**
     * <p>流维度的转码用量信息详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoList")
    private List<DescribeLiveBatchStreamTranscodeDataResResultStreamInfoListItem> streamInfoList;

    /**
     * <p>分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveBatchStreamTranscodeDataResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
