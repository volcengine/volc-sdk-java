package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTopPlayDataBody
 */
@lombok.Data
public final class DescribeLiveTopPlayDataBody  {

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 单次查询最大时间跨度为 31 天。</p>
     *
     * <p>- 历史查询时间范围是 366 天。</p>
     *
     * <p>- 带宽和流量数据按照整小时进行聚合。在此建议您，查询开始时间和查询结束时间应涵盖您所要查询的时间段的整点小时。</p>
     *
     * <p>:::</p>
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
     * <p>- `Stream`（默认值）：查询 TOPN 直播流的流量带宽信息。</p>
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
     * <p>域名空间列表，默认为空，表示所有域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名空间信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<String> vhostList;

    /**
     * <p>域名列表，默认为空，表示所有域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>每页显示的数据条数，默认值为 10，取值范围为  [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private String pageSize;

    /**
     * <p>查询数据的页码，默认值为 1，表示查询第一页的数据。 </p>
     *
     * <p>:::tip</p>
     *
     * <p>PageSize 为 10，PageNum 为 1 时，表示查询 TOP 10 的数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private String pageNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
