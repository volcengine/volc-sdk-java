package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchStreamTrafficDataBody
 */
@lombok.Data
public final class DescribeLiveBatchStreamTrafficDataBody  {

    /**
     * <p>域名列表。缺省情况下，表示当前账号下的所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>推拉流协议。支持查询的协议包括：</p>
     *
     * <p>- RTMP</p>
     *
     * <p>- RTM</p>
     *
     * <p>- HTTP-FLV</p>
     *
     * <p>- HTTP-HLS</p>
     *
     * <p>- SRT</p>
     *
     * <p>- QUIC</p>
     *
     * <p>:::warning</p>
     *
     * <p>- 缺省情况下，查询的总流量数据为实际产生的上下行流量。</p>
     *
     * <p>- 如果传入协议进行查询，并对各协议的流量求和，结果将大于实际总流量。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>查询的起始时间，支持查询最近 93 天内的数据。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，支持查询最近 93 天内的数据。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>分页查询页码，默认值为 1，即查询第一页的信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>单个分页中，查询的流数量。默认值为 1000，取值范围为 [100,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
