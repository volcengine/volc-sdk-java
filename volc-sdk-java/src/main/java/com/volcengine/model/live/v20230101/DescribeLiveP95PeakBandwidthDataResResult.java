package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveP95PeakBandwidthDataResResult
 */
@lombok.Data
public final class DescribeLiveP95PeakBandwidthDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>推拉流协议，协议说明如下。</p>
     *
     *
     *
     * <p>- HTTP-FLV：基于 HTTP 协议的推拉流协议，使用 FLV 格式传输视频格式。</p>
     *
     * <p>- HTTP-HLS：基于 HTTP 协议的推拉流协议，使用 TS 格式传输视频格式。</p>
     *
     * <p>- RTMP：Real Time Message Protocol，实时信息传输协议。</p>
     *
     * <p>- RTM：Real Time Media，超低延时直播协议。</p>
     *
     * <p>- SRT：Secure Reliable Transport，安全可靠传输协议。</p>
     *
     * <p>- QUIC：Quick UDP Internet Connections，一种基于 UDP 的全新的低延时互联网传输协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>CDN 节点 IP 所属区域的列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveP95PeakBandwidthDataResResultRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域的列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveP95PeakBandwidthDataResResultUserRegionListItem> userRegionList;

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
     * <p>数据聚合的时间粒度，单位为秒。</p>
     *
     * <p>- 300：5 分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>时间范围内的上下行 95 峰值带宽总和。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果请求时，`Regionlist` 中传入多个 region，则返回这些 region 的上下行带宽 95 峰值总和。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "P95PeakBandwidth")
    private Float p95PeakBandwidth;

    /**
     * <p>95 峰值带宽的时间戳，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "P95PeakTimestamp")
    private String p95PeakTimestamp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
