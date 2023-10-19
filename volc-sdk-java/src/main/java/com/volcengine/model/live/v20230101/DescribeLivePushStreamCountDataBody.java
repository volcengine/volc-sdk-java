package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePushStreamCountDataBody
 */
@lombok.Data
public final class DescribeLivePushStreamCountDataBody  {

    /**
     * <p>域名列表，缺省情况表示该用户的所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>聚合的时间粒度，支持以下取值：</p>
     *
     * <p>- 60s：查询支持的时间跨度为 24h、历史查询时间范围为 7d</p>
     *
     * <p>- 300s：查询支持的时间跨度为 31d、历史查询时间范围为 93d</p>
     *
     * <p>- 3600s：查询支持的时间跨度为 93d、历史查询时间范围为93d</p>
     *
     * <p>- 1d：查询支持的时间跨度为 93d、历史查询时间范围为93d，</p>
     *
     *
     *
     * <p>默认 300s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，可取元素"Domain"，设置为空时不安维度不拆分数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>运营商，缺省情况下，表示查询所有运营商，支持的运营商如下所示。</p>
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
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLivePushStreamCountDataBodyUserRegionListItem> userRegionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
