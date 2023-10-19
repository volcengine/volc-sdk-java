package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePlayStatusCodeDataResResult
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResult  {

    /**
     * <p>拉流域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLivePlayStatusCodeDataResResultRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLivePlayStatusCodeDataResResultUserRegionListItem> userRegionList;

    /**
     * <p>起始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>是否返回过滤字段和时间聚合后的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>所有时间数据总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusSummaryDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusSummaryDataListItem> statusSummaryDataList;

    /**
     * <p>每个时间点的粒度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusDataListItem> statusDataList;

    /**
     * <p>字段和时间聚合后数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusDetailDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItem> statusDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
