package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveEdgeStatDataResResult
 */
@lombok.Data
public final class DescribeLiveEdgeStatDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>推拉流协议，协议说明如下。</p>
     *
     * <p>- `HTTP-FLV`：基于 HTTP 协议的推拉流协议，使用 FLV 格式传输视频格式。</p>
     *
     * <p>- `HTTP-HLS`：基于 HTTP 协议的推拉流协议，使用 TS 格式传输视频格式。</p>
     *
     * <p>- `RTMP`：Real Time Message Protocol，实时信息传输协议。</p>
     *
     * <p>- `RTM`：Real Time Media，超低延时直播协议。</p>
     *
     * <p>- `SRT`：Secure Reliable Transport，安全可靠传输协议。</p>
     *
     * <p>- `QUIC`：Quick UDP Internet Connections，一种基于 UDP 的全新的低延时互联网传输协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>提供网络接入服务的运营商标识符，标识符与运营商的对应关系如下。</p>
     *
     * <p>- `unicom`：联通；</p>
     *
     * <p>- `railcom`：铁通；</p>
     *
     * <p>- `telecom`：电信；</p>
     *
     * <p>- `mobile`：移动；</p>
     *
     * <p>- `cernet`：教育网；</p>
     *
     * <p>- `tianwei`：天威；</p>
     *
     * <p>- `alibaba`：阿里巴巴；</p>
     *
     * <p>- `tencent`：腾讯；</p>
     *
     * <p>- `drpeng`：鹏博士；</p>
     *
     * <p>- `btvn`：广电；</p>
     *
     * <p>- `huashu`：华数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveEdgeStatDataResResultRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveEdgeStatDataResResultUserRegionListItem> userRegionList;

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
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，维度说明如下所示。</p>
     *
     * <p>- `Domain`：域名；</p>
     *
     * <p>- `Protocol`：推拉流协议；</p>
     *
     * <p>- `ISP`：运营商；</p>
     *
     * <p>- `Area`：CDN 节点 IP 所属大区。</p>
     *
     * <p>- `Country`：CDN 节点 IP 所属国家。</p>
     *
     * <p>- `Province`：CDN 节点 IP 所属省份。</p>
     *
     * <p>- `UserArea`：客户端 IP 所属大区。</p>
     *
     * <p>- `UserCountry`：客户端 IP 所属国家。</p>
     *
     * <p>- `UserProvince`：客户端 IP 所属省份。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>上行总流量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalUpTraffic")
    private Float totalUpTraffic;

    /**
     * <p>下行总流量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDownTraffic")
    private Float totalDownTraffic;

    /**
     * <p>AppName 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppList")
    private List<String> appList;

    /**
     * <p>StreamName 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamList")
    private List<String> streamList;

    /**
     * <p>上行带宽峰值，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>下行峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakDownBandwidth")
    private Float peakDownBandwidth;

    /**
     * <p>请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalRequest")
    private Float totalRequest;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EdgeStatDataList")
    private List<DescribeLiveEdgeStatDataResResultEdgeStatDataListItem> edgeStatDataList;

    /**
     * <p>按维度拆分后的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EdgeStatDetailDataList")
    private List<DescribeLiveEdgeStatDataResResultEdgeStatDetailDataListItem> edgeStatDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
