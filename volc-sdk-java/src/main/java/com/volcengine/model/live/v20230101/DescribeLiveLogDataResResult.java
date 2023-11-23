package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveLogDataResResult
 */
@lombok.Data
public final class DescribeLiveLogDataResResult  {

    /**
     * <p>开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询日志的域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的日志类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveLogDataResResultPagination pagination;

    /**
     * <p>日志文件信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogInfoList")
    private List<DescribeLiveLogDataResResultLogInfoListItem> logInfoList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
