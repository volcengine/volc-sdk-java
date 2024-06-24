package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveMetricTrafficDataBody
 */
@lombok.Data
public final class DescribeLiveMetricTrafficDataBody  {

    /**
     * <p>域名列表，默认为空，表示查询您视频直播产品下所有域名的流量监控数据。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>应用名称，取值与直播流地址中的 AppName 字段取值相同，查询流粒度数据时必传，且需同时传入 `Stream`。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查询流粒度的流量监控数据时，需同时指定 `App` 和 `Stream` 来指定直播流。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中的 StreamName 字段取值相同，查询流粒度数据时必传，且需同时传入 `Stream`。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查询流粒度的流量监控数据时，需同时指定 `App` 和 `Stream` 来指定直播流。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

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
     * <p>如果查询推拉流协议为 `QUIC`，不能同时查询其他协议。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

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
     * <p>- `huashu`：华数；</p>
     *
     * <p>- `other`：其他。</p>
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
    private List<reqRegion20230101> regionList;

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
    private List<reqRegion20230101> userRegionList;

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
     * <p>聚合的时间粒度，单位为秒，支持的时间粒度如下所示。</p>
     *
     *
     *
     * <p>- `60`：1 分钟。时间粒度为 1 分钟时，单次查询最大时间跨度为 24 小时，历史查询时间范围为 366 天；</p>
     *
     * <p>- `300`：（默认值）5 分钟。时间粒度为 5 分钟时，单次查询最大时间跨度为 31 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- `3600`：1 小时。时间粒度为 1 小时时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，默认为空表示不按维度进行数据拆分，支持的维度如下所示。</p>
     *
     * <p>- `Domain`：域名；</p>
     *
     * <p>- `Protocol`：推拉流协议；</p>
     *
     * <p>- `ISP`：运营商。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>配置数据拆分的维度时，对应的维度参数传入多个值时才会返回按此维度拆分的数据。例如，配置按 Domain 进行数据拆分时， DomainList 传入多个 Domain 值时，才会返回按 Domain 拆分的数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
