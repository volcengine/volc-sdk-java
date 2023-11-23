package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveP95PeakBandwidthDataBody
 */
@lombok.Data
public final class DescribeLiveP95PeakBandwidthDataBody  {

    /**
     * <p>域名列表，缺省情况下表示查询所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>推拉流协议，缺省情况下表示所有协议类型。支持的协议如下所示。</p>
     *
     *
     *
     * <p>- HTTP-FLV</p>
     *
     * <p>- HTTP-HLS</p>
     *
     * <p>- RTMP</p>
     *
     * <p>- RTM</p>
     *
     * <p>- SRT</p>
     *
     * <p>- QUIC</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>如果设置推拉流协议为 QUIC，不能同时传其他协议。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>CDN 节点 IP 所属区域的列表。缺省情况下表示所有区域。</p>
     *
     * <p>:::tip</p>
     *
     * <p>不支持同时传入 `RegionList` 和 `UserRegionList`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveP95PeakBandwidthDataBodyRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     *
     * <p>:::tip</p>
     *
     * <p>不支持同时传入 `RegionList` 和 `UserRegionList`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveP95PeakBandwidthDataBodyUserRegionListItem> userRegionList;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度，单位为 s，默认值为 300，支持的取值为 300。单次查询时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
