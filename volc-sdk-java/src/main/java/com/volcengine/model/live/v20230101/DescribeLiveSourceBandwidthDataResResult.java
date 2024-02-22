package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSourceBandwidthDataResResult
 */
@lombok.Data
public final class DescribeLiveSourceBandwidthDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询流粒度数据时的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>查询流粒度数据时的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>查询流粒度数据时的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>提供网络接入服务的运营商标识符，标识符与运营商的对应关系如下。</p>
     *
     * <p>- unicom：联通；</p>
     *
     * <p>- railcom：铁通；</p>
     *
     * <p>- telecom：电信；</p>
     *
     * <p>- mobile：移动；</p>
     *
     * <p>- cernet：教育网；</p>
     *
     * <p>- tianwei：天威；</p>
     *
     * <p>- alibaba：阿里巴巴；</p>
     *
     * <p>- tencent：腾讯；</p>
     *
     * <p>- drpeng：鹏博士；</p>
     *
     * <p>- btvn：广电；</p>
     *
     * <p>- huashu：华数；</p>
     *
     * <p>- other：其他。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>客户端 IP 所属区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveSourceBandwidthDataResResultUserRegionListItem> userRegionList;

    /**
     * <p>数据拆分的维度，维度说明如下所示。</p>
     *
     * <p>- Domain：域名；</p>
     *
     * <p>- ISP：运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

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
     * <p>聚合的时间粒度，单位为秒。</p>
     *
     *
     *
     * <p>- 60：1 分钟；</p>
     *
     * <p>- 300：5 分钟；</p>
     *
     * <p>- 3600：1 小时。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>查询时间范围内的回源峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakBandwidth")
    private Float peakBandwidth;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribeLiveSourceBandwidthDataResResultBandwidthDataListItem> bandwidthDataList;

    /**
     * <p>按维度拆分后的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDetailDataList")
    private List<DescribeLiveSourceBandwidthDataResResultBandwidthDetailDataListItem> bandwidthDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
