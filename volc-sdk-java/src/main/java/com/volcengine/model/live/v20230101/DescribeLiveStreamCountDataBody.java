package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamCountDataBody
 */
@lombok.Data
public final class DescribeLiveStreamCountDataBody  {

    /**
     * <p>直播流使用的域名列表，默认为空，表示查询所有全部域名下的峰值流数。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

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
     * <p>聚合的时间粒度，单位为秒，支持的时间粒度如下所示。</p>
     *
     * <p>- `60`：1 分钟；</p>
     *
     * <p>- `300`：（默认值）5 分钟；</p>
     *
     * <p>- `3600`：1 小时。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，默认为空表示不按维度进行数据拆分，支持的维度如下所示。</p>
     *
     * <p>- `Domain`：域名；</p>
     *
     * <p>- `ISP`：运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>流类型，缺省情况下表示全部类型，支持的流类型取值如下。</p>
     *
     * <p>- `push`：推流；</p>
     *
     * <p>- `relay-source`：回源流；</p>
     *
     * <p>- `transcode`：转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private List<String> streamType;

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
     * <p>:::tip</p>
     *
     * <p>- 当流类型 `StreamType` 为推流 `push` 时支持使用运营商对查询数据进行筛选。</p>
     *
     * <p>- 您也可以通过 [DescribeLiveISPData](https://www.volcengine.com/docs/6469/1133974) 接口获取运营商对应的标识符。</p>
     *
     * <p>:::</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当流类型 `StreamType` 为推流 `push` 时支持使用客户端 IP 所属的区域对查询数据进行筛选。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveStreamCountDataBodyUserRegionListItem> userRegionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
