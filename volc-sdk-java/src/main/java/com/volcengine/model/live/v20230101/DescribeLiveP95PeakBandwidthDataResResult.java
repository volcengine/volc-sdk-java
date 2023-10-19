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
     * <p>推拉流协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>CDN 节点 IP 所属区域的列表。缺省情况下表示所有区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveP95PeakBandwidthDataResResultRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveP95PeakBandwidthDataResResultUserRegionListItem> userRegionList;

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
     * <p>时间粒度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>上下行带宽 95 峰值。</p>
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
     * <p>95 带宽峰值对应的时间点。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "P95PeakTimestamp")
    private String p95PeakTimestamp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
