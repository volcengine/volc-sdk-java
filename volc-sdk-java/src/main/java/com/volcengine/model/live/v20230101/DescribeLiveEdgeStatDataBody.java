package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveEdgeStatDataBody
 */
@lombok.Data
public final class DescribeLiveEdgeStatDataBody  {

    /**
     * <p>域名列表，默认为空，表示您添加到视频直播中的所有域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名。</p>
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
     * <p>如果查询推拉流协议为 `QUIC`，不能同时查询其他协议。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>提供网络接入服务的运营商标识符，缺省情况下表示所有运营商，支持的运营商如下所示。</p>
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
     * <p>参数 `RegionList`和`UserRegionList` 不支持同时传入。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveEdgeStatDataBodyRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `RegionList`和`UserRegionList` 不支持同时传入。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveEdgeStatDataBodyUserRegionListItem> userRegionList;

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>历史查询最大时间范围为 366 天，单次查询最大时间跨度与数据拆分维度和数据聚合时间粒度有关，详细如下。</p>
     *
     * <p>- 当不进行维度拆分或只使用一个维度拆分数据时：</p>
     *
     * <p>	- 数据以 60 秒聚合时，单次查询最大时间跨度为 24 小时；</p>
     *
     * <p>	- 数据以 300 秒聚合时，单次查询最大时间跨度为 31 天；</p>
     *
     * <p>	- 数据以 3600 秒聚合时，单次查询最大时间跨度为 31 天。</p>
     *
     * <p>- 当使用两个或两个以上维度拆分数据时：</p>
     *
     * <p>	- 数据以 60 秒聚合时，单次查询最大时间跨度为 3 小时；</p>
     *
     * <p>	- 数据以 300 秒聚合时，单次查询最大时间跨度为 24 小时；</p>
     *
     * <p>	- 数据以 3600 秒聚合时，单次查询最大时间跨度为 7 天。</p>
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
     * <p>数据聚合的时间粒度，单位为秒，支持以下取值。</p>
     *
     * <p>- `60`：1 分钟。</p>
     *
     * <p>- `300`：（默认值）5 分钟。</p>
     *
     * <p>- `3600`：1 小时。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，缺省情况下不进行数据拆分，支持的维度如下所示。</p>
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
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>中国（Country 或 UserCountry 为 CN）以外区域无 Province 字段，如果按 Province 或 UserProvince 字段拆分数据时，默认只返回 Country 为 CN 时的数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>直播流地址中的 AppName 字段列表，默认为空表示所有 AppName。每个 AppName 支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppList")
    private List<String> appList;

    /**
     * <p>直播流地址中的 StreamName 字段列表，默认为空表示所有 StreamName。每个 StreamName 支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamList")
    private List<String> streamList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
