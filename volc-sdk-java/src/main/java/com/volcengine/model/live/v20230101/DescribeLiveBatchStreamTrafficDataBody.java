package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchStreamTrafficDataBody
 */
@lombok.Data
public final class DescribeLiveBatchStreamTrafficDataBody  {

    /**
     * <p>域名列表，默认为空，表示查询所有域名下的流量数据。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>推拉流协议，缺省情况下表示所有协议类型，支持的协议如下所示。</p>
     *
     *
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
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 如果查询推拉流协议为 `QUIC`，不能同时查询其他协议。</p>
     *
     * <p>- 缺省情况下，查询的总流量数据为实际产生的上下行流量。</p>
     *
     * <p>- 如果传入单个协议进行查询，并对各协议的流量求和，结果将大于实际总流量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询最大时间跨度为 24 小时，查询历史数据的时间范围为 366 天。</p>
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
     * <p>查询数据的页码，默认值为 1，表示查询第一页的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，默认值为 1000，取值范围为 [100,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>提供网络接入服务的运营商标识符，缺省情况下表示所有运营商，支持的运营商如下所示。</p>
     *
     *
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
     *
     *
     *
     * <p>您也可以通过 [DescribeLiveISPData](https://www.volcengine.com/docs/6469/1133974) 接口获取运营商对应的标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `RegionList`和`UserRegionList` 不支持同时传入。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveBatchStreamTrafficDataBodyRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `RegionList`和`UserRegionList` 不支持同时传入。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveBatchStreamTrafficDataBodyUserRegionListItem> userRegionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
