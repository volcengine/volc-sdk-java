package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePushStreamCountDataBody
 */
@lombok.Data
public final class DescribeLivePushStreamCountDataBody  {

    /**
     * <p>推流域名列表，默认为空，表示查询所有全部域名下的推流峰值流数。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

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
     * <p>数据聚合的时间粒度，单位为秒，支持的时间粒度如下所示。</p>
     *
     * <p>- `60`：1 分钟。时间粒度为 1 分钟时，单次查询最大时间跨度为 24 小时，历史查询时间范围为 366 天；</p>
     *
     * <p>- `300`：（默认值）5 分钟。时间粒度为 5 分钟时，单次查询最大时间跨度为 31 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- `3600`：1 小时。时间粒度为 1 小时时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- `86400`：1 天。时间粒度为 1 天时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，默认为空表示不按维度进行数据拆分，当前接口仅支持填写 `Domain` 表示按查询的域名为维度进行数据拆分。</p>
     *
     * <p>:::tip</p>
     *
     * <p>配置数据拆分的维度时，对应的维度参数传入多个值时才会返回按此维度拆分的数据。例如，配置按 Domain 进行数据拆分时， DomainList 传入多个 Domain 值时，才会返回按 Domain 拆分的数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

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
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<reqRegion20230101> userRegionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
