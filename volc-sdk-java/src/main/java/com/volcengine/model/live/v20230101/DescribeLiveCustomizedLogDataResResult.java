package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveCustomizedLogDataResResult
 */
@lombok.Data
public final class DescribeLiveCustomizedLogDataResResult  {

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
     * <p>查询的日志类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>数据分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveCustomizedLogDataResResultPagination pagination;

    /**
     * <p>日志文件的信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogInfoList")
    private List<DescribeLiveCustomizedLogDataResResultLogInfoListItem> logInfoList;

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
