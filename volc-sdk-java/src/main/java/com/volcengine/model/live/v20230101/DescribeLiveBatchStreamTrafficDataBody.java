package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchStreamTrafficDataBody
 */
@lombok.Data
public final class DescribeLiveBatchStreamTrafficDataBody  {

    /**
     * <p>域名列表，缺省情况下表示当前账号下的所有推拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>推拉流协议，缺省情况下表示所有协议类型，支持的协议如下所示。</p>
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
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 如果查询推拉流协议为 QUIC，不能同时查询其他协议。</p>
     *
     * <p>- 缺省情况下，查询的总流量数据为实际产生的上下行流量。</p>
     *
     * <p>- 如果传入单个协议进行查询，并对各协议的流量求和，结果将大于实际总流量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>查询历史数据的时间范围为 366 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询数据的页码，默认值为 1，表示查询第一页的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，默认值为 1000，取值范围为 100～1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
