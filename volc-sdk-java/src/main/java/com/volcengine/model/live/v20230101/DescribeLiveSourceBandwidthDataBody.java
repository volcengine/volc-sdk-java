package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSourceBandwidthDataBody
 */
@lombok.Data
public final class DescribeLiveSourceBandwidthDataBody  {

    /**
     * <p>域名列表。缺省情况表示该用户的所有域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`DomainList` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询流粒度数据时的域名参数，支持拉流域名。</p>
     *
     * <p>使用 `Domain` 构造请求时，需要同时定义 `App` 和 `Stream` 参数，不可缺省。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>查询流粒度数据时的应用名参数。</p>
     *
     * <p>使用 `App` 构造请求时，需要同时定义 `Domain` 和 `Stream` 参数，不可缺省。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>查询流粒度数据时的流名称参数。</p>
     *
     * <p>使用 `Stream` 构造请求时，需要同时定义 `Domain` 和 `App` 参数，不可缺省。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>运营商，缺省情况下，表示查询所有运营商，支持的运营商如下所示。</p>
     *
     * <p> - unicom：联通；</p>
     *
     * <p> - railcom：铁通；</p>
     *
     * <p> - telecom：电信；</p>
     *
     * <p> - mobile：移动；</p>
     *
     * <p> - cernet：教育网；</p>
     *
     * <p> - tianwei：天威；</p>
     *
     * <p> - alibaba：阿里巴巴；</p>
     *
     * <p> - tencent：腾讯；</p>
     *
     * <p> - drpeng：鹏博士；</p>
     *
     * <p> - btvn：广电；</p>
     *
     * <p> - huashu：华数；</p>
     *
     * <p> - other：其他。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveSourceBandwidthDataBodyUserRegionListItem> userRegionList;

    /**
     * <p>查询单个或多个出口外网 IP 地址数据，第四个地址位需要改为 000。例如，实际 IP 地址为 10.255.159.10，则请求时取 10.255.159.000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPList")
    private List<String> iPList;

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
     * <p>聚合的时间粒度，单位为 s，默认值为 300。支持如下时间粒度。</p>
     *
     * <p>- 60：支持单次查询时间跨度为 24 小时，历史查询时间范围为 7 天；</p>
     *
     * <p>- 300：支持单次查询时间跨度为 31 天，历史查询时间范围为 93 天。</p>
     *
     * <p>- 3600：支持单次查询时间跨度为 93 天，历史查询时间范围为 93 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>用于指定数据拆分的维度。缺省情况下，表示只显示总回源带宽峰值，不做数据拆维展示。支持的取值如下所示。</p>
     *
     * <p>- Domain：按域名拆分数据；</p>
     *
     * <p>- ISP：按运营商拆分数据。</p>
     *
     *
     *
     * <p>例如，`"DetailField":["Domain"]`，则返回 `DomainList` 中每个域名的回源带宽峰值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
