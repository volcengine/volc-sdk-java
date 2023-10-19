package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePushStreamCountDataResResult
 */
@lombok.Data
public final class DescribeLivePushStreamCountDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>*运营商*。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>客户端 IP 所属区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLivePushStreamCountDataResResultUserRegionListItem> userRegionList;

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
     * <p>聚合的时间粒度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>峰值流数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakCount")
    private Integer peakCount;

    /**
     * <p>按指定时间粒度聚合后的峰值流数数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalStreamDataList")
    private List<DescribeLivePushStreamCountDataResResultTotalStreamDataListItem> totalStreamDataList;

    /**
     * <p>拆分维度字段和时间聚合后数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamDetailDataList")
    private List<DescribeLivePushStreamCountDataResResultStreamDetailDataListItem> streamDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
