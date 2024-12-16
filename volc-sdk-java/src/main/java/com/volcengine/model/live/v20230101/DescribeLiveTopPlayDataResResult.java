package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTopPlayDataResResult
 */
@lombok.Data
public final class DescribeLiveTopPlayDataResResult  {

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
     * <p>查询类型，取值及含义如下所示。 </p>
     *
     * <p>- `Domain` ：查询 TOPN 域名的的流量带宽信息。</p>
     *
     * <p>- `Stream`（默认值）查询 TOPN 直播流的流量带宽信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryType")
    private String queryType;

    /**
     * <p>TOPN 结果的排序指标，取值及含义如下所示。 </p>
     *
     * <p>- `PeakBandwidth`（默认值）：以峰值带宽值降序展示查询结果。 </p>
     *
     * <p>- `AvgBandwidth`：以平均带宽值降序展示查询结果。</p>
     *
     * <p>- `TotalTraffic`：以流量加值降序展示查询结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SortBy")
    private String sortBy;

    /**
     * <p>域名空间列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<String> vhostList;

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>带宽和流量详细数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataItemList")
    private List<DescribeLiveTopPlayDataResResultDataItemListItem> dataItemList;

    /**
     * <p>查询结果的分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveTopPlayDataResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
