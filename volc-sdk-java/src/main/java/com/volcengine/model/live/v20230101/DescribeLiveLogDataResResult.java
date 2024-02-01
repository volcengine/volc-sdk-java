package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveLogDataResResult
 */
@lombok.Data
public final class DescribeLiveLogDataResResult  {

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
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>日志类型，类型说明如下所示。</p>
     *
     * <p>- pull：拉流日志</p>
     *
     * <p>- push：推流日志</p>
     *
     * <p>- source：回源日志</p>
     *
     * <p>- relay：拉流转推日志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>数据分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveLogDataResResultPagination pagination;

    /**
     * <p>日志文件的信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogInfoList")
    private List<DescribeLiveLogDataResResultLogInfoListItem> logInfoList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
