package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePlayStatusCodeDataBody
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataBody  {

    /**
     * <p>拉流域名列表，默认为账号下全部域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>运营商，缺省情况下，表示查询所有运营商，支持的运营商如下所示。</p>
     *
     *
     *
     * <p>- unicom：联通；</p>
     *
     * <p>- railcom：铁通；</p>
     *
     * <p>- telecom：电信；</p>
     *
     * <p>- mobile：移动；</p>
     *
     * <p>- cernet：教育网；</p>
     *
     * <p>- tianwei：天威；</p>
     *
     * <p>- alibaba：阿里巴巴；</p>
     *
     * <p>- tencent：腾讯；</p>
     *
     * <p>- drpeng：鹏博士；</p>
     *
     * <p>- btvn：广电；</p>
     *
     * <p>- huashu：华数；</p>
     *
     * <p>- other：其他。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域的列表，缺省情况下表示所有区域。区域代号和区域的映射关系如下所示。</p>
     *
     *
     *
     * <p>- all：全部，独立查询；</p>
     *
     * <p>- CN：中国内地；</p>
     *
     * <p>- OverSeas：海外所有大区，包含下属所有大区，独立查询；</p>
     *
     * <p>- AP1：亚太一区；</p>
     *
     * <p>- AP2：亚太二区；</p>
     *
     * <p>- AP3：亚太三区；</p>
     *
     * <p>- EU：欧洲；</p>
     *
     * <p>- MEAA：中东；</p>
     *
     * <p>- SA：南美；</p>
     *
     * <p>- NA：北美；</p>
     *
     * <p>- Other：无法定位的数据，独立查询。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`RegionList`和`UserRegionList`传且仅传一个</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLivePlayStatusCodeDataBodyRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。区域代号和区域的映射关系如下所示。</p>
     *
     *
     *
     * <p>- all：全部，独立查询；</p>
     *
     * <p>- CN：中国内地；</p>
     *
     * <p>- OverSeas：海外所有大区，包含下属所有大区，独立查询；</p>
     *
     * <p>- AP1：亚太一区；</p>
     *
     * <p>- AP2：亚太二区；</p>
     *
     * <p>- AP3：亚太三区；</p>
     *
     * <p>- EU：欧洲；</p>
     *
     * <p>- MEAA：中东；</p>
     *
     * <p>- SA：南美；</p>
     *
     * <p>- NA：北美；</p>
     *
     * <p>- Other：无法定位的数据，独立查询。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`RegionList`和`UserRegionList`传且仅传一个</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLivePlayStatusCodeDataBodyUserRegionListItem> userRegionList;

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
     * <p>聚合的时间粒度，单位秒，默认值为 60。支持以下粒度。</p>
     *
     *
     *
     * <p>- 60：支持单次查询时间跨度为 24 小时，历史查询时间范围为 7 天；</p>
     *
     * <p>- 300：支持单次查询时间跨度为 31 天，历史查询时间范围为 93 天；</p>
     *
     * <p>- 3600：支持单次查询时间跨度为 93 天，历史查询时间范围为 93 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，可取值为 "Domain"，"ISP"，设置为空时不进行数据拆分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
