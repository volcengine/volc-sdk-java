package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXEdgeRequestTrafficQuery
 */
@lombok.Data
public final class DescribeImageXEdgeRequestTrafficQuery  {

    /**
     * <p>服务 ID。为空时表示不筛选，支持查询多个服务，使用逗号分隔不同的服务。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考 [GetAllImageServices](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceIds")
    private String serviceIds;

    /**
     * <p>域名。为空时表示不筛选，支持查询多个域名，不同的域名使用逗号分隔。</p>
     *
     * <p>您可以通过调用 [GetServiceDomains](https://www.volcengine.com/docs/508/9379) 获取服务下所有域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainNames")
    private String domainNames;

    /**
     * <p>区域。传入多个时用英文逗号作为分割符，缺省情况下表示查询所有区域。取值如下所示：</p>
     *
     *
     *
     * <p>- `中国大陆`</p>
     *
     * <p>- `亚太一区`</p>
     *
     * <p>- `亚太二区`</p>
     *
     * <p>- `亚太三区`</p>
     *
     * <p>- `欧洲区`</p>
     *
     * <p>- `北美区`</p>
     *
     * <p>- `南美区`</p>
     *
     * <p>- `中东区`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Regions")
    private String regions;

    /**
     * <p>客户端国家。传入多个时用英文逗号作为分割符，缺省情况下表示不过滤。可调用[获取边缘分发地区列表](https://www.volcengine.com/docs/508/177111)获取 IP 解析后的客户端国家。取值如下所示：</p>
     *
     *
     *
     * <p>- `海外`，除中国外全部国家。</p>
     *
     * <p>- 具体国家取值，如`中国`、`美国`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserCountry")
    private String userCountry;

    /**
     * <p>客户端省份。传入多个用英文逗号分割。缺省情况下表示不过滤。可调用[获取边缘分发地区列表](https://www.volcengine.com/docs/508/177111)获取 IP 解析后的客户端省份。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserProvince")
    private String userProvince;

    /**
     * <p>过滤网络协议。传入多个用英文逗号分割。缺省情况下表示不过滤。取值如下所示：</p>
     *
     *
     *
     * <p>- `HTTP`</p>
     *
     * <p>- `HTTPS`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocols")
    private String protocols;

    /**
     * <p>过滤运营商。传入多个用英文逗号分割，缺省情况下表示不过滤。取值如下所示：</p>
     *
     *
     *
     * <p>- `电信`</p>
     *
     * <p>- `联通`</p>
     *
     * <p>- `移动`</p>
     *
     * <p>- `鹏博士`</p>
     *
     * <p>- `教育网`</p>
     *
     * <p>- `广电网`</p>
     *
     * <p>- `其它`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private String isp;

    /**
     * <p>分组依据，仅支持取值`DomainName`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

    /**
     * <p>获取数据起始时间点。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>由于仅支持查询近 93 天的历史数据，则若此刻时间为`2011-11-21T16:14:00+08:00`，那么您可输入最早的开始时间为`2011-08-21T00:00:00+08:00`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询数据的时间粒度。单位为秒，缺省时查询`StartTime`和`EndTime`时间段全部数据，此时单次查询最大时间跨度为 93 天。支持以下取值：</p>
     *
     *
     *
     * <p>- `60`：单次查询最大时间跨度为 6 小时</p>
     *
     * <p>- `120`：单次查询最大时间跨度为 6 小时</p>
     *
     * <p>- `300`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `600`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `1200`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `1800`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `3600`：单次查询最大时间跨度为 93 天</p>
     *
     * <p>- `86400`：单次查询最大时间跨度为 93 天</p>
     *
     * <p>- `604800`：单次查询最大时间跨度为 93 天</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private String interval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
