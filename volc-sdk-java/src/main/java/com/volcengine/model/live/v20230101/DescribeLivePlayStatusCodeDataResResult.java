package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePlayStatusCodeDataResResult
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>提供网络接入服务的运营商标识符，标识符与运营商的对应关系如下。</p>
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
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<respRegion20230101> regionList;

    /**
     * <p>客户端 IP 所属区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<respRegion20230101> userRegionList;

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
     * <p>聚合的时间粒度，单位为秒。</p>
     *
     *
     *
     * <p>- `60`：1 分钟；</p>
     *
     * <p>- `300`：5 分钟；</p>
     *
     * <p>- `3600`：1 小时。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，维度说明如下所示。</p>
     *
     * <p>- `Domain`：域名；</p>
     *
     * <p>- `ISP`：运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>当前查询条件下的状态码占比数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusSummaryDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusSummaryDataListItem> statusSummaryDataList;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusDataListItem> statusDataList;

    /**
     * <p>按维度拆分后的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusDetailDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItem> statusDetailDataList;

    /**
     * <p>请求类型，取值及含义如下所示。</p>
     *
     * <p>- `Access`：推流请求和拉流请求；</p>
     *
     * <p>- `Source`：回源请求。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
